Feature: To Validate Graph Data Structure

Scenario: The user is logged in to DS Algo portal
    Given user is on Signin of DS Algo portal
    When user enters "bahnisikha.dalbehera@gmail.com" and "Bahnirupa"  	
    And  user clicks on login button
    Then user redirected to Home Page of DsAlgo Portal

Scenario: User should be able to navigate to Graph Data Structure Page
Given User is on Home Page of DsAlgo Portal
When User clicks on Graph Get started button
Then User re-directed to Graph Page

Scenario: User should  be able to navigate to Graph Page
Given User is on Graph Data Structure Page
When User clicks on Graph link in Graph Page 
Then User is re-directed to Graphlink of Graph Page 

Scenario: User should be able to navigate to tryEditor Page
Given User is on Graph link of Graph Page
When User clicks on Try here button of Graph page
Then User is re-directed to tryEditor Page

Scenario: User enters valid Python code and Presented with Result
Given User is on tryEditor Page
When User enters Valid Python code "print('Implementation of Graph')" 
And clicks on Run button
Then User is presented with the Result

Scenario: User should be able to navigate to Graph representations Page
Given  User is on Graph Page
When User clicks on  Graph Representations link
Then User is navigated to Graph Representations Page

Scenario: User should be able to  navigate to tryEditor Page
Given User is on Graph Representations Page
When User clicks on Try here button of Graph Representations page
Then User is re-directed to tryEditor Page

Scenario: User should be able to enter a invalid Python code and Presented with Error Message
Given User is on tryEditor Page
When User enters  code "print(Graph Representation)"
And clicks on Run button 
Then User is presented with Error Message

#Scenario: User should be able to  navigate to Practice Questions Page
#Given User is on Graph Representations Page
#When User click  on Practice Questions link
#Then User navigated to Practice Questions Page
Scenario: The user is able to navigate to "Practice Questions" in graph Page
#Given The user is on the Graph page after logged in
Given User is on Graph Representations Page
When User clicks on  Practice Questions of Graph page
Then The user should be redirected to Practice Questions of Graph page






