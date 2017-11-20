package calculator.service;

import calculator.domain.ComplexObject;

/**
 * Created by Dmytro_Zadokhin on 11/20/2017.
 */
public class ReverseCountingServiceImpl implements CountingService{

    public ComplexObject add(ComplexObject param1, ComplexObject param2) {
        ComplexObject result = new ComplexObject();
        result.setValueA(param1.getValueA() + param2.getValueB());
        result.setValueB(param1.getValueB() + param2.getValueA());
        return result;
    }

    public ComplexObject subtract(ComplexObject param1, ComplexObject param2) {
        ComplexObject result = new ComplexObject();
        result.setValueA(param1.getValueA() - param2.getValueB());
        result.setValueB(param1.getValueB() - param2.getValueA());
        return result;
    }

    public ComplexObject multiply(ComplexObject param1, ComplexObject param2) {
        ComplexObject result = new ComplexObject();
        result.setValueA(param1.getValueA() * param2.getValueB());
        result.setValueB(param1.getValueB() * param2.getValueA());
        return result;
    }

    public ComplexObject divide(ComplexObject param1, ComplexObject param2) {
        ComplexObject result = new ComplexObject();
        result.setValueA(param1.getValueA() / param2.getValueB());
        result.setValueB(param1.getValueB() / param2.getValueA());
        return result;
    }
}
