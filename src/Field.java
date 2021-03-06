public class Field {
    private Wheat acker[][];

    public Field(int size){
        acker = new Wheat[size][size];

        for(int x = 0; x < size; x++){
            for(int y = 0; y < size; y++){
                acker[x][y] = new Wheat();

            }
            System.out.println("created " + ((1+x)*size) + "plants");
        }
    }

    public void setWheatGrain(int grainHeight, Position position){
        acker[position.x][position.y].setNumberOfGrains(grainHeight);
    }

    public Wheat[][] getAcker() {
        return acker;
    }
}
