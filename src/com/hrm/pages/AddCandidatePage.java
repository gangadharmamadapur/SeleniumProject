package com.hrm.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AddCandidatePage {
	
	@FindBy(id="addCandidate_firstName")
	private WebElement firstName;
	
	@FindBy(id="addCandidate_middleName")
	private WebElement middleName;
	
	@FindBy(id="addCandidate_lastName")
	private WebElement lastName;
	
	@FindBy(id="addCandidate_email")
	private WebElement email;
	
	@FindBy(id="btnSave")
	private WebElement saveButton;
	
	public void setFirstName(String fn) {
		firstName.sendKeys(fn);
	}
	public void setMiddleName(String mn) {
		middleName.sendKeys(mn);
	}
	public void setLastName(String ln) {
		lastName.sendKeys(ln);
	}

}
