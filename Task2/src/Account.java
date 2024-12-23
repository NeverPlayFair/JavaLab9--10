public class Account {
    private String owner;
    private int balance;
    private String accountNumber;

    public Account(String owner, int balance, String accountNumber) {
        this.owner = owner;
        this.balance = balance;
        this.accountNumber = accountNumber;
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    // Metoda symulująca wypłatę/przelew
    public void withdraw(int amount) throws NotEnoughMoney {
        if (amount > balance) {
            throw new NotEnoughMoney("Attempting to withdraw more than your account balance");
        }
        this.balance -= amount;
        System.out.println("Paid out " + amount + " $. Remaining balance: " + balance);
    }
}
