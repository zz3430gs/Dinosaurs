package com.joe;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class lab5tocont {

    public static void main(String[] args) throws IOException {

        //Create scanner and FileWriters and BufferedWriter
        Scanner s = new Scanner(System.in);
        FileWriter recycling = new FileWriter("House Recycling");
        BufferedWriter bufWriter = new BufferedWriter(recycling);

        int cratesHouse[] = new int[8];
        int totalCrates = 0;
        int max = cratesHouse[0];
        int min = cratesHouse[0];
        int houseWithMaxCrate = 0;
        for (int house = 0; house <= 7; house++) {
            System.out.println("Enter the amount of crates from house " + house);
            int crates = s.nextInt();
            cratesHouse[house] = crates;
            totalCrates += cratesHouse[house];
            bufWriter.write("House " + house + " recycled " + crates + " crates\n");
        }
            bufWriter.write("The total crates " + totalCrates + "\n");
        //Create loop to find a maximum number
        for (int h = 0; h < cratesHouse.length; h++) {
            if (cratesHouse[h] > max) {
                max = cratesHouse[h];
            }
        }//Create loop to find minimum number
        for (int h = 0; h < cratesHouse.length; h++) {
            if (cratesHouse[h] < min) {
                min = cratesHouse[h];
            }
            //Create loop for finding the most crates a house recycled
        }
        for (int i = 1; i < cratesHouse.length; i++) {
            if (cratesHouse[i] >= max) {
                max = cratesHouse[i];
                houseWithMaxCrate = i;
            }
        }
        //write in the text and close
        bufWriter.write("House that recycled the most:\n");
        bufWriter.write("house " + houseWithMaxCrate + " which recycled " + max + " crates");
        bufWriter.close();
    }
}