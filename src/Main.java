public class Main {
    public static void main(String[] args) {
        EmployeeBook employeeBook = new EmployeeBook();
        employeeBook.initializeEmployees();
        employeeBook.printAllInformationEmployees();
        employeeBook.amountOfSalaryExpensesAndAverageSalary();
        employeeBook.minEmployeeSalary();
        employeeBook.maxEmployeeSalary();
        employeeBook.printAllNamesEmployees();
        employeeBook.salaryIndexation(25);
        employeeBook.minEmployeeSalaryForDept(2);
        employeeBook.maxEmployeeSalaryForDept(1);
        employeeBook.amountOfSalaryExpensesForDept(5);
        employeeBook.averageSalaryForDept(4);
        employeeBook.salaryIndexationForDept(3, 50);
        employeeBook.printAllInformationEmployeesForDept(4);
        employeeBook.salaryMinTheNumber(78000);
        employeeBook.salaryMaxTheNumber(90000);
        System.out.println(employeeBook.removeEmployeeById(12));
        employeeBook.addEmployee();
        Employee employee = employeeBook.getEmployeeById(20);
        if (employee != null) {
            System.out.println(employee);
        }
    }
}