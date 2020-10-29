public class Konto {
    int balance = 1000;
    int maxPoint = 3000;

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
        if (balance < 0) {
            setBalance(0);
        }
    }
}

