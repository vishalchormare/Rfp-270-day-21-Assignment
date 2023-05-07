package day21user_register_test;

import java.util.regex.Pattern;

public class UserRegistration {

	public static boolean isValidFirstName(String fristName) {
		Pattern pattern = Pattern.compile("^[A-Z][a-zA-z0-9]{2,}$");
		if (pattern.matcher(fristName).matches()) {
			return true;
		} else {
			throw new UserRegistrationException("Invalid first Name",
					UserRegistrationException.ExceptionType.INDVALID_FIRSTNAME);
		}
	}

	public static boolean isValidLastName(String lastName) {
		Pattern pattern = Pattern.compile("^[A-Z][a-zA-z0-9]{2,}$");
		if (pattern.matcher(lastName).matches()) {
			return true;
		} else {
			throw new UserRegistrationException("Invalid last name",
					UserRegistrationException.ExceptionType.INVALID_LASTNAME);
		}

	}

	public static boolean isValidPhoneNumber(String phoneNo) {
		Pattern pattern = Pattern.compile("^[0-9]{1,2} \\d{10}$");
		if (pattern.matcher(phoneNo).matches()) {
			return true;
		} else {
			throw new UserRegistrationException("Invalid phone number",
					UserRegistrationException.ExceptionType.INVALID_PHONENUMBER);
		}

	}

	public static boolean isValidEmail(String email) {
		Pattern pattern = Pattern
				.compile("^[a-zA-Z0-9]+([+_.-][a-zA-Z0-9]+)*@[a-zA-Z0-9]+[.][a-zA-Z]{2,4}([.][a-zA-Z]{2,4})?");
		if (pattern.matcher(email).matches()) {
			return true;
		} else {

			throw new UserRegistrationException("Invalid email", UserRegistrationException.ExceptionType.INVALID_EMAIL);
		}

	}

	public static boolean isPasswordRule1(String passwordRule1) {
		Pattern pattern = Pattern.compile("^[a-zA-z0-9]{8,}$");
		if (pattern.matcher(passwordRule1).matches()) {
			return true;
		} else {
			throw new UserRegistrationException("invalid password rule 1",
					UserRegistrationException.ExceptionType.INVALID_PASSWORD);
		}

	}

	public static boolean isPasswordRule2(String passwordRule2) {
		Pattern pattern = Pattern.compile("^[A-Z][a-zA-z0-9]{7,}$");
		if (pattern.matcher(passwordRule2).matches()) {
			return true;
		}
		throw new UserRegistrationException("invalid password",
				UserRegistrationException.ExceptionType.INVALID_PASSWORD);
	}

	public static boolean isPasswordRule3(String passwordRule3) {
		Pattern pattern = Pattern.compile("^[A-Z][a-zA-z1-9]{6,}[1-9]+$");
		if (pattern.matcher(passwordRule3).matches()) {
			return true;
		} else {
			throw new UserRegistrationException("invalid password",
					UserRegistrationException.ExceptionType.INVALID_PASSWORD);
		}
	}

	public static boolean isPasswordRule4(String passwordRule4) {
		Pattern pattern = Pattern.compile("^[A-Z][a-zA-z1-9]{5,}[@$^][1-9]+$");
		if (pattern.matcher(passwordRule4).matches()) {
			return true;
		} else {
			throw new UserRegistrationException("invalid password",
					UserRegistrationException.ExceptionType.INVALID_PASSWORD);
		}

	}

	public static boolean isEmailVaildation(String email) {
		Pattern pattern = Pattern
				.compile("^[a-zA-Z0-9]+([+_.-][a-zA-Z0-9]+)*@[a-zA-Z0-9]+[.][a-zA-Z]{2,4}([.][a-zA-Z]{2,4})?");
		pattern.matcher(email).matches();
		return true;
	}

	public static void main(String[] args) {
		isValidFirstName("Vishal");
		isValidLastName("Chormare");
		isValidPhoneNumber("9868587848");
		isValidEmail("vishalmj123@gmail.com");
		isPasswordRule1("vishal121");
		isPasswordRule2("vishal121");
		isPasswordRule3("vishalchormare1");
		isPasswordRule4("Vishal@123");
		isEmailVaildation("vishalmj8080@yahoo.co.in");

	}
}
