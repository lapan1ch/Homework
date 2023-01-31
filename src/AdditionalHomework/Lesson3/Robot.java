package AdditionalHomework.Lesson3;

public class Robot {
    String name = "ROBO";
    public void sayHello(){
        String name;
        System.out.println("Hello!");
    }
    public Robot(){
    }
    public Robot(String robotName){
        this.name = robotName;
    }
    public void sayYorName(){
        System.out.println("My name is " + name);
    }
}
