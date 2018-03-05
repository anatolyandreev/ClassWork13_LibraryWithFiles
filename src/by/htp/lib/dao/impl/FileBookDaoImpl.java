package by.htp.lib.dao.impl;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

import by.htp.lib.bean.Author;
import by.htp.lib.bean.Book;
import by.htp.lib.dao.BookDao;

public class FileBookDaoImpl implements BookDao {

	@Override
	public Book[] readAll() {
		
		Book[] books = new Book[5];
		Author[] authors = new Author[5];
		
		try (BufferedReader br = new BufferedReader(new FileReader("resources/library.txt"))) {
			String str = null;
			int counter = 0;
			while((str = br.readLine()) != null) {
					String[] temp = parseLine(str);
					books[counter] = new Book(Integer.parseInt(temp[0]), temp[1], Integer.parseInt(temp[2].trim()));
					authors[counter] = new Author(Integer.parseInt(temp[0]), temp[3], temp[4]);
					books[counter].setAuthor(authors[counter]);
					counter++;
			}			
		} catch (IOException e) {
			e.printStackTrace();
		}
		return books;
	}
	
	public static String[] parseLine(String s) {
		return s.split(",");
	}
	
	
	
	

}
