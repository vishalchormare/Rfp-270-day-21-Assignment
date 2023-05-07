package day21user_register_test;

public class UserRegistrationException extends RuntimeException {

	enum ExceptionType {
		INDVALID_FIRSTNAME, INVALID_LASTNAME, INVALID_EMAIL, INVALID_PHONENUMBER, INVALID_PASSWORD;
	}

	ExceptionType exceptionType;

	public UserRegistrationException(String message, ExceptionType exceptionType) {
		super(message);
		this.exceptionType = exceptionType;
	}
}
