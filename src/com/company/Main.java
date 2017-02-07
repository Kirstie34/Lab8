package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scan1 = new Scanner(System.in);

        System.out.print("Please enter the number of players: ");
        int noOfPlayers = getValidInteger(1, Integer.MAX_VALUE);

        int[][] ar3 = new int[noOfPlayers][];
        //creates the row array (allows user to enter how many rows are needed).

        for (int i = 0; i < ar3.length; i++) {
            System.out.printf("Enter the number of times at bat for player %d: ", i + 1);
            int noOfAtBats = scan1.nextInt();

            ar3[i] = new int[noOfAtBats];
            //creates the column array (allows user to enter how many columns are needed).

            System.out.println();

            double sum = 0.0;
            double numNotZero = 0;
            int count = 0;

            System.out.println("0=out, 1=single, 2=double, 3=triple, 4=home run");
            for (int j = 0; j < ar3[i].length; j++) {
                System.out.printf("Player %d, Result for at-bat %d: ", i + 1, j + 1); //filling the rows with data
                ar3[i][j] = getValidInteger(-1, 5);

                if (ar3[i][j] != 0) {
                    numNotZero = 1 + count++;
                }

                sum = sum + ar3[i][j];
            }

            System.out.println();
            System.out.printf("Batting Average: %.3f", battingAverage(numNotZero, noOfAtBats));
            System.out.println();

            System.out.printf("Slugging Percentage: %.3f", sluggingPercentage(sum, noOfAtBats));
            System.out.println();
            System.out.println();
        }
    }

    public static double battingAverage(double numNotZero, int noOfAtBats) {

        double battingAverage = 0.0;
        battingAverage = numNotZero / noOfAtBats;
        return battingAverage;
    }

    public static double sluggingPercentage(double sum, int noOfAtBats) {

        double sluggingPercentage = 0.0;
        sluggingPercentage = sum / noOfAtBats;
        return sluggingPercentage;
    }

    public static int getValidInteger() {
        Scanner scan1 = new Scanner(System.in);
        //validation for numbers
        while (!scan1.hasNextInt()) {
            scan1.nextLine(); //clears the buffer
            System.out.println("Please enter an integer! "); //tells user to enter number
        }
        return scan1.nextInt(); //takes the correct integer
    }

    public static boolean checkRange(int input, int min, int max) {
        if (input <= min || input >= max) {
            return false;
        }
        return true;
    }

    public static int getValidInteger(int min, int max) {
        int userInput = getValidInteger();
        while (checkRange(userInput, min, max) == false) {
            System.out.println("Please provide a number within range!");
            userInput = getValidInteger();
        }
        return userInput;
    }

}
