@wip
Feature: Personal to Business page navigation


Scenario: Business page navigation
  Given I am in personal page
  When I click the business tab
  And I see the URL "https://www.zionsbank.com/business-banking/"
  Then I can verify window title is "Business Banking | Savings | Checking | Loans | Zions Bank"


Scenario: Wealth page navigation
  Given I am in personal page
  When I click the wealth tab
  And I see the URL "https://www.zionsbank.com/wealth-banking/"
  Then I can verify window title is "Banking | Savings | Checking | Loans | Zions Bank"

