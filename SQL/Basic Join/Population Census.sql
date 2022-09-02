/*
Given the CITY and COUNTRY tables, query the sum of the populations of all cities where the CONTINENT is 'Asia'.

Note: CITY.CountryCode and COUNTRY.Code are matching key columns.
*/

SELECT SUM(city.population) FROM city
INNER JOIN country ON country.code = city.countrycode
WHERE country.continent = 'Asia';