package valerij.task2;

public class Main {
    public static void main(String[] args) throws FieldLengthLimitException, IncorrectSalaryException, EmployeeInRegistryException {
        WorkersRegistry workers = WorkersRegistry.getRegistry();
        workers.printList();

        // список пустий

        Employee employee = new Employee("Valerij", 1500);
        workers.addWorker(employee);
        workers.printList();

        // додаємо співробітника

        Employee manager = new Manager("Anton", 1700, 500);
        workers.addWorker(manager);
        workers.printList();

        // додаємо другого співробітника

        workers.addWorker(manager);

        // перевіряємо EmployeeInRegistryException
    }
}