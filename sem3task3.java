// Задание 3.
// Написать программу, показывающую последовательность действий для игры “Ханойская башня”

import java.util.Scanner;


public class sem3task3 {
    public static void main(String[] args) {

        Scanner Scanner = new Scanner(System.in);
        System.out.print("Введите количество дисков : ");
        int n = Scanner.nextInt();
        Scanner.close();
        System.out.println("\nНачальные параметры:\nЗадано " + n + " дисков и 3 пирамиды (стержня).\nАлгоритм работы следующий: ");
        move(n, 1, 3);
    }

    public static void move(int n, int start, int end) {
        if (n == 0) {
            return;
        }
        int intermediate = 6 - start - end;
        move(n - 1, start, intermediate);
        System.out.println("Перемещаем диск " + n + " с пирамиды № " + start + " на пирамиду №  " + end);
        move(n - 1, intermediate, end);
    }
}