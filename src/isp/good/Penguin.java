package isp.good;

public class Penguin implements SwimmingCreature, FeatheredCreature {
    private String currentLocation;
    private Integer numberOfFeathers;

    public Penguin(String currentLocation, Integer numberOfFeathers) {
        this.currentLocation = currentLocation;
        this.numberOfFeathers = numberOfFeathers;
    }

    public String getCurrentLocation() {
        return currentLocation;
    }

    public void setCurrentLocation(String currentLocation) {
        this.currentLocation = currentLocation;
    }

    public Integer getNumberOfFeathers() {
        return numberOfFeathers;
    }

    public void setNumberOfFeathers(Integer numberOfFeathers) {
        this.numberOfFeathers = numberOfFeathers;
    }

    public void molt() {
        this.numberOfFeathers -= 1;
    }

    public void swim() {
        this.currentLocation = "in the water";
    }
}
