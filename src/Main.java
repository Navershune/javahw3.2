public class Main {
    public static void main(String[] args) {
        BmiService bmiService = new BmiService();
        double weight = 98; // в килограммах
        double height = 1.87; // в метрах
        int bmi = bmiService.calculate(weight, height);
        System.out.println("BMI индекс: " + bmi);
    }
}