CREATE DATABASE healthApp;
\c healthApp

CREATE TABLE IF NOT EXISTS counties{
id SERIAL PRIMARY KEY int,
countyName VARCHAR,
countyPopulation int,
totalCases int
};

CREATE TABLE IF NOT EXISTS cases{
id SERIAL PRIMARY KEY  int,
county_id int,
caseStatus VARCHAR
};