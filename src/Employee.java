
import java.util.Objects;

public class Employee {
    private static int idPlus = 1;
    private int id;
    private String fullName;
    private int department; // Отделы для простоты должны быть названы от 1 до 5.
    private int salary;


    public Employee(String fullName, int department, int salary) {
        id = idPlus++;
        this.fullName = fullName;
        this.department = department;
        this.salary = salary;

    }

    public static void zeroingId(Employee[] EMPLOYEES) {
        idPlus -= EMPLOYEES.length;

    }

    public int getId() {
        return id;
    }

    public String getFullName() {
        return fullName;
    }

    public int getDepartment() {
        return department;
    }

    public int getSalary() {
        return salary;
    }


    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Employee employee = (Employee) o;
        return department == employee.department && salary == employee.salary && Objects.equals(fullName, employee.fullName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(fullName, department, salary);
    }

    public void setDepartment(int department) {
        this.department = department;
    }

    public void setSalary(int Salary) {
        this.salary = Salary;
    }


    @Override
    public String toString() {
        return "id=" + id +
                ", fullName='" + fullName + '\'' +
                ", otdel=" + department +
                ", ZP=" + salary;
    }
}
