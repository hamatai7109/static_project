public class PracticeFor {
    public static void main(String[] args) {
//03
// for 文を使ってコンソールに出力して下さい。条件は以下です。
//
//    Java ファイル PracticeFor を作成して、その中に記述して下さい。
//    1 ～ 100 までの整数を足して、その総和を表示するプログラムを作成して下さい。
        int result = 0;
        for(int i = 1; i <= 100; i++){
            result += i;
        }
        System.out.println(result);
    }
}
