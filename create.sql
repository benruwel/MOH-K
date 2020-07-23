CREATE DATABASE healthapp;
\c healthapp

CREATE TABLE IF NOT EXISTS counties(
id SERIAL PRIMARY KEY,
county_name VARCHAR,
county_code INT,
county_population INT,
total_cases INT,
active_cases INT,
recovered_cases INT,
death_cases INT
);