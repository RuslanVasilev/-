package ru.geekbrains.Lesson1;

public class HomeWorkApp {
    public static void main(String[] args) {
        System.out.println("Hello World");
        printThreeWords();
        checkSumSign();
        printColor();
        compareNumbers();
    }
         // Метод "Написать три слова".
       public static void printThreeWords() {

        System.out.println("Orangge");
        System.out.println("Banana");
        System.out.println("Apple");
       }
       // Метод проверки суммы.
      public static void checkSumSign() {

        int a = 10;
        int b = 15;
        int sum = a + b;
        if ( sum >= 0) {
        System.out.println("Сумма положительная");
        }
        if (sum < 0) {
            System.out.println("Сумма отрицательная");
        }
      }
      // Метод "Написать цвет".
      public static void printColor() {
        int value = 5;
                if (value <= 0) {
                System.out.println("Красный");
                }
                if (value > 0 && value <= 100) {
                    System.out.println("Желтый");
                }
                if (value > 100) {
                    System.out.println("Зеленый");
                }
      }
      // Метод "Сравнить числа".
       public static void compareNumbers() {
       int a = 3;
       int b = 5;
       if (a >= b) {
           System.out.println("a>=b");
       }
       else {
           System.out.println("a<b");
       }
      }
    }
// Конец!
