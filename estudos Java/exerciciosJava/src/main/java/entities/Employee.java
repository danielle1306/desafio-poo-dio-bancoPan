package entities;

public class Employee {

    public String name;
    public Double grossSalary;
    public Double tax;


    public double NetSalary() {
        return grossSalary - tax;

    }
    public void increaseSalary(double percentage) {
        grossSalary += grossSalary * percentage/100.0;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", grossSalary=" + grossSalary +
                ", tax=" + tax +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
