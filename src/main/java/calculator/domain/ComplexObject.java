package calculator.domain;

/**
 * Created by Dmytro_Zadokhin on 11/20/2017.
 */
public class ComplexObject {

    private int valueA, valueB;

    private Service service;

    public int getValueA() {
        return valueA;
    }

    public void setValueA(int valueA) {
        this.valueA = valueA;
    }

    public int getValueB() {
        return valueB;
    }

    public void setValueB(int valueB) {
        this.valueB = valueB;
    }

    public Service getService() {
        return service;
    }

    public void setService(Service service) {
        this.service = service;
    }

    public ComplexObject() {
    }

    public ComplexObject(int valueA, int valueB) {
        this.valueA = valueA;
        this.valueB = valueB;
    }

    public ComplexObject(int valueA, int valueB, Service service) {
        this.valueA = valueA;
        this.valueB = valueB;
        this.service = service;
    }


    @Override
    public String toString() {
        return "ComplexObject{" +
                "valueA=" + valueA +
                ", valueB=" + valueB +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        ComplexObject that = (ComplexObject) o;

        return valueA == that.valueA && valueB == that.valueB;

    }

    @Override
    public int hashCode() {
        int result = valueA;
        result = 31 * result + valueB;
        return result;
    }
}
