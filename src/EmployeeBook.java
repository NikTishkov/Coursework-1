public class EmployeeBook {
    private static final Employee[] employees = new Employee[10];

    public void initializeEmployees() {
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
    }

    public void printAllInformationEmployees() {
        for (Employee emp : employees) {
            System.out.println(emp.toString());
        }
    }

    public void amountOfSalaryExpensesAndAverageSalary() {
        double amountOfSalaryExpenses = 0;
        for (Employee sum : employees) {
            amountOfSalaryExpenses = amountOfSalaryExpenses + sum.getEmployeeSalary();
        }
        double averageSum = amountOfSalaryExpenses / employees.length;
        System.out.println("Сумма затрат на зарплату составляет: " + amountOfSalaryExpenses + " рублей.");
        System.out.println("Среднее значение зарплат составляет: " + averageSum + " рублей.");
    }

    public void minEmployeeSalary() {
        Employee minSalary = employees[0];
        for (Employee min : employees) {
            if (min.getEmployeeSalary() < minSalary.getEmployeeSalary()) {
                minSalary = min;
            }
        }
        System.out.println("Минимальная зарплата сотрудника составляет: " + minSalary.getEmployeeSalary() + " рублей.");
    }

    public void maxEmployeeSalary() {
        double maxSalary = -1;
        for (final Employee max : employees) {
            if (max.getEmployeeSalary() > maxSalary) {
                maxSalary = max.getEmployeeSalary();
            }
        }
        System.out.println("Максимальная зарплата сотрудника составляет " + maxSalary + " рублей.");
    }

    public void printAllNamesEmployees() {
        System.out.println("Ф.И.О всех сотрудников:");
        for (Employee name : employees) {
            System.out.println(name.getFullName() + ".");
        }
    }

    public void salaryIndexation(double percentIndexation) {
        for (Employee indexation : employees) {
            if (percentIndexation < -100) {
                throw new IllegalArgumentException("Процент не может быть меньше -100!");
            }
            double currentSalary = indexation.getEmployeeSalary();
            double newSalary = currentSalary * (1 + percentIndexation / 100);
            indexation.setEmployeeSalary(newSalary);
            System.out.println("Новая зарплата сотрудника: " + indexation.getFullName() + ", после индексации = " + newSalary + " рублей.");
        }
    }

    public void minEmployeeSalaryForDept(int dept) {
        if (dept < 1 || dept > 5) {
            throw new IllegalArgumentException("Введен некорректный номер отдела, введите номер отдела от 1 до 5!");
        }
        Employee minSalaryForDept = employees[0];
        for (Employee minForDept : employees) {
            if (dept == minForDept.getDept() && minForDept.getEmployeeSalary() < minSalaryForDept.getEmployeeSalary()) {
                minSalaryForDept = minForDept;
            }
        }
        System.out.println("Минимальная зарплата сотрудника отдела " + dept + " составляет: " + minSalaryForDept.getEmployeeSalary() + " рублей.");
    }

    public void maxEmployeeSalaryForDept(int dept) {
        if (dept < 1 || dept > 5) {
            throw new IllegalArgumentException("Введен некорректный номер отдела, введите номер отдела от 1 до 5!");
        }
        double maxSalaryForDept = -1;
        for (final Employee maxForDept : employees) {
            if (dept == maxForDept.getDept() && maxForDept.getEmployeeSalary() > maxSalaryForDept) {
                maxSalaryForDept = maxForDept.getEmployeeSalary();
            }
        }
        System.out.println("Максимальная зарплата сотрудника отдела " + dept + " составляет: " + maxSalaryForDept + " рублей.");
    }

    public void amountOfSalaryExpensesForDept(int dept) {
        if (dept < 1 || dept > 5) {
            throw new IllegalArgumentException("Введен некорректный номер отдела, введите номер отдела от 1 до 5!");
        }
        double amountOfSalaryExpensesForDept = 0;
        for (Employee sum : employees) {
            if (dept == sum.getDept()) {
                amountOfSalaryExpensesForDept = amountOfSalaryExpensesForDept + sum.getEmployeeSalary();
            }
        }
        System.out.println("Сумма затрат в отделе " + dept + " на зарплату составляет: " + amountOfSalaryExpensesForDept + " рублей.");
    }

    public void averageSalaryForDept(int dept) {
        if (dept < 1 || dept > 5) {
            throw new IllegalArgumentException("Введен некорректный номер отдела, введите номер отдела от 1 до 5!");
        }
        double amountOfSalaryExpensesForDept = 0;
        int dept1 = 0;
        for (Employee sum : employees) {
            if (dept == sum.getDept()) {
                amountOfSalaryExpensesForDept = amountOfSalaryExpensesForDept + sum.getEmployeeSalary();
                dept1++;
            }
        }
        double averageSum = amountOfSalaryExpensesForDept / dept1;
        System.out.println("Средняя зарплата в отделе " + dept + " на зарплату составляет: " + averageSum + " рублей.");
    }

    public void salaryIndexationForDept(int dept, double percentIndexation) {
        if (dept < 1 || dept > 5) {
            throw new IllegalArgumentException("Введен некорректный номер отдела, введите номер отдела от 1 до 5!");
        }
        for (Employee indexation : employees) {
            if (percentIndexation < -100) {
                throw new IllegalArgumentException("Процент не может быть меньше -100!");
            }
            if (dept == indexation.getDept()) {
                double currentSalary = indexation.getEmployeeSalary();
                double newSalary = currentSalary * (1 + percentIndexation / 100);
                indexation.setEmployeeSalary(newSalary);
                System.out.println("Новая зарплата сотрудника отдела " + dept + ": " + indexation.getFullName() + ", после индексации = " + newSalary + " рублей.");
            }
        }
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

    public void salaryMinTheNumber(double number) {
        System.out.println("Сотрудники у которых зароботная плата меньше " + number + ":");
        for (Employee salaryMinTheNumber : employees) {
            if (number > salaryMinTheNumber.getEmployeeSalary()) {
                System.out.println("Ф.И.О: " + salaryMinTheNumber.getFullName() + ". Зароботная плата сотрудника- " + salaryMinTheNumber.getEmployeeSalary() + " рубля." + " ID: " + salaryMinTheNumber.getId());
            }
        }
    }

    public void salaryMaxTheNumber(double number) {
        System.out.println("Сотрудники у которых зароботная плата больше или равна " + number + ":");
        for (Employee salaryMinTheNumber : employees) {
            if (number <= salaryMinTheNumber.getEmployeeSalary()) {
                System.out.println("Ф.И.О: " + salaryMinTheNumber.getFullName() + ". Зароботная плата сотрудника- " + salaryMinTheNumber.getEmployeeSalary() + " рубля." + " ID: " + salaryMinTheNumber.getId());
            }
        }
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

    public boolean addEmployee() {
        Employee newEmployee = new Employee("Перкулова", "Анастасия", "Олеговна", 3, 78993);
        if (newEmployee == null) {
            throw new IllegalArgumentException("Сотрудник не может быть null.");
        }
        for (int i = 0; i < employees.length; i++) {
            if (employees[i] == null) {
                employees[i] = newEmployee;
                System.out.println(newEmployee);
                return true;
            }
        }
        return false;
    }

    public Employee getEmployeeById(int id) {
        for (Employee employee : employees) {
            if (employee != null && employee.getId() == id) {
                return employee;
            }
        }
        return null;
    }
}
