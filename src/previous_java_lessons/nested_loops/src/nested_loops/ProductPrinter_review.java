package nested_loops;

public class ProductPrinter_review {
	
	public static void main(String[] args) {
		int[] arr1 = {2,4,6,8,10,12,14,16,18,20};
		int[] arr2 = {1,3,5,7,9,11,13,15,17,19};
		
		//iterate over the first set of numbers
		
		for(int i=0;i<arr1.length;i++) {
			for(int j=0;j<arr2.length;j++) {
				System.out.println(arr1[i]*arr2[j]);
			}
		
		}
		String[] firstName= {"Adam", "Alexis", "Dennis", "Jose", "Jessica", "Meghan", "Memphis", "Nicky", "Sarah", "William"};
		String[] lastName= {"Adamson", "Bond", "Brown", "Johnson", "Gallagher", "Smith", "Thompson", "Perez", "Snow", "Tran"};
		
		for(int i=0;i<firstName.length;i++) {
			for(int j=0;j<lastName.length;j++) {
				System.out.println(firstName[i] + " "+lastName[j]);
			}
		}
		}

}
