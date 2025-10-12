Feature: Qtrip.com

  @SuccessfulLogin
  Scenario: Qtrip Login Successful
    Given User is on homepage
    When Click login button
    When Click the Email address button
    When Write the email address "successLogin"
    When Click the password button
    When Write password "successLogin"
    When Click login to Qtrip button
    Then Check Successful Login

  @SuccessfulLogout
  Scenario: Qtrip Logout Successful
    Given User is on homepage
    When Click login button
    When Click the Email address button
    When Write the email address "successLogin"
    When Click the password button
    When Write password "successLogin"
    When Click login to Qtrip button
    Then Check Successful Login
    And Click Logout Button
    And Check Successful Logout

  @FailedLogin1_TC_02
  Scenario: Qtrip Login Failed with Wrong Password
    Given User is on homepage
    When Click login button
    When Click the Email address button
    When Write the email address "WrongPasswordCorrectEmail"
    When Click the password button
    When Write password "WrongPasswordCorrectEmail"
    When Click login to Qtrip button
    Then Verify error message

  @FailLogin2
  Scenario: Qtrip Login Failed with Wrong Email
    Given User is on homepage
    When Click login button
    When Click the Email address button
    When Write the email address "WrongEmail"
    When Click the password button
    When Write password "WrongEmail"
    When Click login to Qtrip button
    Then Verify error message for wrong email




