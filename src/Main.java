
public class Main {

    public static void main(String[] args) {

//        Сгенерировал массив из 10
        EmployeeBook.initEmloyees();

//        Получить список всех сотрудников со всеми имеющимися по ним данными (вывести в консоль значения всех полей (toString));
        EmployeeBook.returnInfo(EmployeeBook.EMPLOYEES);

//        Посчитать сумму затрат на ЗП в месяц;
        System.out.println("Сумму затрат в месяц - " + EmployeeBook.sumZP(EmployeeBook.EMPLOYEES));

//        Найти сотрудника с минимальной ЗП;
        System.out.println("Сотрудника с минимальной ЗП - " + EmployeeBook.searchMinZP(EmployeeBook.EMPLOYEES));

//        Найти сотрудника с максимальной ЗП;
        System.out.println("Сотрудника с максимальной ЗП - " + EmployeeBook.searchMaxZP(EmployeeBook.EMPLOYEES));

//        Подсчитать среднее значение зарплат (можно использовать для этого метод из пункта b);
        System.out.println("Среднее значение зарплат - " + EmployeeBook.sumZPMid(EmployeeBook.EMPLOYEES));

//        Распечатать ФИО всех сотрудников (метод void).
        EmployeeBook.returnFullName(EmployeeBook.EMPLOYEES);

//        Проиндексировать зарплату (вызвать изменение зп у всех сотрудников на величину аргумента в %)
        EmployeeBook.increaseByPercent(20, EmployeeBook.EMPLOYEES);

//        Проверил изменения
        EmployeeBook.returnInfo(EmployeeBook.EMPLOYEES);

        System.out.println();
//        Объявил новый массив
        System.out.println("Новый");

//        Получить в качестве параметра номер отдела (1-5) и найти (всего 6 методов):
        EmployeeBook.checkIfThereIsADepartment();

//        Обнулил счетчик
        Employee.getIdNull(EmployeeBook.EMPLOYEES);

//        Сгенерировал новый массив состоящий только из сотрудников которые из одного отдела
        EmployeeBook.initEmloyeesnew();

//        Проверил создался ли верный массив
        EmployeeBook.returnInfo(EmployeeBook.EMPLOYEESNEW);

//        Посчитать сумму затрат на ЗП в месяц;
        System.out.println("Сумму затрат в месяц - " + EmployeeBook.sumZP(EmployeeBook.EMPLOYEESNEW));

//        Сотрудника с минимальной зп;
        System.out.println("Сотрудника с минимальной ЗП - " + EmployeeBook.searchMinZP(EmployeeBook.EMPLOYEESNEW));

//        Сотрудника с максимальной зп;
        System.out.println("Сотрудника с максимальной ЗП - " + EmployeeBook.searchMaxZP(EmployeeBook.EMPLOYEESNEW));

//        Среднюю зп по отделу (учесть, что количество людей в отделе отличается от employees.length);
        System.out.println("Среднее значение зарплат - " + EmployeeBook.sumZPMid(EmployeeBook.EMPLOYEESNEW));

//        Распечатать ФИО всех сотрудников (метод void).
        EmployeeBook.returnFullName(EmployeeBook.EMPLOYEESNEW);

//        Проиндексировать зарплату всех сотрудников отдела на процент, который приходит в качестве параметра;
        EmployeeBook.increaseByPercent(20, EmployeeBook.EMPLOYEESNEW);

//        Напечатать всех сотрудников отдела (все данные, кроме отдела).
        EmployeeBook.toStringNoOtdel(EmployeeBook.EMPLOYEESNEW);

//        Всех сотрудников с зп меньше числа (распечатать id, фио и зп в консоль);
        EmployeeBook.searchLow(EmployeeBook.EMPLOYEESNEW, 50000);

//        Всех сотрудников с зп больше (или равно) числа (распечатать id, фио и зп в консоль).
        EmployeeBook.searchUp(EmployeeBook.EMPLOYEESNEW, 50000);

    }
}