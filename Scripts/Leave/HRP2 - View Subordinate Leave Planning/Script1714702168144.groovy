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

def testData = findTestData('Credentials')

//def staffNoValue = GlobalVariable.staffNoValue



// Access the internal test data
// Iterate through each row of test data
for (int i = 1; i <= testData.getRowNumbers(); i++) {
    // Extract values from the current row
    String username = testData.getObjectValue('user', i)

    String password = testData.getObjectValue('psswd', i)
	
	String staffnumber = testData.getObjectValue('staffno', i)
	

      // Define the TestObjects for the username field, password field, and login button
    //TestObject usernameField = findTestObject('usernamefield/user')

   // TestObject passwordField = findTestObject('passwordfield/psswd')

    //TestObject loginButton = findTestObject('button_LOGIN/Login Button')

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
	
	WebUI.executeJavaScript('document.getElementById(\'btnAgree\').click();', null) 
	//WebUI.click(findTestObject('Object Repository/ApplyLeave/ButtonApply'))
	
	

	// WebUI.executeJavaScript('document.getElementById(\'submit\').click();', null)	
	//WebUI.setText(passwordField, password)
	WebUI.navigateToUrl('http://13.228.241.164:8081/hrp2/subordinateleaveplanning_newgui.jsp?')
	//WebUI.delay(2)
	
	
	//document.querySelector("body > div.menu-list.menu-leave.hr-hidden > table > tbody > tr > td.row1 > a:nth-child(9)")
	///html/body/div[18]/table/tbody/tr/td[1]/a[7]
	///html/body/div[18]/table/tbody/tr/td[1]/a[7]

  //  WebUI.navigateToUrl(('http://13.228.241.164:8081/hrp2/self_leave_newentry.jsp?leavetypecode=AL&staffno=' + staffnumber) + 
       // '&stype=')
	

	
	
	//WebUI.executeJavaScript('document.getElementById(\'btnAgree\').click();', null)
	
	
	// Find the link in the first row
	//TestObject link = WebUI.findTestObject('xpath:(//tbody/tr/td/a[@class="hr-list-mainlink"])[1]')
	
	// Click the link in the first row
	//WebUI.click(link)
	// Find the link in the first row
	//TestObject link = WebUI.findTestObject('xpath:(//tbody/tr/td/a[@class="hr-list-mainlink"])[1]', 10)
	
	// Click the link in the first row
	//WebUI.click(link)
	
	// Find the link in the first row
	//TestObject link = WebUI.(findTestObject['xpath:(//tbody/tr/td/a[@class="hr-list-mainlink"])[1]', 10])
	
	// Click the link in the first row
	//WebUI.click(link)
	// Find the table element by its id
	//TestObject table = findTestObject('hr-list-content')
	
	// Execute JavaScript to click the button inside the table
	//WebUI.executeJavaScript("document.getElementById('hr-list-content').click();", Arrays.asList(table))
	
	// Find the table element
	//TestObject table = findTestObject('hr-list-content')
	
	// Find all rows in the table
	//List<TestObject> rows = WebUI.findWebElements(table, '//tr')
	
	// Check if any rows exist in the table
	//if (!rows.isEmpty()) {
		// Get the first row
	//	TestObject firstRow = rows.get(0)
		
		// Find the link in the first row
	//	TestObject link = WebUI.findWebElements(firstRow, '//a[@class="hr-list-mainlink"]')
	
		// Click the link in the first row
	//	WebUI.click(link)
	//} else {
		// Handle case where no rows exist in the table
	
	//	println("No rows found in the table.")
	//}
	
	
	// Define the JavaScript code to click on the element identified by the XPath
	//String jsClick = 'document.evaluate("//*[@id=\"hr-list-content\"]/table/tbody/tr[1]/td[3]/a", document, null, XPathResult.FIRST_ORDERED_NODE_TYPE, null).singleNodeValue.click();'
	
	// Execute the JavaScript code
	//WebUI.executeJavaScript(jsClick, null)
	
	///html/body/div[18]/table/tbody/tr/td[1]/a[7]
	///html/body/div[18]/table/tbody/tr/td[1]/a[7]
	//this works to enter the form from listing screen
	
	
	
	
	//this also works to enter the form from listing screen
	
	//String jsCode = "var element = document.evaluate('//*[@id=\"hr-list-content\"]/table/tbody/tr[1]/td[3]/a', document, null, XPathResult.FIRST_ORDERED_NODE_TYPE, null).singleNodeValue;\n" +
	// "if (element) {\n" +
	// "    element.click();\n" +
	// "}";
	//WebUI.executeJavaScript(jsCode, null);

	
	
	
	//def driver = DriverFactory.getWebDriver()
	
	//WebElement element = driver.findElement(By.cssSelector("#hr-list-content > table > tbody > tr:nth-child(2) > a"))element.click()
	
	
	
	
	
	
    //WebUI.executeJavaScript('document.evaluate("/html/body/form/div/table/tbody/tr[1]", document, null, XPathResult.FIRST_ORDERED_NODE_TYPE, null).singleNodeValue.click();', null)
	
	
	
	// Find the element and click using Selenium WebDriver
    // WebUI.getDriver().findElement(By.cssSelector("#hr-list-content > table > tbody > tr:nth-child(2) > a")).click()
	

	
	
	
	
		//String jss = 'document.querySelector("#hr-list-content > table > tbody > tr:nth-child(2)>a")'
		//WebUI.executeJavaScript(jss, null)
		// Click on the element using Katalon Studio's built-in keywords
		//WebUI.click(findTestObject(jss,null))
		
	
   // WebUI.closeBrowser()

}

