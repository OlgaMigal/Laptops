import java.awt.*;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

import static java.awt.SystemColor.menu;

/*
Подумать над структурой класса Ноутбук для магазина техники - выделить поля и методы. 
Реализовать в java.
Создать множество ноутбуков.
Написать метод, который будет запрашивать у пользователя критерий (или критерии)
 фильтрации и выведет ноутбуки, отвечающие фильтру. Критерии фильтрации можно хранить в Map. 
Например: 
“Введите цифру, соответствующую необходимому критерию:
1 - ОЗУ
2 - Объем ЖД
3 - Операционная система
4 - Цвет …
Далее нужно запросить минимальные значения для указанных критериев - 
сохранить параметры фильтрации можно также в Map.
Отфильтровать ноутбуки из первоначального множества и вывести проходящие по условиям.
Работу сдать как обычно ссылкой на гит репозиторий
Частые ошибки:
1. Заставляете пользователя вводить все существующие критерии фильтрации
2. Невозможно использовать более одного критерия фильтрации одновременно
3. При выборке выводятся ноутбуки, которые удовлетворяют только одному фильтру, 
а не всем введенным пользователем
4. Работа выполнена только для каких то конкретных ноутбуков, и если поменять 
характеристики ноутбуков или добавить еще ноутбук, то программа начинает работать некорректно
 */
public class Main {
    public static void main(String[] args) {


        int id = 1;
        Laptop laptop1 = new Laptop(id++, "Dell", "grey", 16, 1024, 13, 47000);
        Laptop laptop2 = new Laptop(id++, "Macbook", "silver", 16, 512, 13, 150000);
        Laptop laptop3 = new Laptop(id++, "Acer", "blue", 8, 256, 15, 35000);
        Laptop laptop4 = new Laptop(id++, "hp", "grey", 16, 256, 19, 66000);
        Laptop laptop5 = new Laptop(id++, "Asus", "white", 16, 512, 17, 54000);
        Laptop laptop6 = new Laptop(id++, "Dell", "grey", 8, 512, 15, 45000);


        Set<Laptop> laptops = new HashSet<>();
        laptops.add(laptop1);
        laptops.add(laptop2);
        laptops.add(laptop3);
        laptops.add(laptop4);
        laptops.add(laptop5);
        laptops.add(laptop6);

//        printSet(laptops);

        Scanner scanner = new Scanner(System.in);
        Interface.menu();
        int choice = scanner.nextInt();
        if (choice == 3 || choice == 4 || choice == 5 || choice == 6) {
            System.out.println("Введите минимум и максимум через пробел");
            int min = scanner.nextInt();
            int max = scanner.nextInt();

            if (choice == 3) {
                for (Laptop elem : laptops) {//RAM
                    if (elem.getRam() >= min && elem.getRam() <= max) {
                        System.out.println(elem);

                    }
                }
            } else if (choice == 4) { // HDD
                for (Laptop elem : laptops) {
                    if (elem.getHdd() >= min && elem.getHdd() <= max) {
                        System.out.println(elem);

                    }
                }

            } else if (choice == 5) { // Диагональ
                for (Laptop elem : laptops) {
                    if (elem.getDiagonal() >= min && elem.getDiagonal() <= max) {
                        System.out.println(elem);
                    }
                }

            } else if (choice == 6) { // Цена
                for (Laptop elem : laptops) {
                    if (elem.getPrice() >= min && elem.getPrice() <= max) {
                        System.out.println(elem);
                    }
                }
            }
//        }else if (choice == 1) {
//            System.out.println("Введите интересующий вариант: ");
//            String stringChoice = scanner.nextLine();
//            for (Laptop elem : laptops) {
//                if (elem.getBrand().equals(stringChoice)) {
//                    System.out.println(elem);
//                }
//            }
        }else{
            System.out.println("Попробуйте снова, ряд функций в разработке");
        }
    }
}

