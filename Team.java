package week7;

import week7.Person;
import java.util.Scanner;

public class Team {
	public static final int MAX_PLAYERS = 53;
	private String teamName;
	private String coachName;
	private String conferenceName;
	private Person[] roster;
	private int numPlayers = 0;
	
	public Team(String teamName, String coachName, String conferenceName) {
		this.teamName = teamName;
		this.coachName = coachName;
		this.conferenceName = conferenceName;
		roster = new Person[MAX_PLAYERS];
		numPlayers = 0;
	}

	

	public void add(Person player) {
		roster[numPlayers] = player;
		numPlayers++;
	}
	
    public void findPerson(String searchField, String searchTerm) {
        for(int i = 0; i < numPlayers; i++) {
        	if(searchField.equals("name")) {
        		if(roster[i].getName().equalsIgnoreCase(searchTerm)) {
        			System.out.println(roster[i].getName());
        		}
        	}
        	
        	if(searchField.equals("number")) {
        		if(roster[i].getJN().equals(searchTerm)) {
        			System.out.println(roster[i].getJN());
        		}
        	}
       
        }
        
    }

	    

    public void displayRoster() {
		for (int i = 0; i < numPlayers; i++) {
		System.out.println(roster[i].toString() + " " + roster[i].getName() +  " " + roster[i].getbirthDate() + " " + roster[i].getPN() + " " + roster[i].getJN());
			}
		}
	
	 public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        System.out.print("Enter team name: ");
	        String teamName = scanner.nextLine();
	        System.out.print("Enter coach name: ");
	        String coachName = scanner.nextLine();
	        System.out.print("Enter conference name: ");
	        String conferenceName = scanner.nextLine();

	        Team team = new Team(teamName, coachName, conferenceName);
	        Person playerOne = new Person("Tahu", "111-222-3333", "7/9/01","1");
	        Person playerTwo = new Person("Gali", "123-456-789", "7/9/01", "2");
	        Person playerThree = new Person("Lewa", "109-876-5432", "7/9/01","3");
	        
	    
	        
	        team.add(playerOne);
	        team.add(playerTwo);
	        team.add(playerThree);
	        
	        System.out.print("Enter Search Field:");
	        String field = scanner.nextLine();
	        System.out.print("Enter Search Term:");
	        String term = scanner.nextLine();
	        team.findPerson(field, term);
	        
	        
	        team.displayRoster();
	        
	        
	 }
}

