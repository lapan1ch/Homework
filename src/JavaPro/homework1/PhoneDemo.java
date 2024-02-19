package JavaPro.homework1;

public class PhoneDemo {
    public static void main(String[] args) {

        Phone phone1 = new Phone("Huawei G13",25555555,100.5);
        System.out.println("Phone 1:");
        System.out.println("Number: " + phone1.getNumber());
        System.out.println("Model: " + phone1.getModel());
        System.out.println("Weight: " + phone1.getWeight() + "  g");

        phone1.receiveCall("Karl");
        System.out.println("Phone number " + phone1.getNumber());

        Phone phone2 = new Phone("Iphone 10", 24567899,95.6);

        System.out.println("Phone 2:");
        System.out.println("Number: " + phone2.getNumber());
        System.out.println("Model: " + phone2.getModel());
        System.out.println("Weight: " + phone2.getWeight() + " g");

        phone2.receiveCall("Frank");
        System.out.println("Phone number " + phone2.getNumber());

        Phone phone3 = new Phone("Samsung S12",21345670,84.3);
        System.out.println("Phone 3:");
        System.out.println("Number: " + phone3.getNumber());
        System.out.println("Model: " + phone3.getModel());
        System.out.println("Weight: " + phone3.getWeight() + " g");

        phone3.receiveCall("Brad");
        System.out.println("Phone number " + phone3.getNumber());
    }
}
