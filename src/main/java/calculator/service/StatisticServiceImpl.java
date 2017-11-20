package calculator.service;

public class StatisticServiceImpl implements StatisticsService {

    private int additions, subtractions, multiplications, divisions;

    public void newAddition() {
        additions++;
    }

    public void newSubtraction() {
        subtractions++;
    }

    public void newMultiplication() {
        multiplications++;
    }

    public void newDivision() {
        divisions++;
    }

    public int getAdditions() {
        return additions;
    }

    public int getSubtractions() {
        return subtractions;
    }

    public int getMultiplications() {
        return multiplications;
    }

    public int getDivisions() {
        return divisions;
    }

    public void printStatistics() {
        System.out.println("Additions: " + additions);
        System.out.println("Subtractions: " + subtractions);
        System.out.println("Multiplications: " + multiplications);
        System.out.println("Divisions: " + divisions);
    }
}
