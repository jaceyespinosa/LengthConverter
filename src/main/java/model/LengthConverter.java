package model;


/*
 * PojoClass that stores the length and the conversion formulas
 */
public class LengthConverter {
    private double value;
    private double result;

    public LengthConverter() {
        super();
    }

    public LengthConverter(double value) {
        this.value = value;
    }

    public double getValue() {
        return value;
    }

    public void setValue(double value) {
        this.value = value;
    }

    public double getResult() {
        return result;
    }

    public void metersToCentimeters() {
        result = value * 100;
    }

    public void kilometersToMeters() {
        result = value * 1000;
    }
}