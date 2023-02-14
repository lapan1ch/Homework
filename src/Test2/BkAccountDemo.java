package Test2;

public class BkAccountDemo {

    public static void main(String[] args) {
        BkAccount bankAccount = new BkAccount("Viktor", 100000);
        String ownerFirstName = bankAccount.getOwner();
        int moneyAmount = bankAccount.getMoney();
        System.out.println("Owner = " + ownerFirstName);
        System.out.println("Money = " + moneyAmount);
    }
}