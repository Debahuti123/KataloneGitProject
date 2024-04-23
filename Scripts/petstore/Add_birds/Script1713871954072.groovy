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

WebUI.navigateToUrl('https://petstore.octoperf.com/actions/Catalog.action')

WebUI.click(findTestObject('Object Repository/Page_JPetStore Demo/a_Sign In (4)'))

WebUI.setText(findTestObject('Object Repository/Page_JPetStore Demo/input_Need a user name and password_username (4)'), 
    'Debahuti')

WebUI.setEncryptedText(findTestObject('Object Repository/Page_JPetStore Demo/input_Need a user name and password_password (4)'), 
    'gx5eF5RZOCViIDRmNDPMxg==')

WebUI.click(findTestObject('Object Repository/Page_JPetStore Demo/input_Need a user name and password_signon (4)'))

WebUI.click(findTestObject('Object Repository/Page_JPetStore Demo/img (3)'))

WebUI.click(findTestObject('Object Repository/Page_JPetStore Demo/a_AV-CB-01'))

WebUI.click(findTestObject('Object Repository/Page_JPetStore Demo/a_Add to Cart (3)'))

WebUI.setText(findTestObject('Object Repository/Page_JPetStore Demo/input_false_EST-18'), '6')

WebUI.click(findTestObject('Object Repository/Page_JPetStore Demo/input_Sub Total 193.50_updateCartQuantities'))

WebUI.click(findTestObject('Object Repository/Page_JPetStore Demo/a_Proceed to Checkout (3)'))

WebUI.click(findTestObject('Object Repository/Page_JPetStore Demo/input_Ship to different address_newOrder (3)'))

WebUI.click(findTestObject('Object Repository/Page_JPetStore Demo/a_Confirm (2)'))

WebUI.click(findTestObject('Object Repository/Page_JPetStore Demo/a_Sign Out (3)'))

WebUI.closeBrowser()

