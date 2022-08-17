// Написать программу вычисления n-ого треугольного числа. 
// https://www.google.com/url?q=http://ru.wikipedia.org/wiki/%25D0%25A2%25D1%2580%25D0%25B5%25D1%2583%25D0%25B3%25D0%25BE%25D0%25BB%25D1%258C%25D0%25BD%25D0%25BE%25D0%25B5_%25D1%2587%25D0%25B8%25D1%2581%25D0%25BB%25D0%25BE&sa=D&source=docs&ust=1655220207346067&usg=AOvVaw3gJTO4FgcibF0Zo_INUoNm


import java.util.Scanner;

public class sem1task1 {
    public static void main(String[] args) {
        Scanner Scanner = new Scanner(System.in);
        System.out.print("Введите число : ");
        int a = Scanner.nextInt();
        Scanner.close();
        System.out.println("Треугольное число = " + Triangle(a) + "\n");
    }

    public static int Triangle(int num) {
        if (num == 1) {
            return 1;
        }
        return Triangle(num - 1) + num;
    }
}