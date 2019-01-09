public class FuelEngine extends Engine {

    private int horsepower;
    private double fuelConsumption;
    private boolean running;

    public FuelEngine(int horsepower, int fuelConsumption){
        this.horsepower = horsepower;
        this.fuelConsumption = fuelConsumption;
    }


    @Override
    public void startEngine() {
        running = true;
    }

    @Override
    public void stopEngine() {
        running = false;
    }

    @Override
    public double getEnergyConsumption() {
        return getEnergyConsumption();
    }

    @Override
    public int getHorsepower() {
        return horsepower;
    }
}
