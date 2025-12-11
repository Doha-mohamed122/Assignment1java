package BusinessEmployee;

public class Intern extends Employee implements  CheckTheSpecificType{
    public Intern(int id, String name, double baseSalary) {
        super(id, name, baseSalary);
    }

    @Override
    public double calculateSalary() {
        return 3000;
    }

    @Override
    public void printRole() {
        System.out.println("Role: Intern");
    }
}

