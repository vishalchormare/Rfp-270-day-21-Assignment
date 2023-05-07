package day21Assignment;

public class MoodAnalysisException extends Exception {

	public static final String TypeOfException = null;
	String type;
	
	enum TypeOfException {
		ENTERED_EMPTY, ENTERED_NULL;

	}
	
	public MoodAnalysisException(String message, String typeofexception2) {
		super(message);
		this.type = typeofexception2;
	}
}
