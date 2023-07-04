package org.example.animal;
public class Lion extends Animal{

    public Lion(String name, int age, String gender, String health, int massOfFood, String dayImport) {
        super(name, age, gender, health, massOfFood, dayImport);
    }

    @Override
    public String toString() {
        return "Lion{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", gender='" + gender + '\'' +
                ", health='" + health + '\'' +
                ", massOfFood=" + massOfFood + "kg" +
                ", dayImport='" + dayImport + '\'' +
                '}';
    }
}
