package com.company;

public class Worker implements WorkerInterface {
    private int ID;
    private double pay;
    private String name;
    private double mPay;

    public Worker(int ID, String name, double mPay) {
        this.pay = mPay;
    }

    public double getPay() {
        return pay;
    }
}
