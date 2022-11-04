Feature: user want to fetch the data from database 
Scenario: user is able retrieve the data
When user wants to retrive the data by using an url is "http://localhost:8080/tourist?tId=SATYA_TOURIST_00052"
Then use validates the status code of the id is 200
