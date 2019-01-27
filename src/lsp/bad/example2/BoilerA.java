package lsp.bad.example2;

public class BoilerA extends Boiler {
    public BoilerA(Integer temperature, Integer desirableTemperature) {
        super(temperature, desirableTemperature);
    }

    public void heat() {
        this.setCurrentTemperature(this.getCurrentTemperature() + 1);
    }
}
