public class Task3 {
    public static void distance(int distance) {
        int days = 1;
        days += (distance - 20) / 40;
        if (((distance - 20) % 40 != 0) && distance>20) {
            days += 1;
        }
        System.out.println("Время доставки займет " + days + " дней");
    }

    public static void main(String[] args) {
        int distance = 61;
        distance(distance);
    }
}
