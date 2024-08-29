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

public class Click_LinkText {

	@Keyword
	def LinkText_Click(TestObject MobileElement1 , int x , int y) {


		Mobile.comment('Pass the Mobile Element (findObject) and x , y')


		String x_Element = Mobile.getAttribute(MobileElement1 , 'x', 10, FailureHandling.STOP_ON_FAILURE)


		String y_Element = Mobile.getAttribute(MobileElement1, 'y', 10, FailureHandling.STOP_ON_FAILURE)


		String width_Element = Mobile.getAttribute(MobileElement1, 'width', 10, FailureHandling.STOP_ON_FAILURE)


		String height_Element = Mobile.getAttribute(MobileElement1, 'height', 10, FailureHandling.STOP_ON_FAILURE)

		int x_position_Element = Integer.parseInt(x_Element)

		int y_position_Element = Integer.parseInt(y_Element)

		Mobile.tapAtPosition(x_position_Element+x, x_position_Element+y)
	}
}
