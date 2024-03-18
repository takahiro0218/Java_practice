public class Lesson2c {
    public static void main(String[] args) {
        /*
        *数値を扱う
        */
        // 数値を出力
        System.out.println(12345);

        // 足し算してみる
        System.out.println(1+1+1); // 3が出力
        // 引き算してみる
        System.out.println(10-2); // 8が出力
        // 掛け算してみる
        System.out.println(2*3); // 6が出力
        // 割り算してみる
        System.out.println(10/2); // 5が出力

        // 計算の優先順位は算数と同じ（掛け算が先）
        System.out.println(2+2*10); // 22が出力
        // 算数のように（）で先に計算できる
        System.out.println((2+2)*10); // 40が出力
        // 2で割った余りを出力してみる
        System.out.println(9%2); // 1が出力
        // 数字（文字）と数値の和
        System.out.println("123" + 4);
    }
}
