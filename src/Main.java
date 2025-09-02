public class Main {
    public static void main(String[] args) {
        // Создаём объект сервиса
        BmiService bmiService = new BmiService();

        // Пример расчёта для проверки
        double weight = 98.0;  // вес в кг
        double height = 1.87;  // рост в метрах

        // Вызываем метод расчёта
        int bmi = bmiService.calculate(weight, height);

        // Выводим результат
        System.out.println("Индекс массы тела: " + bmi);
    }
}
