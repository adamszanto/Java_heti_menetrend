package org.example;

interface Payment {
    void pay(int amount);
}

class Cash implements Payment {
   private int amount;

    @Override
    public void pay(int amount) {
        if(this.amount - amount < 0) {
            throw new IllegalArgumentException();
        }
        this.amount -= amount;
    }
}

interface CashProxyInterface {
    public void pay(int amount);
}

class CashProxyInterfaceImpl implements CashProxyInterface {
    private Cash cash = new Cash();

    @Override
    public void pay(int amount) {
        cash.pay(amount);
    }
}


class CashProxy implements Payment {
    private final Cash cash = new Cash();

    // Plusz funkcióval egészítettük ki az eredeti funkciót.
    @Override
    public void pay(int amount) {
        synchronized (cash) {
            cash.pay(amount);
        }
    }
}

public class Main {
    public static void main(String[] args) {
        Payment payment = new CashProxy();
        CashProxyInterface cash = new CashProxyInterfaceImpl();
    }
}