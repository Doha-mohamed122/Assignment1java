package BusinessEmployee;

public abstract class Employee {
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public double getBaseSalary() {
        return baseSalary;
    }
    public void setBaseSalary(double baseSalary) {
        this.baseSalary = baseSalary;
    }

    private int id;
    private String name;
    private double baseSalary;
    private static int empC=0;

    public Employee(int id, String name, double baseSalary){
        this.id=id;
        this.name=name;
        this.baseSalary=baseSalary;
        empC++;
    }

    public abstract double calculateSalary();

    public void displayInfo() {
        System.out.println("ID: " + id);
        System.out.println("Name: " + name);
        System.out.println("Base Salary: " + baseSalary);
    }


    }

