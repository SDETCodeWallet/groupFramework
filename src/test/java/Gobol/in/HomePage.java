package Gobol.in;

import org.testng.annotations.Test;

import genricFunctions.webUtils;

public class HomePage extends webUtils{

	String propFile="src//main//resources//testData//GobolData.properties";
	@Test
	public void launchTest(){
		launchbrowser(webUtils.getValue(propFile,"cValue"),webUtils.getValue(propFile, "url"));
	}
}
