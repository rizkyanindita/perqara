import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import com.kms.katalon.core.annotation.Keyword
import com.kms.katalon.core.checkpoint.Checkpoint
import com.kms.katalon.core.checkpoint.CheckpointFactory
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.testcase.TestCase
import com.kms.katalon.core.testcase.TestCaseFactory
import com.kms.katalon.core.testdata.TestData
import com.kms.katalon.core.testdata.TestDataFactory
import com.kms.katalon.core.testobject.ObjectRepository
import com.kms.katalon.core.testobject.TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

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

import cucumber.api.java.en.And
import cucumber.api.java.en.Given
import cucumber.api.java.en.Then
import cucumber.api.java.en.When



class RegisterStep {

	@Given("start apps")
	def start_apps() {
		print 'test coba'
		Mobile.startApplication('/Users/macbookpro/Documents/app-release.apk', false)
	}
	@When("I Want to click button (.*) in onboarding pages")
	def click_button_onboading(String button) {
		print button
		if (Mobile.verifyElementNotExist(findTestObject(button), 3)) {
			print 'ga nongol onboarding pages mas'
		}else {
			Mobile.tap(findTestObject(button), 10)
		}
		
	}
	@When("click button (.*)")
	def click_button(String button1) {
		print 'test coba2'
		Mobile.tap(findTestObject(button1), 10)
	}
	
	@When("input text in (.*) with (.*)")
	def set_text(String field, String text) {
		print 'test coba3'
		Mobile.setText(findTestObject(field), text, 0)
	}
	
	

	@Then("capture image")
	def capture() {
		Mobile.takeScreenshot("/Users/macbookpro/Documents/ss/cobasek.png")
	}


	@Then("Close application")
	def I_verify_the_status_in_step() {
		Mobile.closeApplication()
	}
}