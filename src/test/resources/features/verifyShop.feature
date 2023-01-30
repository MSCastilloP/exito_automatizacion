Feature: Verify thessss  product to the shopping cart


  @stories3
  Scenario: Check the functionality of adding products to the shopping cart
    Given the user santiago is on the success page
    When he chooses 5 products randomly and also randomly their quantities
    Then everything chosen appears in the shopping cart