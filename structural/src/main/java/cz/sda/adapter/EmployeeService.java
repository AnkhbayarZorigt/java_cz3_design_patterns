package cz.sda.adapter;

public class EmployeeService {
    public void hire(Employee employee) {
        System.out.println("I've hired " + employee.getFullName());
    }

    public void fire(Employee employee) {
        System.out.println("I've fired " + employee.getFullName());
    }
}
