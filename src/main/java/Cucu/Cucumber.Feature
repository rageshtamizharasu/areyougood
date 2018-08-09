Feature: Login for leaf taps
Scenario: Positive Login Leaf taps
Given : Open the Browser 
And		: Maximize the window
And		: Load the URL
And		: Set the Timeout
And		: Enter the username as DemoSaleManger
And		: Enter the Password as Cmsf
When		: Click on the Login Button
Then		: Verify login is successful  
But		: Verify Negative 
