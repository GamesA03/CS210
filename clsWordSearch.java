package week3;
import java.util.Scanner;
public class clsWordSearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int count = 0;
		
		System.out.println("Enter words: ");
		String words = scan.nextLine();
		String[] wordArray = words.split(",");
		
		System.out.println("Enter word you want to find: ");
		String wordToFind = scan.next();
		System.out.println();
		System.out.println("You are looking for " + wordToFind);
		System.out.println();
		System.out.println("Here is the list of words: ");
		for (int i = 0; i < wordArray.length; i++) { 
			if(wordArray[i].equals(wordToFind)) {
				count++;
				
			}
			System.out.println(wordArray[i]);
		}
		
		if(count > 0) {
			System.out.println("True. There is more than one instance");
		} 
		
		System.out.println(count);
		
	}

}
