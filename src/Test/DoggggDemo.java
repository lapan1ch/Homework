package Test;

public class DoggggDemo {
    public static void main(String[] args) {
        Dogggg dog1 = new Dogggg("Sharik", "Black");
        dog1.age = 5;
        System.out.println("My dog is " + dog1.age + " years old");
        dog1.voice();
        dog1.happyBirthday();
        System.out.println("Happy birthday !");
        dog1.voice();
        System.out.println("Сheck my calendar " +  dog1.age  + " times");
        System.out.println("I'm looking for " + dog1.getName() + " him " + dog1.age + " years old " + "and he has a " + dog1.color + " color");
        dog1.voice();
        dog1.changeColor("Red");
        System.out.println("My dog change his color, now it's " + dog1.color);
        dog1.voice();
    }
}

