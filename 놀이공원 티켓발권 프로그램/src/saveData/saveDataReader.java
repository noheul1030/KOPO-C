package saveData;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class saveDataReader {

	public static void main(String[] args) throws IOException {

//		���� ���پ� �б�
		FileReader read = new FileReader("SaveFile/save.csv");
		BufferedReader bfread = new BufferedReader(read);
		String line = "";

		while ((line = bfread.readLine()) != null) {
			System.out.println("---------------------------------------------------------");
			// readLine() -> ���پ� �б�
			System.out.println(line);
		}
		System.out.println("---------------------------------------------------------");
		bfread.close();

//		���� �ѹ��� �б� 
//		File read2 = new File("SaveFile/save.csv");
//		// scan.nextLine() -> ���� �ѹ��� �б�
//		Scanner scan = new Scanner(read2);
//
//		while (scan.hasNextLine()) {
//			System.out.println(scan.nextLine());
//		}
//		bfread.close();
//		scan.close();
	}

}
