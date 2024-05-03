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

WebUI.openBrowser('')

WebUI.navigateToUrl('http://13.228.241.164:8081/hrp2/stafflogin.jsp')

WebUI.setText(findTestObject('Object Repository/Medical/Page_HR Avenue - Login Page/input_Remember Me_username'), '0068')

WebUI.setEncryptedText(findTestObject('Object Repository/Medical/Page_HR Avenue - Login Page/input_Remember Me_password'), 
    'cvW8qx4B2o3F4VwP/kNsqA==')

WebUI.click(findTestObject('Object Repository/Medical/Page_HR Avenue - Login Page/button_LOGIN'))

WebUI.click(findTestObject('Object Repository/Medical/Page_PDPA/input_Test_btnAgree'))

WebUI.click(findTestObject('Object Repository/Medical/Page_- Employee Self Service/a_Apply Medical Claim'))

WebUI.setText(findTestObject('Object Repository/Medical/Page_- Employee Self Service/input__telext'), '123')

WebUI.setText(findTestObject('Object Repository/Medical/Page_- Employee Self Service/input_Amount Approved (RM)_treatmentdate0'), 
    '')

WebUI.click(findTestObject('Object Repository/Medical/Page_- Employee Self Service/input_Amount Approved (RM)_treatmentdate0'))

WebUI.click(findTestObject('Object Repository/Medical/Page_- Employee Self Service/a_3'))

WebUI.selectOptionByValue(findTestObject('Object Repository/Medical/Page_- Employee Self Service/select_ZAKARIA BIN NAWANI'), 
    'ZAKARIA BIN NAWANI', true)

WebUI.click(findTestObject('Object Repository/Medical/Page_- Employee Self Service/input_Amount Approved (RM)_treatmentdate0'))

WebUI.click(findTestObject('Object Repository/Medical/Page_- Employee Self Service/a_5'))

WebUI.click(findTestObject('Object Repository/Medical/Page_- Employee Self Service/input_Amount Approved (RM)_treatmentdate0'))

WebUI.click(findTestObject('Object Repository/Medical/Page_- Employee Self Service/td_1'))

WebUI.click(findTestObject('Object Repository/Medical/Page_- Employee Self Service/input_Amount Approved (RM)_treatmentdate0'))

WebUI.click(findTestObject('Object Repository/Medical/Page_- Employee Self Service/a_1'))

WebUI.setText(findTestObject('Object Repository/Medical/Page_- Employee Self Service/input_Time Out (24 hours)_amtbfgst0'), 
    '20.00')

WebUI.setText(findTestObject('Object Repository/Medical/Page_- Employee Self Service/input_Time Out (24 hours)_gstamt0'), 
    '40.00')

WebUI.setText(findTestObject('Object Repository/Medical/Page_- Employee Self Service/input_Time Out (24 hours)_amtbfgst0'), 
    '20.00')

WebUI.click(findTestObject('Object Repository/Medical/Page_- Employee Self Service/input_Time Out (24 hours)_amtbfgst0'))

WebUI.selectOptionByValue(findTestObject('Object Repository/Medical/Page_- Employee Self Service/select_HOSP  -     HOSPITALIZATION'), 
    'HOSP', true)

WebUI.click(findTestObject('Object Repository/Medical/Page_- Employee Self Service/a_Lookup'))

WebUI.click(findTestObject('Object Repository/Medical/Page_- Employee Self Service/input_Both_submit'))

WebUI.setText(findTestObject('Object Repository/Medical/Page_- Employee Self Service/input_Clinic  Hospital Name_sch'), 
    '_')

WebUI.click(findTestObject('Object Repository/Medical/Page_- Employee Self Service/input_Both_submit'))

WebUI.click(findTestObject('Object Repository/Medical/Page_- Employee Self Service/td_JALAN PUCHONGKAJANGSELANGORMALAYSIA'))

WebUI.setText(findTestObject('Object Repository/Medical/Page_- Employee Self Service/textarea_Detailed Description_detaildesc0'), 
    'sdfdsf')

WebUI.setText(findTestObject('Object Repository/Medical/Page_- Employee Self Service/input_Discharge Date_dischargedate0'), 
    '')

WebUI.click(findTestObject('Object Repository/Medical/Page_- Employee Self Service/input_Discharge Date_dischargedate0'))

WebUI.click(findTestObject('Object Repository/Medical/Page_- Employee Self Service/a_2'))

WebUI.setText(findTestObject('Object Repository/Medical/Page_- Employee Self Service/input_Receipt No_receiptno0'), '23423')

WebUI.click(findTestObject('Object Repository/Medical/Page_- Employee Self Service/a_Lookup_1'))

WebUI.click(findTestObject('Object Repository/Medical/Page_- Employee Self Service/td_ABSCESSES(BISUL)'))

WebUI.click(findTestObject('Object Repository/Medical/Page_- Employee Self Service/input_Attachment_btn-sendapprover'))

WebUI.click(findTestObject('Object Repository/Medical/Page_- Employee Self Service/span_Hour_ui-slider-handle ui-corner-all ui_5b7fd8'))

WebUI.click(findTestObject('Object Repository/Medical/Page_- Employee Self Service/button_Done'))

WebUI.click(findTestObject('Object Repository/Medical/Page_- Employee Self Service/label_Please enter a valid time'))

WebUI.click(findTestObject('Object Repository/Medical/Page_- Employee Self Service/input_Time Out (24 hours)_timeout0'))

WebUI.click(findTestObject('Object Repository/Medical/Page_- Employee Self Service/span_Hour_ui-slider-handle ui-corner-all ui_5b7fd8_1'))

WebUI.click(findTestObject('Object Repository/Medical/Page_- Employee Self Service/button_Done'))

WebUI.click(findTestObject('Object Repository/Medical/Page_- Employee Self Service/input_Attachment_btn-sendapprover'))

