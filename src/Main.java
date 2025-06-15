import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        EmployeeBook employeeBook = new EmployeeBook();
        employeeBook.initializeEmployees();
        employeeBook.printAllInformationEmployees();
        double[] amountOfSalaryExpensesAndAverageSalary = employeeBook.calculateSalaryExpensesAndAverageSalary();
        System.out.println("Сумма затрат на зарплату составляет: " + amountOfSalaryExpensesAndAverageSalary[0] + " рублей.");
        System.out.println("Среднее значение зарплат составляет: " + amountOfSalaryExpensesAndAverageSalary[1] + " рублей.");
        Employee minSalary = employeeBook.calculateminEmployeeSalary();
        System.out.println("Сотрудник с минимальной зарплатой - " + minSalary.getFullName() + ". Размер зарплаты составляет: " + minSalary.getEmployeeSalary() + " рублей.");
        double[] maxSalary = employeeBook.calculatemaxEmployeeSalary();
        System.out.println("Максимальная зарплата сотрудника составляет " + maxSalary[0] + " рублей.");
        employeeBook.printAllNamesEmployees();
        double[] newSalaries = employeeBook.calculatesalaryIndexation(25);
        for (double newSalary : newSalaries) {
            System.out.println("Зарплата после индексации: " + newSalary);
        }
        Employee minEmployeeSalaryForDept = employeeBook.calculateminEmployeeSalaryForDept(2);
        System.out.println("Минимальная зарплата сотрудника отдела " + minEmployeeSalaryForDept.getDept() + " составляет: " + minEmployeeSalaryForDept.getEmployeeSalary() + " рублей.");
        Employee maxEmployeeSalaryForDept = employeeBook.calculatemaxEmployeeSalaryForDept(1);
        System.out.println("Максимальная зарплата сотрудника отдела " + maxEmployeeSalaryForDept.getDept() + " составляет: " + maxEmployeeSalaryForDept.getEmployeeSalary() + " рублей.");
        double amountOfSalaryExpensesForDept = employeeBook.calculateSalaryExpensesForDept(5);
        System.out.println("Сумма затрат в отделе на зарплату составляет: " + amountOfSalaryExpensesForDept + " рублей.");
        double averageSalaryForDept = employeeBook.calculateAverageSalaryForDept(4);
        System.out.println("Средняя зарплата в отделе на зарплату составляет: " + averageSalaryForDept + " рублей.");
        double[] salaryIndexationForDept = employeeBook.calculatesalaryIndexationForDept(3, 50);
        System.out.println("Зарплата сотрудников в отделе после индексации: ");
        for (double newSalaryForDept : salaryIndexationForDept) {
            System.out.println(newSalaryForDept);
        }
        employeeBook.printAllInformationEmployeesForDept(4);
        Employee[] minTheNumber = employeeBook.findSalaryMinTheNumber(50000);
        if (minTheNumber.length > 0) {
            System.out.println("Сотрудники с зарплатой меньше введенного числа:");
            for (Employee min : minTheNumber) {
                System.out.println(min.getFullName() + ". ID:" + min.getId() + " Зароботная плата сотрудника- " + min.getEmployeeSalary() + ".");
            }
        } else {
            System.out.println("Сотрудников с зарплатой меньше введенного числа нет.");
        }
        Employee[] maxTheNumberOrEqualToTheNumber = employeeBook.salaryMaxTheNumberOrEqualToTheNumber(90000);
        if (maxTheNumberOrEqualToTheNumber.length > 0) {
            System.out.println("Сотрудники с зарплатой больше или равной введенному числу:");
            for (Employee max : maxTheNumberOrEqualToTheNumber) {
                System.out.println(max.getFullName() + ". ID:" + max.getId() + " Зароботная плата сотрудника- " + max.getEmployeeSalary() + ".");
            }
        } else {
            System.out.println("Сотрудников с зарплатой больше или равной введенному числу нет.");
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