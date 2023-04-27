package output;

import java.util.Locale;
import java.util.ResourceBundle;

import inputUtil.TicketConstants;

public class LanguagePrintClass {

    // ��� ����
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
 * + ���(path) - ������(�ۼַ�ƮPath) : �ֻ���(root) ���丮���� ���۵Ǵ� ��� - window : ex) c:\\,
 * c:/, d:\\, d/ - linux(unix) : ex) /(rootPath)
 * 
 * - �����(relationPath) : ���� ���丮���� ���۵Ǵ� ��� - XMLProject �� �����̶�� - window : ex)
 * resource\\jsontest.json, resource/jsontest.json - linux(unix) : ex)
 * resource/jsontest.json
 * 
 * - Ŭ�������(classPath) - classPath�� ���� ���۵Ǵ� ��� - eclipse : src(�ҽ�����) -> bin ������
 * classpath�̴� - resource/message_en.properties
 * 
 * 
 * java -> class ����� �����?
 * 
 * javac LanguagePrintClass.java -> LanguagePrintClass.class java -classpath
 * resource:json-simple-1.1.1.jar LanguagePrintClass
 * 
 */