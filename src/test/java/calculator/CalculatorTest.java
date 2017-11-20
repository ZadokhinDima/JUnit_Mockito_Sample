package calculator;

import calculator.domain.ComplexObject;
import calculator.service.CountingService;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import static org.mockito.Mockito.*;

import org.mockito.Mockito;
import org.mockito.runners.MockitoJUnitRunner;

/**
 * Created by Dmytro_Zadokhin on 11/20/2017.
 */
@RunWith(MockitoJUnitRunner.class)
public class CalculatorTest {

    @Mock
    private CountingService countingService;
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
        Mockito.verify(countingService, times(1))
                .add(objectA, objectB);
    }

}
