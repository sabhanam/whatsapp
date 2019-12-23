#Author: Ram Sabhanam
Feature: Automating WhatsApp

	#Author: Ram Sabhanam
	Scenario: Automating WhatsApp to send Messages
		Given I will be on WhatsApp homescreen
		When I verify whether there is any existing chat with "SSPART Organization"
		And Search the contact "SSPART Organization" if not available
		Then I select the contact "SSPART Organization" and send the message "Hello SSPART Organization, Its great to see you"
		
		