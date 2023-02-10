package homework3;

class PizzaCaloriesCalculator {
    public static void main(String[] args) {
        byte firstPizzaDiameterInCm = 24;
        byte secondPizzaDiameterInCm = 28;
        float extraPizzaSquare = (float) (((secondPizzaDiameterInCm * secondPizzaDiameterInCm
                - firstPizzaDiameterInCm * firstPizzaDiameterInCm) / 4) * Math.PI);
        float calories = extraPizzaSquare * 40;
        System.out.println("Extra calories equals - " + calories);
    }
}
