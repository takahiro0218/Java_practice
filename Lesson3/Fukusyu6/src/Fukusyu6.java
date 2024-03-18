public class Fukusyu6 {
    public static void main(String[] args) {
        int x = 5;
        int y;

        y = --x + x--;
        // y = 8,x = 3と予想
        System.out.println(x);
        System.out.println(y);
    }
}