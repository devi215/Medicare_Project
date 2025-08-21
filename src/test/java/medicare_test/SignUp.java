package medicare_test;

import org.testng.annotations.Test;

import medicare.SignUpPage;

public class SignUp extends BaseClass  {
	@Test
	public void SignUpScenarioTest() {
		SignUpPage lp=new SignUpPage();
		lp.LoginFunction("Lata","Pathange","shivam123@gmail.com","9876654566","Pranu@123","Pranu@123","13 lupton close","london","london","se12 0dr","london","United Kingdon");
		
	
	}	
}
