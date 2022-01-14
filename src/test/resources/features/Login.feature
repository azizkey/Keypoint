Feature: As a user I should be able to loging using valid credantial

  Background:
    Given the user goes to "https://www.saucedemo.com/" page


  Scenario Outline: User should be login by using valid credantial

    When user types "<userName>" and "<Password>" on the login page

    Examples:
      | userName                | Password     |
      | standard_user           | secret_sauce |
      | problem_user            | secret_sauce |
      | performance_glitch_user | secret_sauce |

  Scenario Outline: User should not be able to login using invalid credential, blank field or as a locked_out_user

    When user NOT types "<userName>" or "<Password>" on the login page or using wrong username

    Examples:
      | userName        | Password       |
      | wrong_user_name | secret_sauce   |
      | standard_user   | wrong_password |
      | locked_out_user | secret_sauce   |
      |                 | secret_sauce   |
      | standard_user   |                |


