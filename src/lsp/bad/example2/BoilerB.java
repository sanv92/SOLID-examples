package lsp.bad.example2;

public class BoilerB extends Boiler {
    public BoilerB(Integer temperature, Integer desirableTemperature) {
        super(temperature, desirableTemperature);
    }

    public void heat() {
        this.setCurrentTemperature(this.getCurrentTemperature() + 2);
    }
}
