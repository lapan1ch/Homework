package AdditionalHomework.Lesson3;

public class DogDemo {
    public static void main(String[] args) {
        Dog dog = new Dog("Black");
        dog.age = 7;
        dog.voice();
        System.out.println("- " +dog.getDogName() + " is " + dog.age + " years old.");
        System.out.println(dog.color + " dog got angry");
        dog.happyBirthday(dog);
        System.out.println("- Happy Birthday, old pal!");
        dog.voice();
        dog.changeColor("Red");
        System.out.println("Checked my calendar, it was saying - " + dog.age + " years");
        System.out.println(dog.color + " dog was staring at me...");
    }
}
