import java.util.Map;

public class Main {
    public static void main(String[] args) {
        AppData data = IOstream.getReading();
        for (Map.Entry el: data.getMap().entrySet()){
            System.out.println(el);
        }

        data.addData("Value 1",763);
        data.addData("Value 2",124);
        data.addData("Value 3",421);

        data.addData("Value 1",13);
        data.addData("Value 2",12);
        data.addData("Value 3",41);

        IOstream.getWriting(data);
    }
}