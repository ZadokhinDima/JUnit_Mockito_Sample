package calculator.service;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class StatisticServiceImplTest {

    private StatisticsService statisticsService = new StatisticServiceImpl();

    @Test
    public void newAdditionTest() throws Exception {
       assertEquals(1, statisticsService.newAddition());
       assertEquals(2, statisticsService.newAddition());
       assertEquals(3, statisticsService.newAddition());
       assertEquals(4, statisticsService.newAddition());
    }

    @Test
    public void newSubtractionTest() throws Exception {
       assertEquals(1, statisticsService.newSubtraction());
       assertEquals(2, statisticsService.newSubtraction());
       assertEquals(3, statisticsService.newSubtraction());
       assertEquals(4, statisticsService.newSubtraction());
       assertEquals(5, statisticsService.newSubtraction());
    }

    @Test
    public void newMultiplicationTest() throws Exception {
        assertEquals(1, statisticsService.newMultiplication());
        assertEquals(2, statisticsService.newMultiplication());
        assertEquals(3, statisticsService.newMultiplication());
        assertEquals(4, statisticsService.newMultiplication());
    }

    @Test
    public void newDivisionTest() throws Exception {
       assertEquals(1, statisticsService.newDivision());
       assertEquals(2, statisticsService.newDivision());
       assertEquals(3, statisticsService.newDivision());
       assertEquals(4, statisticsService.newDivision());
       assertEquals(5, statisticsService.newDivision());
    }


}