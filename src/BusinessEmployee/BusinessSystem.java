package BusinessEmployee;

import java.util.ArrayList;
import java.util.ListIterator;

public class BusinessSystem {
    static void main(String[] args) {
        ArrayList<Employee>employees=new ArrayList<>();
        employees.add(new Manager(1,"Doha",20000,1000));
        employees.add(new SalesPerson(2,"Mohamed",25000,20.00));
        employees.add(new Intern(3,"Ismael",15000));

        ListIterator<Employee> lit=employees.listIterator();
        int c=0;
        while(lit.hasNext()){
            c++;
            System.out.println("-personal info for Employee number " +c);
            Employee emp=lit.next();
            emp.displayInfo();
            if (emp instanceof CheckTheSpecificType) {
                ((CheckTheSpecificType) emp).printRole();
            }
            System.out.println("The Total Salary is: " + emp.calculateSalary());

        }




    }
}

