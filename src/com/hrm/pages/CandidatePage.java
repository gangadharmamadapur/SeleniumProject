package com.hrm.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

public class CandidatePage {
	
	@FindBy(id="addCandidate_firstName")
	private WebElement firstName;
	
	public void verifyFirstName(String efn) {
		String afn = firstName.getAttribute("value");
		Assert.assertEquals(afn,efn);
	}
	@FindBy(id="btmBack")
	private WebElement backButton;
	
	public void clickBackButton() {
	backButton.click();
	}
}
