import java.util.Scanner;

public class FuelCosts {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double gallons = 0;
        double efficiency = 0;
        double pricePerGallon = 0;
        boolean validGallons = false;
        boolean validEfficiency = false;
        boolean validPrice = false;
        double costOfTotal;
        double distance;

        do {
            System.out.println("Enter the number of gallons of gasoline");
            if (scan.hasNextDouble()) {
                gallons = scan.nextDouble();
                if (gallons >= 0) {
                    validGallons = true;
                    scan.nextLine();
                }
                else {
                    scan.nextLine();
                    System.out.println("Invalid number of gallons, try again");
                    System.out.println();
                }
            }
            else {
                scan.nextLine();
                System.out.println("Invalid data type, try again");
                System.out.println();
            }
        } while(!validGallons);

        do {
            System.out.println("Enter the efficiency in miles per gallons");
            if (scan.hasNextDouble()) {
                efficiency = scan.nextDouble();
                if (efficiency >= 0) {
                    validEfficiency = true;
                    scan.nextLine();
                }
                else {
                    scan.nextLine();
                    System.out.println("Invalid efficiency value, try again");
                    System.out.println();
                }
            }
            else {
                scan.nextLine();
                System.out.println("Invalid data type, try again");
                System.out.println();
            }
        } while(!validEfficiency);

        do {
            System.out.println("Enter the current price for gallons of gas");
            if (scan.hasNextDouble()) {
                pricePerGallon = scan.nextDouble();
                if (pricePerGallon >= 0) {
                    validPrice = true;
                }
                else {
                    scan.nextLine();
                    System.out.println("Invalid price value, try again");
                    System.out.println();
                }
            }
            else {
                scan.nextLine();
                System.out.println("Invalid data type, try again");
                System.out.println();
            }
        } while(!validPrice);

        costOfTotal = pricePerGallon/efficiency * 100;
        distance = gallons*efficiency;

        System.out.printf("Cost per 100 miles: %8.2f", costOfTotal);
        System.out.printf("\nCost per 100 miles: %8.2f", distance);
    }
}