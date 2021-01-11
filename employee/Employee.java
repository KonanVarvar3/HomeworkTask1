package com.homework.task1.employee;

import java.util.Objects;

public class Employee {

    private int id;
    private String firstName;
    private String lastName;
    private int salary;

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }

        if (o == null || getClass() != o.getClass()) {
            return false;
        }

        Employee employee = (Employee) o;

        return id == employee.id &&
                salary == employee.salary &&
                Objects.equals(firstName, employee.getFirstName()) &&
                Objects.equals(lastName, employee.getLastName());
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;

        result = prime * result + id;
        result = prime * result + salary;
        result = prime * result + ((firstName == null) ? 0 : firstName.hashCode());
        result = prime * result + ((lastName == null) ? 0 : lastName.hashCode());

        return result;
    }

    public Employee(int id, String firstName, String lastName, int salary) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.salary = salary;
    }

    public int getId() {
        return id;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getName() {
        return "\"" + firstName + " " + lastName + "\"";
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public int AnnualSalary() {
        return salary * 12;
    }

    public int raiseSalary(int percent) {
        return salary * percent / 100 + salary;
    }

    @Override
    public String toString() {
        return "\"Employee[" +
                "id=" + id +
                ",name=" + firstName + ' ' + lastName +
                ",salary=" + salary + "]\"";
    }
}

















