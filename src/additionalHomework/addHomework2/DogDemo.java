package additionalHomework.addHomework2;

class DogDemo {
    public static void main(String[] args) {
        Dog dog = new Dog("Spike", (byte) 7,"Black");
        dog.voice();
        System.out.println("- " + dog.nickName + " is " + dog.age + " years old.");
        System.out.println(dog.color + " dog got angry");
        dog.happyBirthday();
        System.out.println("- Happy Birthday, old pal!");
        dog.voice();
        System.out.println("Checked my calendar, it was saying - " + dog.age + " years");
        dog.changeColor("Red");
        System.out.println(dog.color + " dog was staring at me...");
    }
}
