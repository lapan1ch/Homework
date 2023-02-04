package additionalHomework.addHomework2;

class Dog {
    String nickName;
    byte age;
    String color;
    public void happyBirthday() {
        age = (byte) (age + 1);
        System.out.println("Dog barked " + age + " times");
    }
    public Dog(String nickName, byte age, String color) {
        this.nickName = nickName;
        this.age = age;
        this.color = color;
    }
    public void voice() {
        System.out.println("- Woof, woof, woof!");
    }
    public void changeColor(String newColor) {
        color = newColor;
    }
}
