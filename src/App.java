public class App {

    public static void main(String[] args) {

        // Курсовая работа 1-го курса
        System.out.println("Курсовая работа 1-го курса");

        Employee[] EMPLOYEES = new Employee[10];
        EMPLOYEES[0] = new Employee("Иванов Иван Иванович", 1,26_000);
        EMPLOYEES[1] = new Employee("Алексеев Алексей Алексеевич", 4,41_000);
        EMPLOYEES[2] = new Employee("Владиславов Владислав Владиславович", 3,35_000);
        EMPLOYEES[3] = new Employee("Артемов Артем Артемович", 4,54_000);
        EMPLOYEES[4] = new Employee("Андреев Андрей Андреевич", 2,32_000);
        EmployeeBook employeeBook = new EmployeeBook(EMPLOYEES);

        System.out.println("_____________________________");
        // Базовая сложность
        System.out.println("Базовая сложность");

        employeeBook.getAllEmployees();
        System.out.println("Сумма затрат на зарплаты в месяц: " + employeeBook.countTotalSalary());
        System.out.println("Сотрудник с минимальной зарплатой: " + employeeBook.findMinSalaryEmployee());
        System.out.println("Сотрудник с максимальной зарплатой: " + employeeBook.findMaxSalaryEmployee());
        System.out.println("Среднее значение зарплат: " + employeeBook.countAverageSalary());
        employeeBook.getFullNameEmployees();

        System.out.println("_____________________________");
        // Повышенная сложность
        System.out.println("Повышенная сложность");

        employeeBook.indexSalary(10);
        employeeBook.getAllEmployees();
        System.out.println("Сотрудник с минимальной зарплатой в 4 отделе: = " + employeeBook.findMinSalaryEmployeeByDepartment(4));
        System.out.println("Сотрудник с минимальной зарплатой в 4 отделе: = " + employeeBook.findMaxSalaryEmployeeByDepartment(4));
        System.out.println("Сумма затрат на зарплаты в месяц в 4 отделе: " + employeeBook.countTotalSalaryByDepartment(4));
        System.out.println("Среднее значение зарплат в 4 отделе: " + employeeBook.countAverageSalaryByDepartment(4));
        employeeBook.indexSalaryByDepartment(10, 4);
        employeeBook.getAllEmployeesByDepartment(4);
        System.out.println("Сотрудники с зарплатой меньше чем 40000");
        employeeBook.findEmployeesWithSalaryLessThan(40_000);
        System.out.println("Сотрудники с зарплатой больше чем или равной 40000");
        employeeBook.findEmployeesWithSalaryMoreOrEven(40_000);

        System.out.println("_____________________________");
        // Очень сложно
        System.out.println("Очень сложно");

        employeeBook.addEmployee(new Employee("Васильев Василий Васильевич", 4, 38_000));
        employeeBook.deleteEmployee("Иванов Иван Иванович", 1);
        employeeBook.getAllEmployees();
        employeeBook.changeEmployeeSalary("Васильев Василий Васильевич", 39_000);
        employeeBook.changeEmployeeDepartment("Васильев Василий Васильевич", 1);
        employeeBook.getEmployeesFullNameByDepartment();

    }

}