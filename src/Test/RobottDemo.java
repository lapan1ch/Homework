package Test;

public class RobottDemo {
    public static void main(String[] args) {

        Robott robott = new Robott();
        robott.name = "ROBO";
        System.out.println(robott);
        robott.sayHello();
        robott.sayYourName();
        Robott robott1 = new Robott("Rider");
        robott1.sayHello();
        robott1.sayYourName();
        Robott robott2 = new Robott("John");
        robott2.sayHello();
        robott2.sayYourName();
    }
}
