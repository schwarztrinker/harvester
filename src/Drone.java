public class Drone {

    private Field outputField;
    private final int fieldSize;

    public Drone(int fieldSize){
        this.fieldSize = fieldSize;
        outputField = new Field(fieldSize);
    }

    public Field scan(){

        for(int i = 0; i < fieldSize; i++){
            for(int j = 0; j < fieldSize; j++){
            int rnd = (int) Math.round(100 + Math.random() * 400);
                outputField.setWheatGrain(rnd, new Position(i, j));
            }
        }

        return outputField;

    }
}
