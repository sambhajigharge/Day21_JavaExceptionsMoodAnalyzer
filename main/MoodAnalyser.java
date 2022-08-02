package MoodAnalyserProblem.main;

import java.util.Locale;

public class MoodAnalyser {

    public static String message;

    public MoodAnalyser() {
    }

    public MoodAnalyser(String message) {
        this.message = message;
        analyseMood();

    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public static String analyseMood() {
        try {
            if (message.toLowerCase().contains("sad")) {
                return "SAD";
            } else {
                return "HAPPY";
            }

        } catch (NullPointerException e) {
            return "Exception Handled";
        }
    }
}
