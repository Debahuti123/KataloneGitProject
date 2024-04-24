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

WebUI.navigateToUrl('https://www.saucedemo.com/v1/index.html')

WebUI.click(findTestObject('Object Repository/Page_Swag Labs/input_standard_userlocked_out_userproblem_u_db77ac (2)'))

WebUI.setText(findTestObject('Object Repository/Page_Swag Labs/input_standard_userlocked_out_userproblem_u_db77ac (2)'), 
    'standard_user')

WebUI.setEncryptedText(findTestObject('Object Repository/Page_Swag Labs/input_standard_userlocked_out_userproblem_u_3423e9 (2)'), 
    'qcu24s4901FyWDTwXGr6XA==')

WebUI.click(findTestObject('Object Repository/Page_Swag Labs/input_standard_userlocked_out_userproblem_u_0dff71 (2)'))

WebUI.click(findTestObject('Object Repository/Page_Swag Labs/button_ADD TO CART (2)'))

WebUI.click(findTestObject('Object Repository/Page_Swag Labs/button_ADD TO CART (2)'))

WebUI.click(findTestObject('Object Repository/Page_Swag Labs/button_ADD TO CART (2)'))

WebUI.click(findTestObject('Object Repository/Page_Swag Labs/button_ADD TO CART (2)'))

WebUI.click(findTestObject('Object Repository/Page_Swag Labs/button_ADD TO CART (2)'))

WebUI.click(findTestObject('Object Repository/Page_Swag Labs/button_ADD TO CART (2)'))

WebUI.click(findTestObject('Object Repository/Page_Swag Labs/path (1)'))

WebUI.click(findTestObject('Object Repository/Page_Swag Labs/a_Continue Shopping (1)'))

WebUI.click(findTestObject('Object Repository/Page_Swag Labs/path (1)'))

WebUI.click(findTestObject('Object Repository/Page_Swag Labs/a_CHECKOUT (1)'))

WebUI.setText(findTestObject('Object Repository/Page_Swag Labs/input_Checkout Your Information_first-name (1)'), 'd')

WebUI.setText(findTestObject('Object Repository/Page_Swag Labs/input_Checkout Your Information_last-name (1)'), 'p')

WebUI.setText(findTestObject('Object Repository/Page_Swag Labs/input_Checkout Your Information_postal-code (1)'), '123456')

WebUI.click(findTestObject('Object Repository/Page_Swag Labs/input_CANCEL_btn_primary cart_button (1)'))

WebUI.click(findTestObject('Object Repository/Page_Swag Labs/a_FINISH (1)'))

WebUI.verifyElementText(findTestObject('Object Repository/Page_Swag Labs/h2_THANK YOU FOR YOUR ORDER (1)'), 'THANK YOU FOR YOUR ORDER')

WebUI.click(findTestObject('Object Repository/Page_Swag Labs/button_Open Menu (2)'))

WebUI.click(findTestObject('Object Repository/Page_Swag Labs/a_Logout (2)'))

WebUI.closeBrowser()

