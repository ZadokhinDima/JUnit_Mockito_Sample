package calculator.service;

import calculator.domain.ComplexObject;
import org.junit.Assert;
import org.junit.Test;

/**
 * Created by Dmytro_Zadokhin on 11/20/2017.
 */
public class CountingServiceImplTest {

    private CountingService service = new CountingServiceImpl();

    @Test
    public void addTest(){
        //Given
        ComplexObject objectA = new ComplexObject(1, 2);
        ComplexObject objectB = new ComplexObject(3, 4);
        ComplexObject expected = new ComplexObject(4, 6);

        //When
        ComplexObject result = service.add(objectA, objectB);

        //Then
        Assert.assertEquals(expected, result);
    }

    @Test
    public void subtractTest(){
        //Given
        ComplexObject objectA = new ComplexObject(1, 2);
        ComplexObject objectB = new ComplexObject(3, 4);
        ComplexObject expected = new ComplexObject(-2, -2);

        //When
        ComplexObject result = service.subtract(objectA, objectB);

        //Then
        Assert.assertEquals(expected, result);
    }
    @Test
    public void multiplyTest(){
        //Given
        ComplexObject objectA = new ComplexObject(1, 2);
        ComplexObject objectB = new ComplexObject(3, 4);
        ComplexObject expected = new ComplexObject(3, 8);

        //When
        ComplexObject result = service.multiply(objectA, objectB);

        //Then
        Assert.assertEquals(expected, result);
    }
    @Test
    public void divideTest(){
        //Given
        ComplexObject objectA = new ComplexObject(10, 30);
        ComplexObject objectB = new ComplexObject(4, 8);
        ComplexObject expected = new ComplexObject(2, 3);

        //When
        ComplexObject result = service.divide(objectA, objectB);

        //Then
        Assert.assertEquals(expected, result);
    }

}
