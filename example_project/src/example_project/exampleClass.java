package example_project;

public class exampleClass {
	public static void main(String[] args) {
		int[] nums={1,2,3,4,5,6,7,8};
		String[] words= {"hello","text","this","number"};
		for(int i : nums) {
			System.out.println(i);
			for(int j=0;j<words.length;j++){
				System.out.println(words[j]);
			}
		}
	}
//	public static void main(String[] args) {
//		exampleClass ec = new exampleClass();
//		ec.say();
//	}
//	
//	public void say() {
//		System.out.println("This is the string it will return");
//		return;
//	}
}
