Feature: Verify the correct addition of a product to the shopping cart

  @stories
  Scenario: Check the functionality of adding products to the shopping cart
    Given user Santiago navigates on the Exito page.
    When the user chooses the technology category
    And choose a monitors subcategory
    And Randomly choose 5 products
    And randomly aggregate between 1 and 10 the amount of each product
    Then the name of the chosen products must be the same as in the shopping cart
    And the total prices of the added products must be equal to that of the shopping cart
    And the number of products added should be equal to the shopping cart
    And the number of products added must be equal to the shopping cart