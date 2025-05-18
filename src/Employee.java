
import java.util.Objects;

public class Employee {
    private static int idPlus = 1;
    private int id;
    private String fullName;
    private int otdel; // Отделы для простоты должны быть названы от 1 до 5.
    private int Salary;


    public Employee(String fullName, int otdel, int Salary) {
        id = idPlus++;
        this.fullName = fullName;
        this.otdel = otdel;
        this.Salary = Salary;

    }

    public static void getIdNull(Employee[] EMPLOYEES) {
        idPlus -= EMPLOYEES.length;

    }

    public int getId() {
        return id;
    }

    public String getFullName() {
        return fullName;
    }

    public int getOtdel() {
        return otdel;
    }

    public int getSalary() {
        return Salary;
    }


    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Employee employee = (Employee) o;
        return otdel == employee.otdel && Salary == employee.Salary && Objects.equals(fullName, employee.fullName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(fullName, otdel, Salary);
    }

    public void setOtdel(int otdel) {
        this.otdel = otdel;
    }

    public void setSalary(int Salary) {
        this.Salary = Salary;
    }


    @Override
    public String toString() {
        return "id=" + id +
                ", fullName='" + fullName + '\'' +
                ", otdel=" + otdel +
                ", ZP=" + Salary;
    }
}
