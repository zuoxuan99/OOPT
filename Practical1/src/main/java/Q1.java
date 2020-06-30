import java.util.Scanner;

public class Q1 {
    
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        
        String name;
        int yearOfStudy;
        double targetGPA;
        
        System.out.println("Enter name: ");
        name = scan.nextLine();
        System.out.println("\nEnter your year of study: ");
        yearOfStudy = scan.nextInt();
        System.out.println("\nWhat is your target GPA for this semester? ");
        targetGPA = scan.nextDouble();
        
        System.out.println("\nWelcome "+ name +"!");
        System.out.println("Work hard to achieve your target GPA of "+ targetGPA +" this semester of your Year "+ yearOfStudy +".");
        
    }
}
