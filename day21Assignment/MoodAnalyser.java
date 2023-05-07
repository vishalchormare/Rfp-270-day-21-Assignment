package day21Assignment;

public class MoodAnalyser {

	private String message;

	public MoodAnalyser(String message) {
		this.message = message;
	}

	public String analyseMood() throws MoodAnalysisException {

		String messageForEmptyString = "Message is Empty,Please enter valid message";
		String messageForNullString = "Message is Null,Please enter valid message";

		try {

			if (message.length() == 0)
				throw new MoodAnalysisException(messageForEmptyString, MoodAnalysisException.TypeOfException);
			else if (message.contains("sad"))
				return "SAD";
			else
				return "HAPPY";

		} catch (NullPointerException e) {

			throw new MoodAnalysisException(messageForNullString, MoodAnalysisException.TypeOfException);

		}

	}

}
