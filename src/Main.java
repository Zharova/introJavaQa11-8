public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();
        double bmi = service.calculate(50, 1.62);
        System.out.println(bmi);
    }
}
