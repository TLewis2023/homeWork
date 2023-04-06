package oop.salary;

import oop.Employees;

public class SalariedEmployee extends Employees {
    private double salary;

    public SalariedEmployee(String name,double salary) {
        super(name);
        this.salary = salary;

    }

    @Override
    public String toString() {
        return "SalariedEmployee{" +
                "salary=" + salary +
                '}';
    }

    private double getSalary(){
        return salary;

    }

    }
