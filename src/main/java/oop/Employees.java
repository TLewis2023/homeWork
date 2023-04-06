package oop;

public class Employees extends Person {


    private static int ID;

    private static int unique = 0;

    public Employees(String name){
        super(name);
        this.ID = unique++;

    }

    public int getID() {
        return ID;
    }

    public static void printBadge(){
        System.out.println(ID);
    }
}
