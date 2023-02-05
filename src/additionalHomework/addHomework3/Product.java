package additionalHomework.addHomework3;

class Product {
    String name;
    double regularPrice;
    double discount;
    Product(String name) {
        this.name = name;
    }
    double actualPrice(){
        return regularPrice * (1 - discount / 100);
    }
    void printInformation(){
        System.out.println("The current price of \"" + name + "\" is - '$" + actualPrice() + "'");
    }
}
