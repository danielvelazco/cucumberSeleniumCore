Feature: LoginFeature
  deals with de login functionality of the app


  Scenario: Login with correct user name and password
    Given I navigate to the login page
    And I enter the following for login
      | username | password      |
      | admin    | adminPassword |
    And I click login buttom
    Then I should see the useform page


  #Scenario Outline: Login with correct user name and password using Scenario outline
    #Given I navigate to the login page
    #And I enter <username> and <password>
   # And I click login buttom
    #Then I should see the useform page
   # Examples:
    # | username  | password          |
      #| adminOut  | adminPasswordOut  |
     # | adminOut2 | adminPasswordOut2 |
