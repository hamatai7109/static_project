import java.util.Random;

public class PracticeSwitch {
    public static void main(String[] args) {
//06
// switch 文を使ってコンソールに出力して下さい。条件は以下です。
//
//    Java ファイル PracticeSwitch を作成して、その中に記述して下さい。
//    1~5の数値が10個入るint型の配列を用意して、要素の数値によってジョブ分けをして下さい。
//    ジョブ
//    （1：勇者、2：バトルマスター、3：パラディン、4：海賊、5：魔法剣士）
//    ジョブをコンソールに出力して下さい。
        int[] intArray = new Random().ints(10,1,6).toArray();
        for (int i = 0; i < intArray.length; i ++){
            switch (intArray[i]) {
                case 1 -> System.out.println(intArray[i] + ": 勇者");
                case 2 -> System.out.println(intArray[i] + ": バトルマスター");
                case 3 -> System.out.println(intArray[i] + ": パラディン");
                case 4 -> System.out.println(intArray[i] + ": 海賊");
                case 5 -> System.out.println(intArray[i] + ": 魔法剣士");
            }
        }
    }
}
