package com.fitrasalam;

public class Employee {

    private final int id;
    private final String firstName;
    private final String lastName;
    private int salary;

    public Employee(int ID, String FirstName, String LastName, int Salary) {
        this.id = ID;
        this.firstName = FirstName;
        this.lastName = LastName;
        this.salary = Salary;
    }

    int getId() {
        return id;
    }

    String getfirstName() {
        return firstName;
    }

    String getlastName() {
        return lastName;
    }

    String getName() {
        return getfirstName() + " " + getlastName();
    }

    int getSalary() {
        return salary;
    }

    public void setSalary(int slr) {
        this.salary = slr;
    }

    int getAnnualSalary() {
        return salary * 12;
    }

    int raiseSalary(float percent) {
        return (int) (getAnnualSalary() * percent + getAnnualSalary());// peningkatan gaji dengan persen
    }

    @Override
    public String toString() {
        return "Employee [ ID :" + getId() + ", Nama : " + getName() + " , salary : ";
    }
}