import java.util.Comparator;
public class MyComparator implements Comparator<Position> {

    private Wheat wheatField[][];

    public MyComparator(Wheat wheatField[][]){
        this.wheatField = wheatField;
    }



    private Position findPosition(Wheat plant) {
        for(int x = 0; x < wheatField.length; x++){
            for(int y = 0; y < wheatField[x].length; y++){
                if(wheatField[x][y].equals(plant)) return new Position(x,y);
            }
        }
        return null;
    }

    @Override
    public int compare(Position p1, Position p2) {
        Wheat w1 = wheatField[p1.x][p1.y];
        Wheat w2 = wheatField[p2.x][p2.y];

        if(w1.getNumberOfGrains() != w2.getNumberOfGrains()) return w1.getNumberOfGrains()-w2.getNumberOfGrains();

        if(p1.x != p2.x) return p1.x - p2.x;
        if(p1.y != p2.y) return p1.y - p2.y;
        return 0;
    }
}
