package valerij.task1;

public class Main {
    public static void main(String[] args) {
        try {
            Employee emp = new Employee("Valerij", "Dyagovets", -600);

            System.out.println(emp);

        } catch (FieldLengthLimitException e) {
            System.out.println(e.getMessage());
        }
        catch (IncorrectSalaryException e)
        {
            System.out.println(e.getMessage());
        }

        try {
            Employee emp = new Employee("Valerijjjjjjjj", "Dyagovets", 600);

            System.out.println(emp);

        } catch (FieldLengthLimitException e) {
            System.out.println(e.getMessage());
        }
        catch (IncorrectSalaryException e)
        {
            System.out.println(e.getMessage());
        }

        try {
            Employee emp = new Employee("Valerij", "Dyagovets", 600);

            System.out.println(emp);

        } catch (FieldLengthLimitException e) {
            System.out.printf(e.getMessage());
        }
        catch (IncorrectSalaryException e)
        {
            System.out.println(e.getMessage());
        }
    }
}