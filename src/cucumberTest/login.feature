Feature: Login Action
 
@Login
Scenario: Successful Login with Valid Credentials
	Given User is on Home Page
	When User Navigate to LogIn Page
	And User enters UserName and Password
	Then Message displayed Login Successfully

@Inbox
Scenario: Show Gmail Inbox	
	When user is displayed with gmail inbox
	Then user clicks on Setting page
	
@Logout
Scenario: Successful LogOut
	When User LogOut from the Application
	Then Message displayed LogOut Successfully
	