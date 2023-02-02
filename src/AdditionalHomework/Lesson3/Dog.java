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
        public void happyBirthday() {
        System.out.println("Dog barked " + (age + 1) + " times");
    }
    public Dog(String color) {
        this.color = color;
    }
    public void changeColor(String newColor) {
        this.color = newColor;
    }
}
