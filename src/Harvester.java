public class Harvester {

    public Harvester(){
        Engine engine = new Engine(560);
        CuttingUnit cuttingUnit = new CuttingUnit(9);
        Pipe pipe = new Pipe(6, false);
        Storage storage = new Storage(12000);
        Wheel wheel[] = new Wheel[4];
        for (int i= 0; i <  4; i++ ){
            if(i < 2) wheel[i] = new Wheel(3.2, true);
            else wheel[i] = new Wheel(1.0, false);
        }
    }
}
