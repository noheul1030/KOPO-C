package output;

import java.util.Locale;
import java.util.ResourceBundle;

import inputUtil.TicketConstants;

public class LanguagePrintClass {

    // 언어 설정
    public static ResourceBundle messages;

    public static void choiceLanguage(String language) {

//        if (language.equals(TicketConstants.KOREAN_COUNTRY_NUMBER)) {
//            Locale.setDefault(Locale.KOREAN);
//            messages = ResourceBundle.getBundle("message", new Locale(TicketConstants.LANGUAGE_KOREAN));
//        } else if (language.equals(TicketConstants.ENGLISH_COUNTRY_NUMBER)) {
//            Locale.setDefault(Locale.ENGLISH);
//            messages = ResourceBundle.getBundle("message", new Locale(TicketConstants.LANGUAGE_ENGLISH));
//        }
        if (language.equals(TicketConstants.KOREAN_COUNTRY_NUMBER)) {
            Locale.setDefault(Locale.KOREAN);
        } else if (language.equals(TicketConstants.ENGLISH_COUNTRY_NUMBER)) {
            Locale.setDefault(Locale.ENGLISH);
        }
        messages = ResourceBundle.getBundle("message", Locale.getDefault());
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

// Classpath 
/**
 * + 경로(path) - 절대경로(앱솔루트Path) : 최상위(root) 디렉토리부터 시작되는 경로 - window : ex) c:\\,
 * c:/, d:\\, d/ - linux(unix) : ex) /(rootPath)
 * 
 * - 상대경로(relationPath) : 기준 디렉토리부터 시작되는 경로 - XMLProject 가 기준이라면 - window : ex)
 * resource\\jsontest.json, resource/jsontest.json - linux(unix) : ex)
 * resource/jsontest.json
 * 
 * - 클래스경로(classPath) - classPath로 부터 시작되는 경로 - eclipse : src(소스폴더) -> bin 하위가
 * classpath이다 - resource/message_en.properties
 * 
 * 
 * java -> class 만드는 방법은?
 * 
 * javac LanguagePrintClass.java -> LanguagePrintClass.class java -classpath
 * resource:json-simple-1.1.1.jar LanguagePrintClass
 * 
 */