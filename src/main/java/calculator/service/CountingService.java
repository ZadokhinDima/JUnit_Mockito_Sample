package calculator.service;

import calculator.domain.ComplexObject;

/**
 * Created by Dmytro_Zadokhin on 11/20/2017.
 */
public interface CountingService {
    ComplexObject add(ComplexObject param1, ComplexObject param2);
    ComplexObject subtract(ComplexObject param1, ComplexObject param2);
    ComplexObject multiply(ComplexObject param1, ComplexObject param2);
    ComplexObject divide(ComplexObject param1, ComplexObject param2);

}
