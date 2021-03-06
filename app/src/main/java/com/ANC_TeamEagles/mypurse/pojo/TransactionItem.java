package com.ANC_TeamEagles.mypurse.pojo;

/**
 * Created by nezspencer on 8/8/17.
 */

public class TransactionItem {

    private double amount;
    private String description;
    private String day_month;
    private double totalSoFar;
    private boolean isIncome;
    private long timeCreated;



    //mandatory empty constructor for firebase
    public TransactionItem() {
    }

    public TransactionItem(double amount, String description, String day_month, double
            totalSoFar, boolean isIncome, long timeCreated) {
        this.amount = amount;
        this.description = description;
        this.day_month = day_month;
        this.totalSoFar = totalSoFar;
        this.isIncome = isIncome;
        this.timeCreated = timeCreated;
    }

    public double getAmount() {
        return amount;
    }

    public String getDescription() {
        return description;
    }

    public String getDay_month() {
        return day_month;
    }

    public double getTotalSoFar() {
        return totalSoFar;
    }

    public boolean isIsIncome() {
        return isIncome;
    }

    public long getTimeCreated() {
        return timeCreated;
    }
}
