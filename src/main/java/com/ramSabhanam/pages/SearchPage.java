package com.ramSabhanam.pages;

import java.util.List;
import java.util.stream.Collectors;

import org.openqa.selenium.WebElement;

import com.ramSabhanam.hybridDriver.ExtendedWebPage;
import static com.ramSabhanam.resources_util.ResourcesUtil.*;

/**
 * This class represents the search page in WhatsApp
 * @author RamSabhanam
 *
 */
public class SearchPage extends ExtendedWebPage{

	/**
	 * Selecting the contact from the search page in WhatsApp
	 * 
	 * @param contactName
	 */
	public void selectContact(String contactName) {

		List<String> names = null;
		
		List<WebElement> contactNames = driver.findElements(getBy("whatsapp.contacts.names"));
		
		names = driver.findElements(getBy("whatsapp.contacts.names"))
				.stream().map(WebElement::getText).collect(Collectors.toList());
		
		contactNames.get(names.indexOf(contactName)).click();
		
		
	}

}
