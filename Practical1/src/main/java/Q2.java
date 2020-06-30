import java.util.Scanner;

public class Q2 {
    
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        
        int age;
        
        System.out.println("Enter your age (years): ");
        age = scan.nextInt();
        
        System.out.println("Age in years: "+ age +" years");
        System.out.println("Age in days: "+ age*365 +" days");
        System.out.println("Age in seconds: "+ age*365*24*60*60 +" seconds");
        
    }
}
