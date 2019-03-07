@test
  Feature: Front End - UI Test Cases of Google Search.

    Scenario: Verify that user can navigate to a page number directly or move to previous or next page using the links present

      Given user navigates to the HomePage
      And user clicks the Advertising link on HomePage and Verify
      And user clicks Overview link on HomPage and Verify
      And user clicks HowItWorks link on the HomePage and Verify
      And user clicks Cost link on the HomePage and Verify
      And user click FAQ Link on the HomePage and Verify
      Then user click the GDPR Link and Verify
      And user click the SuccessStories Link and Verify
      And user clicks the Resources Link and Verify BasicsOfOlineMarketing HowGoogleAdsWorks Cost&BUdgets Advanced links
      Then user clicks Contact Links and Verify
