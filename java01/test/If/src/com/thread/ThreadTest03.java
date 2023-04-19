package com.thread;

public class ThreadTest03 {
    public static void main(String[] args) {
        Account account = new Account("001",10000);
        Thread thread = new AccountThread(account);
        Thread thread1 = new AccountThread(account);
        thread.setName("t1");
        thread1.setName("t2");
        thread.start();
        thread1.start();

    }
}
class Account {
    private String number;//账号
    private double balance;
    public Account() {

    }

    public Account(String number, double balance) {
        this.number = number;
        this.balance = balance;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }
    //取款
    public void withDraw(double money) {
        //小括号写你希望哪些线程同步，共享数据的对象
        synchronized (this) {
            balance -= money;
        }
    }
}
class AccountThread extends Thread {
    private Account act;

    public AccountThread(Account act) {
        this.act = act;
    }

    @Override
    public void run() {
        ///思考:t1执行到这里了，但还没有来得及执行这行代码，t2线程进来withdraw方法了。此时一定出问题。
        String s = Thread.currentThread().getName();
        System.out.println(s + "将要执行，账户"+act.getNumber()+"当前余额"+act.getBalance());
        act.withDraw(1000.0);

        System.out.println(s + "线程执行了，"+"账户"+act.getNumber()+"取款"+ 1000+"成功，余额" +act.getBalance());
    }
}