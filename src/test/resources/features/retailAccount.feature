Feature: Retail Account Page

Background: 
Given User is on retail website homepage
When user click on Sign in option
And User enter email 'salimanrtest@gmail.com' and password 'salir123@@'
And User click on login button
Then Verify user is logged in

@updatePI
Scenario: Verify User can update profile information
When User click on Account option
And User update Name 'SaliRahm' and phone '1234568'
And User click on Update button
Then user profile information should be updated