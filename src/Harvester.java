public class Harvester {

    public Harvester(int horsePower, int cuttingUnitWidth, int pipeLenght, boolean pipeOpen, int maxStorage){
        Engine engine = new Engine( horsePower);
        CuttingUnit cuttingUnit = new CuttingUnit(cuttingUnitWidth);
        Pipe pipe = new Pipe(pipeLenght, pipeOpen);
        Storage storage = new Storage(maxStorage);
        Wheel wheel[] = new Wheel[4];
        for (int i= 0; i <  4; i++ ){
            if(i < 2) wheel[i] = new Wheel(3.2, true);
            else wheel[i] = new Wheel(1.0, false);
        }
    }
}
