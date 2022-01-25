package swappingElements;

public class SwapElements_review {
	
	public static void main(String[] args) {
		int[] elements = {1,2,3,4,5};
		
		//Put your code here to swap the first element with the last
		//System.out.println(elements.length); //has 5 elements
		
		int temp=elements[0];
		elements[0]=elements[elements.length-1];
		elements[elements.length-1]=temp;
		
		for(int i=0; i<elements.length; i++) {
			System.out.println(elements[i]);
		}
		
	}

}
