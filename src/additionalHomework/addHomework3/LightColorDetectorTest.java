package additionalHomework.addHomework3;

class LightColorDetectorTest {
    public static void main(String[] args) {
        LightColorDetector lightColorDetector = new LightColorDetector();
        String expectedResult = new String("Red");
        String actualResult = lightColorDetector.detect(666);
        if (expectedResult.equals(actualResult)){
            System.out.println("Test = OK");
        }else {
            System.out.println("Test result was supposed to be '" + expectedResult + "' , but returned '"
                    + actualResult + "'");
        }
    }
}
