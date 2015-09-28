package com.joe;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;


public class Main {

    public static void main(String[] args) throws IOException {

        try {
            FileReader reader = new FileReader("");
            BufferedReader bufReader = new BufferedReader(reader);
            String line = bufReader.readLine();

            while (line != null) {
                System.out.println(line);
                line = bufReader.readLine();
            }
            bufReader.close();
        } catch (IOException ioe) {
            System.out.println("Could not open or read test.txt");
            System.out.println(ioe.toString());
        }
        System.out.println("If the code did not work, the program did not crash");
        System.out.println("The program keeps running so could perhaps ask the user to create this file, or specify the file location location");

    }
}
