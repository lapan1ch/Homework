package Test2;

public class Prdt {

    String name;

    double regularPrice;

    double discount;

    public Prdt(String meat) {
        this.name = meat;
    }

    double actualPrice() {return regularPrice * (1 - discount/100);}

    void printInformation() {
        System.out.println("Today's date price of " + name + " is '$ " + actualPrice());
    }
}
