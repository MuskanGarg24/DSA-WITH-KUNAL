// electricity bill calculator
import java.util.Scanner;

public class Second {
    public static void main(String[] args) {
        System.out.println("****************** INDIA ********************");

        String Appliance;
        int powerUsage;
        int hours;
        int cost = 9;

        try(Scanner input = new Scanner(System.in)){
            System.out.print("Typical Appliance: ");
            Appliance = input.nextLine();
            System.out.print("Power Usage: ");
            powerUsage = input.nextInt();
            System.out.print("Hours of use per Day: ");
            hours = input.nextInt();
        }
        
        System.out.println("1 unit 'killowatt-hour(kwh)' cost = "+  cost);
        System.out.println("******Calculations******");

        float perDay = ((cost*hours*powerUsage)/1000);
        float perMonth = perDay*30;
        float perYear = perDay*365;

        System.out.println("Cost for appliance "+Appliance+" is - ");
        System.out.println("Electricity cost per Day: "+ perDay+" Rs.");
        System.out.println("Electricity cost per Month: "+ perMonth+" Rs.");
        System.out.println("Electricity cost per Year: "+ perYear+" Rs.");

    }
}
