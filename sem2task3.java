// Вывести массив всех чисел в заданном интервале, которые делятся на сумму цифр этого числа

import java.util.Scanner;

public class sem2task3 {
    public static void main(String[] args) {
        Scanner Scanner = new Scanner(System.in);
        System.out.print("\nВведите число начала интервала: ");
        int a = Scanner.nextInt();
        System.out.print("\nВведите число конца интервала: ");
        int b = Scanner.nextInt();
        Scanner.close();
        System.out.print("\nПолученные числа: ");
        for (int i = a; i <= b; i++) {
            if (i % sum_numbers(i) == 0) {
                System.out.print(i + " ");
            }
        }
        System.out.println("\n\n");
    }

    public static int sum_numbers(int n) {
        int sum = 0;
        while (0 != n) {
            sum += n % 10;
            n /= 10;
        }
        return sum;
    }
}
