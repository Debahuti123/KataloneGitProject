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

WebUI.click(findTestObject('Object Repository/Page_Swag Labs/input_standard_userlocked_out_userproblem_u_db77ac (3)'))

WebUI.setText(findTestObject('Object Repository/Page_Swag Labs/input_standard_userlocked_out_userproblem_u_db77ac (3)'), 
    'standard_user')

WebUI.setEncryptedText(findTestObject('Object Repository/Page_Swag Labs/input_standard_userlocked_out_userproblem_u_3423e9 (3)'), 
    'qcu24s4901FyWDTwXGr6XA==')

WebUI.click(findTestObject('Object Repository/Page_Swag Labs/input_standard_userlocked_out_userproblem_u_0dff71 (3)'))

WebUI.click(findTestObject('Object Repository/Page_Swag Labs/div_Sauce Labs Bike LightA red light isnt t_fd1a73'))

WebUI.click(findTestObject('Object Repository/Page_Swag Labs/div_Sauce Labs Bolt T-ShirtGet your testing_76f43a'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.click(findTestObject('Object Repository/Page_Swag Labs/div_Sauce Labs Fleece JacketIts not every d_f43511'))

WebUI.click(findTestObject('Object Repository/Page_Swag Labs/div_Sauce Labs OnesieRib snap infant onesie_f360a4'))

WebUI.click(findTestObject('Object Repository/Page_Swag Labs/div_Test.allTheThings() T-Shirt (Red)This c_7d6811'))

WebUI.click(findTestObject('Object Repository/Page_Swag Labs/div_15.99ADD TO CART'))

WebUI.click(findTestObject('Object Repository/Page_Swag Labs/div_15.99ADD TO CART'))

WebUI.click(findTestObject('Object Repository/Page_Swag Labs/button_Open Menu (3)'))

WebUI.click(findTestObject('Object Repository/Page_Swag Labs/a_Logout (3)'))

WebUI.closeBrowser()

