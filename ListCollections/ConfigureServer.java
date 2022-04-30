package Lesson14;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

public class ConfigureServer {
    private static List<String> list = new ArrayList<>();
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        while (true) {
            System.out.println("Выберите опцию: " +
                    "\n1. Добавить задачу " +
                    "\n2. Показать все задачи " +
                    "\n3. Удалить задачу " +
                    "\n4. Выйти из системы");
            Scanner scanner = new Scanner(System.in);
            int task = scanner.nextInt();
            switch (task) {
                case 1:
                    addTask(list);
                    break;
                case 2:
                    showTask();
                    System.out.println();
                    break;
                case 3:
                    deleteTask();
                    break;
                case 4:
                    break;
                default:
                    System.out.println("Неправильно задана опция, попробуйте еще раз");
                    break;
            }
        }
    }

    public static void addTask(List<String> list) {
        while (true) {
            System.out.println("Введите название задачи (для завершение введите end)");
            Scanner scanner = new Scanner(System.in);
            String task = scanner.nextLine();
            if ("end".equalsIgnoreCase(task)) {
                System.out.println("Вы вышли из опции");
                break;
            } else {
                list.add(task);
            }
        }
    }

    private static void showTask() {
        System.out.println("Список задач:");
        for (int i = 0; i < list.size(); i++) {
            System.out.println(i + 1 + " " + list.get(i));
        }
    }

    public static void deleteTask() {
        System.out.println("Нажмите один из индексов, чтобы удалить задачу");
        int position = Integer.parseInt(scanner.nextLine());
        list.remove(position - 1);
    }
}