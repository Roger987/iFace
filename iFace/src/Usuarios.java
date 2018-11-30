import java.util.Scanner;
import java.util.ArrayList;

public class Usuarios{
	public String login;
	public String name;
	private String password;
	public int id;
	public ArrayList<String> friends = new ArrayList<String>();
	public ArrayList<String> newfriends = new ArrayList<String>();
	private ArrayList<String> messages = new ArrayList<String>();
	public int age;
	public String city;
	public String nacionality;
	
	
	public void CreateNewAccount() {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Login:");
		login = scanner.nextLine();
		
		System.out.println("User namer:");
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
		
		return;
		
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
		System.out.println(age + " years\nLives in " + city + "       He/She is " + nacionality);
		System.out.println("Friends list:");
		for(i = 0; i < friends.size(); i++) {
			System.out.println(friends.get(i));
		}
	}
	
	public void SendMessage() {
		
	}
}