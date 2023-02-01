package AdditionalHomework.Lesson3;

public class Dog {
    private String dogName = "Spike";
    byte age;
    String color;
    public String getDogName() {
        return dogName;
    }
    public void voice() {
        System.out.println("- Woof, woof, woof!");
    }
    public void happyBirthday(Dog dog) {
        dog.age = 8;
        System.out.println("Dog barked " + dog.age + " times");
    }
    public Dog(String color) {
        this.color = color;
    }
    public void changeColor(String newColor) {
        this.color = newColor;
    }
}
