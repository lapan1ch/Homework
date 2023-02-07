package Hmwk3;

public class ConvMoney {

    public double  resultOfmoney;

    public ConvMoney(double resultOfmoney) {
        this.resultOfmoney = resultOfmoney;
    }

    public void convertEuroToUSD(){
        System.out.println(resultOfmoney + " EUR equals " + resultOfmoney * 1.08 + " USD");
    }

}
