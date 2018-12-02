import java.util.ArrayList;
import java.util.Scanner;

public class Messages{
	
	public String messagename;
	private ArrayList<String> messages = new ArrayList<String>();
	
	public ArrayList getMessages() {
		return this.messages;
	}
	
	public void newTalk(String name, String myname) {
		
		messagename = name;
		
		Scanner scanner =  new Scanner(System.in);
		
		System.out.println("Your message:");
		
		String messag = scanner.nextLine();
		
		messages.add(myname + ": " + messag);
	}
	
}