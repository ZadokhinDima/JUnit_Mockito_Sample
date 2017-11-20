package calculator.service;

public interface StatisticsService {

    void newAddition();

    void newSubtraction();

    void newMultiplication();

    void newDivision();

    int getAdditions();

    int getSubtractions();

    int getMultiplications();

    int getDivisions();

    void printStatistics();

}
