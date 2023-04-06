package oop.salary;

import oop.Employees;

public class Hourly extends Employees {
    private int hoursWorked;
    private double rate;

    public double getRate() {
        return hoursWorked + rate;
    }

    @Override
    public String toString() {
        return "Hourly{" +
                "hoursWorked=" + hoursWorked +
                ", rate=" + rate +
                '}';
    }

    public Hourly(String name, int hoursWorked, double rate) {
        super(name);
        this.hoursWorked = hoursWorked;
        this.rate = rate;


    }

}

