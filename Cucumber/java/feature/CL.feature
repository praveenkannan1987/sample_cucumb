Feature: Login into LeafTaps 

Background: 
	Given Launch the browser 
	And Load the URL 
	And Maximize the browser 
	And Set the timeout 
@smoke @sanity
Scenario: Login positive 
	And Enter username as DemoSalesManager 
	And Enter password as crmsfa 
	When Click on Loginbutton 
	Then Verify the Welcome message of Demo
@reg @sanity
Scenario: Login negative 
	And Enter username as DemoSalesManager 
	And Enter password as crmsfa 
	When Click on Loginbutton 
	Then Verify the Welcome message of Demo
	
	
	
	
	
	
	
