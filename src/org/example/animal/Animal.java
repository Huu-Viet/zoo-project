package org.example.animal;
public class Animal {
    String name;
    int age;
    String gender;
    String health;

    public int getMassOfFood() {
        return massOfFood;
    }

    public void setMassOfFood(int massOfFood) {
        if(massOfFood >= 1) {
            this.massOfFood = massOfFood;
        }
    }

    int massOfFood; // ?/kg
    String dayImport; // dd/mm/yy
    public int weight = 0;

    public Animal(String name, int age, String gender, String health, int massOfFood, String dayImport) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.health = health;
        this.massOfFood = massOfFood;
        this.dayImport = dayImport;
    }


    @Override
    public String toString() {
        return "Animal{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", gender='" + gender + '\'' +
                ", health='" + health + '\'' +
                ", massOfFood=" + massOfFood +
                ", dayImport='" + dayImport + '\'' +
                '}';
    }
}
