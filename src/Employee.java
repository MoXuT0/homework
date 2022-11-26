public class Employee {

    private final String fullName;
    private int department;
    private double salary;
    private final int id;
    private static int idCounter = 1;

    public Employee(String fullName, int department, int salary) {
        this.fullName = fullName;
        this.department = department;
        this.salary = salary;
        id = idCounter++;
    }

    public String getFullName() {
        return fullName;
    }

    public int getDepartment() {
        return department;
    }

    public double getSalary() {
        return salary;
    }

    public int getId() {
        return id;
    }

    public static int getIdCounter() {
        return idCounter;
    }

    public void setDepartment(int department) {
        if (department < 1 || department > 5)
            throw new IllegalArgumentException("Отдел должен быть от 1 до 5");
        this.department = department;
    }

    public void setSalary(double salary) {
        if (salary < 0)
            throw new IllegalArgumentException("Зарплата не может быть отрицательной");
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Сотрудник {" +
                "Ф.И.О. = '" + fullName + '\'' +
                ", отдел = " + department +
                ", зарплата = " + salary +
                ", номер = " + id +
                '}';
    }

}
