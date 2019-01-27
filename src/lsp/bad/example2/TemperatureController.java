package lsp.bad.example2;

public interface TemperatureController {
    public void setDevice(Boiler boiler);

    public Integer getWaterTemperature();

    public void heatWater();
}
