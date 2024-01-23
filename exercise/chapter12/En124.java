package practice.exercise.chapter12;

public class En124 {
    public static void main(String[] args){
        Dog dog = new Dog(10);
        Bird bird = new Bird(1000);
        Whale whale = new Whale(50);
    
        dog.move();
        dog.eat("お肉");
        bird.move();
        bird.eat("虫");
        whale.move();
        whale.eat("オキアミ");
        }
    
}
