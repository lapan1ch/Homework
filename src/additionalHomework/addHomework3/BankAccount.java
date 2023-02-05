package additionalHomework.addHomework3;

class BankAccount {
    private String owner;
    private int money;
    BankAccount(String name, int moneyAmount) {
        this.owner = name;
        this.money = moneyAmount;
    }
    String getOwner() {
        return this.owner;
    }
    int getMoney() {
        return this.money;
    }
}
