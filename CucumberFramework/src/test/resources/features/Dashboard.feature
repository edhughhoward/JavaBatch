@dash
Feature: Dashboard Functionality
  Scenario: Dashboard tab verification
    When login with valid credentials
    Then verify the following dashboard tabs
      | Admin | PIM | Leave | Time | Recruitment | Performance | Dashboard | Directory |
      
