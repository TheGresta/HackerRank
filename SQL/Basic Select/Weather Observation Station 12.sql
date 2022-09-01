/*
Query the list of CITY names from STATION that do not start with vowels and do not end with vowels. Your result cannot contain duplicates.
*/

SELECT DISTINCT city FROM station
WHERE NOT(
    city LIKE 'a%' OR 
    city LIKE 'e%' OR 
    city LIKE 'i%' OR 
    city LIKE 'o%' OR 
    city LIKE 'u%'
)
AND NOT(
    city LIKE '%a' OR 
    city LIKE '%e' OR 
    city LIKE '%i' OR 
    city LIKE '%o' OR 
    city LIKE '%u'
)