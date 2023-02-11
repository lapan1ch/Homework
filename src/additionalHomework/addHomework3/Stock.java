package additionalHomework.addHomework3;

public class Stock {
    String company;
    int priceInformation;
    int minPrice;
    int maxPrice;
    int updatePrice(int newPrice){
        return newPrice;
    }
    public Stock(String company, int priceInformation) {
        this.company = company;
        this.priceInformation = priceInformation;
    }
    public int getPriceInformation() {
        return priceInformation;
    }
}
