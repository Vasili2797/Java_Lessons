package main.com.Serialize_Deserialize;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class SerializeDemo {

	public static void main(String[] args) {
		Employee e = new Employee();
		e.name = "Bobby";
		e.address = "Pokahunta drive";
		e.number = 1223441244;
		e.SSN = 313;

		try {
			FileOutputStream fileOut = new FileOutputStream("employee.ser");
			ObjectOutputStream out = new ObjectOutputStream(fileOut);
			out.writeObject(e);
			out.close();
			System.out.printf("Serialized fdata is save in employee.ser");
		} catch (IOException IOE) {
			IOE.printStackTrace();
		}
	}

}
