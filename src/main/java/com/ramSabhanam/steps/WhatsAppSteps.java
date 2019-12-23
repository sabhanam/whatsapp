package com.ramSabhanam.steps;

import com.ramSabhanam.pages.ChatPage;
import com.ramSabhanam.pages.HomePage;
import com.ramSabhanam.pages.SearchPage;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

/**
 * 
 * This class represents the Cucumber steps of the WhatsApp Automation
 * 
 * @author RamSabhanam
 *
 */
public class WhatsAppSteps {
	
	HomePage homePage = new HomePage();
	SearchPage searchPage = new SearchPage();
	ChatPage chatPage = new ChatPage();
	boolean bool = false;
	
	@Given("I will be on WhatsApp homescreen")
	public void i_will_be_on_WhatsApp_homescreen() {
		
		homePage.verifyContactInPreviousChats("");
		
	}

	@When("I verify whether there is any existing chat with {string}")
	public void i_verify_whether_there_is_any_existing_chat_with(String contactName) {
		if(homePage.verifyContactInPreviousChats(contactName)) {
			bool = true;
		}
	}

	@When("Search the contact {string} if not available")
	public void search_the_contact_if_not_available(String contactName) {
		if(bool) {
			homePage.searchContact(contactName);
		}
	}

	@Then("I select the contact {string} and send the message {string}")
	public void i_select_the_contact_and_send_the_message(String contactName, String message) {
		
		searchPage.selectContact(contactName);
		
		chatPage.sendMessage(message);
		
	}
	
}
