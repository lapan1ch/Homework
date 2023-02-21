package Test2;

public class TwoRealDifferentObjectDemo {
    public static void main(String[] args) {

        TwoRealDifferentObjectUtillities twoRealDifferentObjectUtillities = new TwoRealDifferentObjectUtillities();
        TwoRealDifferentObject firstObject = twoRealDifferentObjectUtillities.createObjectwithallParameters("Theo",20,true);
        System.out.println(firstObject.name + "really is " + firstObject.getYear() + " years old");
        twoRealDifferentObjectUtillities.changeYear(firstObject,21);
        System.out.println(firstObject.name + "really is " + firstObject.getYear() + " years old");
        TwoRealDifferentObject secondObject = twoRealDifferentObjectUtillities.createObjectwithTwoParameters("Deo","X-77");
        System.out.println(secondObject.getName() + " is your really name?");
        twoRealDifferentObjectUtillities.changeName(secondObject,"Meo");
        System.out.println(secondObject.getName() + " is your really name?");

    }

}
