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

import org.openqa.selenium.Keys as Keys
import io.appium.java_client.android.AndroidDriver;

public class scrollToText {

	/*
	 @Keyword
	 private static void scrollEntireList(String xpath, String elementText, ScrollFactor scrollFactor, ScrollDirection scrollDirection, Integer timeout) {
	 AppiumDriver<?> driver = MobileDriverFactory.getDriver();
	 Logger.debug("Getting a scroll list of all elements.");
	 @SuppressWarnings("unchecked")
	 List<RemoteWebElement> listElements = (List<RemoteWebElement>) driver.findElementsByXPath(xpath);
	 if (listElements.size() <= 0) {
	 // throw a new exception for not being able to find the elements
	 throw(new ListItemsNotFoundException(xpath));
	 }
	 Logger.debug("Current list:");
	 Logger.printList(listElements, LogLevel.DEBUG);
	 // TODO: Handle offset when looking at header labels with a lot of subitems in between
	 RemoteWebElement bottomElement = listElements.get(listElements.size() - 1);
	 // It's possible that the very last element may be cut off and cannot be tapped.
	 // In this case, the last visible list item should be considered the bottom.
	 RemoteWebElement justAboveBottomElement = listElements.get(listElements.size() - 2);
	 if (bottomElement.getSize().height < justAboveBottomElement.getSize().height) {
	 bottomElement = justAboveBottomElement;
	 }
	 RemoteWebElement topElement = listElements.get(0);
	 Logger.debug("Top element is now: " + topElement.getText() + " -> " + topElement.getLocation());
	 Logger.debug("Bottom element is now: " + bottomElement.getText() + " -> " + bottomElement.getLocation());
	 // Check if the last element is the same as the previous time we scrolled, if so,
	 // it means we hit the end of the list without finding the element
	 // and should throw an error.
	 String boundaryElementText = scrollDirection == ScrollDirection.DOWN ? "last" : "first";
	 Logger.debug("Comparing the previous " + boundaryElementText + " element in the list: " + lastScrolledElement);
	 RemoteWebElement boundaryElement = scrollDirection == ScrollDirection.DOWN ? bottomElement : topElement;
	 Logger.debug("with the new " + boundaryElementText + " element in the list: " + (boundaryElement != null ? boundaryElement.getText() : "null"));
	 if (lastScrolledElement != null && lastScrolledElement.equals(boundaryElement.getText())) {
	 Logger.error("Scrolled to the end of the list and we didn't find the element.");
	 // reset the last scrolled element for the next time we do scrolling
	 lastScrolledElement = null;
	 throw(new ListItemsNotFoundException(xpath, elementText));
	 }
	 Logger.debug("Resetting lastScrolledElement to " + boundaryElement.hashCode() + " " + boundaryElement.getText());
	 lastScrolledElement = boundaryElement.getText();
	 // Press and scroll from the last element in the list all the way to the top
	 Logger.debug("Scrolling...");
	 TouchAction touchAction = new TouchAction(driver);
	 Point from = scrollDirection == ScrollDirection.DOWN ? bottomElement.getLocation() : topElement.getLocation();
	 Point to = scrollDirection == ScrollDirection.DOWN ? topElement.getLocation() : bottomElement.getLocation();
	 // This simulates a swipe action, so releasing at the top of the screen will
	 // scroll the screen way further than we want. We may need to release the press
	 // further down the screen. Allowing the tester to set a scrollFactor will give them more control
	 // over how far the list scrolls.
	 int endY = from.y - (int)((from.y - to.y) * (double)scrollFactor.factor / 100.0);
	 Logger.debug("Scrolling from " + from.y + " to " + endY + " using scrollFactor " + scrollFactor);
	 touchAction.longPress(PointOption.point(from.x, from.y)).moveTo(PointOption.point(to.x, endY)).release().perform();
	 // Sometimes need a delay after scrolling before checking for the element
	 MobileBuiltInKeywords.delay(timeout);
	 Logger.debug("********** Scroll attempt complete *********** ");
	 }
	 */
}