import java.util.Scanner;

public class iFace{
	
	public static void main(String[] args) {
		
		java.util.ArrayList<Usuarios> users = new java.util.ArrayList<Usuarios>();
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Welcome to iFace\n");
		System.out.println("Choose an option:\n0 - Leave the page\n1 - Create new account\n2 - Login");
		
		int input = -1;
		
		while(input != 0) {
			
			input = scanner.nextInt();
			String aux = scanner.nextLine();
			
			switch(input) {
			
				case 1:
					Usuarios user = new Usuarios();
					user.CreateNewAccount();
					
					users.add(user);
					
					System.out.println("New account created!");
					
					break;
				
				case 2:
					
					System.out.println("Login:");
					System.out.println("Password:");
					//buscar no sistema
					System.out.println("Hello ");
					System.out.println("Choose an option:\n1 - Edit my profile\n2 - Add a new friend\n3 - Send a message\n4 - Read your messages\n5 - Create a community\n6 - Add a new person to your community\n7 - \n8 - Delete your account\n9 - Logout");
					int inputcase2 = scanner.nextInt();
					aux = scanner.nextLine();
					
					switch(inputcase2) {
					
						case 1:
							break;
						case 2:
					
					}
					
					break;
		
			}
			
			System.out.println("Choose an option:\n0 - Leave the page\n1 - Create new account\n2 - Login");
			
		}
		
	}
	
	
}