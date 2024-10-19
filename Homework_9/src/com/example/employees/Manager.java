package com.example.employees;

class Manager extends Employee {
    public Manager(String name, int age, double salary) {
        super(name, age, salary);
    }
    @Override
    public void performJob() {
        System.out.println(getName() + " - менеджер команди.");
    }
    @Override
    public void describeRole() {
        System.out.println("Задача: займається не лише організацією деталей, а й внутрішніми питаннями команди.");
    }
    @Override
    public void describeRole(String extraInfo) {
        System.out.println("Role: Manager. " + extraInfo);
    }
}
