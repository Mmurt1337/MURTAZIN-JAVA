package task1;

import java.util.Scanner;

/*
Составить алгоритм: если введенное число больше 7, то вывести “Привет”
Составить алгоритм: если введенное имя совпадает с Вячеслав, то вывести “Привет, Вячеслав”, если нет, то вывести "Нет такого имени"
Составить алгоритм: на входе есть числовой массив, необходимо вывести элементы массива кратные 3
*/

public class InteractiveProgram {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Выберите программу для запуска:");
            System.out.println("1: Проверить число");
            System.out.println("2: Проверить имя");
            System.out.println("3: Проверить массив");
            System.out.println("0: Выход");

            int choice = scanner.nextInt();
            scanner.nextLine(); 

            switch (choice) {
                case 1:
                    checkNumber(scanner);
                    break;
                case 2:
                    checkName(scanner);
                    break;
                case 3:
                    checkArray(scanner);
                    break;
                case 0:
                    System.out.println("До свидания!");
                    return;
                default:
                    System.out.println("Неверный выбор. Пожалуйста, попробуйте снова.");
            }
        }
    }

    private static void checkNumber(Scanner scanner) {
        System.out.println("Введите число:");
        int number = scanner.nextInt();

        if (number > 7) {
            System.out.println("Привет");
        }
    }

    private static void checkName(Scanner scanner) {
        System.out.println("Введите имя:");
        String name = scanner.nextLine();

        if ("Вячеслав".equals(name)) {
            System.out.println("Привет, Вячеслав");
        } else {
            System.out.println("Нет такого имени");
        }
    }

    private static void checkArray(Scanner scanner) {
        System.out.print("Введите размер массива: ");
        int size = scanner.nextInt();
        int[] array = new int[size];
        System.out.println("Введите элементы массива: ");
        for (int i = 0; i < size; i++) {
            array[i] = scanner.nextInt();
        }

        System.out.println("Элементы массива, кратные 3:");
        for (int value : array) {
            if (value % 3 == 0) {
                System.out.println(value);
            }
        }
    }
}
