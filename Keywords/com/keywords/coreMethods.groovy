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

import java.text.DecimalFormat
import internal.GlobalVariable
//import java.io.*;
public class coreMethods {

	@Keyword
	static float parseFloat(String variable1) {


		def formatr = new DecimalFormat('0.00');

		float val1 = formatr.format(Float.parseFloat(variable1.substring(3).replaceAll(",", "")));
		println("============================================================================================"+val1)
		return val1
	}

	@Keyword
	static boolean CompareTowFloatValues(String maxValue, String minValue, String toCompare) {

		//def formatr = new DecimalFormat('0.00');
		//change the string to float value
		Float.parseFloat(maxValue)
		float maxValueLocal = Float.parseFloat(maxValue);
		float minValueLocal = Float.parseFloat(minValue);
		float toCompareLocal = Float.parseFloat(toCompare);

		if ((maxValueLocal - minValueLocal) == toCompareLocal) {

			return true

		}
		return false

	}
}
