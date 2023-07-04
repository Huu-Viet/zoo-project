package org.example;
import org.example.animal.*;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    static ArrayList<Lion> zoo;

    public static void main(String[] args) {
        String name;
        int age;
        String gender;
        String health;
        int massOfFood;
        int weight;
        String dayImport;
        int n=1;
        zoo = new ArrayList<>();
//        lion = new ArrayList<>();

        for(int i=0;i<n;i++){
            n++;
            //nhập thông tin
            Scanner scanner = new Scanner(System.in);
            System.out.println("nhập tên: ");
            name = scanner.nextLine();
            System.out.println("nhập tuổi: ");
            age = scanner.nextInt();
            System.out.println("nhập giới tính: ");
            scanner.nextLine();
            gender = scanner.nextLine();
            System.out.println("nhập tình trạng sức khỏe: ");
            health = scanner.nextLine();
            System.out.println("nhập khối lượng thức ăn/tháng: ");
            massOfFood = scanner.nextInt();
            weight = massOfFood;
            scanner.nextLine();
            System.out.println("nhập ngày đưa vào sở thú: ");
            dayImport = scanner.nextLine();
            //tạo các cá thể sư tử
            Lion newlion = new Lion(name, age, gender, health, massOfFood, dayImport);

            newlion.weight = weight;
            zoo.add(newlion);
            System.out.println("bạn có muốn nhập thêm hay không (yes/no): ");
            String answer = scanner.nextLine();
            if(answer.equals("no")){
                n--;
            }

        }
        // in cac thong tin
        prinAllAnimal();
        int sum = 0;
        for(Lion lionx : zoo){
            sum +=  lionx.getMassOfFood();
        }
        System.out.println("weight sum ="+sum);
    }


    static void prinAllAnimal(){
        for (Object animal : zoo){
            System.out.println(animal);
        }
    }
}