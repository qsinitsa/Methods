public class Task1 {
    public static boolean year(int year) {
        boolean check = year % 4 == 0 && (year % 100 != 0 || year % 400 == 0);
        return check;

    }

    public static void main(String[] args) {
        int year = 400;
        boolean check = year(year);
        System.out.println(check);
    }
}
