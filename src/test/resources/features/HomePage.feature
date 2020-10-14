

Feature: adesso Homepage

  Background:
    Given the user access adesso homepage

  @wip
  Scenario: Verify Page Title

    Then the page title is "adesso SE - Führender IT-Dienstleister im deutschsprachigen Raum"
    And the logo is displayed

  @wip
  Scenario: Verify subTabs of adessoEntdecken
    When the user clicks "entdecken"
    Then the user can see the following under "entdecken"
      | Branchen                |
      | Technologie-Plattformen |
      | Impulse                 |
      | Unternehmen             |
      | Jobs & Karriere         |
      | News                    |
      | Kontakt                 |


