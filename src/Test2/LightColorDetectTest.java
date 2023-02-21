package Test2;;

public class LightColorDetectTest {
    public static void main(String[] args) {
        LightColorDetect lightColorDetect = new LightColorDetect();
        String expectedResult = new String("Red");
        String actualResult = lightColorDetect.detect(900);
        if (expectedResult.equals(actualResult)){
            System.out.println("Test = OK");
        }else {
            System.out.println("Test result was supposed to be '" + expectedResult + "' , but returned '"
                    + actualResult + "'");
        }
    }
}

