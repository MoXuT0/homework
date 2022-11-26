import java.util.Objects;

public class App {

    public static final Employee[] EMPLOYEES = new Employee[10];

    public static void main(String[] args) {

        // Курсовая работа 1-го курса
        System.out.println("Курсовая работа 1-го курса");

        EMPLOYEES[0] = new Employee("Иванов Иван Иванович", 1,26_000);
        EMPLOYEES[1] = new Employee("Алексеев Алексей Алексеевич", 4,41_000);
        EMPLOYEES[2] = new Employee("Владиславов Владислав Владиславович", 3,35_000);
        EMPLOYEES[3] = new Employee("Артемов Артем Артемович", 4,54_000);
        EMPLOYEES[4] = new Employee("Андреев Андрей Андреевич", 2,32_000);

        // Базовая сложность
        System.out.println("Базовая сложность");
        getAllEmployees();
        System.out.println("Сумма затрат на зарплаты в месяц: " + countTotalSalary());
        System.out.println("Сотрудник с минимальной зарплатой: " + findMinSalaryEmployee());
        System.out.println("Сотрудник с максимальной зарплатой: " + findMaxSalaryEmployee());
        System.out.println("Среднее значение зарплат: " + countAverageSalary());
        getFullNameEmployees();

        // Повышенная сложность
        System.out.println("Повышенная сложность");
        indexSalary(10);
        getAllEmployees();
        System.out.println("Сотрудник с минимальной зарплатой в 4 отделе: = " + findMinSalaryEmployeeByDepartment(4));
        System.out.println("Сотрудник с минимальной зарплатой в 4 отделе: = " + findMaxSalaryEmployeeByDepartment(4));
        System.out.println("Сумма затрат на зарплаты в месяц в 4 отделе: " + countTotalSalaryByDepartment(4));
        System.out.println("Среднее значение зарплат в 4 отделе: " + countAverageSalaryByDepartment(4));
        indexSalaryByDepartment(10, 4);
        getAllEmployeesByDepartment(4);
        System.out.println("Сотрудники с зарплатой меньше чем 40000");
        findEmployeesWithSalaryLessThan(40_000);
        System.out.println("Сотрудники с зарплатой больше чем или равной 40000");
        findEmployeesWithSalaryMoreOrEven(40_000);

    }

    private static void getAllEmployees() {
        for (Employee employee : EMPLOYEES) {
            if (Objects.nonNull(employee)) {
                System.out.println(employee);
            }
        }
    }

    private static double countTotalSalary() {
        double totalSalary = 0;
        for (Employee employee : EMPLOYEES) {
            if (Objects.nonNull(employee)) {
                totalSalary += employee.getSalary();
            }
        }
        return totalSalary;
    }

    private static Employee findMinSalaryEmployee() {
        double minSalary = Double.MAX_VALUE;
        Employee minSalaryEmployee = null;
        for (Employee employee : EMPLOYEES) {
            if (Objects.nonNull(employee) && minSalary > employee.getSalary()) {
                minSalary = employee.getSalary();
                minSalaryEmployee = employee;
            }
        }
        return minSalaryEmployee;
    }

    private static Employee findMaxSalaryEmployee() {
        double maxSalary = Double.MIN_VALUE;
        Employee maxSalaryEmployee = null;
        for (Employee employee : EMPLOYEES) {
            if (Objects.nonNull(employee) && maxSalary < employee.getSalary()) {
                maxSalary = employee.getSalary();
                maxSalaryEmployee = employee;
            }
        }
        return maxSalaryEmployee;
    }

    private static double countAverageSalary() {
        int totalEmployees = 0;
        for (Employee employee : EMPLOYEES) {
            if (Objects.nonNull(employee)) {
                totalEmployees++;
            }
        }
        if (totalEmployees != 0) {
            return countTotalSalary() / totalEmployees;
        }
        return 0;
    }

    private static void getFullNameEmployees() {
        for (Employee employee : EMPLOYEES) {
            if (Objects.nonNull(employee)) {
                System.out.println(employee.getFullName());
            }
        }
    }

    private static void indexSalary(int percent) {
        for (Employee employee : EMPLOYEES) {
            if (Objects.nonNull(employee)) {
                double currentSalary = employee.getSalary();
                employee.setSalary(currentSalary * (percent/100d+1));
            }
        }
    }

    private static Employee findMinSalaryEmployeeByDepartment(int department) {
        double minSalary = Double.MAX_VALUE;
        Employee minSalaryEmployee = null;
        for (Employee employee : EMPLOYEES) {
            if (Objects.nonNull(employee) && minSalary > employee.getSalary() && employee.getDepartment() == department) {
                minSalary = employee.getSalary();
                minSalaryEmployee = employee;
            }
        }
        return minSalaryEmployee;
    }

    private static Employee findMaxSalaryEmployeeByDepartment(int department) {
        double maxSalary = Double.MIN_VALUE;
        Employee maxSalaryEmployee = null;
        for (Employee employee : EMPLOYEES) {
            if (Objects.nonNull(employee) && maxSalary < employee.getSalary() && employee.getDepartment() == department) {
                maxSalary = employee.getSalary();
                maxSalaryEmployee = employee;
            }
        }
        return maxSalaryEmployee;
    }

    private static double countTotalSalaryByDepartment(int department) {
        double totalSalary = 0;
        for (Employee employee : EMPLOYEES) {
            if (Objects.nonNull(employee) && employee.getDepartment() == department) {
                totalSalary += employee.getSalary();
            }
        }
        return totalSalary;
    }

    private static double countAverageSalaryByDepartment(int department) {
        int departmentSize = 0;
        for (Employee employee : EMPLOYEES) {
            if (Objects.nonNull(employee) && employee.getDepartment() == department) {
                departmentSize++;
            }
        }
        if (departmentSize != 0) {
            return countTotalSalaryByDepartment(department) / departmentSize;
        }
        return 0;
    }

    private static void indexSalaryByDepartment(int percent, int department) {
        for (Employee employee : EMPLOYEES) {
            if (Objects.nonNull(employee) && employee.getDepartment() == department) {
                double currentSalary = employee.getSalary();
                employee.setSalary(currentSalary * (percent/100d+1));
            }
        }
    }

    private static void getAllEmployeesByDepartment(int department) {
        for (Employee employee : EMPLOYEES) {
            if (Objects.nonNull(employee) && employee.getDepartment() == department) {
                System.out.println("Сотрудник {" +
                        "Номер = " + employee.getId() +
                        ", Ф.И.О. ='" + employee.getFullName() + '\'' +
                        ", зарплата = " + employee.getSalary() +
                        '}');
            }
        }
    }

    public static void findEmployeesWithSalaryLessThan(double salary) {
        for (Employee employee : EMPLOYEES) {
            if (Objects.nonNull(employee) && employee.getSalary() < salary) {
                System.out.println("Сотрудник {" +
                        "Номер = " + employee.getId() +
                        ", Ф.И.О. = '" + employee.getFullName() + '\'' +
                        ", зарплата = " + employee.getSalary() +
                        '}');
            }
        }
    }

    public static void findEmployeesWithSalaryMoreOrEven(double salary) {
        for (Employee employee : EMPLOYEES) {
            if (Objects.nonNull(employee) && employee.getSalary() >= salary) {
                System.out.println("Сотрудник {" +
                        "Номер = " + employee.getId() +
                        ", Ф.И.О. = '" + employee.getFullName() + '\'' +
                        ", зарплата = " + employee.getSalary() +
                        '}');
            }
        }
    }

}