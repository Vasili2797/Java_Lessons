package main.com.Serialize_Deserialize;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class DeserializeDemo {

	public static void main(String[] args) {
		Employee e = null;
		try {
			FileInputStream fileIn = new FileInputStream("employee.ser");
			ObjectInputStream in = new ObjectInputStream(fileIn);
			e = (Employee) in.readObject();
			in.close();
			fileIn.close();
		} catch (IOException ioe) {
			ioe.printStackTrace();
			return;
		} catch (ClassNotFoundException cnfe) {
			cnfe.printStackTrace();
			return;
		}
		
		System.out.println("Deserialized Employee...");
		System.out.println("Name:" + e.name);
		System.out.println("Address:" + e.address);
		System.out.println("Number:" + e.number);
		System.out.println("SSN:" + e.SSN);
	}
}
