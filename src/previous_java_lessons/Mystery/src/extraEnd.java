
public class extraEnd {
	public static void main(String[] args) {
		
		System.out.println(extraEnd("Hello"));
		
	}
	public static String extraEnd(String str) {
		  if (str.length() <= 2){
		    return str+str+str;
		  }
		  return str.substring(str.length() - 2)+str.substring(str.length() - 2)+
		  str.substring(str.length() - 2);
	}
}
