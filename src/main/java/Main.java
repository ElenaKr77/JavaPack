import ru.netology.javaqa.javaqamvn.services.CalcService;

public class Main {
    public static void main(String[] args) {
        CalcService service = new CalcService();
        int expected = 3;
        int actual = service.calculate(10000, 3000, 20000);
        System.out.println(actual);

        expected = 2;
        actual = service.calculate(100000, 60000, 150000);
        System.out.println(actual);
    }
}