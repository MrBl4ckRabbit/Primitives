package _03_._07;

/*
Максимум четырех чисел
Ввести с клавиатуры четыре числа, и вывести максимальное из них.
Если числа равны между собой, необходимо вывести любое.


Requirements:
1. Программа должна считывать числа c клавиатуры.
2. Программа должна выводить число на экран.
3. Программа должна выводить на экран максимальное из четырёх чисел.
4. Если максимальных чисел несколько, необходимо вывести любое из них.*/

import java.util.Scanner;

public class Solution {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        int[] numbers = new int[4];
        int max = 0;
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = scanner.nextInt();
            if (numbers[i] > max) {
                max = numbers[i];
            }
        }
        System.out.println(max);
    }
}

