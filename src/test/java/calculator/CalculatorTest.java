package calculator;

import calculator.domain.ComplexObject;
import calculator.domain.Service;
import calculator.service.CountingService;
import calculator.service.StatisticsService;
import calculator.service.ValidationService;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import static org.mockito.Mockito.*;

import org.mockito.runners.MockitoJUnitRunner;

/**
 * Created by Dmytro_Zadokhin on 11/20/2017.
 */
@RunWith(MockitoJUnitRunner.class)
public class CalculatorTest {

    @Mock
    private CountingService countingService;

    @Mock
    private StatisticsService statisticsService;

    @Mock
    private ValidationService validationService;

    @InjectMocks
    private Calculator calculator;

    @Test
    public void addTest(){
//        Given
        ComplexObject objectA = new ComplexObject(1, 4);
        ComplexObject objectB = new ComplexObject(2, 5);
        ComplexObject expected = new ComplexObject();
        when(countingService.add(objectA, objectB)).thenReturn(expected);

//        When
        ComplexObject result = calculator.add(objectA, objectB);

//        Then
        Assert.assertEquals(expected, result);
        verify(countingService, times(1))
                .add(objectA, objectB);
        verify(statisticsService, times(1)).newAddition();
        verify(validationService, times(1)).validate(objectA);
        verify(validationService, times(1)).validate(objectB);
    }

    @Test(expected = IllegalArgumentException.class)
    public void addDifferentServices(){
//        Given
        ComplexObject objectA = new ComplexObject(1, 4, Service.APPLE);
        ComplexObject objectB = new ComplexObject(2, 5, Service.SAMSUNG);
        ComplexObject expected = new ComplexObject();
        when(countingService.add(objectA, objectB)).thenReturn(expected);

//        When
        ComplexObject result = calculator.add(objectA, objectB);

//        Then
        verify(validationService, times(1)).validate(objectA);
        verify(validationService, times(1)).validate(objectB);
        verify(statisticsService, times(0)).newAddition();
    }

    @Test
    public void subtractTest(){
//        Given
        ComplexObject objectA = new ComplexObject(1, 4);
        ComplexObject objectB = new ComplexObject(2, 5);
        ComplexObject expected = new ComplexObject();
        when(countingService.subtract(objectA, objectB)).thenReturn(expected);

//        When
        ComplexObject result = calculator.subtract(objectA, objectB);

//        Then
        Assert.assertEquals(expected, result);
        verify(countingService, times(1))
                .subtract(objectA, objectB);
        verify(statisticsService, times(1)).newSubtraction();
        verify(validationService, times(1)).validate(objectA);
        verify(validationService, times(1)).validate(objectB);
    }

    @Test(expected = IllegalArgumentException.class)
    public void subtractDifferentServices(){
//        Given
        ComplexObject objectA = new ComplexObject(1, 4, Service.APPLE);
        ComplexObject objectB = new ComplexObject(2, 5, Service.SAMSUNG);
        ComplexObject expected = new ComplexObject();
        when(countingService.subtract(objectA, objectB)).thenReturn(expected);

//        When
        ComplexObject result = calculator.subtract(objectA, objectB);

//        Then
        verify(validationService, times(1)).validate(objectA);
        verify(validationService, times(1)).validate(objectB);
        verify(statisticsService, times(0)).newSubtraction();
    }

    @Test
    public void multiplyTest(){
//        Given
        ComplexObject objectA = new ComplexObject(1, 4);
        ComplexObject objectB = new ComplexObject(2, 5);
        ComplexObject expected = new ComplexObject();
        when(countingService.multiply(objectA, objectB)).thenReturn(expected);

//        When
        ComplexObject result = calculator.multiply(objectA, objectB);

//        Then
        Assert.assertEquals(expected, result);
        verify(countingService, times(1))
                .multiply(objectA, objectB);
        verify(statisticsService, times(1)).newMultiplication();
        verify(validationService, times(1)).validate(objectA);
        verify(validationService, times(1)).validate(objectB);
    }

    @Test(expected = IllegalArgumentException.class)
    public void multiplyDifferentServices(){
//        Given
        ComplexObject objectA = new ComplexObject(1, 4, Service.APPLE);
        ComplexObject objectB = new ComplexObject(2, 5, Service.SAMSUNG);
        ComplexObject expected = new ComplexObject();
        when(countingService.multiply(objectA, objectB)).thenReturn(expected);

//        When
        ComplexObject result = calculator.multiply(objectA, objectB);

//        Then
        verify(validationService, times(1)).validate(objectA);
        verify(validationService, times(1)).validate(objectB);
        verify(statisticsService, times(0)).newMultiplication();
    }

    @Test
    public void divideTest(){
//        Given
        ComplexObject objectA = new ComplexObject(1, 4);
        ComplexObject objectB = new ComplexObject(2, 5);
        ComplexObject expected = new ComplexObject();
        when(countingService.divide(objectA, objectB)).thenReturn(expected);

//        When
        ComplexObject result = calculator.divide(objectA, objectB);

//        Then
        Assert.assertEquals(expected, result);
        verify(countingService, times(1))
                .divide(objectA, objectB);
        verify(statisticsService, times(1)).newDivision();
        verify(validationService, times(1)).validate(objectA);
        verify(validationService, times(1)).validate(objectB);
    }

    @Test(expected = IllegalArgumentException.class)
    public void divideDifferentServices(){
//        Given
        ComplexObject objectA = new ComplexObject(1, 4, Service.APPLE);
        ComplexObject objectB = new ComplexObject(2, 5, Service.SAMSUNG);
        ComplexObject expected = new ComplexObject();
        when(countingService.divide(objectA, objectB)).thenReturn(expected);

//        When
        ComplexObject result = calculator.divide(objectA, objectB);

//        Then
        verify(validationService, times(1)).validate(objectA);
        verify(validationService, times(1)).validate(objectB);
        verify(statisticsService, times(0)).newDivision();
    }

}
