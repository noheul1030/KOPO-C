package saveData;

import java.io.*;
public class Report {

	public static void ReportHeadWriter() throws IOException {
		BufferedWriter headWriter = new BufferedWriter(
				new OutputStreamWriter(new FileOutputStream("SaveFile/save.csv", true), "UTF-8"));
//		FileWriter headWriter = new FileWriter("SaveFile/save.csv",StandardCharsets.UTF_8);

		String headData = "��¥,����,���ɱ���,����,����,������";
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