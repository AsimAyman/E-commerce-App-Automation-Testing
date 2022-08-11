@smoke
Feature:  follow us
Scenario: user opens facebook link
  When user click on facebook Icon
  And close  the second tap
  Then The browser open a new tap with url: "https://www.facebook.com/nopCommerce"

Scenario: user opens twitter link
  When user click on twitter Icon
  And close  the second tap
  Then The browser open a new tap with url: "https://twitter.com/nopCommerce"

Scenario: user opens rss link
  When user click on rss Icon
  And close  the second tap
  Then The browser open a new tap with url: "https://demo.nopcommerce.com/new-online-store-is-open"

Scenario: user opens youtube link
  When user click on youtube Icon
  And close  the second tap
  Then The browser open a new tap with url: "https://www.youtube.com/user/nopCommerce"
