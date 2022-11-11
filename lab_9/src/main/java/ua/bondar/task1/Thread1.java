package ua.bondar.task1;

public class Thread1 implements Runnable{

    private final Bank bank;

    public Thread1(Bank bank) {
        this.bank = bank;
    }

    @Override
    public void run() {
        synchronized (bank) {
            for (int i = 0; i < 200000; i++) {
                bank.setAccount(bank.getAccount() + 2);
            }
        }
    }
}
