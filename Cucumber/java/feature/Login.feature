Feature: Login into LeafTaps
	
Scenario Outline: Login positive 
	And Enter username as <username>
	And Enter password as <pass> 
	When Click on Loginbutton 
	Then Click Logout
	
	Examples: 
		|username|pass|
		|DemoSalesManager|crmsfa|
		|DemoCSR|crmsfa|
		
		#Scenario: Login negative
		#And Enter username as DemoCSR
		#And Enter password as crmsfa
		#When Click on Loginbutton
		#Then Verify the Welcome message as B2B
		
		
		
		
		
		
		
