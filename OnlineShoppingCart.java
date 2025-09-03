// 3. The Online Shopping Cart 
// A shopping app stores product prices in an array when a customer adds items.
// Use a loop to calculate the total cart value.
// Apply a discount of 10% if the total exceeds 5000.
// Add a delivery charge of 100 if the total after discount is less than 2000.
// Display the final payable amount.


import java.util.Scanner;

public class OnlineShoppingCart {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to your online shopping cart!");
        System.out.println("Enter the number of products you wish to add:");
        int numberOfProducts = scanner.nextInt();
        
        double[] productPrices = new double[numberOfProducts];
        double totalCartValue = 0.0;

        for (int i = 0; i < numberOfProducts; i++) {
            System.out.print("Enter price for product " + (i + 1) + ": ");
            productPrices[i] = scanner.nextDouble();
            totalCartValue += productPrices[i];
        }

        System.out.println("\n--- Cart Summary ---");
        System.out.printf("Total cart value: $%.2f%n", totalCartValue);

        double finalAmount = totalCartValue;
        double discount = 0.0;
        double deliveryCharge = 0.0;

       
        if (finalAmount > 5000) {
            discount = finalAmount * 0.10;
            finalAmount -= discount;
            System.out.printf("Discount applied (10%%): -$%.2f%n", discount);
        }

        if (finalAmount < 2000) {
            deliveryCharge = 100.0;
            finalAmount += deliveryCharge;
            System.out.printf("Delivery charge added: +$%.2f%n", deliveryCharge);
        }

        System.out.println("\n--- Final Bill ---");
        System.out.printf("Final payable amount: $%.2f%n", finalAmount);

        scanner.close();
    }
}