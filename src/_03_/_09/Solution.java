package _03_._09;

/*
Настя или Настя?
Ввести с клавиатуры два имени, и если имена одинаковые вывести сообщение "Имена идентичны".
Если имена разные, но их длины равны - вывести сообщение - "Длины имен равны".
Если имена и длины имен разные - ничего не выводить.


Requirements:
1. Программа должна считывать две строки c клавиатуры.
2. Программа должна содержать System.out.println() или System.out.print()
3. Если имена одинаковые вывести сообщение "Имена идентичны"
4. Если имена разные, но их длины равны , вывести сообщение "Длины имен равны"
5. Если имена и длины имен разные - ничего не выводить.*/

import java.util.Scanner;

public class Solution {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите первое имя: ");
        String firstName = scanner.nextLine();
        System.out.print("Введите второе имя: ");
        String secondName = scanner.nextLine();

        if (firstName.equals(secondName)) {
            System.out.println("Имена идентичны");
        } else if (firstName.length() == secondName.length()) {
            System.out.println("Длины имен равны");
        }
    }
}


