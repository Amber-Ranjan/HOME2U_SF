package com.keywords
import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import com.kms.katalon.core.annotation.Keyword
import com.kms.katalon.core.checkpoint.Checkpoint
import com.kms.katalon.core.checkpoint.CheckpointFactory
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords
import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.testcase.TestCase
import com.kms.katalon.core.testcase.TestCaseFactory
import com.kms.katalon.core.testdata.TestData
import com.kms.katalon.core.testdata.TestDataFactory
import com.kms.katalon.core.testobject.ObjectRepository
import com.kms.katalon.core.testobject.TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile

import internal.GlobalVariable

import org.openqa.selenium.WebElement
import org.openqa.selenium.WebDriver
import org.openqa.selenium.By

import com.kms.katalon.core.mobile.keyword.internal.MobileDriverFactory
import com.kms.katalon.core.webui.driver.DriverFactory

import com.kms.katalon.core.testobject.RequestObject
import com.kms.katalon.core.testobject.ResponseObject
import com.kms.katalon.core.testobject.ConditionType
import com.kms.katalon.core.testobject.TestObjectProperty

import com.kms.katalon.core.mobile.helper.MobileElementCommonHelper
import com.kms.katalon.core.util.KeywordUtil

import com.kms.katalon.core.webui.exception.WebElementNotFoundException


class ScrollAction {
	/**
	 * Check if element present in timeout
	 * @param to Katalon test object
	 * @param timeout time to wait for element to show up
	 * @return true if element present, otherwise false
	 */
	@Keyword
	def scroll(float startYPercentage,float endYPercentage ) {

		Mobile.takeScreenshot(FailureHandling.OPTIONAL)

		// swipe up the screen
		int startX = Mobile.getDeviceWidth()/2;
		int endX = Mobile.getDeviceWidth()/2;
		int startY = Mobile.getDeviceHeight()*startYPercentage;
		int endY = Mobile.getDeviceHeight()*endYPercentage;
		Mobile.swipe(startX, startY, endX, endY)

		Mobile.takeScreenshot(FailureHandling.OPTIONAL)


	}


	@Keyword
	def scrollUntillText(float startYPercentage, float endYPercentage, String scrollText ) {

		Mobile.takeScreenshot(FailureHandling.OPTIONAL)

		// swipe up the screen
		int startX = Mobile.getDeviceWidth()/2;
		int endX = Mobile.getDeviceWidth()/2;
		int startY = Mobile.getDeviceHeight()*startYPercentage;
		int endY = Mobile.getDeviceHeight()*endYPercentage;
		Mobile.swipe(startX, startY, endX, endY)

		for (int i=0; i<=5; i++) {

			if (Mobile.verifyElementNotExist(findTestObject(scrollText), 5, FailureHandling.OPTIONAL)) {

				Mobile.swipe(startX, startY, endX, endY)
			}

			Mobile.takeScreenshot(FailureHandling.OPTIONAL)

		}
	}

}
