SET MODE PostgreSQL;

CREATE TABLE IF NOT EXISTS counties (
id int SERIAL PRIMARY KEY auto_increment,
countyName VARCHAR,
countyPopulation int,
totalCases int
);

CREATE TABLE IF NOT EXISTS cases (
id int SERIAL PRIMARY KEY auto_increment,
name VARCHAR,
county_id int,
case_status VARCHAR
);