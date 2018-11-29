import java.util.Scanner;
import java.util.ArrayList;

public class Usuarios{
	private String login;
	public String name;
	private String password;
	public ArrayList<Integer> friends = new ArrayList<Integer>();
	private ArrayList<String> messages = new ArrayList<String>();
	
	public void CreateNewAccount() {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Login:");
		login = scanner.nextLine();
		
		System.out.println("User namer:");
		name = scanner.nextLine();
		
		System.out.println("Password:");
		password = scanner.nextLine();
		
		scanner.close();
	}
	
	public void CreateNewProfile() {
		
		Scanner scanner = new Scanner(System.in);
		
		
		
		
		scanner.close();
		
	}
}