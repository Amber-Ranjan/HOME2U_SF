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

public class AddFloatValues {

	@Keyword
	def AddFloatValuesMethod(String var1, String var2, String var3, String var4, String var5, String var6, String var7, String var8, String var9, String var10, String var11, String var12, String var13, String var14, String InputComparisonValue) {

		//def formatr = new DecimalFormat('0.00');

		float val1 = Float.parseFloat(var1.replaceAll(",", ""));
		float val2 = Float.parseFloat(var2.replaceAll(",", ""));
		float val3 = Float.parseFloat(var3.replaceAll(",", ""));
		float val4 = Float.parseFloat(var4.replaceAll(",", ""));
		float val5 = Float.parseFloat(var5.replaceAll(",", ""));
		float val6 = Float.parseFloat(var6.replaceAll(",", ""));
		float val7 = Float.parseFloat(var7.replaceAll(",", ""));
		float val8 = Float.parseFloat(var8.replaceAll(",", ""));
		float val9 = Float.parseFloat(var9.replaceAll(",", ""));
		float val10 = Float.parseFloat(var10.replaceAll(",", ""));
		float val11 = Float.parseFloat(var11.replaceAll(",", ""));
		float val12 = Float.parseFloat(var12.replaceAll(",", ""));
		float val13 = Float.parseFloat(var13.replaceAll(",", ""));
		float val14 = Float.parseFloat(var14.replaceAll(",", ""));
		float InputComparisonVal = Float.parseFloat(InputComparisonValue);


		float total = val1+val2+val3+val4+val5+val6+val7+val8+val9+val10+val11+val12+val13+val14

		println("total is =========================================================="+total)
		println("inputcomparisonval is =========================================================="+InputComparisonVal)

		if (InputComparisonVal==InputComparisonVal) {

			println("true")
			return true

		}else if (val3!=val4) {
			println("false")
			return false

		}
	}

}

