package com.ramSabhanam.tests;

import org.testng.annotations.Test;

import com.ramSabhanam.pages.ChatPage;
import com.ramSabhanam.pages.HomePage;
import com.ramSabhanam.pages.SearchPage;

/**
 * WhatsApp tests; sending a message to anyone automatically
 * 
 * @author RamSabhanam
 *
 */
public class WhatsAppTests 
{
	
	HomePage homePage = new HomePage();
	SearchPage searchPage = new SearchPage();
	ChatPage chatPage = new ChatPage();
    
	@Test
	public void TC001_send_message_to_my_contact() throws InterruptedException {
		
		String contactName = "SSPART Organization";
		String message = "Hi SSPART how are you";
		
		if(homePage.verifyContactInPreviousChats(contactName)) {
		
			homePage.searchContact(contactName);
			
		}
		
		searchPage.selectContact(contactName);
		
		chatPage.sendMessage(message);
		
	}

}
