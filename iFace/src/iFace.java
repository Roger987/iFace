import java.util.Scanner;

public class iFace{
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		int input = -1, num = 0;
		
		
		System.out.println("Welcome to iFace\n");
		System.out.println("Choose an option:\n0 - Leave the page\n1 - Create new account\n2 - Login\n\n");
		
		java.util.ArrayList<Usuarios> users = new java.util.ArrayList<Usuarios>();
		
		while(input != 0) {
			
			input = scanner.nextInt();
			
			scanner.nextLine();
			
			switch(input) {
			
				case 1:
					Usuarios user = new Usuarios();
					
					user.CreateNewAccount();
					user.EditProfile();
					user.id = num;
					users.add(user);
					num++;
					
					System.out.println("New account created!\n\n");
					
					break;
				
				case 2:
					
					int i, id = 0;
					String password = null;
					System.out.println("Login:");
					String login = scanner.nextLine();
					
					for(i = 0; i < num; i++) {
						if(login.equals(users.get(i).login)) {
							id = i;
							System.out.println("Password:");
							password = scanner.nextLine();
							break;
						}
					}
					
					if(password.equals(users.get(id).getPassword())){
						System.out.println("\nHello " + users.get(id).name + "!\n");
						System.out.println("\nChoose an option:\n1 - Edit my profile\n2 - Add a new friend\n3 - Accept a new friend\n4 - Send a message\n5 - Read your messages\n6 - Create a community\n7 - Add a new person to your community\n8 - \n9 - Show my profile\n10 - Delete your account\n11 - Logout\n\n");
						
						int inputcase2 = -1, friendx = 0, indexfriends = 0;
						
						while(inputcase2 != 11) {
							
							inputcase2 = scanner.nextInt();
							scanner.nextLine();
							
							switch(inputcase2) {
							
								case 1:
									
									users.get(id).EditProfile();
									
									break;
								
								case 2:
									
									System.out.println("\nType your friend's user name:\n");
									
									String friendname = scanner.nextLine();
									
									for(i = 0; i < num; i++) {
										
										if(friendname.equals(users.get(i).name)) {
											users.get(i).AddFriend(users.get(id).name);
											friendx++;
											break;
										}
										
									}
									
									
								case 3:
									
									int j;
									System.out.println("People who wants to be your friends\nPress 1 to accept and 2 to decline\n\n");
									
									for(i = 0; i < friendx; i++) {
										
										System.out.println(users.get(id).newfriends.get(i));
										
										int accept = scanner.nextInt();
										
										if(accept == 1) {
											
											users.get(id).friends.add(users.get(id).newfriends.get(i));
											
											for(j = 0; j < num; j++) {
												if(users.get(id).newfriends.get(i).equals(users.get(j).name)) {
													users.get(j).friends.add(users.get(id).name);
												}
												indexfriends++;
											}
											
										}
									}
									break;
							}
						
						}
					}
					 else {
						 System.out.println("\nWrong password.\n\nTry again.\n\n");
					 }
					
					break; 
		
			}
			
			System.out.println("\n\nChoose an option:\n0 - Leave the page\n1 - Create new account\n2 - Login\n\n");
			
		}
		
		scanner.close();
	}
	
	
}