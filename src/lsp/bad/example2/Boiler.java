package lsp.bad.example2;

public abstract class Boiler {
    private Integer currentTemperature;
    private Integer desirableTemperature;

    public Boiler(Integer currentTemperature, Integer desirableTemperature) {
        this.currentTemperature = currentTemperature;
        this.desirableTemperature = desirableTemperature;
    }

    public void setDesirableTemperature(Integer temp) {
        this.desirableTemperature = temp;
    }

    public Integer getDesirableTemperature() {
        return this.desirableTemperature;
    }

    public Integer getCurrentTemperature() {
        return this.currentTemperature;
    }

    public void setCurrentTemperature(Integer currentTemperature) {
        this.currentTemperature = currentTemperature;
    }

    public abstract void heat();
}
