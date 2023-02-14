package Test2;

public class PrdtDemo {

    public static void main(String[] args) {
        Prdt prdt = new Prdt("Stake");
        prdt.regularPrice = 40;
        prdt.discount = 20;
        prdt.printInformation();
    }
}
