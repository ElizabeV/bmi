public class BmiService {
    public int calculate(int weightInKg, double heightInMeter) { //указываем возвращаемый тип
        double heightSqrt = Math.pow(heightInMeter, 2);
        double bmi;
        bmi = weightInKg / heightSqrt;
        return (int) bmi;
    }
}
