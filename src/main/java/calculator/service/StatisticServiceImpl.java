package calculator.service;

public class StatisticServiceImpl implements StatisticsService {

    private int additions, subtractions, multiplications, divisions;

    public int newAddition() {
        return ++additions;
    }

    public int newSubtraction() {
        return ++subtractions;
    }

    public int newMultiplication() {
        return ++multiplications;
    }

    public int newDivision() {
        return ++divisions;
    }

}
