package com.example.employees;

public class Main {
    public static void main(String[] args) {
        Employee[] employees = new Employee[3];
        employees[0] = new Manager("Іван", 30, 30000);
        employees[1] = new Developer("Сергій",35 , 50000);
        employees[2] = new Designer("Дмитро", 26, 30000);

        for (Employee emp : employees) {
            emp.performJob();
            emp.describeRole();
            emp.describeRole("with additional responsibilities.");
            System.out.println();
        }
    }
}