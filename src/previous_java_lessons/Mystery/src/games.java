import java.util.*;

public class games {
	
	public static void main(String[] args) {
		List<String>favGame = new ArrayList<>();
		List<Integer>numPlayers = new ArrayList<Integer>();
		favGame.add("Soccer");
		favGame.add("Hide and Seek");
		favGame.add("Catch");
		numPlayers.add(22);
		numPlayers.add(2);
		numPlayers.add(2);
		
		
		//Scanner scan = new Scanner(System.in);
		//String scans = scan.nextLine();
		System.out.println("My favourite games are as follows: \n"+favGame);
		System.out.println("The numbers of players in the game are in the same order. \n"+numPlayers +"\nAlso, more players can play each game.");
		System.out.println();
		
		System.out.println("\"I made this letter longer than usual because I lack the time to \n"+"make it short.\"\n\tBlaise Pascal");
		float f=27.32f;
		int value=15;
		value =(int)f;
		System.out.println(value);
		String message;
		Scanner scan= new Scanner(System.in);
		System.out.println("Enter a line of text:");
		message=scan.nextLine();
		System.out.println("you entered \""+message+"\"");
		
		
	}
	

}
