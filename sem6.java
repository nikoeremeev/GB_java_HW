/**
 * Жанр
 * Название песни
 * количество прослушиваний
 * <p>
 * Дай мне список популярной для сна музыки
 * <p>
 * List<Music>
 * - Название
 * - Автор
 * - Количество прослушиваний
 */


import java.util.*;

public class sem6 {

    public static void main(String[] args) {

        Map<String, Map<String, Integer>> playList = new HashMap<>();
        for (int i = 0; i < 10; i++) {

            Map<String, Integer> temp = new HashMap<>();
            temp.put(genStr(),(int) (Math.random()*1001)+1);
            playList.put(genStr(),temp);

        }
        System.out.println(playList);
        Sort(playList);

    }

    public static String genStr () {
        int size = (int) (Math.random()*10)+5;
        String genStr = "";
        for (int i = 0; i < size; i++) {

            genStr = genStr + (char)((Math.random() * 26) + 97);

        }
        return genStr;
    }

    public static void Sort(Map<String, Map<String, Integer>> noSorted) {
        List<String> howManyListened = new ArrayList<>();
        for (Map.Entry<String, Map<String, Integer>> item:noSorted.entrySet()) {
            String[] music = item.getValue().keySet().toArray(new String[item.getValue().keySet().size()]);
            for (String str: music) {
                System.out.println(str);
            }
            int temp = 0;
            for (int i = 0; i < music.length; i++) {
                for (int j = i; j < music.length; j++) {
                    int max = item.getValue().get(music[j]);
                    if(max<item.getValue().get(music[j])) {

                        temp = j;
                        max = item.getValue().get(music[j]);


                    } else {

                    }
                }
                howManyListened.add(music[temp]);
            }
        }
        System.out.println(howManyListened);
    }
}