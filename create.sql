CREATE DATABASE healthapp;
\c healthapp

CREATE TABLE IF NOT EXISTS counties(
id SERIAL PRIMARY KEY,
countyName VARCHAR,
countyCode INT,
countyPopulation INT,
totalCases INT,
activeCases INT,
recoveredCases INT,
deathCases INT
);
