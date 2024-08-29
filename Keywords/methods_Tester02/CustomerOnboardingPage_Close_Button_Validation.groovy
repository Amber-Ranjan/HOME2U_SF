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

public class CustomerOnboardingPage_Close_Button_Validation {


	@Keyword
	def closeButton(String Page) {

		switch (Page) {
			case 'CustomerOnboardingPage1':

				Mobile.tap(findTestObject('Object Repository/Tester02_New/CustomerOnboardingPage_1/CustomerOnboardingPage1_button_Close'),
				0)

				Mobile.tap(findTestObject('Object Repository/Tester02_New/CustomerOnboardingPage_1/CustomerOnboardingPage1_button_Close'),
						10, FailureHandling.OPTIONAL)

				Mobile.delay(3)

				Mobile.waitForElementPresent(findTestObject('Object Repository/Tester02_New/CustomerOnborading_Close/CustomerOnBoarding_ClosePopUp_text_Save Your Progress'),
						0)

				Mobile.verifyElementText(findTestObject('Object Repository/Tester02_New/CustomerOnborading_Close/CustomerOnBoarding_ClosePopUp_text_You can choose'),
						'You can choose to save your progress as a draft before leaving and pick-up from where you left off at a later time.')

				Mobile.tap(findTestObject('Object Repository/Tester02_New/CustomerOnborading_Close/CustomerOnBoarding_ClosePopUp_button_Exit'),
						0)

				Mobile.tap(findTestObject('Object Repository/Tester02_New/CustomerOnboardingPage_1/CustomerOnboardingPage1_button_Close'),
						0)


				Mobile.waitForElementPresent(findTestObject('Object Repository/Tester02_New/CustomerOnborading_Close/CustomerOnBoarding_ClosePopUp_text_Save Your Progress'),
						0)

				Mobile.tap(findTestObject('Object Repository/Tester02_New/CustomerOnborading_Close/CustomerOnBoarding_ClosePopUp_button_close'),
						0)
			/*
			 Mobile.tap(findTestObject('Object Repository/Tester02_New/CustomerOnboardingPage_1/CustomerOnboardingPage1_button_Close'),
			 0)
			 Mobile.waitForElementPresent(findTestObject('Object Repository/Tester02_New/CustomerOnborading_Close/CustomerOnBoarding_ClosePopUp_text_Save Your Progress'),
			 0)
			 Mobile.tap(findTestObject('Object Repository/Tester02_New/CustomerOnborading_Close/CustomerOnBoarding_ClosePopUp_button_Save Now'),0) */
				break;
			case 'CustomerOnboardingPage2':
				Mobile.tap(findTestObject('Object Repository/Tester02_New/CustomerOnboardingPage_2/CustomerOnboardingPage2_button_Close'),
				0)

				Mobile.waitForElementPresent(findTestObject('Object Repository/Tester02_New/CustomerOnborading_Close/CustomerOnBoarding_ClosePopUp_text_Save Your Progress'),
						0)

				Mobile.verifyElementText(findTestObject('Object Repository/Tester02_New/CustomerOnborading_Close/CustomerOnBoarding_ClosePopUp_text_You can choose'),
						'You can choose to save your progress as a draft before leaving and pick-up from where you left off at a later time.')

				Mobile.tap(findTestObject('Object Repository/Tester02_New/CustomerOnborading_Close/CustomerOnBoarding_ClosePopUp_button_Exit'),
						0)

				Mobile.tap(findTestObject('Object Repository/Tester02_New/CustomerOnboardingPage_2/CustomerOnboardingPage2_button_Close'),
						0)


				Mobile.waitForElementPresent(findTestObject('Object Repository/Tester02_New/CustomerOnborading_Close/CustomerOnBoarding_ClosePopUp_text_Save Your Progress'),
						0)

				Mobile.tap(findTestObject('Object Repository/Tester02_New/CustomerOnborading_Close/CustomerOnBoarding_ClosePopUp_button_close'),
						0)
			/*
			 Mobile.tap(findTestObject('Object Repository/Tester02_New/CustomerOnboardingPage_2/CustomerOnboardingPage2_button_Close'),
			 0)
			 Mobile.waitForElementPresent(findTestObject('Object Repository/Tester02_New/CustomerOnborading_Close/CustomerOnBoarding_ClosePopUp_text_Save Your Progress'),
			 0)
			 Mobile.tap(findTestObject('Object Repository/Tester02_New/CustomerOnborading_Close/CustomerOnBoarding_ClosePopUp_button_Save Now'),0) */
				break;
			case 'CustomerOnboardingPage3':
				Mobile.tap(findTestObject('Object Repository/Tester02_New/CustomerOnboardingPage_3/CustomerOnboardingPage3_button_Close'),
				0, FailureHandling.OPTIONAL)

				Mobile.tap(findTestObject('Object Repository/Tester02_New/CustomerOnboardingPage_3/CustomerOnboardingPage3_button_Close'),
						0, FailureHandling.OPTIONAL)

				Mobile.waitForElementPresent(findTestObject('Object Repository/Tester02_New/CustomerOnborading_Close/CustomerOnBoarding_ClosePopUp_text_Save Your Progress'),
						0, FailureHandling.OPTIONAL)

				Mobile.verifyElementText(findTestObject('Object Repository/Tester02_New/CustomerOnborading_Close/CustomerOnBoarding_ClosePopUp_text_You can choose'),
						'You can choose to save your progress as a draft before leaving and pick-up from where you left off at a later time.', FailureHandling.OPTIONAL)

				Mobile.tap(findTestObject('Object Repository/Tester02_New/CustomerOnborading_Close/CustomerOnBoarding_ClosePopUp_button_Exit'),
						0, FailureHandling.OPTIONAL)

				Mobile.tap(findTestObject('Object Repository/Tester02_New/CustomerOnboardingPage_3/CustomerOnboardingPage3_button_Close'),
						0)


				Mobile.waitForElementPresent(findTestObject('Object Repository/Tester02_New/CustomerOnborading_Close/CustomerOnBoarding_ClosePopUp_text_Save Your Progress'),
						0)

				Mobile.tap(findTestObject('Object Repository/Tester02_New/CustomerOnborading_Close/CustomerOnBoarding_ClosePopUp_button_close'),
						0)
			/*
			 Mobile.tap(findTestObject('Object Repository/Tester02_New/CustomerOnboardingPage_3/CustomerOnboardingPage3_button_Close'),
			 0)
			 Mobile.waitForElementPresent(findTestObject('Object Repository/Tester02_New/CustomerOnborading_Close/CustomerOnBoarding_ClosePopUp_text_Save Your Progress'),
			 0)
			 Mobile.tap(findTestObject('Object Repository/Tester02_New/CustomerOnborading_Close/CustomerOnBoarding_ClosePopUp_button_Save Now'),0) */
				break;
			case 'CustomerOnboardingPage4':

				Mobile.tap(findTestObject('Object Repository/Tester02_New/CustomerOnboardingPage_4/CustomerOnboardingPage4_button_Close'),
				0)

				Mobile.waitForElementPresent(findTestObject('Object Repository/Tester02_New/CustomerOnborading_Close/CustomerOnBoarding_ClosePopUp_text_Save Your Progress'),
						0)

				Mobile.verifyElementText(findTestObject('Object Repository/Tester02_New/CustomerOnborading_Close/CustomerOnBoarding_ClosePopUp_text_You can choose'),
						'You can choose to save your progress as a draft before leaving and pick-up from where you left off at a later time.')

				Mobile.tap(findTestObject('Object Repository/Tester02_New/CustomerOnborading_Close/CustomerOnBoarding_ClosePopUp_button_Exit'),
						0)

				Mobile.tap(findTestObject('Object Repository/Tester02_New/CustomerOnboardingPage_4/CustomerOnboardingPage4_button_Close'),
						0)

				Mobile.waitForElementPresent(findTestObject('Object Repository/Tester02_New/CustomerOnborading_Close/CustomerOnBoarding_ClosePopUp_text_Save Your Progress'),
						0)

				Mobile.tap(findTestObject('Object Repository/Tester02_New/CustomerOnborading_Close/CustomerOnBoarding_ClosePopUp_button_close'),
						0)
			/*
			 Mobile.tap(findTestObject('Object Repository/Tester02_New/CustomerOnboardingPage_4/CustomerOnboardingPage4_button_Close'),
			 0)
			 Mobile.waitForElementPresent(findTestObject('Object Repository/Tester02_New/CustomerOnborading_Close/CustomerOnBoarding_ClosePopUp_text_Save Your Progress'),
			 0)
			 Mobile.tap(findTestObject('Object Repository/Tester02_New/CustomerOnborading_Close/CustomerOnBoarding_ClosePopUp_button_Save Now'),0) */
				break;
			case 'CustomerOnboardingPage5':

				Mobile.tap(findTestObject('Object Repository/Tester02_New/CustomerOnboardingPage_5/CustomerOnboardingPage5_button_Close'),
				0)

				Mobile.waitForElementPresent(findTestObject('Object Repository/Tester02_New/CustomerOnborading_Close/CustomerOnBoarding_ClosePopUp_text_Save Your Progress'),
						0)

				Mobile.verifyElementText(findTestObject('Object Repository/Tester02_New/CustomerOnborading_Close/CustomerOnBoarding_ClosePopUp_text_You can choose'),
						'You can choose to save your progress as a draft before leaving and pick-up from where you left off at a later time.')

				Mobile.tap(findTestObject('Object Repository/Tester02_New/CustomerOnborading_Close/CustomerOnBoarding_ClosePopUp_button_Exit'),
						0)

				Mobile.tap(findTestObject('Object Repository/Tester02_New/CustomerOnboardingPage_5/CustomerOnboardingPage5_button_Close'),
						0)

				Mobile.waitForElementPresent(findTestObject('Object Repository/Tester02_New/CustomerOnborading_Close/CustomerOnBoarding_ClosePopUp_text_Save Your Progress'),
						0)

				Mobile.tap(findTestObject('Object Repository/Tester02_New/CustomerOnborading_Close/CustomerOnBoarding_ClosePopUp_button_close'),
						0)
			/*
			 Mobile.tap(findTestObject('Object Repository/Tester02_New/CustomerOnboardingPage_5/CustomerOnboardingPage5_button_Close'),
			 0)
			 Mobile.waitForElementPresent(findTestObject('Object Repository/Tester02_New/CustomerOnborading_Close/CustomerOnBoarding_ClosePopUp_text_Save Your Progress'),
			 0)
			 Mobile.tap(findTestObject('Object Repository/Tester02_New/CustomerOnborading_Close/CustomerOnBoarding_ClosePopUp_button_Save Now'),0) */
		}
	}
}
