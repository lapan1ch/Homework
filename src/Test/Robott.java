package Test;

public class Robott {

    String name;


    public void sayHello(){

        System.out.println("Hello !");

    }

    public Robott() {

    }

    public void sayYourName(){
        System.out.println("My name is " + this.name);

    }

    public Robott(String robotName) {
        this.name = robotName;
    }


}


