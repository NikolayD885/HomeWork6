package job6;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Laptop l1 = new Laptop(1, 2, 128, "Windows 10", "Сиреневый");
        Laptop l2 = new Laptop(2, 4, 256, "Windows 11", "Красный");
        Laptop l3 = new Laptop(3, 32, 512, "Windows 10", "Серый");
        Laptop l4 = new Laptop(4, 16, 256, "Windows 11", "Черный");
        //System.out.println(l1.toString());

        System.out.println("Введите 1 - фильтр по объему ОЗУ");
        System.out.println("Введите 2 - фильтр по объуму SSD");
        System.out.println("Введите 3 - фильтр по установленной OS");
        System.out.println("Введите 4 - фильтр по Цвету");
        System.out.print("Выберите параметр: ");

        Scanner sc = new Scanner(System.in);
        Integer choice = sc.nextInt();
        if(choice == 1){

            System.out.println("Выберите объем ОЗУ:");
            System.out.println("Введите 1 - 2Gb");
            System.out.println("Введите 2 - 4Gb");
            System.out.println("Введите 3 - 16Gb");
            System.out.println("Введите 4 - 32Gb");
            System.out.print("Выберите параметр: ");

            Scanner sc2 = new Scanner(System.in);
            Integer choice2 = sc.nextInt();
            if(choice2 == 1){
                System.out.printf(l1.toString());
            }
            else if (choice2 == 2) {
                System.out.printf(l2.toString());
            }
            else if (choice2 == 3) {
                System.out.printf(l4.toString());
            }
            else if (choice2 == 4) {
                System.out.printf(l3.toString());
            }
            else{
                System.out.println("Фильтра по такому параметру нет!");
            }

        }
        else if(choice == 2){

            System.out.println("Выберите объем SSD:");
            System.out.println("Введите 1 - 128Gb");
            System.out.println("Введите 2 - 256Gb");
            System.out.println("Введите 3 - 512Gb");
            System.out.print("Выберите параметр: ");

            Scanner sc2 = new Scanner(System.in);
            Integer choice2 = sc.nextInt();
            if(choice2 == 1){
                System.out.printf(l1.toString());
            }
            else if (choice2 == 2) {
                System.out.printf(l2.toString() + "\n" + l3.toString());
            }
            else if (choice2 == 3) {
                System.out.printf(l3.toString());
            }
            else{
                System.out.println("Фильтра по такому параметру нет!");
            }

        }

        else if(choice == 3){
            System.out.println("Выберите OS:");
            System.out.println("Введите 1 - Windows 10");
            System.out.println("Введите 2 - Windows 11");
            System.out.print("Выберите параметр: ");

            Scanner sc2 = new Scanner(System.in); //"ibm866"
            Integer choice2 = sc.nextInt();
            if(choice2 == 1){
                System.out.printf(l1.toString() + "\n" + l3.toString());
            }
            else if (choice2 == 2) {
                System.out.printf(l2.toString() + "\n" + l4.toString());
            }
            else{
                System.out.println("Фильтра по такому параметру нет!");
            }
        }
        else if(choice == 4){
            System.out.println("Выберите цвет: ");
            System.out.println("Введите 1 - Сиреневый");
            System.out.println("Введите 2 - Красный");
            System.out.println("Введите 3 - Серый");
            System.out.println("Введите 4 - Черный");
            System.out.print("Выберите параметр: ");

            Scanner sc2 = new Scanner(System.in); //"ibm866"
            Integer choice2 = sc.nextInt();
            if(choice2 == 1){
                System.out.printf(l1.toString());
            }
            else if (choice2 == 2) {
                System.out.printf(l2.toString());
            }
            else if (choice2 == 3) {
                System.out.printf(l3.toString());
            }
            else if (choice2 == 4) {
                System.out.printf(l4.toString());
            }
            else{
                System.out.println("Фильтра по такому параметру нет!");
            }
        }

        sc.close();
    }

}


