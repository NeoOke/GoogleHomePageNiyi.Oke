
@test
Feature: New Car Search at chase car on base page

  Scenario Outline: Identify Default out for New Car Search

    Given I navigate to the login page
    Given user as correct make type and correct ZipCode
    And   user click the shop new cars
    Then  the user clicks AllStyles Link
    And  Verify the user gets correct "<MakeType>"
    Then select the "<MakeYear>" then click build and Price
    Then verify the "<MakeType>" and "<MakeYear>"



    Examples:
      | MakeType   | ZipCode | MakeYear |
      |Alfa Romeo  | 01001   | 2018     |
      |Acura       |01002    |2019      |
      |Aston Martin|01003    |2019      |
      |Audi        |01004    |2018      |




