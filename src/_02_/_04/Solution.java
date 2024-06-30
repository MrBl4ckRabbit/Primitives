package _02_._04;

/*
Предсказание на будущее
Ввести с клавиатуры отдельно Имя, число1, число2.
Вывести надпись:
"Имя" получает "число1" через "число2" лет.

Пример:
Коля получает 3000 через 5 лет.


Requirements:
1. Программа должна выводить текст.
2. Программа должна считывать данные с клавиатуры.
3. Выведенный текст должен содержать введенное имя.
4. Выведенный текст должен содержать введенное число1.
5. Выведенный текст должен содержать введенное число2.
6. Выведенный текст должен полностью соответствовать заданию.
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) throws Exception {
//        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
//        String name = reader.readLine();
//        String num1 = reader.readLine();
//        String num2 = reader.readLine();
//
//        System.out.println("" + name + " получает " + num1 + " через " + num2 + "" + " лет");
        ///////////////////////////////////////////////////////////

        Scanner sc = new Scanner(System.in);
        String nick = sc.nextLine();
        int a = sc.nextInt();
        int b = sc.nextInt();

        System.out.println("" + nick + " получает " + a + " через " + b + "" + " лет");


    }
}

