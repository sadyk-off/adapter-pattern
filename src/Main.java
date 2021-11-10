import adapter.TemperatureInfo;
import adapter.concrete.TemperatureReporter;

public class Main {

    public static void main(String[] args) {

        System.out.println("class adapter test");
        TemperatureInfo tempInfo = new TemperatureReporter();
        testTempInfo(tempInfo);

    }

    public static void testTempInfo(TemperatureInfo tempInfo) {
        tempInfo.setTemperatureInCelsius(0);
        System.out.println("temp in C:" + tempInfo.getTemperatureInCelsius());
        System.out.println("temp in F:" + tempInfo.getTemperatureInFahrenheit());

        tempInfo.setTemperatureInFahrenheit(85);
        System.out.println("temp in C:" + tempInfo.getTemperatureInCelsius());
        System.out.println("temp in F:" + tempInfo.getTemperatureInFahrenheit());
    }
}
