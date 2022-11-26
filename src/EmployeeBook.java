import java.util.Objects;

public class EmployeeBook {

    private final Employee[] EMPLOYEES;

    public EmployeeBook(Employee[] EMPLOYEES) {
        this.EMPLOYEES = EMPLOYEES;
    }

    public void getAllEmployees() {
        for (Employee employee : EMPLOYEES) {
            if (Objects.nonNull(employee)) {
                System.out.println(employee);
            }
        }
    }

    public double countTotalSalary() {
        double totalSalary = 0;
        for (Employee employee : EMPLOYEES) {
            if (Objects.nonNull(employee)) {
                totalSalary += employee.getSalary();
            }
        }
        return totalSalary;
    }

    public Employee findMinSalaryEmployee() {
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

    public Employee findMaxSalaryEmployee() {
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

    public double countAverageSalary() {
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

    public void getFullNameEmployees() {
        for (Employee employee : EMPLOYEES) {
            if (Objects.nonNull(employee)) {
                System.out.println(employee.getFullName());
            }
        }
    }

    public void indexSalary(int percent) {
        for (Employee employee : EMPLOYEES) {
            if (Objects.nonNull(employee)) {
                double currentSalary = employee.getSalary();
                employee.setSalary(currentSalary * (percent/100d+1));
            }
        }
    }

    public Employee findMinSalaryEmployeeByDepartment(int department) {
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

    public Employee findMaxSalaryEmployeeByDepartment(int department) {
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

    public double countTotalSalaryByDepartment(int department) {
        double totalSalary = 0;
        for (Employee employee : EMPLOYEES) {
            if (Objects.nonNull(employee) && employee.getDepartment() == department) {
                totalSalary += employee.getSalary();
            }
        }
        return totalSalary;
    }

    public double countAverageSalaryByDepartment(int department) {
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

    public void indexSalaryByDepartment(int percent, int department) {
        for (Employee employee : EMPLOYEES) {
            if (Objects.nonNull(employee) && employee.getDepartment() == department) {
                double currentSalary = employee.getSalary();
                employee.setSalary(currentSalary * (percent/100d+1));
            }
        }
    }

    public void getAllEmployeesByDepartment(int department) {
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

    public void findEmployeesWithSalaryLessThan(double salary) {
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

    public void findEmployeesWithSalaryMoreOrEven(double salary) {
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

