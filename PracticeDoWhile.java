public class PracticeDoWhile {
    public static void main(String[] args) {
//o2
//do while 文を使ってコンソールに出力して下さい。条件は以下です。
//
//    Java ファイル PracticeDoWhile を作成して、その中に記述して下さい。
//    100 から 1 ずつ減算して、0 まで表示するプログラムを作成して下さい。
        int num = 100;
        do{
            System.out.println(num);
            num -= 1;
        }while (num >= 0);
    }
}
