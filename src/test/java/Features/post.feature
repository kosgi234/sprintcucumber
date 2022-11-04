Feature: a user is able to create data in database
Scenario: a user wants to create the data by using post method
Given a user is able to provide the data 
When a user create a data by using an url :"http://localhost:8080/tourist"
Then a user validate status code is 200
