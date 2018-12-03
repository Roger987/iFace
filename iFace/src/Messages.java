import java.util.ArrayList;
import java.util.Scanner;

public class Messages{
	
	public String messagename;
	public ArrayList<String> messages = new ArrayList<String>();

	public void ShowMessages() {
		int i;
		System.out.println("Your messages with " + messagename);
		for(i = 0; i < messages.size(); i++) {
			System.out.println(messages.get(i));
		}
	}
	
}