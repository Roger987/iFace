import java.util.ArrayList;
import java.util.Scanner;

public class Community{
	public String creator;
	public String communityname;
	public String description;
	public ArrayList<String> communityusers = new ArrayList<String>();
	
	
	public void CreateNewCommunity(String creatorcommunity) {
		
		Scanner scanner = new Scanner(System.in);
		
		creator = creatorcommunity;
		
		communityusers.add(creatorcommunity);
		
		System.out.println("Hi! Choose a name to your Community:");
		
		communityname = scanner.nextLine();
		
		System.out.println("Now, give a description to your community:");
		
		description = scanner.nextLine();
		
		System.out.println("Nice! Community created!");
		
	}
	
	public void AddToCommunity(String creatorname, String newmember, ArrayList creatorfriends) {
		
		System.out.println("Hello " + creatorname + "! Type the name of the friend that you want to add to your community  " + communityname);
		
		Scanner scanner = new Scanner(System.in);
		
		int i = 0;
		
	
	}
	
	
}