package com.joe;

public class DinosaurSupervisor {

    public static void main(String[] args){

        //Create dinosaur and call the method roar
        Dinosaur t_rex = new Dinosaur();
        Dinosaur velociraptor = new Dinosaur();
        Dinosaur diplodocus = new Dinosaur();

        t_rex.roar();
        velociraptor.roar();
        diplodocus.roar();
    }
}
