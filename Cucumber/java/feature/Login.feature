Feature: Login into LeafTaps 

Background: 
	Given Launch the browser 
	And Load the URL 
	And Maximize the browser 
	And Set the timeout 
	
Scenario Outline: Login positive 
	And Enter username as <username>
	And Enter password as <pass> 
	When Click on Loginbutton 
	Then Verify the Welcome message of <verificationName>
	
	Examples: 
		|username|pass|verificationName|
		|DemoSalesManager|crmsfa|Sales|
		|DemoCSR|crmsfa|B2B|
		
		#Scenario: Login negative
		#And Enter username as DemoCSR
		#And Enter password as crmsfa
		#When Click on Loginbutton
		#Then Verify the Welcome message as B2B
		
		
		
		
		
		
		
