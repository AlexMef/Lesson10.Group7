package com.company;

public class HourWorker implements WorkerInterface {
    private int ID;
    private double pay;
    private String name;
    private double hPay;

    public HourWorker(int ID, String name, double hPay) {
        this.pay = hPay;
    }

    public double getPay() {
        return pay;
    }
}
