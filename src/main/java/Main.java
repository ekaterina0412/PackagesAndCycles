import ru.netology.services.RestServices;

public class Main {

    public static void main(String[] args) {
        RestServices service = new RestServices();
        int income = 10000;
        int expenses = 3000;
        int threshold = 20000;

        int actual = service.calculate(income, expenses, threshold);

        System.out.println(actual + " месяца отдыха");
    }
}
