package lsp.bad.example2;

public class BoilerC extends Boiler {
    private Integer desirableTemperature = 0;

    public BoilerC(Integer temperature, Integer desirableTemperature) {
        super(temperature, desirableTemperature);
    }

    @Override
    public void setDesirableTemperature(Integer temp) {
        this.desirableTemperature = temp;
    }

    @Override
    public Integer getDesirableTemperature() {
        return this.desirableTemperature;
    }

    public void heat() {
        this.setCurrentTemperature(this.getCurrentTemperature() + 3);
    }
}
