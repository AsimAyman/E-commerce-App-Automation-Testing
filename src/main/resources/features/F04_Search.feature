
@smoke
  Feature: user could search
    Scenario Outline: user could search using product name
      When user could search using <productName>
      And click on search
      Then search results contains the search <productName>
      Examples:
      |productName|
      |book       |
      |laptop     |
      |nike       |

    Scenario Outline: user could search for product using sku
      When user could search using <productSku>
      And click on search
      Then search results contains the search <productSku>
      Examples:
      |productSku|
      |SCI_FAITH |
      |APPLE_CAM |
      |SF_PRO_11 |
