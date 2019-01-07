public class Drone {

    private Field outputField;

    public Drone(){
        outputField = new Field(10000);
    }

    public Field scan(Field fieldToBeScanned){

        for(int i =0; i < 10000; i++){
            for(int j =0; j< 10000; j++){
            int rnd = (int) Math.round(100 + Math.random() * 400);
            fieldToBeScanned.setWheatGrain(rnd, new Position(i, j));
            }
        }
        return outputField;

    }
}
