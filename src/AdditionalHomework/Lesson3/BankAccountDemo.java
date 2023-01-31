package AdditionalHomework.Lesson3;

public class BankAccountDemo {
    public static void main(String[] args) {
        BankAccount bankAccount = new BankAccount("Viktor", "Savonin", 100000);
        System.out.println("Owner first name = " + bankAccount.getOwnerFirstName());
        System.out.println("Owner last name = " + bankAccount.getOwnerLastName());
        System.out.println("Money amount = " + bankAccount.getMoneyAmount());
    }
}
