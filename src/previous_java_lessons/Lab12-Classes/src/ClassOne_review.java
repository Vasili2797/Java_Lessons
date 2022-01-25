
public class ClassOne_review {
	
	int id;
	
	public int getId() {
		return id;
	}
	
	public void setId(int id) {
		this.id=id;
	}
	
	public static void main(String[] args) {
	ClassOne_review c1 = new ClassOne_review();
	c1.setId(25);
	System.out.println(c1.getId());
	}
}
