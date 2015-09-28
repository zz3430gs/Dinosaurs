package com.joe;

public class lab5cont {

    public static void main(String[] args) {

        //Create variables with the amount of the coin
        int dollar = 100;
        int quarter = 25;
        int dime = 10;
        int nickel = 5;
        int penny = 1;
        int combo = 0;

        //Create loops, then when the loops adds up to 100 the variable combo will add 1 every time
        for (int p = 0; p <= 100; p++) {
            for (int n = 0; n <= 20; n++) {
                for (int d = 0; d <= 10; d++) {
                    for (int q = 0; q <= 4; q++) {
                        if (p * penny + n * nickel + d * dime + q * quarter == dollar) {
                            combo++;
                        }
                    }
                }
            }
        }
        //Print out how many different combinations there are
        System.out.println("The total combination is " + combo);
            }
        }


