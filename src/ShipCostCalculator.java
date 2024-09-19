import java.util.Scanner;

public class ShipCostCalculator {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int FREE_SHIPPING = 100;
        double SHIPPING_FEE = 0.2;
        double itemPrice;
        double shippingCost = 0;
        double totalCost = 0;

        System.out.println("What is the price of your item");
        if(scan.hasNextDouble()) {
            itemPrice = scan.nextDouble();
            if(itemPrice >= 0){
                if(itemPrice >= FREE_SHIPPING){

                    totalCost = itemPrice;

                } else {
                    shippingCost = SHIPPING_FEE * itemPrice;
                    totalCost = itemPrice + shippingCost;
                }
                System.out.println("Your total cost is $" + totalCost + ". Your shipping cost is $" + shippingCost + ".");
            } else {
                System.out.println("You entered a negative number or zero");
                System.exit(32498);
            }
        } else {
            System.out.println("you entered a wrong data type");
            System.exit(0);
        }

    }
}