/*

import java.io.IOException;
import java.util.*;

public class Main2 {
	public static void main(String[] args) {
		
		ArrayList<Car> cars= new ArrayList<Car>();
		
		Tesla Tesla = new Tesla("Model 3");
		mustangGT mustangGT = new mustangGT("Mustang GT");
		toyotaPrius toyotaPrius = new toyotaPrius("Toyota Prius");
		
		cars.add(Tesla);
		cars.add(mustangGT);
		cars.add(toyotaPrius);
		
		//String carName = scan.nextLine();
		//System.out.println("Welcome to the CarExplainer.");
		//System.out.println("Please Pick one of the cars in the following list \n"+cars +"\n 1 for Tesla Model 3, 2 for Ford Mustang GT, 3 for Toyota Prius, 4 to exit the system.");
		
		Scanner scan = new Scanner(System.in);
		int choice;
		while(true) {
			try {
				System.out.println("Welcome to the CarExplainer.");
				System.out.println("Please Pick one of the cars in the following list \n"+cars +"\n 1 for Tesla Model 3, 2 for Ford Mustang GT, 3 for Toyota Prius, 4 to exit the system.");
				choice=scan.nextInt();;
			//int choice=scan.nextInt();
				switch(choice) {
				case 1:
					System.out.println("Your choice was "+Tesla);
					System.out.println("Tesla is a fully electric car company that designs, produces and manufactures different electric cars, as well as electric batteries for said vehicles.");
					break;
				case 2:
					System.out.println("Your choice was "+mustangGT);
					System.out.println("Ford was the first comany to start manufacturing vehicles in assembly line. Their first vehicle was Model T.");
					break;
				case 3:
					System.out.println("Your choice was "+toyotaPrius);
					System.out.println("Toyota is a Japanese car manufacturing company incorporated in 1937. They are famous for their hybrid vehicles");
					break;
					
				case 4:
					System.out.println("Thank you for your interest. Please visit again!");
					System.exit(0);
				}
			}catch(IOException e) {
				System.out.println("Invalid User Input. Please enter a value from 0 to 4!");
				continue;
			}
		
	}}
		public static void getInput() throws NoSuchElementException{
			
	}

}
*/