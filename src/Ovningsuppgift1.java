import java.util.Calendar;

public class Ovningsuppgift1 {
    public static void main(String[] args) {
        String currentTime = Calendar.getInstance().getTime().toString();

        System.out.printf("Aktuell tid: " + currentTime);

    }
}
