public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();
        int mass = service.calculate(90, 2);
        System.out.println(mass);
    }
}