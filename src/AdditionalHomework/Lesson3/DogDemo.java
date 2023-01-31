package AdditionalHomework.Lesson3;

public class DogDemo {
    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.age = 7;
        dog.voice();
        System.out.println("- " +dog.getDogName() + " is " + dog.age + " years old.");
        dog.happyBirthday();
        System.out.println("- Happy Birthday, old pal!");
        dog.voice();
        System.out.println("- How old are you, again?");
        dog.happyBirthday();
    }
}
