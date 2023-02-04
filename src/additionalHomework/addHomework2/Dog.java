package additionalHomework.addHomework2;

class Dog {
    String nickName;
    byte age;
    String color;
    byte newAge;
    public void happyBirthday() {
        newAge = (byte) (age + 1);
        System.out.println("Dog barked " + newAge + " times");
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
