package week3;
import java.util.Scanner; 
public class clsResumeBuilder {
	
	public static String getName(String name) {
		String formName = "Name: " + name;
		return formName;
	}
	
	public static String getContactInfo(String email, String phoneNumber) {
		String formContact = "Email: " + email + "\nPhone Number: " + phoneNumber;
		return formContact;
	
	}
	
	public static String getEducation(String school, String major, String gradYear) {
		String formEducation = "School: " + school + "\nMajor: " + major + "\nGraduation Year: " + gradYear;
		return formEducation;
	}
	
	public static String getWorkExperience (String work) {
		String workList = "Work Experience: ";
		String[] workArray = work.split(",");
		for(int i = 0; i < workArray.length; i++) {
			workList+="\n" + workArray[i];
		}
		return workList;
	}
	
	public  static String getSkills (String skills) {	
		String skillList = "Skills: ";
		String[] skillArray = skills.split(",");
		for(int i = 0; i < skillArray.length; i++) {
			skillList+="\n" + skillArray[i];
		}
		return skillList;
	}
	
	public static void buildResume(String getName, String getContactInfo, String getEducation, String getWork, String getSkills) {
		System.out.println(getName);
		System.out.println();
		System.out.println(getContactInfo);
		System.out.println();
		System.out.println(getEducation);
		System.out.println();
		System.out.println(getWork);
		System.out.println();
		System.out.println(getSkills);
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter name:");
		String name = scan.nextLine();
		System.out.print("Enter email: ");
		String email = scan.nextLine();
		System.out.print("Enter Phone number: ");
		String phoneNumber = scan.nextLine();
		System.out.print("Enter School:");
		String school=scan.nextLine();
		System.out.print("Enter Major: ");
		String major = scan.nextLine();
		System.out.print("Enter Graduation Year: ");
		String gradYear = scan.nextLine();
		System.out.print("Enter Work Experience (Separated by commas): ");
		String work = scan.nextLine();
		System.out.print("Enter Skills (Separated by commas): ");
		String skills = scan.nextLine();
		
		
		String getName = getName(name);
		String getContactInfo = getContactInfo(email,phoneNumber);
		String getEducation = getEducation(school, major, gradYear);
		String getWork = getWorkExperience(work);
		String getSkills = getSkills(skills);
		buildResume(getName, getContactInfo, getEducation, getWork, getSkills);
		
		
	}

}
