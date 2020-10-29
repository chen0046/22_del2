public class Konto {
    int balance;
int maxPoint = 3000;



    public void Startpenge() {
        this.balance = 1000;

    }
    public boolean addPoint(int point){


        if (balance + point >=0){
            this.balance = balance + point;
            return true;
        }
        else {
            return false;
        }
    }

    public boolean withdrawPoints(int point){
        this.balance = balance - point;

        if (balance - point <=0){
            this.balance = balance - point;
            return true;
        } else {
            return false;
        }

    }

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }
    }

