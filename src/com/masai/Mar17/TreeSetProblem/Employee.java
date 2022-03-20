package com.masai.Mar17.TreeSetProblem;

public class Employee {

    private int empId;
    private String empName;
    private double salary;

    public Employee() {
    }

    public Employee(int empId, String empName, double salary) {
        this.empId = empId;
        this.empName = empName;
        this.salary = salary;
    }

    public int getEmpId() {
        return empId;
    }

    public void setEmpId(int empId) {
        this.empId = empId;
    }

    public String getEmpName() {
        return empName;
    }

    public void setEmpName(String empName) {
        this.empName = empName;
    }

    @Override
    public String toString() {
        return "empId=" + empId +
                ", empName='" + empName + '\'' +
                ", salary=" + salary ;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }


}