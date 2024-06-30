package _03_._08;

/*
Сортировка трех чисел
Ввести с клавиатуры три числа, и вывести их в порядке убывания.
Выведенные числа должны быть разделены пробелом.


Requirements:
1. Программа должна считывать числа c клавиатуры.
2. Программа должна выводить числа на экран.
3. Программа должна выводить три числа разделенных пробелами.
4. Программа должна выводить числа в порядке убывания.
*/

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        Integer[] numbers = new Integer[3];
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = scanner.nextInt();
        }
        Arrays.sort(numbers,Collections.reverseOrder());
        for (Integer number : numbers) {
            System.out.print(number + " ");
        }
    }
}

