// 1. The Library Book Tracker 
// A library records the number of books borrowed each day for 7 days in an array.
// Use a loop to calculate the total number of books borrowed in the week.
// Find the day with the highest borrowings.
// Check if there was any day with zero borrowings (holiday).
// Display the average daily borrowings.

import java.util.Scanner;

public class The_Library_Book_Tracker {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

       
        System.out.println("Please enter the number of books borrowed for each of the 7 days:");
        int[] dailyBorrowings = new int[7];
        String[] daysOfWeek = {"Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday"};

        for (int i = 0; i < dailyBorrowings.length; i++) {
            System.out.print(daysOfWeek[i] + ": ");
            dailyBorrowings[i] = scanner.nextInt();
        }

        int totalBooks = 0;
        int maxBorrowings = -1; 
        String dayWithMaxBorrowings = "";
        boolean holidayFound = false;

 
        for (int i = 0; i < dailyBorrowings.length; i++) {
            totalBooks += dailyBorrowings[i];

            if (dailyBorrowings[i] > maxBorrowings) {
                maxBorrowings = dailyBorrowings[i];
                dayWithMaxBorrowings = daysOfWeek[i];
            }

            if (dailyBorrowings[i] == 0) {
                holidayFound = true;
            }
        }

        
        double averageBorrowings = (double) totalBooks / dailyBorrowings.length;

      
        System.out.println("\n--- Library Book Tracker Report ---");
        System.out.println("Total books borrowed in the week: " + totalBooks);
        System.out.println("Day with the highest borrowings: " + dayWithMaxBorrowings + " with " + maxBorrowings + " books.");

        if (holidayFound) {
            System.out.println("There was at least one day with zero borrowings (holiday).");
        } else {
            System.out.println("There were no days with zero borrowings.");
        }

        System.out.printf("Average daily borrowings: %.2f%n", averageBorrowings);

        scanner.close();
    }
}

