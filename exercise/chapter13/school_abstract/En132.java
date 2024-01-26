package practice.exercise.chapter13.school_abstract;
import java.util.Scanner;
public class En132 {
    public static void main(String[] args){
        Scanner stdIn = new Scanner(System.in);
// ーーーーーーーーーーーーーーーーーーーーーーーーーーーーーーーーーー
        // 簿記学生の情報入力
        // 名前
        System.out.print("簿記学校生の名前を入力して下さい：");
        String b_name = stdIn.nextLine();
        // 学生番号
        System.out.print(b_name + "さんの学生番号を入力して下さい：");
        String b_no = stdIn.nextLine();
        // 学校名
        System.out.print(b_name + "さんの学校名を入力して下さい：");
        String b_school = stdIn.nextLine();
        // 会計学の得点
        System.out.print(b_name + "さんの会計学の得点を入力して下さい：");
        int a_score = stdIn.nextInt();
        // ビジネスの得点
        System.out.print(b_name + "さんのビジネスの得点を入力して下さい：");
        int b_score = stdIn.nextInt();
// ーーーーーーーーーーーーーーーーーーーーーーーーーーーーーーーーーー
        stdIn.nextLine();
        // BookKeepingStudentのインスタンス化
        BookKeepingStudent book1 = new BookKeepingStudent(b_name, b_no, b_school, a_score, b_score);

// ーーーーーーーーーーーーーーーーーーーーーーーーーーーーーーーーーー
        // 情報学生の情報入力
        // 名前
        System.out.print("情報学校生の名前を入力して下さい：");
        String i_name = stdIn.nextLine();
        // 学生番号
        System.out.print(i_name + "さんの学生番号を入力して下さい：");
        String i_no = stdIn.nextLine();
        // 学校名
        System.out.print(i_name + "さんの学校名を入力して下さい：");
        String i_school = stdIn.nextLine();
        // HTMLの得点
        System.out.print(i_name + "さんのhtmlの得点を入力して下さい：");
        int h_score = stdIn.nextInt();
        // javaScriptの得点
        System.out.print(i_name + "さんのjavaScriptの得点を入力して下さい：");
        int js_score = stdIn.nextInt();
        // javaの得点
        System.out.print(i_name + "さんのjavaの得点を入力して下さい：");
        int j_score = stdIn.nextInt();
// ーーーーーーーーーーーーーーーーーーーーーーーーーーーーーーーーーー
        // ITStudentのインスタンス化
        ITStudent it1 = new ITStudent(i_name, i_no, i_school, h_score, js_score, j_score);

        // 平均点メソッドを呼び出して、変数に代入しておく
        double b_ave = book1.calcAve();
        double i_ave = it1.calcAve();
        // 結果の表示
        System.out.println(b_school + b_no + b_name + "さんの平均点は" + b_ave + "点です。");
        System.out.println(i_school + i_no + i_name + "さんの平均点は" + i_ave + "点です。");
    }
    
}
