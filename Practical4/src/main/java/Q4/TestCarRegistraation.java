package Q4;

import java.util.Scanner;

public class TestCarRegistraation {

    public static void main(String[] args) {

        //todo:: By using array, create 3 CarType objects
        CarType[] typeList = {new CarType("Toyota", "Vios", 1.5),
            new CarType("Nissan", "Teana", 2.0),
            new CarType("Honda", "City", 1.6)
        };

        //todo:: create an array that will able to store 6 registrations
        Registration[] registration = new Registration[6];

        Scanner scan = new Scanner(System.in);
        
        /*todo:: loop until the number of registration */
        for (int i = 0; i < registration.length; ++i) {
            
            /* todo:: display current registration number*/
            System.out.print("\nRegistration number: " + Registration.nextRegNo);

            //todo:: request and read the owner detail
            System.out.print("Enter owner name : ");
            String name = scan.nextLine();
            System.out.print("Enter owner ic : ");
            String ic = scan.nextLine();
            
            //construct owner object
            Owner owner = new Owner(name, ic);

            //todo:: request and read car detail
            System.out.print("Enter plate number : ");
            String plateNo = scan.nextLine();
            System.out.print("Enter color : ");
            String color = scan.nextLine();
            System.out.print("Enter Year : ");
            int year = scan.nextInt();

            //construct car object
            Car car = new Car(plateNo, color, year);

            System.out.println("\nCar Types: ");
            //todo:: display all available carType
            for (int x = 0; x < typeList.length; x++) { /* todo:: display the max number of car option */
                System.out.println((x + 1) + ". " + typeList[x].toString());
            }

            System.out.print("\nSelect car type [1.." + typeList.length + "]: ");
            int selection = scan.nextInt();

            //todo:: get cartype from array (based on selection)
            CarType selectedType = typeList[selection - 1];

            //todo:: create car object
            Registration newReg = new Registration(car, selectedType, owner);
            
            //todo:: register the car
            registration[i] = newReg;
            scan.nextLine();
        }

        //todo:: display all registration detail
        displayListing(registration);

    }

    public static void displayListing(Registration[] regArr) {
        System.out.printf("\n\n%50s\n", "Car Registration Listing");
        System.out.printf("%-10s %-20s %-15s %-10s %-10s %-10s %-10s %-7s %-10s\n",
                "Reg No", "Name", "IC No.", "Plate No", "Color", "Year", "Make", "Model", "Capacity");
        for (int i = 0; i < regArr.length; ++i) {
            System.out.println(regArr[i]);
        }
    }

}
