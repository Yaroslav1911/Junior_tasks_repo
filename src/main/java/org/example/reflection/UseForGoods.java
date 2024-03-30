package org.example.reflection;

public class UseForGoods {

    private final String name;
    private final double dob;

    public UseForGoods() {
        this.name = "use me";
        this.dob = 3.14d;
    }

    public String getName() {
        return name;
    }

    public double getDob() {
        return dob;
    }

    @Override
    public String toString() {
        return "UseForGoods{" +
                "name='" + name + '\'' +
                ", dob=" + dob +
                '}';
    }
}
