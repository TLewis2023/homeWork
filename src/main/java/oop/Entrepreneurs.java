package oop;

public class Entrepreneurs extends Person{

   public double Pay;

    public double getPay() {
        return Pay;
    }

    public void setPay(double pay) {
        Pay = pay;
    }

    @Override
    public String toString() {
        return "Entrepreneurs{" +
                "Pay=" + Pay +
                '}';
    }

    public Entrepreneurs(String name, double Pay) {
        super(name);
        this.Pay = Pay;


    }
}
