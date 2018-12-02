import java.util.Scanner;
import java.util.ArrayList;

public class Usuarios{
	public String login;
	public String name;
	private String password;
	public int id;
	public ArrayList<String> friends = new ArrayList<String>();
	public ArrayList<String> newfriends = new ArrayList<String>();
	public int age;
	public String city;
	public String nacionality;
	public Community mycommunity = null;
	private ArrayList<Messages> mymessages = new ArrayList<Messages>();
	public ArrayList<String> mycommunities = new ArrayList<String>();
	
	
	public void CreateNewAccount() {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Login:");
		login = scanner.nextLine();
		
		System.out.println("User name:");
		name = scanner.nextLine();
		
		System.out.println("Password:");
		password = scanner.nextLine();
		
	}
	
	
	public String getPassword() {
		return this.password;
	}
	
	
	public void EditProfile() {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Age:");
		age = scanner.nextInt();
		scanner.nextLine();
		
		System.out.println("City:");
		city = scanner.nextLine();
		
		System.out.println("Nacionality:");
		nacionality = scanner.nextLine();
		
	}
	
	
	public void AddFriend(String yourname) {
		String message = yourname;
		newfriends.add(message);
		System.out.println("Done!");
	}
	
	
	public void ShowProfile() {
		int i;
		System.out.println(name.toUpperCase());
		System.out.println("------------------------------");
		System.out.println(age + " years\n" + city + "     " + nacionality);
		System.out.println("Friends list:");
		for(i = 0; i < friends.size(); i++) {
			System.out.println("   " + friends.get(i));
		}
		if(mycommunity != null) {
			System.out.println("My Community: " + mycommunity.communityname + "\n  Description: " + mycommunity.description);

		}
		System.out.println("Communities:");
		for(i = 0; i < mycommunities.size(); i++) {
			System.out.println("   " + mycommunities.get(i));
		}
	}
	
	
	public void CreateCommunity() {
		Community community = new Community();
		community.CreateNewCommunity(this.name);
		mycommunity = community;
	}
	
	
	public void AddCommunity(ArrayList<Usuarios> u) {
		
		Scanner scanner = new Scanner(System.in);
		
		int i;
		
		if(mycommunity != null) {
			
			System.out.println("Type the name of the user who you wants to add to your community:");
			
			String newname = scanner.nextLine();
			
			for(i = 0; i < u.size(); i++) {
				if(newname.equals(u.get(i).name)) {
					mycommunity.communityusers.add(newname);
					u.get(i).mycommunities.add(mycommunity.communityname);
					System.out.println(newname + " add to your community!");
				}
				
			}
		}
		
		else {
			System.out.println("Ops! You haven't a community!\n");
		}
		
	}
	
	
	public void SendMessage(ArrayList<Usuarios> u) {
		
		Scanner scanner = new Scanner(System.in);
		
		Messages message = new Messages();
		
		int i, j;
		
		System.out.println("Type the name of the user who you wants to send a message:");
		
		String newname = scanner.nextLine();

	}


	
}





