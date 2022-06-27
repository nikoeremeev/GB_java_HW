// У вас есть отсортированный массив, нужно используя минимальное колличество попыток найти загаданное число

import java.util.Random;

public class sem2task4 {
    public static void main(String[] args) {
        int[] array  = new int[] {1, 3, 6, 7, 8, 20, 30, 40, 50, 100};

        Random rnd = new Random(System.currentTimeMillis());
        int number = 0 + rnd.nextInt(array.length - 0);
        System.out.print("\nЗагаданное число: " + array[number] + "\n");
        int minn = 0;
        int maxx = array.length-1;
        int num = maxx / 2;
        int count = 0;
        while (array[number] != array[num]){
            count++;
            if (array[num] < array[number]){
                minn = num;
                num = minn + (maxx - minn)/2 + 1;
            }
            else{
                maxx = num;
                num = minn + (maxx - minn)/2;
            }
            
        }
        System.out.print("\nКоличество шагов: " + count + "; найденое число: " + array[num] + "\n");
    }
    
}
