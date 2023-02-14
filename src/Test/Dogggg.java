package Test;

public class Dogggg {
    private String name;
    String color;
    int age;
    public  void voice() {
        System.out.println("Auuuu, auuuu, auuu");
    }
    public void happyBirthday() {
         age = age + 1;
        System.out.println(" My dog is " + age  + " years old");
    }


     public String getName() {
        return name;
    }

    public Dogggg(String name, String color) {
        this.name = name;
        this.color = color;
    }


    public void changeColor(String neWcolor){
        this.color = neWcolor;
    }
}


