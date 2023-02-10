package additionalHomework.addHomework3;

class Calculator {
    double a;
    double b;
    double summarize(){
        return a + b;
    }
    double subtract(){
        return a - b;
    }
    double multiply(){
        return a * b;
    }
    double divide(){
        return a / b;
    }
    boolean isEven(long number){
        return number % 2 == 0;
    }
    double compare() {
        if (a > b) {
            return a;
        } else {
            return b;
        }
    }
    Calculator(double a, double b) {
        this.a = a;
        this.b = b;
    }
}
