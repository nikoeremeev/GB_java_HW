// Задание 1.
// Создать карту (Map), будет хранить в себе данные телефонной книги (Фамилии и телефонные номера),
// если будут дубликаты фамилий, то должны выводиться оба номера (если помним Map не может хранить дубликаты,
//  будет заменять номер телефона по ключу, нужно подумать как не допустить такого)

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class sem2task5 {

    // функция печати всего телефонного справочника
    public static void printTD(HashMap<String, String> mapa) {
        for (Map.Entry<String, String> entry : mapa.entrySet()) {
            System.out.printf("Контакт: %s, номер телефона: %s\n", entry.getValue(), entry.getKey());
        }
    }

    // функция печати по контакту
    public static void printTD(HashMap<String, String> mapa, String name) {
        
        for (Map.Entry<String, String> entry : mapa.entrySet()) {

            if (entry.getValue().equals(name)) {
                System.out.printf("Контакт: %s, номер телефона: %s\n", entry.getValue(), entry.getKey());
            }
        }
    }
    public static void main(String[] args) {
        HashMap<String, String> telephoneDirectory = new HashMap<>();

        telephoneDirectory.put("89998884564", "Contact1");
        telephoneDirectory.put("88886664441", "Contact2");
        telephoneDirectory.put("12345678910", "Contact3");
        telephoneDirectory.put("98345242300", "Contact4");
        telephoneDirectory.put("96545612300", "Contact1");
        telephoneDirectory.put("98741232300", "Contact2");

        printTD(telephoneDirectory);
        System.out.println();
        System.out.println();
        Scanner Scanner = new Scanner(System.in);
        System.out.print("Введите наименование контакта для поиска : ");
        String a = Scanner.next();
        Scanner.close();
        System.out.println();
        printTD(telephoneDirectory, a);
    }

    

    
}