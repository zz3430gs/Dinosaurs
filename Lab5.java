package com.joe;


import java.io.*;

public class Lab5 {

    public static void main(String[] args) throws IOException{

        //Create FileWriter and name it name
        //Create Buffwriter
        FileWriter name = new FileWriter("Name.txt");
        BufferedWriter bufWriter = new BufferedWriter(name);

        //Add the data
        //And close
        bufWriter.write("Joe\n");
        bufWriter.write("Blue\n");
        bufWriter.write("ITEC 2545\n");
        bufWriter.close();

        //Create a FileReader and BufferedReader
        FileReader reader = new FileReader("Name.txt");
        BufferedReader bufReader = new BufferedReader(reader);
        String line = bufReader.readLine();

        //Print out each line
        while(line != null){
            System.out.println(line);
            line = bufReader.readLine();
        }
        bufReader.close();


    }
}
