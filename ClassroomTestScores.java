// 4. The Classroom Test Scores 
// A teacher records the marks of 12 students in an array.
// Use a loop to calculate the class average.
// Find the highest and lowest marks.
// Count how many students scored above the average.
// Display a message if any student scored below passing marks (say 40).

import java.util.Scanner;

public class ClassroomTestScores {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numberOfStudents = 12;
        int[] testScores = new int[numberOfStudents];


        System.out.println("Please enter the test scores for " + numberOfStudents + " students (out of 100):");
        for (int i = 0; i < numberOfStudents; i++) {
            System.out.print("Student " + (i + 1) + " score: ");
            testScores[i] = scanner.nextInt();
        }

        int totalScore = 0;
        int highestScore = testScores[0];
        int lowestScore = testScores[0];
        boolean failedStudent = false;
        int passingMarks = 40;

        for (int score : testScores) {
            totalScore += score;
            if (score > highestScore) {
                highestScore = score;
            }
            if (score < lowestScore) {
                lowestScore = score;
            }
            if (score < passingMarks) {
                failedStudent = true;
            }
        }

        double classAverage = (double) totalScore / numberOfStudents;

        int aboveAverageCount = 0;
        for (int score : testScores) {
            if (score > classAverage) {
                aboveAverageCount++;
            }
        }

        System.out.println("\n--- Classroom Test Report ---");
        System.out.printf("Class average score: %.2f%n", classAverage);
        System.out.println("Highest score: " + highestScore);
        System.out.println("Lowest score: " + lowestScore);
        System.out.println("Number of students who scored above average: " + aboveAverageCount);

        if (failedStudent) {
            System.out.println("A student scored below the passing mark of " + passingMarks + ".");
        } else {
            System.out.println("All students scored at or above the passing mark of " + passingMarks + ".");
        }

        scanner.close();
    }
}