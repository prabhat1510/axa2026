package com.axa.java.dayfive.oopsconcepts.inheritancexample.ex;

class A{
    int money;
    private int pocketMoney;

    void fill(int money, int pocketMoney)
    {
        this.money = money;
        this.pocketMoney = pocketMoney;
    }

    public int getPocketMoney() {
        return pocketMoney;
    }
}
