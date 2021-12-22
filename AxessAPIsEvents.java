package main.java.pageEvents;

import java.io.IOException;

import com.aventstack.extentreports.Status;

import main.java.pageObjects.AxessAPIsElements;
import main.java.utilities.ElementFetch;
import main.java.utilities.ElementMethods;

public class AxessAPIsEvents extends ElementMethods{
	

	ElementFetch elementFetch = new ElementFetch();

	
	public void verifyaxessAPISPage() throws IOException, InterruptedException{
		
		click(elementFetch.getWebElement("XPATH", AxessAPIsElements.APIsTab));
		
		logger.log(Status.PASS, "navigate to APIs page", addImageToExtentReport());
		verifyIfElementDisplayed(elementFetch.getWebElement("XPATH", AxessAPIsElements.APIsHeader));
		logger.log(Status.PASS, "APIs header is present", addImageToExtentReport());
		
		click(elementFetch.getWebElement("XPATH", AxessAPIsElements.AllCatalogues));
		click(elementFetch.getWebElement("XPATH", AxessAPIsElements.corporate));
		logger.log(Status.PASS, "click on the corporate option in the dropdown ", addImageToExtentReport());
		
		verifyIfElementDisplayed(elementFetch.getWebElement("XPATH", AxessAPIsElements.accountInquiryTile));
		logger.log(Status.PASS, "accountInquiryTile is present ", addImageToExtentReport());

		verifyIfElementDisplayed(elementFetch.getWebElement("XPATH", AxessAPIsElements.collectMoneyTile));
		logger.log(Status.PASS, " collectMoneyTile", addImageToExtentReport());
		
		verifyIfElementDisplayed(elementFetch.getWebElement("XPATH", AxessAPIsElements.corporateCustomerOnboardingTile));
		logger.log(Status.PASS, "corporateCustomerOnboardingTile ", addImageToExtentReport());
		
		verifyIfElementDisplayed(elementFetch.getWebElement("XPATH", AxessAPIsElements.corporateFinancialMarketsTile));
		logger.log(Status.PASS, "corporateFinancialMarketsTile ", addImageToExtentReport());
		
		scrollTillFindElement(elementFetch.getWebElement("XPATH",AxessAPIsElements.moveMoneyTile));
		verifyIfElementDisplayed(elementFetch.getWebElement("XPATH", AxessAPIsElements.moveMoneyTile));
		logger.log(Status.PASS, " moveMoneyTile ", addImageToExtentReport());
		
		verifyIfElementDisplayed(elementFetch.getWebElement("XPATH", AxessAPIsElements.notificationTile));
		logger.log(Status.PASS, "notificationTile ", addImageToExtentReport());
		
		verifyIfElementDisplayed(elementFetch.getWebElement("XPATH", AxessAPIsElements.PSD2CoverageTile));
		logger.log(Status.PASS, "PSD2CoverageTile ", addImageToExtentReport());
		
		verifyIfElementDisplayed(elementFetch.getWebElement("XPATH", AxessAPIsElements.rportingTile));
		logger.log(Status.PASS, " rportingTile", addImageToExtentReport());
		
		scrollTillFindElement(elementFetch.getWebElement("XPATH",AxessAPIsElements.scurityServicesTile));
		verifyIfElementDisplayed(elementFetch.getWebElement("XPATH", AxessAPIsElements.scurityServicesTile));
		logger.log(Status.PASS, "scurityServicesTile ", addImageToExtentReport());
		
		verifyIfElementDisplayed(elementFetch.getWebElement("XPATH", AxessAPIsElements.smartContractSuiteTile));
		logger.log(Status.PASS, "smartContractSuiteTile ", addImageToExtentReport());
		
		verifyIfElementDisplayed(elementFetch.getWebElement("XPATH", AxessAPIsElements.tradeTile));
		logger.log(Status.PASS, "tradeTile ", addImageToExtentReport());
		
		verifyIfElementDisplayed(elementFetch.getWebElement("XPATH", AxessAPIsElements.uilitiesAndToolsTile));
		logger.log(Status.PASS, " uilitiesAndToolsTile", addImageToExtentReport());
//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////		
		
		
//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////	
		
		click(elementFetch.getWebElement("XPATH", AxessAPIsElements.APIsTab));
		logger.log(Status.PASS, "navigate again to APIs Toppage", addImageToExtentReport());
		
		click(elementFetch.getWebElement("XPATH", AxessAPIsElements.corporate));
		click(elementFetch.getWebElement("XPATH", AxessAPIsElements.retails));
		logger.log(Status.PASS, "click on the retails option in the dropdown ", addImageToExtentReport());
		
		verifyIfElementDisplayed(elementFetch.getWebElement("XPATH", AxessAPIsElements.bahrainOpenBankingtile));
		logger.log(Status.PASS, "bahrainOpenBankingtile is present ", addImageToExtentReport());
		
		verifyIfElementDisplayed(elementFetch.getWebElement("XPATH", AxessAPIsElements.FXRatestiles));
		logger.log(Status.PASS, "FXRatestiles is present ", addImageToExtentReport());
		
		verifyIfElementDisplayed(elementFetch.getWebElement("XPATH", AxessAPIsElements.leadGeneration));
		logger.log(Status.PASS, "leadGeneration tiles is present ", addImageToExtentReport());

		verifyIfElementDisplayed(elementFetch.getWebElement("XPATH", AxessAPIsElements.locateus));
		logger.log(Status.PASS, "locateus tiles is present ", addImageToExtentReport());
		
		scrollTillFindElement(elementFetch.getWebElement("XPATH",AxessAPIsElements.retailCustomerOnboarding));
		verifyIfElementDisplayed(elementFetch.getWebElement("XPATH", AxessAPIsElements.retailCustomerOnboarding));
		logger.log(Status.PASS, "retailCustomerOnboarding tiles is present ", addImageToExtentReport());
		
		verifyIfElementDisplayed(elementFetch.getWebElement("XPATH", AxessAPIsElements.retailProducts));
		logger.log(Status.PASS, "retailProducts tiles is present ", addImageToExtentReport());
		
		verifyIfElementDisplayed(elementFetch.getWebElement("XPATH", AxessAPIsElements.skRetailAccounts));
		logger.log(Status.PASS, "skRetailAccounts tiles is present ", addImageToExtentReport());
		
		verifyIfElementDisplayed(elementFetch.getWebElement("XPATH", AxessAPIsElements.skRetailProducts));
		logger.log(Status.PASS, "skRetailProducts tiles is present ", addImageToExtentReport());

		
/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
		
		click(elementFetch.getWebElement("XPATH", AxessAPIsElements.APIsTab));
		logger.log(Status.PASS, "navigate to APIs Toppage", addImageToExtentReport());

		click(elementFetch.getWebElement("XPATH", AxessAPIsElements.corporate));
		click(elementFetch.getWebElement("XPATH", AxessAPIsElements.financialInstitutions));
		logger.log(Status.PASS, "click on the Financial Institutions option in the dropdown ", addImageToExtentReport());

		verifyIfElementDisplayed(elementFetch.getWebElement("XPATH", AxessAPIsElements.accountInquiryTile));
		logger.log(Status.PASS, "accountInquiryTile is present ", addImageToExtentReport());


		verifyIfElementDisplayed(elementFetch.getWebElement("XPATH", AxessAPIsElements.collectMoneyTile));
		logger.log(Status.PASS, " collectMoneyTile", addImageToExtentReport());
		
		verifyIfElementDisplayed(elementFetch.getWebElement("XPATH", AxessAPIsElements.moveMoneyTile));
		logger.log(Status.PASS, " moveMoneyTile ", addImageToExtentReport());

		verifyIfElementDisplayed(elementFetch.getWebElement("XPATH", AxessAPIsElements.notificationTile));
		logger.log(Status.PASS, "notificationTile ", addImageToExtentReport());
		
		scrollTillFindElement(elementFetch.getWebElement("XPATH",AxessAPIsElements.financialReporting));
		verifyIfElementDisplayed(elementFetch.getWebElement("XPATH", AxessAPIsElements.financialReporting));
		logger.log(Status.PASS, " rportingTile", addImageToExtentReport());

		verifyIfElementDisplayed(elementFetch.getWebElement("XPATH", AxessAPIsElements.financialUilitiesAndToolsTile));
		logger.log(Status.PASS, " financialUilitiesAndToolsTile", addImageToExtentReport());
		


}}
