public class AccountExample {
    public static void main(String[] args) {
        Account account = new Account("James Gosling", 100000, "1234567891");

        try {
            account.withdraw(1000000);
        } catch (NotEnoughMoney e) {
            System.err.println("Error: " + e.getMessage());
        } catch (Exception e) {
            System.err.println("Other exception: " + e);
        } finally {
            System.out.println("Account Balance (" + account.getOwner() +
                    "): " + account.getBalance() + "$");
        }
    }
}
