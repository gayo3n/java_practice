package practice.exercise.chapter13.calc;

public class CalcExcuter implements CalcAddSub, CalcMultiDiv{
    private int num1;
    private int num2;

    private int add;
    private int sub;

    private int multi;
    private int div;

    @Override
    public void dispAdd(){
        add = num1 + num2;
        System.out.println("足し算の結果：" + add);
    }
    @Override
    public void dispSub(){
        sub = num1 - num2;
    }
    @Override
    public void dispMulti(){
        multi = num1 * num2;
    }
    @Override
    public void dispDiv(){
        div = num1 / num2;
    }
    
}
