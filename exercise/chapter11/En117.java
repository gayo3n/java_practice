package practice.exercise.chapter11;

public class En117 {
    // main
    public static void main(String[] args){
        // Student A
        Student stuA = new Student("A", "001", 89, 65, 88);
        // StudentB
        Student stuB = new Student("B", "002", 80, 95, 64);
        // StudentC
        Student stuC = new Student("C", "003", 70, 80, 98);
        // stuAの結果表示
        System.out.println(stuA.number + "番　" + stuA.name + "さん　" + "平均点" + Student.score_ave(stuA.jap, stuA.math, stuA.eng));
        // stuBの結果表示
        System.out.println(stuB.number + "番　" + stuB.name + "さん　" + "平均点" + Student.score_ave(stuB.jap, stuB.math, stuB.eng));
        // stuCの結果表示
        System.out.println(stuC.number + "番　" + stuC.name + "さん　" + "平均点" + Student.score_ave(stuC.jap, stuC.math, stuC.eng));
    }
    
}
