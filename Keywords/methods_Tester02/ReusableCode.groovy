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
import java.time.LocalDateTime
import java.time.format.DateTimeFormatter

public class ReusableCode {


	@Keyword
	public void tapping(TestObject object) {
		Mobile.verifyElementVisible(object, 0)
		Mobile.takeScreenshot()
		Mobile.tap(object, 0)
		Mobile.delay(1)
	}

	@Keyword
	public void verifyEqual(TestObject object, String expectedText) {
		Mobile.verifyElementVisible(object, 0)
		Mobile.verifyEqual(Mobile.getText(object, 0), expectedText)
	}

	@Keyword
	public void clearAndSetText(TestObject object, String expectedText) {
		Mobile.verifyElementVisible(object, 0)
		Mobile.clearText(object, 0)
		Mobile.setText(object, expectedText, 0)
	}

	@Keyword
	public String dateddMMMyyyy() {
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd MMM yyyy");
		LocalDateTime now = LocalDateTime.now();
		return dtf.format(now);
	}
}
