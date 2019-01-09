public class ElectronicEngine extends Engine {
    private int horsepower;
    private boolean running = false;

    public ElectronicEngine(int horsepower){
        this.horsepower = horsepower;
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
        return horsepower * 1.1;
    }

    @Override
    public int getHorsepower() {
        return horsepower;
    }
}
