// Написать программу возвращающее число, которое без остатка делится на сумма цифр этого числа.

public class sem1task2 {
    public static void main(String[] args) {
        System.out.println("Числа от 0 до 100, которые без остатка делятся на сумма цифр этого числа: ");
        for (int i = 10; i < 101; i++) {
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
