package com.keywords
import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import com.kms.katalon.core.annotation.Keyword
import com.kms.katalon.core.checkpoint.Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.testcase.TestCase
import com.kms.katalon.core.testdata.TestData
import com.kms.katalon.core.testobject.TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable

public class DropDownValidation {

	@Keyword
	def drpDown_Invalidsearch() {

		//Mobile.delay(5)

		//Mobile.waitForElementPresent(findTestObject('Object Repository/Tester01/PropertyDetailsPage1/input_Search'), 30)

		//Mobile.setText(findTestObject('Object Repository/Tester01/PropertyDetailsPage1/input_Search'),'Invalid text search', 0)

		//Mobile.verifyElementText(findTestObject('Object Repository/Tester01/PropertyDetailsPage1/txt_SearchNoResultsFound'),	'No results found')

		//Mobile.tap(findTestObject('Object Repository/Tester01/PropertyDetailsPage1/txt_SearchClose'), 0)
	}

	@Keyword
	def drpDown_TextSearch(String drpDorwnXpath, String defaultText, String drpDownSearchText) {

		Mobile.verifyElementText(findTestObject(drpDorwnXpath), defaultText, FailureHandling.OPTIONAL)

		Mobile.tap(findTestObject(drpDorwnXpath, [('variable') : defaultText]), 10, FailureHandling.CONTINUE_ON_FAILURE)

		Mobile.waitForElementPresent(findTestObject('Object Repository/Tester01/PropertyDetailsPage1/input_Search'), 30)

		//Mobile.setText(findTestObject('Object Repository/Tester01/PropertyDetailsPage1/input_Search'),'Invalid text search', 0)

		//Mobile.verifyElementText(findTestObject('Object Repository/Tester01/PropertyDetailsPage1/txt_SearchNoResultsFound'), 'No results found')

		//Mobile.clearText(findTestObject('Object Repository/Tester01/PropertyDetailsPage1/input_Search'), 10, FailureHandling.CONTINUE_ON_FAILURE)

		Mobile.setText(findTestObject('Object Repository/Tester01/PropertyDetailsPage1/input_Search'), drpDownSearchText, 10, FailureHandling.CONTINUE_ON_FAILURE)

		Mobile.tap(findTestObject('Object Repository/Tester01/CommonElements/txt_StaticVerification_1', [('variable') : drpDownSearchText]), 10, FailureHandling.CONTINUE_ON_FAILURE)
	}
}

