import planner.*;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.Scanner;

public class App {

    public static void main(String[] args) {

        TaskList taskList = new TaskList();

        try (Scanner scanner = new Scanner(System.in)) {
            label:
            while (true) {
                printMenu();
                System.out.print("Выберите пункт меню: ");
                if (scanner.hasNextInt()) {
                    int menu = scanner.nextInt();
                    switch (menu) {
                        case 1:
                            inputTask(scanner, taskList);
                            break;
                        case 2:
                            deleteTask(scanner, taskList);
                            break;
                        case 3:
                            printTasksByDate(scanner, taskList);
                            break;
                        case 0:
                            break label;
                    }
                } else {
                    scanner.next();
                    System.out.println("Выберите пункт меню из списка!");
                }
            }
        }
    }

    private static void inputTask(Scanner scanner, TaskList taskList) {
        System.out.print("Введите название задачи: ");
        String title = scanner.next();
        scanner.nextLine();
        System.out.print("Введите описание задачи: ");
        String description = scanner.next();
        scanner.nextLine();
        System.out.println("Введите тип задачи: ");
        for (TaskType taskType : TaskType.values()) {
            System.out.println(taskType.ordinal() + ", " + taskType.getName());
        }
        String taskType = scanner.next();
        int taskNumber = Integer.parseInt(taskType);
        TaskType type = TaskType.values()[taskNumber];
        scanner.nextLine();
        System.out.println("Введите дату и время в формате ГГГГ-ММ-ДД ЧЧ:ММ : ");
        LocalDate dateTask = LocalDate.parse(scanner.next());
        LocalTime timeTask = LocalTime.parse(scanner.next());
        LocalDateTime dateTime = LocalDateTime.of(dateTask, timeTask);
        scanner.nextLine();
        System.out.println("Выберите тип повторяемости: ");
        for (Repeatability repeatable : Repeatability.values()) {
            System.out.println(repeatable.ordinal() + ", " + repeatable.getName());
        }
        String repeat = scanner.nextLine();
        int repeatNumber = Integer.parseInt(repeat);
        Repeatability repeatability = Repeatability.values()[repeatNumber];
        Task task = new Task(title, description, type, dateTime, repeatability);
        taskList.addTask(task);
        System.out.println("Задача успешно добавлена!");
    }

    public static void deleteTask(Scanner scanner, TaskList taskList){
        System.out.println(taskList.toString());
        System.out.print("Введите ID задачи, которую хотите удалить: ");
        int taskId = Integer.parseInt(scanner.next());
        taskList.removeTask(taskId);
        System.out.println("Задача успешно удалена!");
    }

    public static void printTasksByDate(Scanner scanner, TaskList taskList){
        System.out.print("Введите дату в формате ГГГГ-ММ-ДД на которую получить задачи: ");
        LocalDate taskDate = LocalDate.parse(scanner.next());
        System.out.println("Задачи на " + taskDate + ":\n" + taskList.getTasksForDate(taskDate).toString());
    }

    private static void printMenu() {
        System.out.println("1. Добавить задачу\n2. Удалить задачу\n3. Показать задачи на указанный день\n" + "0. Выход");
    }
}