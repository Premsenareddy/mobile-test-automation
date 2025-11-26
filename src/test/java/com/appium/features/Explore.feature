Feature: Verify Explore tab

  Background:
    Given User Opens the App
    And Successfully registered
    Then User is on dashboard
    And Already registered customer

  @allEngage @engage-exploreScreen
  Scenario Outline: Verify Product Listing screen UI
    When I navigate to Shop tab
    Then User search for product "<Product>"
    And Verify "<Title>" is displayed
    And Verify Listing Screen UI
    Examples:
      |Product	|  Title           |
      |apple        |   Search results |

  @allEngage @engage-exploreScreen @sanity
  Scenario Outline: Verify Product Details Screen UI
    When I navigate to Shop tab
    Then User search for product "<Product>"
    And Verify Product Details Screen UI
    Examples:
      |Product	|
      |promate   |

  @allEngage @engage-exploreScreen
  Scenario Outline: Verify mixed payment screen UI
    When I navigate to Shop tab
    Then User search for product "<Product>"
    And Verify "<Title>" is displayed
    And Select the first product
    And Select Buy Now
    And Choose shipping address
    And Verify mixed payment screen UI
    Examples:
      |Product	|  Title           |
      |canon        |   Search results |

  @allEngage @engage-exploreScreen @sanity
  Scenario Outline: Verify payment using touchpoints only - Buy Now
    When I navigate to Shop tab
    Then User search for product "<Product>"
    And Verify "<Title>" is displayed
    And Select the first product
    And Select Buy Now
    And Choose shipping address
    And Make payment by Touchpoints "<Touchpoints>"
    And Verify Successful Payment
    Examples:
      |Product	|  Title               |  Touchpoints |
      |canon        |   Search results | 144834       |

  @allEngage @engage-exploreScreen
  Scenario Outline: Verify payment using new card only - Buy Now
    When I navigate to Shop tab
    Then User search for product "<Product>"
    And Verify "<Title>" is displayed
    And Select the first product
    And Select Buy Now
    And Choose shipping address
    And Make payment by card
    And Select Add a new card flow
    And Make payment by new card in AED "<CardNumber>", "<CVN1>", "<CVN2>"
    And Verify Successful Payment
    Examples:
      |Product	|  Title             | CardNumber        |  CVN1  |  CVN2  |
      |promate    |   Search results | 4000000000001000  |  111   |  1234  |

  @allEngage @engage-exploreScreen
  Scenario Outline: Verify payment using old card only - Buy Now
    When I navigate to Shop tab
    Then User search for product "<Product>"
    And Verify "<Title>" is displayed
    And Select the first product
    And Select Buy Now
    And Choose shipping address
    And Make payment by card
    And Make payment by old card in AED "<CVN>"
    And Verify Successful Payment
    Examples:
      |Product	|  Title             |  CVN  |
      |promate    |   Search results |  1234 |

  @allEngage @engage-exploreScreen
  Scenario Outline: Verify mixed payment using new card - Add to Cart
    When Clear cart
    When I navigate to Shop tab
    Then User search for product "<Product>"
    And Verify "<Title>" is displayed
    And Select the first product
    And Select Add to Cart And Checkout
    And Choose shipping address
    And Make payment by Touchpoints "<Touchpoints>"
    And Select Add a new card flow
    And Make payment by new card in AED "<CardNumber>", "<CVN1>", "<CVN2>"
    And Verify Successful Payment
    Examples:
      |Product	|  Title             | CardNumber        | CVN1 |  CVN2  | Touchpoints |
      |promate    |   Search results | 4000000000001000  | 111  | 1234   |  50         |

  @engage-exploreScreen
  Scenario Outline: Verify mixed payment using old card - Add to Cart
    When Clear cart
    When I navigate to Shop tab
    Then User search for product "<Product>"
    And Verify "<Title>" is displayed
    And Select the first product
    And Select Add to Cart And Checkout
    And Choose shipping address
    And Make payment by Touchpoints "<Touchpoints>"
    And Make payment by old card in AED "<CVN>"
    And Verify Successful Payment
    Examples:
      |Product	|  Title             | Touchpoints |  CVN  |
      |promate    |   Search results | 50          |  1234 |


  @allEngage @engage-exploreScreen
  Scenario Outline: Verify Add/Delete items from Cart
    When Clear cart
    When I navigate to Shop tab
    Then User search for product "<Product1>"
    And Verify "<Title>" is displayed
    And Select the first product
    And Select Add to Cart
    And Click on Continue shopping
    Then User search for product "<Product2>"
    And Select the first product
    And Select Add to Cart
    And Verify cart has items added
    Examples:
      |Product1	  | Product2 |  Title         |
      |canon      | apple    |   Search results |

