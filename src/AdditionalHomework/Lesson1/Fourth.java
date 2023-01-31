package AdditionalHomework.Lesson1;

public class Fourth {
    public static void main(String[] args) {
        System.out.println("Test Data:");
        System.out.println("Enter a radius");
        InputForAllTasks input = new InputForAllTasks();
        float x = input.aFloatNumber();
        System.out.println("Radius = " + x);
        float p = x * 2f * 3.14f;
        float s = x * x * 3.14f;
        System.out.println("Expected Output:");
        System.out.println("Perimeter is = " + p);
        System.out.println("Area is = " + s);
    }
}
