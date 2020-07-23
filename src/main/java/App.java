import com.google.gson.Gson;
import dao.Sql2oCountyDao;
import exception.ApiException;
import models.County;
import org.sql2o.Connection;
import org.sql2o.Sql2o;

import java.util.HashMap;
import java.util.Map;

import static spark.Spark.*;

public class App {
    public static void main(String[] args) {
        String connectionString = "jdbc:postgresql://localhost:5432/healthapp";
        Sql2o sql2o = new Sql2o(connectionString, "gideon", "33450715Go.");

        Sql2oCountyDao sql2oCountyDao = new Sql2oCountyDao(sql2o);
        Connection con;
        Gson gson= new Gson();

        //post a new County
        post("/county/new","application/json",(request, response) -> {
            County county = gson.fromJson(request.body(),County.class);
            if(sql2oCountyDao.getAllCounties().size()>47){
                return "{\"message\":\"Sorry You have reached the maximum number of counties\"}";
            }
            else {
                sql2oCountyDao.add(county);
                response.status(201);
                return gson.toJson(county);
            }

        });

        //Get Counties
        get("/counties","application/json",(request, response) -> {
            if (sql2oCountyDao.getAllCounties().size()>0){
                return gson.toJson(sql2oCountyDao.getAllCounties());
            }
            else {
                return "{\"message\":\"Sorry No Counties Here!!\"}";
            }
        });

        //Get specific county
        get("/counties/:id", "application/json", (request, response) -> {
            int id=Integer.parseInt(request.params("id"));
            if (sql2oCountyDao.findCountyById(id)== null){
                throw new ApiException(404, String.format("County with the id: \"%s\" doesn't exist",request.params("id")));
            }
            else {
                return  gson.toJson(sql2oCountyDao.findCountyById(id));
            }
        });

    /*    //Update County Code
        post("/counties/:id/update", "application/json", (request, response) -> {
            County county = gson.fromJson(request.body(),County.class);
            int countyId=Integer.parseInt(request.params("id"));

            if (sql2oCountyDao.findCountyById(countyId)== null){
                throw new ApiException(404, String.format("County with the id: \"%s\" doesn't exist",request.params("id")));
            }
            else {
                sql2oCountyDao.update(countyId);
                response.status(201);
                return gson.toJson(county);
            }
        });
*/






        //FILTERS
        exception(ApiException.class, (exception, request, response) -> {
            ApiException err = exception;
            Map<String, Object> jsonMap = new HashMap<>();
            jsonMap.put("status", err.getStatusCode());
            jsonMap.put("errorMessage", err.getMessage());
            response.type("application/json");
            response.status(err.getStatusCode());
            response.body(gson.toJson(jsonMap));
        });

        after((request, response) ->{
            response.type("application/json");
        });


    }
}
