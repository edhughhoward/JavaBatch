@addEmployee
Feature: Add Employees

  Background: 
    When login with valid credentials
    Then navigate to add employee page

  Scenario: Add employee without login details
    And enter first and last name
    Then click on save Button
    And verify the employee is added successfully

  Scenario: Add employee with login details
    And enter first and last name
    When check login details checkbox
    Then enter login details
    Then click on save Button
    And verify the employee is added successfully

  @parameter
  Scenario: Add employee without login details but with middle name
    When Enter first name "Ahmet" middle name "Can" and last name "Bicer"
    Then click on save Button
    And verify that "Ahmet Can Bicer" is added successfully

  @examples
  Scenario Outline: Adding multiple employees without login details
    When enter employee "<First Name>", "<Middle Name>", "<Last Name>"
    Then click on save Button
    And verify that "<First Name>", "<Middle Name>", "<Last Name>" is successfully added

    Examples: 
      | First Name | Middle Name | Last Name |
      | Mark       | J           | Smith     |
      | Ed         | H           | Howard    |
      | John       | M           | Wick      |
      | John       | F           | Kennedy   |

  @dtWithHeader
  Scenario: Adding multiple employees at one execution
    When add multiuple employees adn verify they are added
      | First Name | Middle Name | Last Name |
      | Mark       | J           | Smith     |
      | Ed         | H           | Howard    |
      | John       | M           | Wick      |
      | John       | F           | Kennedy   |
@excelTask
  Scenario: Adding multiple employees from excel file
    When add multiple employeed from "AddEmployee" verify they are added successfully
