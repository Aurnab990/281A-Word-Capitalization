import java.util.Scanner;

public class ProjectDetails {
   
    public static void main(String[] args) {
    	@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
        
        String s = sc.nextLine();
        //Take the first latter
        
        String firstName = s.substring(0,1);
        
        //Then take the remainning all letter
        
        String remainingName = s.substring(1);
        String upperCase = firstName.toUpperCase();
        System.out.println(upperCase+remainingName);
        
    }
}
