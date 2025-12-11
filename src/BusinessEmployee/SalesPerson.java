package BusinessEmployee;

public class SalesPerson extends Employee implements  CheckTheSpecificType{
    private double commission;
    public SalesPerson(int id, String name, double baseSalary, double commission) {
        super(id, name, baseSalary);
        this.commission=commission;
    }

    public double getCommission() {
        return commission;
    }
    public void setCommission(double commission) {
        this.commission = commission;
    }


    @Override
    public double calculateSalary() {
        return getBaseSalary()+ commission;
    }

    @Override
    public void printRole() {
        System.out.println("Role: SalesPerson");
    }
}

