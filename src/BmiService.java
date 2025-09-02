public class BmiService {
    // Метод для расчёта индекса массы тела
    public int calculate(double weightKg, double heightM) {
        // Рассчитываем индекс
        double bmi = weightKg / (heightM * heightM);
        // Приводим к целому числу
        return (int) bmi;
    }
}
