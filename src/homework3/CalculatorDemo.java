package homework3;

class CalculatorDemo {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        calculator.inputNumbers();
        System.out.println("Addition is " + calculator.plus());
        System.out.println("Subtraction is "+ calculator.minus());
        System.out.println("Multiplication is "+ calculator.times());
        System.out.println("Division is "+ calculator.divide());
    }
}
