package FunctionalInterfaces;

import EmployeeSortingSystem.Employee;

public class SalaryProcessor {
    public static boolean check(Employee e,SalaryRule rule){
        return rule.approve(e);
    }
}
