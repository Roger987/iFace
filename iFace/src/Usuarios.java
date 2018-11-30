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
		
	}
	
	public void AddFriend(String yourname) {
		String message = yourname;
		newfriends.add(message);
		System.out.println("Done!");
	}
	
	public void SendMessage() {
		
	}
}