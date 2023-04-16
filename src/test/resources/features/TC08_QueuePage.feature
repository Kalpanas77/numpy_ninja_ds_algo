Feature: To validate Queue Data Structure

Scenario: The user is logged in to DS Algo portal
    Given The user is on Signin page of DS Algo portal
    When The user enter valid "bahnisikha.dalbehera@gmail.com" and "Bahnirupa"  	
    And The user click on login button
    Then The user redirected to homepage


Scenario: User is naviagted to Queue Data structure from homepage
Given User is on Home Page of Dsalgo Portal
When User clicks on getstarted button 
Then User is navigated to Queue data structure

Scenario: User is navigated to Implementation of Queue in Python
Given User is on Queue Data Structure
When User clicks on Implementation of Queue in Python
Then  User is directed to Implementation of Queue in Python

Scenario: User is navigated to tryEditor Page
Given User is on Implementation of Queue in Python
When User clicks on Try here button
Then User is navigated to tryEditor Page

Scenario: User enters valid Python code and Presented with  Result
Given User is on Try Editor Page
And  User Enters  "print('Hello, world!')" in the Editor 
And  clicks on Run Button
Then The User is Presented with a Result

Scenario: User enters Invalid Python code and Presented with Error Message
Given User is navigated to Implementation of Queue in python
When User clicks on Try here button
And  User Enters  Invalid python code "print'Hello, world!')" in the Editor 
And  clicks on Run Button
Then The User is Presented with a Error Message for Invalid python code

Scenario: User navigates to Implementation using collections.deque 
Given User is on Queue Data Structure
When  User clicks on the Implementation using collections.deque link
Then User is navigated to Implementation using collections.deque page

Scenario: User navigates to tryEditor page
Given User is on Implementation using collections.deque page
When User clicks on Try here button
Then User is navigated to tryEditor Page

Scenario: User enters valid Python code and Presented with  Result
Given User is on Try Editor Page
When  User Enters  "print('Implementation using collections.deque')" in the Editor 
And clicks on Run Button
Then The User is Presented with a Result

Scenario: User is navigated to Implementation using array
Given User is on Queue Data Structure
When User clicks on Implementation using array link
Then User is navigated to Implementation using array page

Scenario: User is naviagted to tryEditor page from Implementation using array page
Given User is on Implementation using array page
When User clicks on Try here button
Then User is navigated to tryEditor Page

Scenario: User enters valid Python code and Presented with  Result
Given User is on Try Editor Page
When  User Enters  "print('Implementation using array page')" in the Editor 
And clicks on Run Button
Then The User is Presented with a Result

Scenario: User is navigated to Queue Operations
Given User is on Queue Data Structure
When  User clicks on  Queue Operations link
Then User is navigated to Queue Operations Page

Scenario: User is navigated to tryEditor Page
Given User is on QUeue Operations Page
When User clicks on Try here button
Then User is navigated to tryEditor Page

Scenario: User enters valid Python code and Presented with  Result
Given User is on Try Editor Page
When  User Enters  "print('Queue Operations')" in the Editor 
And clicks on Run Button
Then The User is Presented with a Result

Scenario: User navigated to Practice Questions
Given User is on Implementation of Queue in Python
When  User clicks on Practice Questions link
Then User is navigated to Practice Questions



