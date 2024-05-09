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
import com.kms.katalon.core.testdata.TestDataFactory as TestDataFactory
import org.openqa.selenium.By
import com.kms.katalon.core.webui.driver.DriverFactory
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.webui.driver.DriverFactory as DriverFactory
import org.openqa.selenium.By as By
import com.kms.katalon.core.testobject.ConditionType as ConditionType
import com.kms.katalon.core.testcase.TestCaseFactory as TestCaseFactory
import org.openqa.selenium.Alert
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import org.openqa.selenium.WebElement
import com.kms.katalon.core.testobject.TestObject

String TAG = "MEDICAL EXCESS: "

def credentialsData = findTestData('Credentials')
def envData = findTestData('Env')

String hosturl = envData.getObjectValue('url', 1)

println(TAG + "Selected Env $hosturl") // Debug statement

int responseDelay = 1;


for(int i=1; i <= credentialsData.getRowNumbers(); i++ ) {
	WebUI.openBrowser('')
	
	println(TAG + "Capture Stored Values") // Debug statement
	
	
	// Select the test user data from the internal data storage
	String username = credentialsData.getObjectValue('user', i)
	String password = credentialsData.getObjectValue('psswd', i)
	String staffno = credentialsData.getObjectValue('staffno', i)

	
	println(TAG + "Call Login Test Case") // Debug statement
	WebUI.delay(1)
	
	WebUI.callTestCase(findTestCase("AccountManagement/Login_PDPA"),
		 ["username": username,
		"password": password,
		 "staffno":staffno,
		 "url": hosturl],
	 FailureHandling.STOP_ON_FAILURE)

	WebUI.delay(2)
	
	println(TAG + "Navigate to Medical Excess") // Debug statement
	
	WebUI.navigateToUrl(hosturl + 'selflist_medicalexcess.jsp')
	
	WebUI.callTestCase(findTestCase("Util/CheckIfInvalidOperation"),
		[:],
	FailureHandling.STOP_ON_FAILURE)

	
	println(TAG + "Navigate Successfull") // Debug statement
	
	WebUI.delay(2)
	
	WebUI.closeBrowser()
}