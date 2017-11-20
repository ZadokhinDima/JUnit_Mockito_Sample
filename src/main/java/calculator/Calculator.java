package calculator;

import calculator.domain.ComplexObject;
import calculator.domain.Service;
import calculator.service.CountingService;
import calculator.service.StatisticsService;
import calculator.service.ValidationService;

import java.util.Map;

/**
 * Created by Dmytro_Zadokhin on 11/20/2017.
 */
public class Calculator {

    private CountingService countingService;
    private ValidationService validationService;
    private StatisticsService statisticsService;


    public void setCountingService(CountingService countingService) {
        this.countingService = countingService;
    }

    public void setValidationService(ValidationService validationService) {
        this.validationService = validationService;
    }

    public void setStatisticsService(StatisticsService statisticsService) {
        this.statisticsService = statisticsService;
    }

    public ComplexObject add(ComplexObject param1, ComplexObject param2) {
        validate(param1, param2);
        return countingService.add(param1, param2);
    }

    public ComplexObject subtract(ComplexObject param1, ComplexObject param2) {
        validate(param1, param2);
        return countingService.subtract(param1, param2);
    }

    public ComplexObject multiply(ComplexObject param1, ComplexObject param2) {
        validate(param1, param2);
        return countingService.multiply(param1, param2);
    }

    public ComplexObject divide(ComplexObject param1, ComplexObject param2) {
        validate(param1, param2);
        return countingService.divide(param1, param2);
    }

    private void validate(ComplexObject param1, ComplexObject param2) {
        validationService.validate(param1);
        validationService.validate(param2);
        if (param1.getService() != param2.getService()) {
            throw new IllegalArgumentException("Services do not match!!!!");
        }
    }
}
