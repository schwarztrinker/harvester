public class Harvester {

    public Harvester(){
        Engine engine = new Engine();
        Pipe pipe = new Pipe();
        Storage storage = new Storage();
        Wheel wheel[] = new Wheel[4];
        for (int i= 0; i <  4; i++ ){
            wheel[i] = new Wheel();
        }
    }
}
