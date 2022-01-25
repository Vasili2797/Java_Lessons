
public class ClassB_review {
	ClassA_review ClassA_review = new ClassA_review();
	
	public static void main(String[] args) {
		ClassB_review b = new ClassB_review();
		b.ClassA_review.setName("Taylor");
		System.out.println(b.ClassA_review.getName());
	}
}
