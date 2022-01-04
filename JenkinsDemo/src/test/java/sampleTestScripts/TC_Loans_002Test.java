package sampleTestScripts;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class TC_Loans_002Test {

	@Test
	public void print() {
		Reporter.log("Hi welcome",true);
		System.out.println(System.getProperty("browserName"));
	}
}
