Feature: Allow users to login to quang cao coc coc website

  @Login
  Scenario Outline: Login successfully with email and password
    Given Navigate to herokuapp login site
    Then User clicks on '<link>'
#    Then Should navigate to home page site
    Examples:
      |link|
      |Basic Auth|

#  @pending
##  Scenario Outline: Login failed with invalid email
##    Given Navigate to quang cao coc coc login site
##    When Login with '<email>' and '<password>'
##    Then Should prompt with '<errormessage>'
##    Examples:
##      |email|password|errormessage|
##      |ledinhcuong99@gmail.com|aaa|abc@example.com|