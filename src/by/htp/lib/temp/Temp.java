package by.htp.lib.temp;

import java.io.*;

import by.htp.lib.bean.Book;

public class Temp {

	public static void main(String[] args) {

		Book[] books = new Book[5];

		try (BufferedReader br = new BufferedReader(new FileReader("resources/library.txt"))) {
			String str = null;
			while ((str = br.readLine()) != null) {
				// for (Book bookElement : books) {
				//
				// }
				System.out.println(str);
			}
			br.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}