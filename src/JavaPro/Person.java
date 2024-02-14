package JavaPro;

public class Person {

    String name;

    String fullName;

    int age;


    public Person() {

    }

    public Person(String namePerson, String fullNamePerson, int agePerson) {
        name = namePerson;
        fullName = fullNamePerson;
        age = agePerson;
    }

    public void setName(String namePerson) {
        name = namePerson;
    }

    public void setFullName(String fullNamePerson) {
        fullName = fullNamePerson;
    }

    public void setAge(int agePerson) {
        age = agePerson;
    }

    public void talk(){
        System.out.println("This " + fullName + " is talk");
    }
    public void move (){
        System.out.println("This " + fullName + " is coming");
    }

}
