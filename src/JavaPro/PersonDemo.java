package JavaPro;

public class PersonDemo {

    public static void main(String[] args) {

        Person person1 = new Person();

         person1.setName("Leonardo");
         person1.setFullName("Leonardo Diamond");
         person1.setAge(30);

        Person  person2 = new Person("Joseph","Joseph Jackson", 28);

        person1.move();
        person1.talk();

        person2.move();
        person2.talk();



       }
    }

