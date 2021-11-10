package adapter.concrete;

import adaptee.CelsiusReporter;
import adapter.TemperatureInfo;

public class TemperatureReporter implements TemperatureInfo {

    CelsiusReporter celsiusReporter;

    public TemperatureReporter() {
        celsiusReporter = new CelsiusReporter();
    }

    @Override
    public double getTemperatureInCelsius() {
        return celsiusReporter.getTemperature();
    }

    @Override
    public double getTemperatureInFahrenheit() {
        return celsiusToFahrenheit(celsiusReporter.getTemperature());
    }

    @Override
    public void setTemperatureInCelsius(double temperatureInC) {
        celsiusReporter.setTemperature(temperatureInC);
    }

    @Override
    public void setTemperatureInFahrenheit(double temperatureInF) {
        celsiusReporter.setTemperature(fahrenheitToCelsius(temperatureInF));
    }

    private double fahrenheitToCelsius(double f) {
        return ((f - 32) * 5 / 9);
    }

    private double celsiusToFahrenheit(double c) {
        return ((c * 9 / 5) + 32);
    }

}
