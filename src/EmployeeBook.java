import java.util.Random;

public class EmployeeBook {
    private final static String[] NAMES = {"Oleg", "Sasha", "Igor", "Alex", "Bob",};
    private final static String[] SURNAMES = {"Olegov", "Sashev", "Igorev", "Alexeev", "Bobov",};
    private final static String[] PATRNYMIC_NAMES = {"Olegovich", "Sashevich", "Igorevich", "Alexeevich", "Bobovich",};

    private final static Random RANDOM = new Random();

    private static int otdel;


    public final static Employee[] EMPLOYEES = new Employee[10];



    public static void initEmloyees() {
        for (int i = 0; i < EMPLOYEES.length; i++) {
            String fullName = SURNAMES[RANDOM.nextInt(0, SURNAMES.length)]
                    + " " + NAMES[RANDOM.nextInt(0, NAMES.length)]
                    + " " + PATRNYMIC_NAMES[RANDOM.nextInt(0, PATRNYMIC_NAMES.length)];
            EMPLOYEES[i] = new Employee(fullName, RANDOM.nextInt(1, 6), RANDOM.nextInt(10000, 100001));
        }

    }

    public static int sumZP(Employee[] EMPLOYEES) {
        int sum = 0;
        for (Employee item : EMPLOYEES) {
            sum += item.getSalary();

        }
        return sum;

    }

    public static double sumZPMid(Employee[] EMPLOYEES) {
        double weekMid = 0;

        weekMid = (double) sumZP(EMPLOYEES) / EMPLOYEES.length;
        return weekMid;

    }

    public static Employee searchMinZP(Employee[] EMPLOYEES) {
        Employee employeeMinZP = null;
        for (Employee num : EMPLOYEES) {
            if (employeeMinZP == null || num.getSalary() < employeeMinZP.getSalary()) {
                employeeMinZP = num;
            }

        }

        return employeeMinZP;

    }

    public static Employee searchMaxZP(Employee[] EMPLOYEES) {
        Employee employeeMaxZP = null;
        for (Employee num : EMPLOYEES) {
            if (employeeMaxZP == null || num.getSalary() > employeeMaxZP.getSalary()) {
                employeeMaxZP = num;
            }

        }
        return employeeMaxZP;
    }

    public static void returnInfo(Employee[] EMPLOYEES) {
        for (Employee item : EMPLOYEES) {
            System.out.println(item);

        }
    }

    public static void returnFullName(Employee[] EMPLOYEES) {
        for (Employee item : EMPLOYEES) {
            System.out.println(item.getFullName());

        }
    }

    public static void increaseByPercent(int Percent, Employee[] EMPLOYEES) {
        int present = 0;
        for (int i = 0; i < EMPLOYEES.length; i++) {

            present = EMPLOYEES[i].getSalary();

            EMPLOYEES[i].setSalary((EMPLOYEES[i].getSalary() + (present * Percent) / 100));
        }

    }


    public static int randomOtdel() {
        otdel = RANDOM.nextInt(1, 6);
        return otdel;
    }

    public static int checkIfThereIsADepartment() {
        int cout = 0;
        otdel = randomOtdel();

        for (int i = 0; i < EMPLOYEES.length; i++) {
            if (otdel == EMPLOYEES[i].getDepartment()) {
                cout++;
            }
        }
        if (cout == 0) {
            System.out.println("Нет совпадающих отделов");
        }
        return cout;
    }




    public static Employee[] EMPLOYEESNEW;


    public static void initEmloyeesnew() {

        int size = checkIfThereIsADepartment();
        int count = 0;
        EMPLOYEESNEW = new Employee[size];
        for (int i = 0; i < EMPLOYEES.length; i++) {
            if (otdel == EMPLOYEES[i].getDepartment()) {
                EMPLOYEESNEW[count] = new Employee(EMPLOYEES[i].getFullName(), otdel, EMPLOYEES[i].getSalary());
                count++;
            }

        }
        if (0 == EMPLOYEESNEW.length) {
            System.out.println("Нет совпадающих отделов");
        }


    }

    public static void toStringNoOtdel(Employee[] EMPLOYEES) {
        for (Employee item : EMPLOYEES) {
            System.out.println(
                    "id=" + item.getId() +
                            ", fullName='" + item.getFullName() +
                            ", Salary=" + item.getSalary());

        }
    }


    public static void searchLow(Employee[] EMPLOYEES, int num) {
        int worker = 0;
        for (Employee number : EMPLOYEES) {
            if (number.getSalary() < num) {
                System.out.println("Сотрудники с зарплатой ниже " + num +
                        " это id=" + number.getId() +
                        ", fullName='" + number.getFullName() +
                        ", ZP=" + number.getSalary());
                worker++;
            }
        }
        if (worker == 0) System.out.println("Нет сотрудников с зарплатой ниже " + num);


    }

    public static void searchUp(Employee[] EMPLOYEES, int num) {
        int worker = 0;
        for (Employee number : EMPLOYEES) {
            if (number.getSalary() >= num) {
                System.out.println("Сотрудники с зарплатой выше " + num +
                        " это id=" + number.getId() +
                        ", fullName='" + number.getFullName() +
                        ", ZP=" + number.getSalary());
                worker++;
            }
        }
        if (worker == 0) System.out.println("Нет сотрудников с зарплатой выше " + num);


    }

}
