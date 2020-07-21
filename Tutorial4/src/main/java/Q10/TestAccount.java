package Q10;


import java.util.Scanner;


public class TestAccount {
    private static Scanner scanner = new Scanner(System.in);
        
    public static void main (String[] args) {
          //todo:: create account object
          Account acc1 = new Account(909, "Ali baba", 1000);
          
          //todo:: set Interest rate
          Account.setAnnualInterestRate(0.03);
          
          int choice;
          
          do {
              choice = displayMenu();
              switch (choice ){
                  case 1:  //todo:: display balance 
                           System.out.println("balance : " + acc1.getBalance());
                           break;
                           
                  case 2 : //todo:: request deposit amount
                           System.out.println("Enter Deposit Amount : ");
                           
                           //todo:: cash in
                           acc1.cashIn(scanner.nextDouble());
                           
                           //todo:: display balance
                           System.out.println("New Balance : " + acc1.getBalance());
                           break;
                           
                  case 3 : System.out.print("Enter Amount : ");
                           //todo:: cash out
                           acc1.cashOut(scanner.nextDouble());
                           
                           //todo:: display balance
                           System.out.println("New Balance : " + acc1.getBalance());
                           break;
                           
                  case 4 : //todo:: display interest amount
                           System.out.println("Interest Amount : " + acc1.calcInterest());
                           break;
                         
              }
          }while (choice != 5);
    }
      
    public static int displayMenu(){
          System.out.println("\nMain Menu");
          System.out.println("1 : Check balance");
          System.out.println("2 : Cash In"); 
          System.out.println("3 : Cash Out");
          System.out.println("4 : Interest"); 
          System.out.println("5 : Exit"); 
          System.out.print("Enter a choice : ");
          
          //todo:: read and return selection 
          return scanner.nextInt();
     
    }  
}
