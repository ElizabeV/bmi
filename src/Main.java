public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService(); //создание объекта BmiService
        int weight = 98;
        double height = 1.87;
        int bmi = service.calculate(weight, height);
        //вызов метода calculate объект.метод с параметрами
        System.out.println(bmi);
    }
}
