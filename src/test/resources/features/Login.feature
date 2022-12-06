Feature: Application Login
@LoginPage
Scenario: HomePage Default login
  Given User Launch browser
  And opens URL
When User login into application with username and password
Then Homepage is populated
And Cards are displayed

  @PlaceOrder
  Scenario: Add Task
    Given User Launch browser
    And opens URL
    When Home Page and All Task
    Then Add new Task
    And Task added