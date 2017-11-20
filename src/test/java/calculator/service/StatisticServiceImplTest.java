package calculator.service;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class StatisticServiceImplTest {

    private StatisticsService statisticsService = new StatisticServiceImpl();

    @Test
    public void newAdditionTest() throws Exception {
        Assert.assertEquals(0, statisticsService.getAdditions());
        statisticsService.newAddition();
        statisticsService.newAddition();
        statisticsService.newAddition();
        Assert.assertEquals(3, statisticsService.getAdditions());
    }

    @Test
    public void newSubtractionTest() throws Exception {
        Assert.assertEquals(0, statisticsService.getSubtractions());
        statisticsService.newSubtraction();
        statisticsService.newSubtraction();
        statisticsService.newSubtraction();
        Assert.assertEquals(3, statisticsService.getSubtractions());
    }

    @Test
    public void newMultiplicationTest() throws Exception {
        Assert.assertEquals(0, statisticsService.getMultiplications());
        statisticsService.newMultiplication();
        statisticsService.newMultiplication();
        statisticsService.newMultiplication();
        Assert.assertEquals(3, statisticsService.getMultiplications());
    }

    @Test
    public void newDivisionTest() throws Exception {
        Assert.assertEquals(0, statisticsService.getDivisions());
        statisticsService.newDivision();
        statisticsService.newDivision();
        statisticsService.newDivision();
        Assert.assertEquals(3, statisticsService.getDivisions());
    }


}