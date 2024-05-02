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
// Import the loginexim test case
// Import the loginexim test case
//import login.keywordslogin
import com.kms.katalon.core.webui.driver.DriverFactory as DriverFactory
//import login.keywordslogin
import org.openqa.selenium.By as By
import com.kms.katalon.core.testobject.ConditionType as ConditionType
import com.kms.katalon.core.testcase.TestCaseFactory as TestCaseFactory
import org.openqa.selenium.Alert


// Get the test case object
//WebUI.callTestCase(findTestCase("LoginMethod"), ["username":"user", "password":"psswd", … , "keyN":"valueN"], FailureHandling.OPTIONAL)
// Run the test case

// Execute the imported loginexim test case
//keywordslogin.login('0607', 'Test@123')
//WebUI.navigateToUrl('http://13.228.241.164:8081/hreximv15/lu_leavetypeapplicationcheck_newgui.jsp?')
//WebUI.navigateToUrl('http://13.228.241.164:8081/hreximv15/self_leave_newentry.jsp?leavetypecode=AL&staffno=0607&stype=')
def testData = findTestData('Credentials')

//def staffNoValue = GlobalVariable.staffNoValue



// Access the internal test data
// Iterate through each row of test data
for (int i = 1; i <= testData.getRowNumbers(); i++) {
    // Extract values from the current row
    String username = testData.getObjectValue('user', i)

    String password = testData.getObjectValue('psswd', i)
	
	String staffnumber = testData.getObjectValue('staffno', i)
	

    //keywordslogin.login(username, password) // Remove the extra 'keywordslogin.login' here
    // Import the LoginMethod class
    // Define the TestObjects for the username field, password field, and login button
    TestObject usernameField = findTestObject('usernamefield/user')

    TestObject passwordField = findTestObject('passwordfield/psswd')

    TestObject loginButton = findTestObject('button_LOGIN/Login Button')

    // Define the URL of the login page
    String loginPageUrl = 'http://13.228.241.164:8081/hrp2/stafflogin.jsp?'
	
	WebUI.openBrowser('')
	WebUI.navigateToUrl('http://13.228.241.164:8081/hrp2/stafflogin.jsp?')
	
    //WebUI.setText(findTestObject('Object Repository/HRPLogin/usernamefield'), username)
	//WebUI.setText(findTestObject('Object Repository/HRPLogin/passwordfield'), password)
	WebUI.executeJavaScript("document.getElementById('username').value = '" + username + "';", null)
	WebUI.executeJavaScript("document.getElementById('password').value = '" + password + "';", null)

	
	String js = 'document.querySelector(".btn-block").click()'
	WebUI.executeJavaScript(js, null)
	WebUI.delay(2)
	
	//String jz = 'document.querySelector(".hr-button").click()'
	//WebUI.executeJavaScript(jz, null)
	
	WebUI.executeJavaScript('document.getElementById(\'btnAgree\').click();', null) //WebUI.click(findTestObject('Object Repository/ApplyLeave/ButtonApply'))
	
	

	// WebUI.executeJavaScript('document.getElementById(\'submit\').click();', null)	
	//WebUI.setText(passwordField, password)
	

	
    //WebUI.navigateToUrl('http://13.228.241.164:8081/hrp2/lu_leavetypeapplicationcheck_newgui.jsp?')
	WebUI.delay(2)
    WebUI.navigateToUrl(('http://13.228.241.164:8081/hrp2/self_leave_newentry.jsp?leavetypecode=AL&staffno=' + staffnumber) + 
        '&stype=')

    // Set the values you want to input
    def startDate = '27/09/2024'

    def endDate = '28/09/2024'

    def remark = 'PERSONAL MATTER'

    def backupstaff = '0091'
	
				def testData1 = findTestData('Leave')
	
							for (int d = 1; d <= testData1.getRowNumbers(); d++) {
										String startdate1 = testData1.getObjectValue('startdate', d)	
										String enddate1 = testData1.getObjectValue('enddate', d)
										String remark1 = testData1.getObjectValue('remark', d)
										
	
	
	
	
    //--------------------start datestart
    // Click the "Leave Start Date" input to open the date picker
   // WebUI.click(findTestObject('Object Repository/ApplyLeave/leavestartdate'))
	
	WebUI.executeJavaScript('document.getElementById(\'l_stdate1\').click();', null)
	
	WebUI.delay(2)
    // Execute JavaScript to set the input field's value
    WebUI.executeJavaScript(('document.getElementById(\'l_stdate1\').value = \'' + startdate1) + '\';', null)
	
    // Optionally, click anywhere outside the date picker to close it
    DriverFactory.getWebDriver().findElement(By.tagName('body')).click()

    //----------------------end datestart
    //----------------------start dateend
    // Click the "Leave End Date" input to open the date picker
    //WebUI.click(findTestObject('Object Repository/ApplyLeave/leaveenddate'))
	WebUI.executeJavaScript('document.getElementById(\'l_eddate1\').click();', null)
	

    // Execute JavaScript to set the input field's value
    WebUI.executeJavaScript(('document.getElementById(\'l_eddate1\').value = \'' + enddate1) + '\';', null)

    // Optionally, click anywhere outside the date picker to close it
    DriverFactory.getWebDriver().findElement(By.tagName('body')).click()

    //----------------------end dateend
    //----------------------start Reason
   // WebUI.setText(findTestObject('Object Repository/ApplyLeave/leavereason'), remark1)
	WebUI.executeJavaScript("document.getElementById('reason').value = '" + remark1 + "';", null)
	
}

    //----------------------end Reason
    //----------------------start backup
   // WebUI.executeJavaScript(('document.getElementById(\'backup_startdate0\').value = \'' + startDate) + '\';', null)

    //WebUI.executeJavaScript(('document.getElementById(\'backup_enddate0\').value = \'' + endDate) + '\';', null)

   // WebUI.executeJavaScript(('document.getElementById(\'backup_staffname0\').value = \'' + backupstaff) + '\';', null)

   // WebUI.executeJavaScript(('document.getElementById(\'backup_task0\').value = \'' + remark) + '\';', null)

    //----------------------end backup
    //----------------------start submit
    // Execute JavaScript to click the button with ID "Button2"
    WebUI.executeJavaScript('document.getElementById(\'Button2\').click();', null) //WebUI.click(findTestObject('Object Repository/ApplyLeave/ButtonApply'))
    //----------------------end submit
   // WebUI.closeBrowser()

}

