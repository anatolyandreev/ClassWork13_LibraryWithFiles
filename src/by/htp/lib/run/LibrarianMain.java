package by.htp.lib.run;

import by.htp.lib.bean.Book;
import by.htp.lib.bean.Catalog;
import by.htp.lib.logic.impl.CityLibraryServiceImpl;

public class LibrarianMain {

	public static void main(String[] args) {

		CityLibraryServiceImpl service = new CityLibraryServiceImpl();
		Catalog booksCatalog = service.getMainCatalog();
		viewCatalogInfo(booksCatalog);
		//System.out.println(booksCatalog.getBooks()[0].getAuthor().getName());
	}

	private static void viewCatalogInfo(Catalog catalog) {
		for (Book book : catalog.getBooks()) {
			System.out.println(book);
		}
	}

}
