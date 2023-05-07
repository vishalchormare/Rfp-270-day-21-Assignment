package day21user_register_test;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

public class UserRegistrationTest {

	boolean result;

	@Test
	public void givenFirstName_WhenProper_ShouldReturType() {
		result = UserRegistration.isValidFirstName("Vishal");
		Assert.assertEquals(true, result);

	}

	@Test
	public void givenFirstName_WhineImProper_ShoudlRetruType() {
		try {
			UserRegistration.isValidFirstName("Vishal.12");
		} catch (UserRegistrationException e) {
			Assert.assertEquals(UserRegistrationException.ExceptionType.INDVALID_FIRSTNAME, e.exceptionType);
			System.out.println(e.getMessage());
		}
	}

	@Test
	public  void givenLastName_WhenProper_ShouldReturType() {
		 result = UserRegistration.isValidLastName("Chormare");
		 Assert.assertEquals(true, result);
		
	}
	@Test
	public  void givenLastName_WhenImProper_ShouldReturType() {
		try {
			UserRegistration.isValidLastName("Chormare.12");
		}catch(UserRegistrationException e) {
			Assert.assertEquals(UserRegistrationException.ExceptionType.INVALID_LASTNAME, e.exceptionType);
			System.out.println(e.getMessage());
		}
	}
	
	@Test
	public void givenPhoneNumber_WhenProper_ShouldReturType() {
		 result = UserRegistration.isValidPhoneNumber("91 9868574852");
		Assert.assertEquals(true, result);
	}
	@Test
	public void givenPhoneNumber_WhenImProper_ShouldReturType() {
		try {
			UserRegistration.isValidPhoneNumber("85658974455555");
		}catch(UserRegistrationException e){
			Assert.assertEquals(UserRegistrationException.ExceptionType.INVALID_PHONENUMBER,e.exceptionType);
			System.out.println(e.getMessage());
		}
	}

	@Test
	public void givenValidEmail_WhenProper_ShouldReturType() {
		 result = UserRegistration.isValidEmail("vshal@gmail.com");
		Assert.assertEquals(true, result);
	}
	@Test
	public void givenValidEmail_WhenImProper_ShouldReturType() {
		try {
		UserRegistration.isValidEmail("vishal@chomare.gmail.com");
		}catch(UserRegistrationException e) {
			Assert.assertEquals(UserRegistrationException.ExceptionType.INVALID_EMAIL,e.exceptionType);
			System.out.println(e.getMessage());
		}
	}

	@Test
	public void givenPasswordRule1_WhenProper_ShouldReturType() {
		boolean result = UserRegistration.isPasswordRule1("vishal121");
		Assert.assertEquals(true, result);
	}
	
	@Test
	public void givenPasswordRule1_WhenImProper_ShouldReturType() {
		
		try {
			UserRegistration.isPasswordRule1("Vishal@123");
			
		}catch(UserRegistrationException e) {
			Assert.assertEquals(UserRegistrationException.ExceptionType.INVALID_PASSWORD,e.exceptionType);
			System.out.println(e.getMessage());
		}
	}

	@Test
	public void givenPasswordRule2_WhenProper_ShouldReturType() {
		 result = UserRegistration.isPasswordRule2("vishal121");
		Assert.assertEquals(true, result);
	}
	
	@Test
	public void givenPasswordRule2_WhenImProper_ShouldReturType() {
		
		try {
			UserRegistration.isPasswordRule2("Vishal@123");
			
		}catch(UserRegistrationException e) {
			Assert.assertEquals(UserRegistrationException.ExceptionType.INVALID_PASSWORD,e.exceptionType);
			System.out.println(e.getMessage());
		}
	}

	@Test
	public void givenPasswordRule3_WhenProper_ShouldReturType() {
		 result = UserRegistration.isPasswordRule3("vishalchormare1");
		 Assert.assertEquals(true, result);
	}

	@Test
	public void givenPasswordRule3_WhenImProper_ShouldReturType() {
		
		try {
			UserRegistration.isPasswordRule3("Vishal@123");
			
		}catch(UserRegistrationException e) {
			Assert.assertEquals(UserRegistrationException.ExceptionType.INVALID_PASSWORD,e.exceptionType);
			System.out.println(e.getMessage());
		}
	}
	
	@Test
	public void givenPasswordRule4_WhenProper_ShouldReturType() {
		 result = UserRegistration.isPasswordRule4("Vishal@123");
	}

	
	@Test
	public void givenPasswordRule4_WhenImProper_ShouldReturType() {
		
		try {
			UserRegistration.isPasswordRule4("Vishal@123Vihsla");
			
		}catch(UserRegistrationException e) {
			Assert.assertEquals(UserRegistrationException.ExceptionType.INVALID_PASSWORD,e.exceptionType);
			System.out.println(e.getMessage());
		}
	}
	
	@Test
	public void givenEmailValidation_WhenProper_ShouldReturType() {
		 result = UserRegistration.isEmailVaildation("vishal@yahoo.co.in");
	}
	
	
	@Test
	public void givenEmailValidation_WhenImProper_ShouldReturType() {
		try {
		UserRegistration.isEmailVaildation("vishal@yahoo.co.in");
		}catch(UserRegistrationException e) {
			Assert.assertEquals(UserRegistrationException.ExceptionType.INVALID_EMAIL,e.exceptionType);
			System.out.println(e.getMessage());
		}
	}
}
