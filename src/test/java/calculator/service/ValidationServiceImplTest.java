package calculator.service;

import calculator.domain.ComplexObject;
import calculator.domain.Service;
import org.junit.Test;

import static org.junit.Assert.*;

public class ValidationServiceImplTest {

    private ValidationService validationService = new ValidationServiceImpl();



    @Test(expected = IllegalArgumentException.class)
    public void validationNullTest(){
        ComplexObject object = null;
        validationService.validate(object);
    }

    @Test
    public void validationAppleTest(){
//        Given
        ComplexObject object = new ComplexObject(4, -6, Service.APPLE);

//        When
        validationService.validate(object);
    }

    @Test
    public void validationSamsungTest(){
        ComplexObject object = new ComplexObject(4, 6, Service.SAMSUNG);
        validationService.validate(object);
        object = new ComplexObject(1, 1, Service.SAMSUNG);
        validationService.validate(object);
    }

    @Test(expected = IllegalArgumentException.class)
    public void validationWrongSamsungTest(){
        ComplexObject object = new ComplexObject(-1000, 6, Service.SAMSUNG);
        validationService.validate(object);
    }
    @Test(expected = IllegalArgumentException.class)
    public void validationZeroSamsungTest(){
        ComplexObject object = new ComplexObject(0, 6, Service.SAMSUNG);
        validationService.validate(object);
    }

    @Test
    public void validationXiaomiTest(){
        ComplexObject object = new ComplexObject(0, -5, Service.XIAOMI);
        validationService.validate(object);
        object = new ComplexObject(-100, -5, Service.XIAOMI);
        validationService.validate(object);
        object = new ComplexObject(50, -5, Service.XIAOMI);
        validationService.validate(object);
    }

    @Test(expected = IllegalArgumentException.class)
    public void validationXiaomiSmallATest(){
        ComplexObject object = new ComplexObject(-101, -10, Service.XIAOMI);
        validationService.validate(object);
    }

    @Test(expected = IllegalArgumentException.class)
    public void validationXiaomiBigATest(){
        ComplexObject object = new ComplexObject(51, -10, Service.XIAOMI);
        validationService.validate(object);
    }

    @Test(expected = IllegalArgumentException.class)
    public void validationXiaomiBigBTest(){
        ComplexObject object = new ComplexObject(0, 0, Service.XIAOMI);
        validationService.validate(object);
    }





}