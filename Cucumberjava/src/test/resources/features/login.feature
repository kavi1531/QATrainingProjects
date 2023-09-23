

Feature: This is a test for login

 

  @Smoke

  Scenario: The user is able to access Rahul shetty cart page

    Given The user opens the browser

    When The user enters the valid URL

    Then The user is able to see the Green Cart icon

@Smoketest
Scenario: Feature: Shopping Cart
  Scenario Outline: Adding items to the cart
    Given the user has an empty shopping cart
    When they add <item> to the cart
    Then the cart should contain <item>

    Examples:
    | item         |
    | Apples       |
    | Bananas      |
    | Strawberries |
  