package threads.synchronization;

public class ATM {

    /**
     * Notes:
     * 1) By adding synchronized keyword, This means that now only
     * one thread can enter this method at a time.
     *
     * 2) Synchronized methods are a simple and effective way to stop threads
     * from interfering with object data at the same time.
     * @param account
     * @param amount
     */
    static synchronized void withdraw(BankAccount account, int amount) {
        int balance = account.getBalance();
        if ((balance - amount) < -account.getOverdraft()) {
            System.out.println("Transaction denied!");
        } else {
            account.debit(amount);
            System.out.println("$" + amount + " successfully withdrawn");
        }
        System.out.println("Current balance: " + account.getBalance());
    }
}
