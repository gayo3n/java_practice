package practice.exercise.chapter11;

public class En1110 {

    public static void main(String[] args){
        // インスタンス化⇒表示をしないとnumberが４になった状態で表示してしまうので注意する
        // book1をインスタンス化
        BookInfo book1 = new BookInfo("三国志", "吉川英治", 1989);
        // book1表示
        System.out.printf("書　　名：" + book1.book + "\n著 書 名：" + book1.name + "\n出 版 年：" + book1.year + "\n書籍番号：" + BookInfo.number);
        // book2をインスタンス化
        BookInfo book2 = new BookInfo("楊令伝", "北方鎌三", 2011);
        // book2を表示
        System.out.printf("\n書　　名：" + book2.book + "\n著 書 名：" + book2.name + "\n出 版 年：" + book2.year + "\n書籍番号：" + BookInfo.number);
        // book3をインスタンス化
        BookInfo book3 = new BookInfo("竜馬がゆく", "司馬遼太郎", 1998);
        // book3を表示
        System.out.printf("\n書　　名：" + book3.book + "\n著 書 名：" + book3.name + "\n出 版 年：" + book3.year + "\n書籍番号：" + BookInfo.number);
        // book4をインスタンス化
        BookInfo book4 = new BookInfo("吾輩は猫である", "夏目漱石", 1905);
        // book4を表示
        System.out.printf("\n書　　名：" + book4.book + "\n著 書 名：" + book4.name + "\n出 版 年：" + book4.year + "\n書籍番号：" + BookInfo.number);
    }
    
}
// BookInfoクラス
class BookInfo{
    // インスタンス変数book/書名
    String book;
    // インスタンス変数name/著者名
    String name;
    // インスタンス変数year/出版年
    int year;
    // インスタンス変数num/書籍番号
    int num;
    // クラス変数number
    static int number = 0;

    // BookInfoのコンストラクタ
    BookInfo(String b, String n, int y){
        book = b;
        name = n;
        year = y;
        // インスタンス化をするたびにnumberに+1をする
        num = ++number;
    }
}
