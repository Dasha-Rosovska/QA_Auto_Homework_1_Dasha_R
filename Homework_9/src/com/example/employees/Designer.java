package com.example.employees;

class Designer extends Employee {
    public Designer(String name, int age, double salary) {
        super(name, age, salary);
    }
    @Override
    public void performJob() {
        System.out.println(getName() + " - займається створенням дизайнів.");
    }
    @Override
    public void describeRole() {
        System.out.println("Задача: Відповідає за дизайн UI/UX.");
    }
    @Override
    public void describeRole(String extraInfo) {
        System.out.println("Role: Designer. " + extraInfo);
    }
}
