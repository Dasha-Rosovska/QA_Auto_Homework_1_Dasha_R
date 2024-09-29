package com.example.employees;

class Developer extends Employee {
    public Developer(String name, int age, double salary) {
        super(name, age, salary);
    }
    @Override
    public void performJob() {
        System.out.println(getName() + " - створює програми.");
    }
    @Override
    public void describeRole() {
        System.out.println("Задача: займається написанням та підтримкою програмного забезпечення.");
    }
    @Override
    public void describeRole(String extraInfo) {
        System.out.println("Role: Developer. " + extraInfo);
    }
}

