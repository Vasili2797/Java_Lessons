package nameGenerator;

public class names {
	
	public static void main(String[] args) {
		
		String[] firstNames = {"Adam", "Alexis", "Dennis", "Jose", "Jessica", "Meghan", "Memphis", "Nicky", "Sarah", "William"};
		String[] lastNames= {"Adamson", "Bond", "Brown", "Johnson", "Gallagher", "Smith", "Thompson", "Perez", "Snow", "Tran"};
		
		//iterate over the first set of numbers
		for(int firstNameIndex=0;firstNameIndex<firstNames.length;firstNameIndex++) {
			
			//Get the current first name
			 String currentFirstName = firstNames[firstNameIndex];
			 
			 //loop through each last name
			 for(int lastNameIndex=0;lastNameIndex<lastNames.length;lastNameIndex++) {
				 String currentLastName = lastNames[lastNameIndex];
				 
				 
				 //print the first and last names
				 
				 System.out.println(currentFirstName + " " + currentLastName);
			 }
		}
		
	}

}
