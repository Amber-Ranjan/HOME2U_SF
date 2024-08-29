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

public class ValidateTextBox {


	@Keyword
	def ValidateText_Alpha_Max(TestObject MobileElement1 , int n) {


		/*Mobile.comment('Validate TextBox with Invalid text')
		 String InvalidCharText_Input = '1234567890qwertyuiopasdfghjklzxcvbnm!@#$%^&*()QWERTYUIOOASDFGHJKLZCVBNM';
		 Mobile.delay(2)
		 Mobile.setText(MobileElement1, InvalidCharText_Input , 0,FailureHandling.OPTIONAL)
		 def InvalidCharText_Output = Mobile.getText(MobileElement1 , 0,FailureHandling.OPTIONAL)
		 Mobile.verifyMatch(InvalidCharText_Input , InvalidCharText_Output, false,FailureHandling.OPTIONAL)
		 Mobile.verifyNotMatch(InvalidCharText_Input , InvalidCharText_Output, false,FailureHandling.OPTIONAL)
		 Mobile.comment('Validate TextBox with valid text  -- Max')
		 def MaxCharText_Input = 'abcdefghijklmnopqrstuvwxyzabcdefghijklmno';
		 Mobile.delay(2)
		 switch (n) {
		 case '2000':
		 def MaxCharText_Output_Expected_2000 = 'WEDRFGTHYBGFDSDFVGDCSXCFVGBHVFDCSXCFVGBHNBGFEDWRFTGHYGFREDWRFGTHNGBFDCESFRGHNGBFDE234SXDFGHNGFHMHGTYJUYHTGRGTHJGFGHNGBFVBHNMBGFVGBHNBFVDCVGBHNJMNHGBFVDGBHNGBFVGHNGBFVBHNGBFDCSEFRTYHT543541234567890WEDRFGTHYBGFDSDFVGDCSXCFVGBHVFDCSXCFVGBHNBGFEDWRFTGHYGFREDWRFGTHNGBFDCESFRGHNGBFDE234SXDFGHNGFHMHGTYJUYHTGRGTHJGFGHNGBFVBHNMBGFVGBHNBFVDCVGBHNJMNHGBFVDGBHNGBFVGHNGBFVBHNGBFDCSEFRTYHT543541234567890WEDRFGTHYBGFDSDFVGDCSXCFVGBHVFDCSXCFVGBHNBGFEDWRFTGHYGFREDWRFGTHNGBFDCESFRGHNGBFDE234SXDFGHNGFHMHGTYJUYHTGRGTHJGFGHNGBFVBHNMBGFVGBHNBFVDCVGBHNJMNHGBFVDGBHNGBFVGHNGBFVBHNGBFDCSEFRTYHT543541234567890WEDRFGTHYBGFDSDFVGDCSXCFVGBHVFDCSXCFVGBHNBGFEDWRFTGHYGFREDWRFGTHNGBFDCESFRGHNGBFDE234SXDFGHNGFHMHGTYJUYHTGRGTHJGFGHNGBFVBHNMBGFVGBHNBFVDCVGBHNJMNHGBFVDGBHNGBFVGHNGBFVBHNGBFDCSEFRTYHT543541234567890WEDRFGTHYBGFDSDFVGDCSXCFVGBHVFDCSXCFVGBHNBGFEDWRFTGHYGFREDWRFGTHNGBFDCESFRGHNGBFDE234SXDFGHNGFHMHGTYJUYHTGRGTHJGFGHNGBFVBHNMBGFVGBHNBFVDCVGBHNJMNHGBFVDGBHNGBFVGHNGBFVBHNGBFDCSEFRTYHT543541234567890WEDRFGTHYBGFDSDFVGDCSXCFVGBHVFDCSXCFVGBHNBGFEDWRFTGHYGFREDWRFGTHNGBFDCESFRGHNGBFDE234SXDFGHNGFHMHGTYJUYHTGRGTHJGFGHNGBFVBHNMBGFVGBHNBFVDCVGBHNJMNHGBFVDGBHNGBFVGHNGBFVBHNGBFDCSEFRTYHT543541234567890WEDRFGTHYBGFDSDFVGDCSXCFVGBHVFDCSXCFVGBHNBGFEDWRFTGHYGFREDWRFGTHNGBFDCESFRGHNGBFDE234SXDFGHNGFHMHGTYJUYHTGRGTHJGFGHNGBFVBHNMBGFVGBHNBFVDCVGBHNJMNHGBFVDGBHNGBFVGHNGBFVBHNGBFDCSEFRTYHT543541234567890WEDRFGTHYBGFDSDFVGDCSXCFVGBHVFDCSXCFVGBHNBGFEDWRFTGHYGFREDWRFGTHNGBFDCESFRGHNGBFDE234SXDFGHNGFHMHGTYJUYHTGRGTHJGFGHNGBFVBHNMBGFVGBHNBFVDCVGBHNJMNHGBFVDGBHNGBFVGHNGBFVBHNGBFDCSEFRTYHT543541234567890WEDRFGTHYBGFDSDFVGDCSXCFVGBHVFDCSXCFVGBHNBGFEDWRFTGHYGFREDWRFGTHNGBFDCESFRGHNGBFDE234SXDFGHNGFHMHGTYJUYHTGRGTHJGFGHNGBFVBHNMBGFVGBHNBFVDCVGBHNJMNHGBFVDGBHNGBFVGHNGBFVBHNGBFDCSEFRTYHT543541234567890WEDRFGTHYBGFDSDFVGDCSXCFVGBHVFDCSXCFVGBHNBGFEDWRFTGHYGFREDWRFGTHNGBFDCESFRGHNGBFDE234SXDFGHNGFHMHGTYJUYHTGRGTHJGFGHNGBFVBHNMBGFVGBHNBFVDCVGBHNJMNHGBFVDGBHNGBFVGHNGBFVBHNGBFDCSEFRTYHT543541234567890WEDRFGTHYBGFDSIA78748273843787c';
		 def MaxCharText_Output_Actual = Mobile.getText(MobileElement1 , 0,FailureHandling.OPTIONAL)
		 Mobile.verifyMatch(MaxCharText_Output_Expected_2000 , MaxCharText_Output_Actual, true,FailureHandling.OPTIONAL)
		 break;
		 case '40':
		 def MaxCharText_Output_Expected_40 = 'abcdefghijklmnopqrstuvwxyzabcdefghijklmn';
		 def MaxCharText_Output_Actual = Mobile.getText(MobileElement1 , 0,FailureHandling.OPTIONAL)
		 Mobile.verifyMatch(MaxCharText_Output_Expected_40 , MaxCharText_Output_Actual, true,FailureHandling.OPTIONAL)
		 break;
		 case '20':
		 def MaxCharText_Output_Expected_20 = 'abcdefghijklmnopqrst';
		 def MaxCharText_Output_Actual = Mobile.getText(MobileElement1 , 0,FailureHandling.OPTIONAL)
		 Mobile.verifyMatch(MaxCharText_Output_Expected_20 , MaxCharText_Output_Actual, true,FailureHandling.OPTIONAL)
		 break;
		 case '10':
		 def MaxCharText_Output_Expected_10 = 'abcdefghij';
		 def MaxCharText_Output_Actual = Mobile.getText(MobileElement1 , 0,FailureHandling.OPTIONAL)
		 Mobile.verifyMatch(MaxCharText_Output_Expected_10 , MaxCharText_Output_Actual, true,FailureHandling.OPTIONAL)
		 break;
		 case '5':
		 def MaxCharText_Output_Expected_5 = 'abcde';
		 def MaxCharText_Output_Actual = Mobile.getText(MobileElement1 , 0,FailureHandling.OPTIONAL)
		 Mobile.verifyMatch(MaxCharText_Output_Expected_5 , MaxCharText_Output_Actual, true,FailureHandling.OPTIONAL)
		 break;
		 }
		 Mobile.clearText(MobileElement1 , 0,FailureHandling.OPTIONAL)*/
	}
}