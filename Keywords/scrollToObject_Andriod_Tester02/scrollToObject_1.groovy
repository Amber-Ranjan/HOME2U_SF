package scrollToObject_Andriod_Tester02

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

public class scrollToObject_1 {


	@Keyword
	def scroll_to_Object(String objectPath, String swipeDirection, int maxScrolls ) {
		//This function will take in the object we are looking for
		// the direction of swiping (will be opposite of scroll direction)
		// and number of max scrolls before failing (each scroll about one page)


		//int deviceHeight = Mobile.getDeviceHeight()
		//int deviceWidth = Mobile.getDeviceWidth()

		int deviceHeight = 1600
		int deviceWidth = 700
		int middleWidth = deviceWidth/2
		int middleHeight = deviceHeight/2
		int buttonPosition = 0
		int count = 0
		while (count < maxScrolls) {
			try {
				Mobile.verifyElementVisible(findTestObject(objectPath), 1, FailureHandling.STOP_ON_FAILURE)

				//KeywordUtil.
				//KeywordUtil.logInfo('Button is found')
				buttonPosition = Mobile.getElementTopPosition(findTestObject(objectPath), 2, FailureHandling.STOP_ON_FAILURE)
				if (buttonPosition < deviceHeight ){
					return
				}
			} catch (Exception ex) {
				switch (swipeDirection) {
					case 'up':
						Mobile.swipe(10, middleHeight, 10, 10)
						break
					case 'down':
						Mobile.swipe(10, middleHeight, 10, (deviceHeight-10))
						break
					case 'right' :
						Mobile.swipe(10, 10, middleWidth, 10)
						break
					case 'left' :
						Mobile.swipe((deviceWidth-10), 10, middleWidth, 10);
						break
				}
				count ++
			}
		}
		//KeywordUtil.logInfo('Object not found in max amount of scrolls')
	}
}
