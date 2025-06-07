import java.util.Objects;

public class Employee {
    private String firstName;
    private String surName;
    private String lastName;
    private String fullName;
    private int dept;
    private double employeeSalary;
    private static int idCounter = 12;
    private final int id;

    public Employee(String surName, String firstName, String lastName, int dept, int employeeSalary) {
        this.firstName = firstName;
        this.surName = surName;
        this.lastName = lastName;
        this.fullName = surName + " " + firstName + " " + lastName;
        this.dept = dept;
        this.employeeSalary = employeeSalary;
        this.id = idCounter++;
        if (dept < 1 || dept > 5) {
            throw new IllegalArgumentException("Введен некорректный номер отдела, введите номер отдела от 1 до 5!");
        }
        if (this.id < 0) {
            throw new IllegalArgumentException("ID должен быть положительным");
        }
    }

    public String getFullName() {
        return this.fullName;
    }

    public int getDept() {
        return this.dept;
    }

    public double getEmployeeSalary() {
        return this.employeeSalary;
    }

    public int getId() {
        return this.id;
    }

    public void setDept(int dept) {
        this.dept = dept;
    }

    public void setEmployeeSalary(double employeeSalary) {
        this.employeeSalary = employeeSalary;
    }

    public String toString() {
        return "Ф.И.О: " + this.getFullName() + ". Отдел: " + this.getDept() + ". Зароботная плата сотрудника- " + this.getEmployeeSalary() + " рубля." + " ID: " + this.getId();
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Employee employee = (Employee) o;
        return dept == employee.dept && id == employee.id && Objects.equals(firstName, employee.firstName) && Objects.equals(surName, employee.surName) && Objects.equals(lastName, employee.lastName) && Objects.equals(fullName, employee.fullName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(firstName, surName, lastName, fullName, dept, id);
    }
}
