package additionalHomework.addHomework3;

public class StockTest {
    public static void main(String[] args) {
        Stock google = new Stock("GOOG",10);
        int[] currentPrice = new int[]{10, 12, 5, 7, 99, 77};
        int i = 0;
        do {
            if (currentPrice[i] == google.getPriceInformation()){
                google.maxPrice = google.updatePrice(currentPrice[i]);
                google.minPrice = google.updatePrice(currentPrice[i]);
            }else {
                google.priceInformation = currentPrice[i];
                if (google.maxPrice < google.getPriceInformation()){
                    google.maxPrice = google.getPriceInformation();
                } else if (google.minPrice > google.getPriceInformation()) {
                    google.minPrice = google.getPriceInformation();
                }
            }
            System.out.println("Company = " + google.company + ", Current Price = " + google.getPriceInformation()
                    + ", Min Price = " + google.minPrice + ", Max Price = " + google.maxPrice);
            i++;
        } while (i < currentPrice.length);
    }
}
