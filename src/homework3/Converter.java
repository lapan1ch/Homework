package homework3;

public class Converter {
    double sumOfMoney;
    public Converter(double sumOfMoney) {
        this.sumOfMoney = sumOfMoney;
    }

    void convertEuroToUSD(){
        System.out.println(sumOfMoney + " EUR equals " + sumOfMoney * 1.08 + " USD");
    }
}
