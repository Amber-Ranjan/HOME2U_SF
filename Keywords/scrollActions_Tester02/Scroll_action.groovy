package scrollActions_Tester02

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

public class Scroll_action {

	@Keyword
	def scroll_action(String swipeDirection) {
		//This function will take in the object we are looking for
		// the direction of swiping (will be opposite of scroll direction)
		// and number of max scrolls before failing (each scroll about one page)

		int deviceHeight = Mobile.getDeviceHeight();
		int deviceWidth = Mobile.getDeviceWidth();
		int top = 300;
		int bottom = deviceHeight -1100;
		int left = 300;
		int right = deviceWidth -100;


		switch (swipeDirection) {
			case 'up':
				Mobile.swipe(left, bottom, left,top)
			//Mobile.swipe(10, middleHeight, 10, 10)
			//Mobile.swipe(300, 1600, 300, 300)
				break
			case 'down':
				Mobile.swipe(left, top, left,bottom)
				break
			case 'right' :
				Mobile.swipe(left, top, right, top)
				break
			case 'left' :
				Mobile.swipe(right,bottom,left,bottom);
				break
		}
	}
}


