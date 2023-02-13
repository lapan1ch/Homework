package additionalHomework.addHomework3;

class Stock {
    String company;
    int priceInformation;
    int minPrice;
    int maxPrice;
    int updatePrice(int newPrice){
        return newPrice;
    }
    Stock(String company, int priceInformation) {
        this.company = company;
        this.priceInformation = priceInformation;
    }
    int getPriceInformation() {
        return priceInformation;
    }
}
