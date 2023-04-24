package output;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

import language.EnglishLanguage;
import language.KoreanLanguage;

public class PrintClass {
	public List<List<Class>>Language = new ArrayList<Class>();
	public PrintClass(String country) {
		if (LANGUAGE.equals("KR")) {
			KoreanLanguage print = new KoreanLanguage();
		} else if (LANGUAGE.equals("US")) {
			EnglishLanguage print = new EnglishLanguage();
		}
	}

	// 언어 설정
	public static String LANGUAGE;
	public static String TICKET_TYPE_QUESTION;

	public static String choiceLanguage() {
		Locale currentLocale = Locale.getDefault();
		System.out.println("locale : " + currentLocale.getCountry());
//			ConstValue.startLanguage()currentLocale.getCountry());
		String country = currentLocale.getCountry();
		PrintClass.LANGUAGE = country;
		return country;
	}
}

//		public static String startLanguage(String country) {
//			
//		if(LANGUAGE.equals("KR")) {
//			KoreanLanguage print = new KoreanLanguage();
//			
//		}else if(LANGUAGE.equals("US")){
//			EnglishLanguage print = new EnglishLanguage();
//		}else {
//			
//		}
//		return "";
//		do{
//
//		repeat.Repeat();
//		}