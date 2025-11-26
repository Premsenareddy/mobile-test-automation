Feature: Verify Dashboard Screen

  Background:
    Given User Opens the App
    And Successfully registered
    Then User is on dashboard
    And Already registered customer

  @allEngage @engage-dashboard
  Scenario: Verify Explore screen Banner for marketplace user
    When Verify Explore Screen Banner

  @allEngage @engage-dashboard @sanity @iosengage
  Scenario Outline: Verify Explore screen UI
    When Verify Explore Screen UI
    Then Verify Brand Logos on Explore "<Logo1>", "<Logo2>", "<Logo3>", "<Logo4>", "<Logo5>", "<Logo6>", "<Logo7>", "<Logo8>",
    Examples:
      |Logo1	|  Logo2 | Logo3 | Logo4      | Logo5  | Logo6    | Logo7     | Logo8  |
      |Shopping |  Bills | Food  | Activities | Family | Wellness | Groceries | Travel |

  @toFix
  Scenario: Verify Suggested for you or special offer
    When I land on Explore tab
    And Verify Suggested for you Offers screen UI

  @allEngage @engage-dashboard
  Scenario Outline: Verify Suggested for you Etihad Airways
    When I land on Explore tab
    And Click on suggested for you "<section>"
    And Verify Suggested for you Offers Etihad Airways
    Examples:
      |section	|
      |Etihad |

  @allEngage @engage-dashboard
  Scenario Outline: Verify Shopping category on Explore
    When I navigate on "<category>" category
    Then Verify Shopping Category screen first half UI
    Then Verify Shop By Brand Categories UI
    Examples:
      |category	|
      |Shopping |

  @allEngage @engage-dashboard @sanity
  Scenario Outline: Verify Shopping sub category listing screen
    When I navigate on "<category>" category
    Then Verify Shopping Category screen first half UI
    And Verify product listing for each shop sub category
    Examples:
      |category	|
      |Shopping |

  @allEngage @engage-dashboard @sanity
  Scenario Outline: Verify Food category on Explore
    When I navigate on "<category>" category
    Then Verify Food "<category>" sub Category screen "<title>"
    And Verify Food sub Category bottom sheet screen UI
    Examples:
      | category	| title |
      | Food        | Satisfy your cravings with food delivery deals across the UAE  |

  @allEngage @engage-dashboard
  Scenario Outline: Verify Activities category on Explore
    When I navigate on "<category>" category
    Then Verify Activities "<category>" sub Category screen "<title>"
    And Verify Activities sub Category bottom sheet screen UI

    Examples:
      | category	| title |
      | Activities  | Enjoy deals and offers on fun and entertainment |

  @allEngage @engage-dashboard
  Scenario Outline: Verify Family category on Explore
    When I navigate on "<category>" category
    Then Verify Family "<category>" sub Category screen "<title>"
    And Verify Family sub Category bottom sheet screen UI

    Examples:
      | category	| title |
      | Family  | Add special deals to your quality time with loved ones |

  @allEngage @engage-dashboard
  Scenario Outline: Verify Wellness category on Explore
    When I navigate on "<category>" category
    Then Verify Wellness "<category>" sub Category screen "<title>"
    And Verify Wellness sub Category bottom sheet screen UI
    Examples:
      | category	| title |
      | Wellness        | Welcome health & wellbeing with open arms and cashback |

  @allEngage @engage-dashboard
  Scenario Outline: Verify Groceries category on Explore
    When I navigate on "<category>" category
    Then Verify Groceries "<category>" sub Category screen "<title>"
    And Verify Groceries sub Category bottom sheet screen UI
    Examples:
      | category	| title |
      | Groceries        | Save on your favorite products and daily essentials |

  @allEngage @engage-dashboard
  Scenario Outline: Verify Travel category on Explore
    When I navigate on "<category>" category
    Then Verify Travel "<category>" sub Category screen "<title>"
    And Verify Travel sub Category bottom sheet screen UI
    Examples:
      | category	| title |
      | Travel        | Gear up for your next adventure with everyday deals |

  Scenario: Verify Special Offers UI
    When I scroll to Special Offers UI
    Then Verify Special Offers screen UI
    And Verify Special Offers sub Category screen UI