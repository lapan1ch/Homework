package Homework1.Additional;
import java.util.Scanner;
public class InputForAllTasks {
    Scanner scanner = new Scanner(System.in);
    public double aDoubleNumber() {
        return scanner.nextDouble();
    }
    public String aText() {
        return scanner.nextLine();
    }
    public byte aByteNumber() {
        return scanner.nextByte();
    }
    public float aFloatNumber() {
        return scanner.nextFloat();
    }
    public short aShortNumber() {
        return scanner.nextByte();
    }
}
