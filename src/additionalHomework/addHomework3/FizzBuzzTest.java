package additionalHomework.addHomework3;

class FizzBuzzTest {
    public static void main(String[] args) {
//        ПЕРВЫЙ ВАРИАНТ КОДА
//        FizzBuzz fizzBuzz = new FizzBuzz();
//        String expectedResult = "FizzBuzz";
//        String actualResult = fizzBuzz.detect(60);
//        if (expectedResult == actualResult){
//            System.out.println("Test = OK");
//        }else {
//            System.out.println("Test = FALSE");
//        }
//      ВТОРОЙ ВАРИАНТ КОДА
        FizzBuzz fizzBuzz = new FizzBuzz();
        String expectedResult = new String("FizzBuzz");
        String actualResult = fizzBuzz.detect(60);
        if (expectedResult.equals(actualResult)){
            System.out.println("Test = OK");
        }else {
            System.out.println("Test = FALSE");
        }
    }
}
// Второй вариант кода является более правильным, так как в нем используется метод .equals() для сравнения строк, в то
// время как в первом варианте используется оператор "==". Оператор "==" сравнивает ссылки на объекты, а не их
// содержимое. В результате, если expectedResult и actualResult являются разными экземплярами строк с одинаковым
// содержимым, они не будут считаться равными. Метод .equals() сравнивает содержимое строк, что делает его более
// правильным для этой задачи.

// Оператор == сравнивает значения переменных, а не сами объекты. В первом случае компилятор Java создаёт один и тот же
// объект для строки "FizzBuzz", сохраняет его в пуле строк (String Pool) и присваивает ссылку на него двум переменным
// expectedResult и actualResult. При использовании оператора == сравниваются ссылки на объекты, а в данном случае они
// равны, поэтому код отрабатывает корректно.
//
// Во втором случае с использованием оператора new, для каждой переменной создаётся свой экземпляр объекта String, хотя
// содержание этих объектов одинаково. Таким образом, ссылки на объекты разные, поэтому сравнение с помощью оператора
// == вернёт ложный результат. Для сравнения содержимого строк необходимо использовать метод equals().