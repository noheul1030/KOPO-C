package saveData;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class saveDataReader {

	public static void main(String[] args) throws IOException {

//		파일 한줄씩 읽기
		FileReader read = new FileReader("SaveFile/save.csv");
		BufferedReader bfread = new BufferedReader(read);
		String line = "";

		while ((line = bfread.readLine()) != null) {
			System.out.println("---------------------------------------------------------");
			// readLine() -> 한줄씩 읽기
			System.out.println(line);
		}
		System.out.println("---------------------------------------------------------");
		bfread.close();

//		파일 한번에 읽기 
//		File read2 = new File("SaveFile/save.csv");
//		// scan.nextLine() -> 파일 한번에 읽기
//		Scanner scan = new Scanner(read2);
//
//		while (scan.hasNextLine()) {
//			System.out.println(scan.nextLine());
//		}
//		bfread.close();
//		scan.close();
	}

}
