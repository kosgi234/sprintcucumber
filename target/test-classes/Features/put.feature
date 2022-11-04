Feature: a user is able to update the data in the database

  Scenario: a user wants to put the data
    Given a user is able to provide the data in database
    When a user is able to put a data by using an api is "http://localhost:8080/tourist?id=SATYA_TOURIST_00303"
    Then a user can validates status code is 200
