package org.example;
import org.example.animal.*;

import java.util.ArrayList;

public class Main {
    static ArrayList<Object> zoo;
    public static void main(String[] args) {
        zoo = new ArrayList<>();
        Lion lion = new Lion("Simba", 4, "male", "Strong", 10, "12/4/2020");
        zoo.add(lion);

        // in cac thong tin
        prinAllAnimal();
    }
    static void prinAllAnimal(){
        for (Object animal : zoo){
            System.out.println(animal);
        }
    }
}