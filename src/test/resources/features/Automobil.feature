
@wip
Feature: Automobile

  Scenario: Verify subTabs of Automobil
    Given the user access adesso homepage
    When the user clicks "Automobil"
    Then the user can see the following under "Automobil"
      | CAR TO X                    |
      | PORTALE                     |
      | TELEMATIKPLATTFORMEN        |
      | AGILE SOFTWARE­ENT­WICKLUNG |
      | AGILER FESTPREIS            |

