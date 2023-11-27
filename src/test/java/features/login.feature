Feature: Login Functionality
  @TNR
  Scenario: login with valid email and password

    Given user open the browser
    When  fill the email as "testermob5@gmail.com" and password as "Test123&" and click on login button
    Then  user should navigate at the homepage