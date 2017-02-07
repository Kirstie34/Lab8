package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scan1 = new Scanner(System.in);

        System.out.print("Please enter the number of players: ");
        int noOfPlayers = scan1.nextInt();
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
                ar3[i][j] = scan1.nextInt();

                if (ar3[i][j] != 0) {
                    numNotZero = 1 + count++;
                }

                sum = sum + ar3[i][j];
            }

            System.out.println();
            System.out.printf("Batting Average: %.3f", battingAverage(numNotZero, ar3));
            System.out.println();

            System.out.printf("Slugging Percentage: %.3f", sluggingPercentage(sum, ar3));
            System.out.println();
            System.out.println();

        }
    }


    public static double battingAverage(double numNotZero, int[][] ar3) {

        double battingAverage = 0.0;
        int i = 0;

        battingAverage = numNotZero / ar3[i].length;

        return battingAverage;

    }

    public static double sluggingPercentage(double sum, int[][] ar3) {

        double sluggingPercentage = 0.0;
        int i = 0;


        sluggingPercentage = sum / ar3[i].length;

        return sluggingPercentage;

    }

}


