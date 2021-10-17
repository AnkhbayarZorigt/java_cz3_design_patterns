package cz.sda.adapter;

public class Main {
    public static void main(String[] args) {
        var employeeService = new EmployeeService();
        var hagrid = new Person("Rubius", "Hagrid");

        employeeService.hire(new EmployeeAdapter(hagrid));
    }
}
