package additionalHomework.addHomework2;

class Robot {
    String name = "ROBO";
    public void sayHello(){
        System.out.println("Hello!");
    }
    Robot(){
    }
    Robot(String robotName){
        this.name = robotName;
    }
    public void sayYorName(){
        System.out.println("My name is " + name);
    }
}
