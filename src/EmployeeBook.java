import java.util.ArrayList;
import java.util.List;

public class EmployeeBook {
    private static final Employee[] employees = new Employee[10];

    public Employee[] initializeEmployees() {
        employees[0] = new Employee("Обиджонов", "Рустам", "Евгеньевич", 1, 95473);
        employees[1] = new Employee("Перкулов", "Артем", "Олегович", 3, 88321);
        employees[2] = new Employee("Арсеньев", "Орсмал", "Булатович", 5, 75463);
        employees[3] = new Employee("Иванов", "Иван", "Иванович", 4, 22456);
        employees[4] = new Employee("Грачев", "Демид", "Семенович", 2, 88421);
        employees[5] = new Employee("Дроздов", "Петр", "Андреевич", 3, 13456);
        employees[6] = new Employee("Губов", "Мирон", "Демидович", 1, 21452);
        employees[7] = new Employee("Просевич", "Константин", "Генадьевич", 5, 34123);
        employees[8] = new Employee("Оджоркович", "Биробиджон", "Азаматович", 4, 53122);
        employees[9] = new Employee("Брикетов", "Макар", "Борисович", 2, 86545);

        return employees;
    }

    public void printAllInformationEmployees() {
        for (Employee emp : employees) {
            System.out.println(emp.toString());
        }
    }

    public double calculateSalaryExpenses() {
        double amountOfSalaryExpenses = 0;
        for (Employee sum : employees) {
            amountOfSalaryExpenses = amountOfSalaryExpenses + sum.getEmployeeSalary();
        }

        return amountOfSalaryExpenses;
    }

    public double calculateAverageSalary() {
        double amountOfSalaryExpenses = 0;
        for (Employee sum : employees) {
            amountOfSalaryExpenses = amountOfSalaryExpenses + sum.getEmployeeSalary();
        }
        double averageSum = amountOfSalaryExpenses / employees.length;

        return averageSum;
    }

    public Employee calculateMinEmployeeSalary() {
        Employee minSalary = employees[0];
        for (Employee min : employees) {
            if (min.getEmployeeSalary() < minSalary.getEmployeeSalary()) {
                minSalary = min;
            }
        }
        return minSalary;
    }

    public double calculateMaxEmployeeSalary() {
        double maxSalary = employees[0].getEmployeeSalary();
        for (final Employee max : employees) {
            if (max.getEmployeeSalary() > maxSalary) {
                maxSalary = max.getEmployeeSalary();
            }
        }
        return maxSalary;
    }

    public void printAllNamesEmployees() {
        System.out.println("Ф.И.О всех сотрудников:");
        for (Employee name : employees) {
            System.out.println(name.getFullName() + ".");
        }
    }

    public List<Employee> calculateSalaryIndexation(double percentIndexation) {
        if (percentIndexation < -100) {
            throw new IllegalArgumentException("Процент не может быть меньше -100!");
        }
        List<Employee> resultIndexation = new ArrayList<>();
        for (Employee indexation : employees) {
            if (indexation != null) {
                double currentSalary = indexation.getEmployeeSalary();
                double newSalary = currentSalary * (1 + percentIndexation / 100);
                indexation.setEmployeeSalary(newSalary);
                resultIndexation.add(indexation);
            }
        }
        return  resultIndexation;
    }

    public Employee calculateMinEmployeeSalaryForDept(int dept) {
        if (dept < 1 || dept > 5) {
            throw new IllegalArgumentException("Введен некорректный номер отдела, введите номер отдела от 1 до 5!");
        }
        Employee minSalaryForDept = employees[0];
        for (Employee minForDept : employees) {
            if (dept == minForDept.getDept() && minForDept.getEmployeeSalary() < minSalaryForDept.getEmployeeSalary()) {
                minSalaryForDept = minForDept;
            }
        }
        return minSalaryForDept;
    }

    public Employee calculateMaxEmployeeSalaryForDept(int dept) {
        if (dept < 1 || dept > 5) {
            throw new IllegalArgumentException("Введен некорректный номер отдела, введите номер отдела от 1 до 5!");
        }
        Employee maxSalaryForDept = null;
        for (final Employee maxForDept : employees) {
            if (dept == maxForDept.getDept()) {
                if (maxSalaryForDept == null || maxForDept.getEmployeeSalary() > maxSalaryForDept.getEmployeeSalary()) {
                    maxSalaryForDept = maxForDept;
                }
            }
        }
        return maxSalaryForDept;
    }

    public double calculateSalaryExpensesForDept(int dept) {
        if (dept < 1 || dept > 5) {
            throw new IllegalArgumentException("Введен некорректный номер отдела, введите номер отдела от 1 до 5!");
        }
        double amountOfSalaryExpensesForDept = 0;
        for (Employee sum : employees) {
            if (dept == sum.getDept()) {
                amountOfSalaryExpensesForDept = amountOfSalaryExpensesForDept + sum.getEmployeeSalary();
            }
        }
        return amountOfSalaryExpensesForDept;
    }

    public double calculateAverageSalaryForDept(int dept) {
        if (dept < 1 || dept > 5) {
            throw new IllegalArgumentException("Введен некорректный номер отдела, введите номер отдела от 1 до 5!");
        }
        double amountOfSalaryExpensesForDept = 0;
        int employeeCount = 0;
        for (Employee sum : employees) {
            if (dept == sum.getDept()) {
                amountOfSalaryExpensesForDept = amountOfSalaryExpensesForDept + sum.getEmployeeSalary();
                employeeCount++;
            }
        }
        return amountOfSalaryExpensesForDept / employeeCount;
    }

    public List<Employee> calculateSalaryIndexationForDept(int dept, double percentIndexation) {
        if (dept < 1 || dept > 5) {
            throw new IllegalArgumentException("Введен некорректный номер отдела, введите номер отдела от 1 до 5!");
        }
        if (percentIndexation < -100) {
            throw new IllegalArgumentException("Процент не может быть меньше -100!");
        }
        List<Employee> resultIndexationForDept = new ArrayList<>();
        for (Employee newSalaries : employees) {
            if (newSalaries.getDept() == dept) {
                double newSalary = newSalaries.getEmployeeSalary() * (1 + percentIndexation / 100);
                newSalaries.setEmployeeSalary(newSalary);
                resultIndexationForDept.add(newSalaries);
            }
        }
        return resultIndexationForDept;
    }

    public void printAllInformationEmployeesForDept(int dept) {
        if (dept < 1 || dept > 5) {
            throw new IllegalArgumentException("Введен некорректный номер отдела, введите номер отдела от 1 до 5!");
        }
        System.out.println("Сотрудники отдела " + dept + ":");
        for (Employee employeesForDept : employees) {
            if (dept == employeesForDept.getDept()) {
                System.out.println("Ф.И.О: " + employeesForDept.getFullName() + ". Зароботная плата сотрудника- " + employeesForDept.getEmployeeSalary() + " рубля." + " ID: " + employeesForDept.getId());
            }
        }
    }

    public List<Employee> findEmployeesWithSalaryBelow(double number) {
        List<Employee> employeesWithSalary = new ArrayList<>();
        for (Employee emp : employees) {
            if (emp != null && emp.getEmployeeSalary() < number) {
                employeesWithSalary.add(emp);
            }
        }
        return employeesWithSalary;
    }

    public List<Employee> salaryMaxTheNumberOrEqualToTheNumber(double number) {
        List<Employee> resultEmployeesMaxSalaryNumber = new ArrayList<>();

        for (Employee salaryMax : employees) {
            if (salaryMax != null && number <= salaryMax.getEmployeeSalary()) {
                resultEmployeesMaxSalaryNumber.add(salaryMax);
            }
        }
        return resultEmployeesMaxSalaryNumber;
    }

    public boolean removeEmployeeById(int id) {
        for (int i = 0; i < employees.length; i++) {
            if (employees[i] != null && employees[i].getId() == id) {
                employees[i] = null;
                return true;
            }
        }
        return false;
    }

    public boolean addEmployee(Employee employee) {
        if (employee == null) {
            throw new IllegalArgumentException("Сотрудник не может быть null.");
        }
        for (int i = 0; i < employees.length; i++) {
            if (employees[i] == null) {
                employees[i] = employee;
                return true;
            }
        }
        return false;
    }

    public Employee getEmployeeById(int id) {
        for (Employee employeeById : employees) {
            if (employeeById != null && employeeById.getId() == id) {
                return employeeById;
            }
        }
        return null;
    }
}
