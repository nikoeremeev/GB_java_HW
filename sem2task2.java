// Сократить строку вида aaabbbssskkk до a3b3s3k3

import java.util.Scanner;

public class sem2task2 {
    public static void main(String[] args) {
        Scanner Scanner = new Scanner(System.in);
        System.out.print("Введите строку для сокращения: ");
        String a = Scanner.nextLine();
        Scanner.close();
        String temp = codstr(a);
        System.out.println("\nСокращенная строка: " + temp + "\n");

    }

    public static String codstr(String s) {
        String temp = "";
        int count = 1;
        for (int i = 1; i < s.length(); i++) {
            if (s.charAt(i) == s.charAt(i-1)){
                count++;
                if ((i == s.length() - 1)){
                    temp = temp + s.charAt(i) + Integer.toString(count);
                }
            }
           
            else{
                temp = temp + s.charAt(i-1) + Integer.toString(count);
                count = 1;
                if ((i == s.length() - 1)){
                    temp = temp + s.charAt(i) + Integer.toString(count);
                }
                
            }
        }
        return temp;
    }
}
