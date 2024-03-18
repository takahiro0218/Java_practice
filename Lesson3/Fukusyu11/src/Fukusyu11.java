import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Fukusyu11 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int number1 = 0;
        int number2 = 0;

        System.out.print("数字を入力してください：");
        String num1 = reader.readLine();
        number1 = Integer.parseInt(num1);
        
        System.out.print("数字を入力してください：");
        String num2 = reader.readLine();
        number2 = Integer.parseInt(num2);

        System.out.println(number1 + " + " + number2 + " = " + (number1 + number2));

    }
}