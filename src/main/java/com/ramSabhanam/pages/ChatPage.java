package com.ramSabhanam.pages;

import com.ramSabhanam.hybridDriver.ExtendedWebPage;
import static com.ramSabhanam.resources_util.ResourcesUtil.*;

/**
 * 
 * This class represents the Chat Page in WhatsApp
 * 
 * @author RamSabhanam
 *
 */
public class ChatPage extends ExtendedWebPage {

	public void sendMessage(String message) {

		driver.findElement(getBy("whatsapp.message.textbox")).sendKeys(message);
		
		driver.findElement(getBy("whatsapp.sendMessage.button")).click();
		
	}
	
}
