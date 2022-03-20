package com.masai.Mar17.TreeSetProblem;

import java.util.Comparator;

public class EmpSalaryComp implements Comparator<Employee> {
    @Override
    public int compare(Employee o1, Employee o2) {
        return o1.getSalary()>o2.getSalary() ? +1 : -1;
    }
}
