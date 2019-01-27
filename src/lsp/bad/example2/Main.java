package lsp.bad.example2;

public class Main {
    public static void main(String[] args) {
        TemperatureController controller1 = new ManualTemperatureController();
        BoilerA boilerA = new BoilerA(0, 37);
        controller1.setDevice(boilerA);
        controller1.heatWater();

        System.out.println("Desirable Temperature: " + boilerA.getDesirableTemperature());
        System.out.println("Temperature: " + controller1.getWaterTemperature());
        System.out.println("------------------------");

        TemperatureController controller2 = new ManualTemperatureController();
        BoilerB boilerB = new BoilerB(5, 40);
        controller2.setDevice(boilerB);
        controller2.heatWater();

        System.out.println("Desirable Temperature: " + boilerB.getDesirableTemperature());
        System.out.println("Temperature: " + controller2.getWaterTemperature());
        System.out.println("------------------------");

        /**
         * Violating Liskov Substitution Principle (Desirable Temperature is 0-zero, boiler will not heat water).
         *
         * @description:
         * If you don't follow the LSP, external processes will either break, behave improperly, or need to know too much information.
         */
        TemperatureController controller3 = new AutomaticTemperatureController();
        BoilerC boilerC = new BoilerC(3, 39);
        controller3.setDevice(boilerC);
        System.out.println("Desirable Temperature: " + boilerC.getDesirableTemperature());
        System.out.println("Temperature: " + controller3.getWaterTemperature());
    }
}
