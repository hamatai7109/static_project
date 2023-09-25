public class PracticeForEach {
    public static void main(String[] args) {
//o4
// 拡張 for 文を使ってコンソールに出力して下さい。条件は以下です。
//
//    Java ファイル PracticeForEach を作成して、その中に記述して下さい。
//    社員名をまとめたリストである、変数名 list を出力して下さい。（社員名は姓名どちらかあればOK、社員名は何でもいいです）
//    コンソールには最低 10 人出力して下さい。
        String[] list = {"Hamano", "Fukuo", "Tahara", "Kuranari", "Maemura", "Shigenaga", "Stanley", "Mike", "Jacob", "Messi", "Ronaldo", "Kubo", "Endo", "Tanaka", "Kagawa", "Honda", "Toritani", "Otani"};
        for (String name : list) {
            System.out.println(name);
        }
    }
}
