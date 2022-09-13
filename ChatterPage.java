package com.leaftaps.pages;

import org.openqa.selenium.WebElement;

import com.framework.selenium.api.design.Locators;
import com.framework.testng.api.base.ProjectSpecificMethods;

public class ChatterPage extends ProjectSpecificMethods {
	
	public ChatterPage verifyChatterTitle() {
		pause(3000);
		verifyTitle("Chatter Home | Salesforce");
		reportStep("Chatter Title is as expected", "PASS");
		return this;
	}
	
	public ChatterPage clickQuest() {
		clickUsingJs(locateElement (Locators.XPATH, "//span[text()='Question']"));
		reportStep("Question option is clicked", "PASS");
		return this;
	}
	
	public ChatterPage enterQuestion(String Question) {

		WebElement ele = locateElement(Locators.XPATH, "//textarea[@class='cuf-questionTitleField textarea']");

		clearAndType(ele, Question);

		reportStep("Question is entered","pass");
		return this;
	}
	
	public ChatterPage enterQuestDetails(String Details) {

		WebElement ele = locateElement(Locators.XPATH, "//div[@class='ql-editor ql-blank slds-rich-text-area__content slds-text-color_weak slds-grow']");

		clearAndType(ele, Details);

		reportStep("Question Details are added","pass");
		return this;
	}
	
	public ChatterPage clickAsk() {
		click(locateElement (Locators.XPATH, "//button[text()='Ask']"));
		reportStep("Question option is clicked", "PASS");
		return this;
	}
	
	public ChatterPage verifyQuest(String Question) {

		WebElement ele =locateElement(Locators.XPATH, "//span[text()='"+Question+"']");
		verifyExactText(ele, Question);
		reportStep("Entered Question is added","pass");
		return this;
	}
	

}
