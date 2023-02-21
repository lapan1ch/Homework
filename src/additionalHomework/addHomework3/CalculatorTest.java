package additionalHomework.addHomework3;

class CalculatorTest {
    public static void main(String[] args) {
        Calculator calculator = new Calculator(1,2);
        double expectedSum = 3;
        double actualSum = calculator.summarize();
        if (expectedSum == actualSum){
            System.out.println("Sum test = OK");
        } else {
            System.out.println("Sum test = FAIL");
        }
        double expectedSub = -1;
        double actualSub = calculator.subtract();
        if (expectedSub == actualSub){
            System.out.println("Subtraction test = OK");
        } else {
            System.out.println("Subtraction test = FAIL");
        }
        double expectedMul = 2;
        double actualMul = calculator.multiply();
        if (expectedMul == actualMul){
            System.out.println("Multiplication test = OK");
        } else {
            System.out.println("Multiplication test = FAIL");
        }
        double expectedDiv = 0.5;
        double actualDiv = calculator.divide();
        if (expectedDiv == actualDiv){
            System.out.println("Division test = OK");
        } else {
            System.out.println("Division test = FAIL");
        }
        boolean evenNumberIs = true;
        boolean actualNumber = calculator.isEven(3);
        if (evenNumberIs == actualNumber){
            System.out.println("Number is even");
        } else {
            System.out.println("Number is not even");
        }
        double expectedMaxNumber = 2;
        double actualMaxNumber = calculator.compare();
        if (expectedMaxNumber == actualMaxNumber){
            System.out.println("Max number test = OK");
        } else {
            System.out.println("Max number test = FALSE");
        }
    }
}
