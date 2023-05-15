package studentDatabaseApplication;

import java.util.Hashtable;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class StudentDatabaseApp {

	public static void main(String[] args) {
		System.out.println("HOw many students will be added to the database?");
		Scanner scanner = new Scanner(System.in);
		int classSize = scanner.nextInt();
		System.out.println(
				"There are " + classSize + " Students in class.\nPlease enter the name and year for each student");
		int studentNum = 0;
		Hashtable<String, Integer> my_dictionary = new Hashtable<>();
		while (classSize >= studentNum) {
			Scanner nameScanner = new Scanner(System.in);
			String name = nameScanner.next();
			Scanner yearScanner = new Scanner(System.in);
			int year = yearScanner.nextInt();

			for (int i = 0; i <= classSize; i++) {
				my_dictionary.put(name, year);
				classSize++;
			}
			Set set = my_dictionary.entrySet();
			Iterator it = set.iterator();
			while(it.hasNext()) {
				Map.Entry entry = (Map.Entry)it.next();
				System.out.println(entry.getKey()+" "+entry.getValue());
			}
		}
		
	}
}
