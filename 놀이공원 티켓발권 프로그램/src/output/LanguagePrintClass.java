package output;

import java.util.Locale;
import java.util.ResourceBundle;

import inputUtil.TicketConstants;

public class LanguagePrintClass {

	// 언어 설정
	public static ResourceBundle messages;

	public static String choiceLanguage(String language) {

		if (language.equals(TicketConstants.KOREAN_COUNTRY_NUMBER)) {
			Locale.setDefault(Locale.KOREAN);
			messages = ResourceBundle.getBundle("message", new Locale(TicketConstants.LANGUAGE_KOREAN));
		} else if (language.equals(TicketConstants.ENGLISH_COUNTRY_NUMBER)) {
			Locale.setDefault(Locale.US);
			messages = ResourceBundle.getBundle("message", new Locale(TicketConstants.LANGUAGE_ENGLISH));
		}
		return "";
	}

	public static String getMsg(String key) {
        String message = null;
        try {
            message = messages.getString(key);
        } catch (Exception e) {
            new IllegalArgumentException("Could not find message for key [" + key + "]");
        }
        return message;
    }
}
