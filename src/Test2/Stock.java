package Test2;

public class Stock {
    private String companyName;
    private int currentPrice;
    private int minPrice;
    private int maxPrice;

    public Stock(String companyName, int currentPrice) {
        this.companyName = companyName;
        this.currentPrice = currentPrice;
        this.minPrice = currentPrice;
        this.maxPrice = currentPrice;
    }

    public void updatePrice(int newPrice) {
        if (newPrice < minPrice) {
            minPrice = newPrice;
        }
        if (newPrice > maxPrice) {
            maxPrice = newPrice;
        }
        currentPrice = newPrice;
    }

    public String getPriceInformation() {
        return "Company = \"" + companyName + "\", Current Price = " + currentPrice +
                ", Min Price = " + minPrice + ", Max Price = " + maxPrice;
    }
}