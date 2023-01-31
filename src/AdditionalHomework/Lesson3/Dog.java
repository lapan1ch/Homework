package AdditionalHomework.Lesson3;

public class Dog {
    private String dogName = "Spike";
    byte age;
    public String getDogName() {
        return dogName;
    }
    public void voice(){
        System.out.println("- Woof, woof, woof!");
    }
    public void happyBirthday(){
        byte realAge = (byte) (age + 1);
        System.out.println("Dog barked " + realAge + " times");
    }
}
