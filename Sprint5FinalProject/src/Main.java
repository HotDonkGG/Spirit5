import model.Epic;
import model.SubTask;
import model.Task;
import model.TaskStatus;
import service.InMemoryHistoryManager;
import service.InMemoryTaskManager;
import service.TaskManager;
import utility.UtilityManagers;

public class Main {
    public static void main(String[] args) {
        TaskManager taskManager = UtilityManagers.getManager();



        Task task10 = new Task("Задача спринт 5", "тестовое задание", TaskStatus.NEW);
        Task task11 = new Task("Задача 2 спринт 5", "тестовое задание 2", TaskStatus.NEW);
        SubTask subTask10 = new SubTask("Подзадача 1 спринт 5", "сделать что-то 1",TaskStatus.NEW);
        SubTask subTask11 = new SubTask("Подзадача 2 спринт 5", "сделать что-то 2",TaskStatus.NEW);
        SubTask subTask12 = new SubTask("Подзадача 3 спринт 5", "сделать что-то 3",TaskStatus.NEW);

        Epic epic1 = taskManager.addEpic(new Epic("Эпик1", "Описание эпика1"));
        Epic epic2 = taskManager.addEpic(new Epic("Эпик2", "Описание эпика2"));
        epic1.getSubTaskList().add(subTask12);
        epic1.getSubTaskList().add(subTask11);
        epic1.getSubTaskList().add(subTask10);
        System.out.println(task10);
        System.out.println(epic1);
//        System.out.println(taskManager.getAllEpic());
//
//        System.out.println(subTask11);
//        System.out.println(subTask12);
//        System.out.println(subTask11);
//
//        System.out.println();


    }
}