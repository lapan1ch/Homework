package homework3;

class Converter {
    private double sumOfMoney;
    Converter(double sumOfMoney) {
        this.sumOfMoney = sumOfMoney;
    }
    void convertEuroToUSD(){
        System.out.println(sumOfMoney + " EUR equals " + sumOfMoney * 1.08 + " USD");
    }
}
