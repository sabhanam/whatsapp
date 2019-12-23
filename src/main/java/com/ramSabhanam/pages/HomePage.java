package com.ramSabhanam.pages;

import static com.ramSabhanam.resources_util.ResourcesUtil.getBy;

import java.util.List;
import java.util.stream.Collectors;

import org.openqa.selenium.WebElement;

import com.ramSabhanam.hybridDriver.ExtendedWebPage;

/**
 * 
 * This class represents the HomePage of WhatsApp
 * 
 * @author RamSabhanam
 *
 */
public class HomePage extends ExtendedWebPage{

	/**
	 * Verifying whether contact is already available in previous chat history
	 * 
	 * @param contactName
	 * @return boolean
	 */
	public boolean verifyContactInPreviousChats(String contactName) {
		
		boolean bool = true;
		
		List<String> names = null;
		
		names = driver.findElements(getBy("whatsapp.contacts.names"))
				.stream().map(WebElement::getText).collect(Collectors.toList());
		
		if(names.contains(contactName)) {
			bool = false;
		}
		
		return bool;
	}

	/**
	 * Searching the contact in WhatsApp
	 * 
	 * @param contactName
	 */
	public void searchContact(String contactName) {
		
		driver.findElement(getBy("whatsapp.search.button")).click();
		
		driver.findElement(getBy("whatsapp.search.textbox")).sendKeys(contactName);
		
	}

}
