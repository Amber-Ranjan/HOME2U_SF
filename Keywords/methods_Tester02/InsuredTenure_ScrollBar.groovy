package methods_Tester02

import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testng.keyword.TestNGBuiltinKeywords as TestNGKW
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys



import com.kms.katalon.core.annotation.Keyword


public class InsuredTenure_ScrollBar {

	@Keyword
	def InsuredTenure_ScrollBar_Years( int years) {





		Mobile.comment('Enter Year from 5 to 35')

		TestObject  InsuredTenure_Scroll_bar = findTestObject('Object Repository/Tester02_New/DataEntryPages/DataEntryPage4/DataEntryPage4_Insured Tenure_Scroll_bar')

		TestObject  InsuredTenure_Scroll_Knob = findTestObject('Object Repository/Tester02_New/DataEntryPages/DataEntryPage4/DataEntryPage4_Insured Tenure_Scroll_Pin')

		String x_Element = Mobile.getAttribute(InsuredTenure_Scroll_bar , 'x', 10, FailureHandling.STOP_ON_FAILURE)

		String y_Element = Mobile.getAttribute(InsuredTenure_Scroll_bar, 'y', 10, FailureHandling.STOP_ON_FAILURE)


		String width_Element = Mobile.getAttribute(InsuredTenure_Scroll_bar, 'width', 10, FailureHandling.STOP_ON_FAILURE)


		String height_Element = Mobile.getAttribute(InsuredTenure_Scroll_bar, 'height', 10, FailureHandling.STOP_ON_FAILURE)

		int x_starting = Integer.parseInt(x_Element)

		int y_starting = Integer.parseInt(y_Element)

		int width = Integer.parseInt(width_Element)

		int n = (width/31.5)

		switch (years) {
			case '5':
				int x_ending = x_starting + ((years-5)*n);

				Mobile.tapAndHold(InsuredTenure_Scroll_Knob,
						0, 0)

				Mobile.swipe(x_starting, y_starting,x_ending , y_starting)
				break;
			case '6':
				int x_ending = x_starting + ((years-5)*n);

				Mobile.tapAndHold(InsuredTenure_Scroll_Knob,
						0, 0)

				Mobile.swipe(x_starting, y_starting,x_ending , y_starting)

				break;


			case '7':

				int x_ending = x_starting + ((years-5)*n);

				Mobile.tapAndHold(InsuredTenure_Scroll_Knob,
						0, 0)

				Mobile.swipe(x_starting, y_starting,x_ending , y_starting)
				break;


			case '8':
				int x_ending = x_starting + ((years-5)*n);

				Mobile.tapAndHold(InsuredTenure_Scroll_Knob,
						0, 0)

				Mobile.swipe(x_starting, y_starting,x_ending , y_starting)
				break;
			case '9':
				int x_ending = x_starting + ((years-5)*n);

				Mobile.tapAndHold(InsuredTenure_Scroll_Knob,
						0, 0)

				Mobile.swipe(x_starting, y_starting,x_ending , y_starting)
				break;
			case '10':
				int x_ending = x_starting + ((years-5)*n);

				Mobile.tapAndHold(InsuredTenure_Scroll_Knob,
						0, 0)

				Mobile.swipe(x_starting, y_starting,x_ending , y_starting)

				break;


			case '11':

				int x_ending = x_starting + ((years-5)*n);

				Mobile.tapAndHold(InsuredTenure_Scroll_Knob,
						0, 0)

				Mobile.swipe(x_starting, y_starting,x_ending , y_starting)
				break;


			case '12':
				int x_ending = x_starting + ((years-5)*n);

				Mobile.tapAndHold(InsuredTenure_Scroll_Knob,
						0, 0)

				Mobile.swipe(x_starting, y_starting,x_ending , y_starting)
				break;

			case '13':
				int x_ending = x_starting + ((years-5)*n);

				Mobile.tapAndHold(InsuredTenure_Scroll_Knob,
						0, 0)

				Mobile.swipe(x_starting, y_starting,x_ending , y_starting)
				break;
			case '14':
				int x_ending = x_starting + ((years-5)*n);

				Mobile.tapAndHold(InsuredTenure_Scroll_Knob,
						0, 0)

				Mobile.swipe(x_starting, y_starting,x_ending , y_starting)

				break;


			case '15':

				int x_ending = x_starting + ((years-5)*n);

				Mobile.tapAndHold(InsuredTenure_Scroll_Knob,
						0, 0)

				Mobile.swipe(x_starting, y_starting,x_ending , y_starting)
				break;


			case '16':
				int x_ending = x_starting + ((years-5)*n);

				Mobile.tapAndHold(InsuredTenure_Scroll_Knob,
						0, 0)

				Mobile.swipe(x_starting, y_starting,x_ending , y_starting)
				break;
			case '17':
				int x_ending = x_starting + ((years-5)*n);

				Mobile.tapAndHold(InsuredTenure_Scroll_Knob,
						0, 0)

				Mobile.swipe(x_starting, y_starting,x_ending , y_starting)
				break;
			case '18':
				int x_ending = x_starting + ((years-5)*n);

				Mobile.tapAndHold(InsuredTenure_Scroll_Knob,
						0, 0)

				Mobile.swipe(x_starting, y_starting,x_ending , y_starting)

				break;


			case '19':

				int x_ending = x_starting + ((years-5)*n);

				Mobile.tapAndHold(InsuredTenure_Scroll_Knob,
						0, 0)

				Mobile.swipe(x_starting, y_starting,x_ending , y_starting)
				break;


			case '20':
				int x_ending = x_starting + ((years-5)*n);

				Mobile.tapAndHold(InsuredTenure_Scroll_Knob,
						0, 0)

				Mobile.swipe(x_starting, y_starting,x_ending , y_starting)
				break;

			case '21':
				int x_ending = x_starting + ((years-5)*n);

				Mobile.tapAndHold(InsuredTenure_Scroll_Knob,
						0, 0)

				Mobile.swipe(x_starting, y_starting,x_ending , y_starting)
				break;
			case '22':
				int x_ending = x_starting + ((years-5)*n);

				Mobile.tapAndHold(InsuredTenure_Scroll_Knob,
						0, 0)

				Mobile.swipe(x_starting, y_starting,x_ending , y_starting)

				break;


			case '23':

				int x_ending = x_starting + ((years-5)*n);

				Mobile.tapAndHold(InsuredTenure_Scroll_Knob,
						0, 0)

				Mobile.swipe(x_starting, y_starting,x_ending , y_starting)
				break;


			case '24':
				int x_ending = x_starting + ((years-5)*n);

				Mobile.tapAndHold(InsuredTenure_Scroll_Knob,
						0, 0)

				Mobile.swipe(x_starting, y_starting,x_ending , y_starting)
				break;
			case '25':
				int x_ending = x_starting + ((years-5)*n);

				Mobile.tapAndHold(InsuredTenure_Scroll_Knob,
						0, 0)

				Mobile.swipe(x_starting, y_starting,x_ending , y_starting)
				break;
			case '26':
				int x_ending = x_starting + ((years-5)*n);

				Mobile.tapAndHold(InsuredTenure_Scroll_Knob,
						0, 0)

				Mobile.swipe(x_starting, y_starting,x_ending , y_starting)

				break;


			case '27':

				int x_ending = x_starting + ((years-5)*n);

				Mobile.tapAndHold(InsuredTenure_Scroll_Knob,
						0, 0)

				Mobile.swipe(x_starting, y_starting,x_ending , y_starting)
				break;


			case '28':
				int x_ending = x_starting + ((years-5)*n);

				Mobile.tapAndHold(InsuredTenure_Scroll_Knob,
						0, 0)

				Mobile.swipe(x_starting, y_starting,x_ending , y_starting)
				break;

			case '29':
				int x_ending = x_starting + ((years-5)*n);

				Mobile.tapAndHold(InsuredTenure_Scroll_Knob,
						0, 0)

				Mobile.swipe(x_starting, y_starting,x_ending , y_starting)
				break;
			case '30':
				int x_ending = x_starting + ((years-5)*n);

				Mobile.tapAndHold(InsuredTenure_Scroll_Knob,
						0, 0)

				Mobile.swipe(x_starting, y_starting,x_ending , y_starting)

				break;

			case '31':
				int x_ending = x_starting + ((years-5)*n);

				Mobile.tapAndHold(InsuredTenure_Scroll_Knob,
						0, 0)

				Mobile.swipe(x_starting, y_starting,x_ending , y_starting)

				break;

			case '32':
				int x_ending = x_starting + ((years-5)*n);

				Mobile.tapAndHold(InsuredTenure_Scroll_Knob,
						0, 0)

				Mobile.swipe(x_starting, y_starting,x_ending , y_starting)

				break;

			case '33':
				int x_ending = x_starting + ((years-5)*n);

				Mobile.tapAndHold(InsuredTenure_Scroll_Knob,
						0, 0)

				Mobile.swipe(x_starting, y_starting,x_ending , y_starting)

				break;

			case '34':
				int x_ending = x_starting + ((years-5)*n);

				Mobile.tapAndHold(InsuredTenure_Scroll_Knob,
						0, 0)

				Mobile.swipe(x_starting, y_starting,x_ending , y_starting)

				break;

			case '35':
				int x_ending = x_starting + ((years-5)*n);

				Mobile.tapAndHold(InsuredTenure_Scroll_Knob,
						0, 0)

				Mobile.swipe(x_starting, y_starting,x_ending , y_starting)

				break;
		}
	}
}
