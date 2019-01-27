package lsp.good.example2;

public class BoilerC extends Boiler {
    public BoilerC(Integer temperature, Integer desirableTemperature) {
        super(temperature, desirableTemperature);
    }

    public void heat() {
        this.setCurrentTemperature(this.getCurrentTemperature() + 3);
    }
}
