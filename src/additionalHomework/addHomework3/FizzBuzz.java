package additionalHomework.addHomework3;

class FizzBuzz {
    public String detect(int number){
        if (number % 3 == 0 && number % 5 != 0){
            return "Fizz";
        }else if (number % 5 == 0){
            if (number % 3 == 0){
                return "FizzBuzz";
            }else {
                return "Buzz";
            }
        }else {
            return "" + number;
        }
    }
}
