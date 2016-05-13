package by.htp3.home.book;

import java.io.*;
import java.lang.reflect.Field;
import java.util.*;

public class FileToCollect {

	public static void main(String[] args)
			throws CloneNotSupportedException, IOException, IllegalArgumentException, IllegalAccessException {

		// -------- Creating the collection from the file ------ Start--

		FileReader in = new FileReader("books.txt");
		BufferedReader brIn = new BufferedReader(in);

		Class<Book> c = Book.class;
		Field[] fieldsArray = c.getDeclaredFields();

		// Field[] ar = Book.class.getDeclaredFields(); // Получаем объект
		                                                // класса
		                                                // Class и массив полей
		                                                // класса [Title; Name;
		                                                // Surname]
		int numOfFlds = fieldsArray.length; // number of fields

		String textLine;
		String cutLine;
		String temp;

		ArrayList<Book> bookCollectionFromFile = new ArrayList<Book>(); // collection
																		// of
																		// Books
																		// from
																		// file.txt

		while ((textLine = brIn.readLine()) != null) {
			System.out.println("This is line from your text file  ---> " + textLine);

			int readIndex = 0;  // index of the letter which we are starting
								// to read our information from and put it in
								// temp String
			Book obj = new Book();

			for (int k = 0; k < numOfFlds; k++) {

				temp = textLine.substring(readIndex);
				// System.out.println(temp + " = temp String");

				cutLine = temp.substring(0, temp.indexOf(" -|"));   // cutLineTitle
																	// (k=0),
																	// cutLineAuthorName
																	// (k=1)...
				String fieldName = fieldsArray[k].getName();
				System.out.println(fieldName + " :  " + cutLine);

				fieldsArray[k].setAccessible(true); // now our private field
													// is accessible for
													// changing or setting
				fieldsArray[k].set(obj, cutLine); // set field in book obj

				readIndex = textLine.indexOf(cutLine + " -||- ") + (cutLine + " -||- ").length();

			}

			bookCollectionFromFile.add(obj);

			System.out.println("Object from file :    " + obj.toString());
			System.out.println("--------------------------------------------------");

		}

		brIn.close();

		// -------- Creating the collection from the file ------ End--

		System.out.println(Arrays.toString(fieldsArray));
	}

}
