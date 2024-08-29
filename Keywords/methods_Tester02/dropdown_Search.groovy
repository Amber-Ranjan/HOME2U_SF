package methods_Tester02

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

public class dropdown_Search {

	@Keyword
	def dropDown_Search(String Search_Text) {


		/*Mobile.comment('Validate Dropdown with Invalid text')
		 Mobile.delay(2)
		 Mobile.setText(findTestObject('Object Repository/Tester02_New/CustomerOnboardingPage_1/CustomerOnboardingPage1_dropdownArrow_Alternate ID Type (Optional)_Search'),
		 'abcdefghijklmnopqrstuvwxyz', 0)
		 Mobile.verifyElementText(findTestObject('Object Repository/Tester02_New/StartNewApplication/StartNewApplicationPage_IDType_dorpDown_No results found'),
		 'No results found')
		 Mobile.tap(findTestObject('Object Repository/Tester02_New/CustomerOnboardingPage_1/CustomerOnboardingPage1_dropdownArrow_Alternate ID Type (Optional)_Search_Close'),
		 0)*/

		Mobile.comment('Validate Dropdown with valid text')

		Mobile.setText(findTestObject('Object Repository/Tester02_New/CustomerOnboardingPage_1/CustomerOnboardingPage1_dropdownArrow_Alternate ID Type (Optional)_Search'),
				Search_Text, 0)

		Mobile.delay(5)

		Mobile.tap(findTestObject('Object Repository/Tester02_New/CustomerOnboardingPage_1/CustomerOnboardingPage1_dropdownArrow_Alternate ID Type (Optional)_Search_Result',[('Variable') : Search_Text]),
		0)
	}

	@Keyword
	def dropDown_Search(String Search_Text, Select_Text) {


		/*Mobile.comment('Validate Dropdown with Invalid text')
		 Mobile.delay(2)
		 Mobile.setText(findTestObject('Object Repository/Tester02_New/CustomerOnboardingPage_1/CustomerOnboardingPage1_dropdownArrow_Alternate ID Type (Optional)_Search'),
		 'abcdefghijklmnopqrstuvwxyz', 0)
		 Mobile.verifyElementText(findTestObject('Object Repository/Tester02_New/StartNewApplication/StartNewApplicationPage_IDType_dorpDown_No results found'),
		 'No results found')
		 Mobile.tap(findTestObject('Object Repository/Tester02_New/CustomerOnboardingPage_1/CustomerOnboardingPage1_dropdownArrow_Alternate ID Type (Optional)_Search_Close'),
		 0)*/

		Mobile.comment('Validate Dropdown with valid text')

		Mobile.setText(findTestObject('Object Repository/Tester02_New/CustomerOnboardingPage_1/CustomerOnboardingPage1_dropdownArrow_Alternate ID Type (Optional)_Search'),
				Search_Text, 0)

		Mobile.delay(5)

		Mobile.tap(findTestObject('Object Repository/Tester02_New/CustomerOnboardingPage_1/CustomerOnboardingPage1_dropdownArrow_Alternate ID Type (Optional)_Search_Result',[('Variable') : Select_Text]),
		0)
	}
}
