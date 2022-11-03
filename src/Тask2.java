import java.time.LocalDate;

public class Тask2 {
    public static void version(int os, int year) {
        if (os == 0) {
            if (year < 2015) {
                System.out.println("Установите lite версию для IOS");
            } else {
                System.out.println("Устаносите версию для IOS");
            }
        } else {
            if (year < 2015) {
                System.out.println("Установите lite версию для Android");
            } else {
                System.out.println("Установите версию для Android");
            }
        }
    }

    public static void main(String[] args) {
        int os = 1;
        int currentYear = LocalDate.now().getYear();
        version(os, currentYear);
    }
}
