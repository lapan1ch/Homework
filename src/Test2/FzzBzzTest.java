package Test2;

public class FzzBzzTest {
    public static void main(String[] args) {
        FzzBzz fzzBzz = new FzzBzz();
        String expectedResult1 = "Fzz";
        String actualResult1 = fzzBzz.detect(9);
        if (expectedResult1.equals(actualResult1)) {
            System.out.println("Test 1 = OK");
        } else {
            System.out.println("Test 1 = false");
        }
        String expectedResult2 = "Bzz";
        String actualResult2 = fzzBzz.detect(20);
        if (expectedResult2.equals(actualResult2)) {
            System.out.println("Test 2 = OK");
        } else {
            System.out.println("Test 2 = false");
        }
        String expectedResult3 = "2";
        String actualResult3 = fzzBzz.detect(2);
        if (expectedResult3.equals(actualResult3)) {
            System.out.println("Test 3 = OK");
        } else {
            System.out.println("Test 3 = false");
        }
    }
}