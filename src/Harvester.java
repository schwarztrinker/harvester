public class Harvester {
    Engine engine;
    CuttingUnit cuttingUnit;
    Pipe pipe;
    Storage storage;
    Wheel wheel[];

    BoardComputer boardComputer;

    public Harvester(int horsePower, int cuttingUnitWidth, int pipeLenght, boolean pipeOpen, int maxStorage){
        engine = new Engine( horsePower);
        cuttingUnit = new CuttingUnit(cuttingUnitWidth);
        pipe = new Pipe(pipeLenght, pipeOpen);
        storage = new Storage(maxStorage);
        wheel= new Wheel[4];
        for (int i= 0; i <  4; i++ ){
            if(i < 2) wheel[i] = new Wheel(3.2, true);
            else wheel[i] = new Wheel(1.0, false);
        }


        boardComputer = new BoardComputer(new Drone().scan);


    }
}
