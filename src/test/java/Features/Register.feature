Feature: Register Qtrip.com

  @SuccessfulRegister_TC_01
  Scenario: Qtrip Register Successful
    Given User is on homepage
    When Click register button
    When Click the Email address input field
    When Enter the email address "SuccessfulRegister"
    When Click the password input field
    When Enter the password "SuccessfulRegister"
    When Click the confirm password input field
    When Enter the confirm password "SuccessfulRegister"
    When Click register to Qtrip button
    Then Check Successful Register
    When Click the Email address button
    When Write the email address "SuccessfulRegister"
    When Click the password button
    When Write password "SuccessfulRegister"
    When Click login to Qtrip button
    Then Check Successful Login

  @AlreadyCreatedMailRegister
  Scenario: Qtrip Already Created Mail
    Given User is on homepage
    When Click register button
    When Click the Email address input field
    When Enter the email address "SuccessfulRegister"
    When Click the password input field
    When Enter the password "SuccessfulRegister"
    When Click the confirm password input field
    When Enter the confirm password "SuccessfulRegister"
    When Click register to Qtrip button
    Then Verify error message for register

  @WrongRetypePassword
  Scenario: Qtrip Already Created Mail
    Given User is on homepage
    When Click register button
    When Click the Email address input field
    When Enter the email address "WrongRetypePassword"
    When Click the password input field
    When Enter the password "WrongRetypePassword"
    When Click the confirm password input field
    When Enter the confirm password "WrongRetypePassword"
    When Click register to Qtrip button
    Then Verify error message for retypePassword


