Feature: Name validations against DB

@dbVal
Scenario: First name validation against DB - searching by employee id
When login with valid credentials
Then verify the dashboard logo is displayed
When navigate to employee list
And enter a valid Employee id "0056266"
Then click on search button
And verify the table is displayed
When get first name from the table 
Then get first name the DB
Then validate first name from UI against DB