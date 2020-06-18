Feature: Personal to Business page navigation


Scenario: Business page navigation
  Given I am in personal page
  When I click the business tab
  Then I can verify window title is "Zions Bank | Personal Banking | Savings | Checking | Loans"

