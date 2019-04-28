import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.eviware.soapui.tools.SoapUITestCaseRunner;
/* must import the SOAPUI jar so that we can run SOAPUI testRunner, so we have to:
Import the SOAPUI Jar file so that we can run SOAPUI project, for this:
    	 right click on the Eclipse project, click on properties, click on Add build Path then
    	 click on "Add External Jar..." button
    	 Go to the SAOPUI jar file directory: C:\Program Files\SmartBear\SoapUI-5.4.0\bin
    	 Select this jar file:  soapui-5.4.0
 Go to the SOAPUI lib directory: C:\Program Files\SmartBear\SoapUI-5.4.0\lib and Add all the jar in here    	 
*/
class SOAP_JUnit {

	@Test
	void test() throws Exception {
		SoapUITestCaseRunner testRunner = new SoapUITestCaseRunner();
		testRunner.setProjectFile("C://SOAP_UI//04AutomationWithGroovySOAPProject-soapui-project.xml");
		// indicate the path of the .xml for the SAOP project to be executed.
		testRunner.run();   //to run the project. 
	}

}
