import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        EmployeeBook employeeBook = new EmployeeBook();
        employeeBook.initializeEmployees();
        employeeBook.printAllInformationEmployees();
        double amountOfSalaryExpenses = employeeBook.calculateSalaryExpenses();
        System.out.println("Сумма затрат на зарплату составляет: " + amountOfSalaryExpenses + " рублей.");
        double amountAverageSalary = employeeBook.calculateAverageSalary();
        System.out.println("Среднее значение зарплат составляет: " + amountAverageSalary + " рублей.");
        Employee minSalary = employeeBook.calculateMinEmployeeSalary();
        System.out.println("Сотрудник с минимальной зарплатой - " + minSalary.getFullName() + ". Размер зарплаты составляет: " + minSalary.getEmployeeSalary() + " рублей.");
        double maxSalary = employeeBook.calculateMaxEmployeeSalary();
        System.out.println("Максимальная зарплата сотрудника составляет " + maxSalary + " рублей.");
        employeeBook.printAllNamesEmployees();
        List <Employee> resultIndexation = employeeBook.calculateSalaryIndexation(10.0);
        System.out.println("Зарплаты после индексации:");
        for (Employee indexation : resultIndexation) {
            System.out.println(indexation.getFullName()+ " " + indexation.getEmployeeSalary() + " рублей.");
        }
        Employee minEmployeeSalaryForDept = employeeBook.calculateMinEmployeeSalaryForDept(2);
        System.out.println("Минимальная зарплата сотрудника отдела " + minEmployeeSalaryForDept.getDept() + " составляет: " + minEmployeeSalaryForDept.getEmployeeSalary() + " рублей.");
        Employee maxEmployeeSalaryForDept = employeeBook.calculateMaxEmployeeSalaryForDept(1);
        System.out.println("Максимальная зарплата сотрудника отдела " + maxEmployeeSalaryForDept.getDept() + " составляет: " + maxEmployeeSalaryForDept.getEmployeeSalary() + " рублей.");
        double amountOfSalaryExpensesForDept = employeeBook.calculateSalaryExpensesForDept(5);
        System.out.println("Сумма затрат в отделе на зарплату составляет: " + amountOfSalaryExpensesForDept + " рублей.");
        double averageSalaryForDept = employeeBook.calculateAverageSalaryForDept(4);
        System.out.println("Средняя зарплата в отделе на зарплату составляет: " + averageSalaryForDept + " рублей.");
        List <Employee> resultIndexationForDept = employeeBook.calculateSalaryIndexationForDept(3, 10.0);
        System.out.println("Проиндексированные зарплаты сотрудников отдела: ");
        for (Employee indFDept : resultIndexationForDept) {
            System.out.println(indFDept.getFullName()+ " " + indFDept.getEmployeeSalary() + " рублей.");
        }
        employeeBook.printAllInformationEmployeesForDept(4);
        List<Employee> lowPaidEmployees = employeeBook.findEmployeesWithSalaryBelow(50000);
        System.out.println("Сотрудники с зарплатой ниже 50000:");
        for (Employee min : lowPaidEmployees) {
            System.out.println(min.getFullName() + ". ID:" + min.getId() + " Зароботная плата сотрудника- " + min.getEmployeeSalary() + " рублей.");
        }
        List<Employee> maxTheNumberOrEqualToTheNumber = employeeBook.salaryMaxTheNumberOrEqualToTheNumber(90000);
            System.out.println("Сотрудники с зарплатой больше или равной введенному числу:");
            for (Employee max : maxTheNumberOrEqualToTheNumber) {
                System.out.println(max.getFullName() + ". ID:" + max.getId() + " Зароботная плата сотрудника- " + max.getEmployeeSalary() + " рублей.");
            }
        boolean removeEmployeeById = employeeBook.removeEmployeeById(21);
        if (removeEmployeeById) {
            System.out.println("Сотрудник успешно удален!");
        } else {
            System.out.println("Сотрудник с таким ID не найден.");
        }
        Employee employee = new Employee("Перкулова", "Анастасия", "Олеговна", 3, 78993);
        boolean addEmployee = employeeBook.addEmployee(employee);
        if (addEmployee) {
            System.out.println("Сотрудник успешно добавлен!");
        } else {
            System.out.println("Не удалось добавить сотрудника - нет свободных мест.");
        }
        Employee employeeById = employeeBook.getEmployeeById(20);
        if (employeeById != null) {
            System.out.println(employeeById);
        }
    }
}