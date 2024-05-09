import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject

import java.util.concurrent.Delayed

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
import com.kms.katalon.core.webui.keyword.internal.WebUIAbstractKeyword
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

String TAG = "APPLY MEDICAL CLAIM: "

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
	
	println(TAG + "Navigate to Apply Medicacl Page") // Debug statement
	
	
	WebUI.navigateToUrl(hosturl + 'self_medicalclaimnewwf_newentry.jsp?reqstaffno=' + staffno)
	
	WebUI.callTestCase(findTestCase("Util/CheckIfInvalidOperation"),
		[:],
	FailureHandling.STOP_ON_FAILURE)
	
	println(TAG + "Navigate Successfull") // Debug statement

	
	// Employee Information
	TestObject input_year = findTestObject('Object Repository/Medical/ApplyMedical/input_zyear')
	TestObject input_telext = findTestObject('Object Repository/Medical/ApplyMedical/input_telext')
	
	// Medical Claims
	TestObject input_treatmentdate0 = findTestObject('Object Repository/Medical/ApplyMedical/input_treatmentdate')
	TestObject input_timein0 = findTestObject('Object Repository/Medical/ApplyMedical/input_timein')
	TestObject input_timeout0 = findTestObject('Object Repository/Medical/ApplyMedical/input_timeout')
	TestObject select_patientname0 = findTestObject('Object Repository/Medical/ApplyMedical/input_patientname')
	TestObject input_amtbfgst0 = findTestObject('Object Repository/Medical/ApplyMedical/input_amountclaimed')
	TestObject input_gstamt0 = findTestObject('Object Repository/Medical/ApplyMedical/input_gstamount')
	TestObject select_roundingadjustment0 = findTestObject('Object Repository/Medical/ApplyMedical/select_roundingadjustment')
	
	// Medical Claims - Additional Row
	TestObject select_medicaltypecode0 = findTestObject('Object Repository/Medical/ApplyMedical/select_medicaltypecode')
	TestObject input_receiptno = findTestObject('Object Repository/Medical/ApplyMedical/input_receiptno')
	TestObject checkbox_ispanel0 = findTestObject('Object Repository/Medical/ApplyMedical/checkbox_ispanelclinic')
	TestObject checkbox_isgovernment0 = findTestObject('Object Repository/Medical/ApplyMedical/checkbox_isgovernment')
	
	// Medical Claims - Clinic Info
	TestObject input_detaileddescription = findTestObject('Object Repository/Medical/ApplyMedical/input_detaileddescription')
	TestObject input_dischargedate0 = findTestObject('Object Repository/Medical/ApplyMedical/input_dischargedate')
	
	
	// Attachments
//	TestObject input_attachfile0 = findTestObject('Object Repository/Medical/ApplyMedical/input_attachfile0')
//	TestObject input_attachfile1 = findTestObject('Object Repository/Medical/ApplyMedical/input_attachfile1')
//	TestObject button_add_attachment = findTestObject('Object Repository/Medical/ApplyMedical/button_add_attachment')
	
	// Fill in Employee Information
	WebUI.setText(input_year, '2023')
	WebUI.setText(input_telext, '123456')
	
	// Fill in Medical Claims
	WebUI.setText(input_treatmentdate0, '01/05/2024')
	WebUI.setText(input_timein0, '09:00')
	WebUI.setText(input_timeout0, '17:00')
	WebUI.selectOptionByValue(select_patientname0, 'ZAKARIA BIN NAWANI', true)
	WebUI.setText(input_amtbfgst0, '100.00')
	WebUI.setText(input_gstamt0, '6.04')
	WebUI.selectOptionByValue(select_roundingadjustment0, '-0.04', true)

	
	// Medical Claims - Additional Row
	WebUI.selectOptionByValue(select_medicaltypecode0, 'HOSP', true)
	WebUI.setText(input_receiptno, 'hdow10928929731')
	WebUI.check(checkbox_ispanel0)
	WebUI.uncheck(checkbox_isgovernment0)
	
	// Medical Claims - Clinic Info
	WebUI.setText(input_dischargedate0, '04/05/2024')
	WebUI.setText(input_detaileddescription, 'this is detailed description info')

	
	
	// Upload Attachments
//	WebUI.uploadFile(input_attachfile0, '/path/to/your/attachment1.jpg')
//	WebUI.uploadFile(input_attachfile1, '/path/to/your/attachment2.pdf')
//	WebUI.click(button_add_attachment)
	
	// Click 'Save as Draft' and 'Send to Approver'
//	TestObject button_save_draft = findTestObject('Object Repository/Medical/ApplyMedical/button_save_draft')
//	TestObject button_send_approver = findTestObject('Object Repository/Medical/ApplyMedical/button_send_approver')
	
//	WebUI.click(button_save_draft)
//	WebUI.click(button_send_approver)
	
	
	
	
	
	
	
		
	WebUI.delay(2)
	
//	WebUI.closeBrowser()
}