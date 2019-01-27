package lsp.bad.example2;

public class AutomaticTemperatureController implements TemperatureController {
    private Boiler boiler;

    public void setDevice(Boiler boiler) {
        this.boiler = boiler;
    }

    public Integer getWaterTemperature() {
        return boiler.getCurrentTemperature();
    }

    public void heatWater() {
        boiler.heat();
    }
}
