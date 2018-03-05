package by.htp.lib.run;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.Reader;

public class MainApp {

	private static final String FILE_PATH = "resources/sample.txt";
	
	public static void main(String[] args) {
		
		OutputStream os;
		
		try (InputStream is = new FileInputStream(FILE_PATH)) {
			int count;
			byte[] bytes = new byte[1024];
			do{
//				count = is.read();
//				System.out.print(count);
				count = is.read(bytes);
			} while (count > 0);
			System.out.println(new String(bytes));
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		System.out.println("_____");
		try (Reader reader = new FileReader(FILE_PATH)) {
			int count;
			char[] chars = new char[1024];
			do {
//				count = reader.read();
//				System.out.print(count);
				count = reader.read(chars);
			} while (count > 0);
			System.out.println(new String(chars));
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		
		
	}
}
