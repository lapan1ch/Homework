package JavaPro;

public class Phone {

    private String model;

    private int number;

    private double weight;


    public Phone(String modelPhone, int numberPhone, double weightPhone) {
        model = modelPhone;
        number = numberPhone;
        weight = weightPhone;
    }

    public String getModel() {
        return model;
    }

    public int getNumber() {
        return number;
    }

    public double getWeight() {
        return weight;
    }

    public void receiveCall(String name) {
        System.out.println("Call " +  name);
    }

}
