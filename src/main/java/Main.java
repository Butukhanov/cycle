import ru.netology.sqr.SQRService;

public class Main {
    public static void main(String[] args) {
        SQRService service = new SQRService();
        int res = service.squreCount(200, 300);
        System.giout.println(res);
    }
}
