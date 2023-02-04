package additionalHomework.addHomework2;

class BankAccount {
    String ownerFirstName;
    String ownerLastName;
    private int moneyAmount;
    BankAccount(String ownerFirstName, String ownerLastName, int moneyAmount) {
        this.ownerFirstName = ownerFirstName;
        this.ownerLastName = ownerLastName;
        this.moneyAmount = moneyAmount;
    }
    String getOwnerFirstName() {
        return this.ownerFirstName;
    }
    String getOwnerLastName() {
        return this.ownerLastName;
    }
    int getMoneyAmount() {
        return this.moneyAmount;
    }
}
