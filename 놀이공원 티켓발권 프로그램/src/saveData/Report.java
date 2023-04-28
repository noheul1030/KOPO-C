package saveData;

import java.io.*;
public class Report {

	public static void ReportHeadWriter() throws IOException {
		BufferedWriter headWriter = new BufferedWriter(
				new OutputStreamWriter(new FileOutputStream("SaveFile/save.csv", true), "UTF-8"));
//		FileWriter headWriter = new FileWriter("SaveFile/save.csv",StandardCharsets.UTF_8);

		String headData = "날짜,권종,연령구분,수량,가격,우대사항";
		headWriter.write(headData);
		headWriter.write(System.lineSeparator());
		headWriter.flush();
		headWriter.close();
//		bfread.close();
	}

	public static void ReportSaveWriter(String data, String type, String group, int count, int price,
			String preferentialTreatment) throws IOException {
//		File writer = new File("SaveFile/save.csv");
		BufferedWriter bfwrite = new BufferedWriter(
				new OutputStreamWriter(new FileOutputStream("SaveFile/save.csv", true), "UTF-8"));
//		BufferedWriter buffer = new BufferedWriter(new FileWriter(writer, true));
		bfwrite.write(
				data + "," + type + "," + group + "," + count + "" + price + "" + preferentialTreatment);
		bfwrite.write(System.lineSeparator());
		bfwrite.flush();
		bfwrite.close();
	}

}

//Classpath 
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