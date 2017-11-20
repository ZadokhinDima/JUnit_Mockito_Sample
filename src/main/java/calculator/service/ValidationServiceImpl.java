package calculator.service;

import calculator.domain.ComplexObject;
import calculator.domain.Service;

/**
 * Created by Dmytro_Zadokhin on 11/20/2017.
 */
public class ValidationServiceImpl implements ValidationService {

    public void validate(ComplexObject object) {
        if (object == null) throw new IllegalArgumentException("Null parameter!!!!");

        if(object.getService() == Service.SAMSUNG){
            if(object.getValueA() <= 0 || object.getValueB() <= 0) {
                throw new IllegalArgumentException("For Samsung object values should be positive.");
            }
        }

        if(object.getService() == Service.XIAOMI){
            if(object.getValueA() < -100 || object.getValueA() > 50 || object.getValueB() >= 0){
                throw  new IllegalArgumentException("For Xiaomi object value A should be in [-100; 50] and valueB should be negative");
            }
        }

    }
}
