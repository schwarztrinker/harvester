import java.util.TreeMap;

public class BoardComputer {
    private TreeMap<Position, Wheat> sortedMap; //= new TreeMap<>();


    public BoardComputer(Wheat wheatField[][]){
        for(int x = 0; x < wheatField.length; x++){
            for(int y = 0; y < wheatField[x].length; y++){
                sortedMap.put(new Position(x,y), wheatField[x][y]);
            }
        }
    }

    public void getPlangt(Position position){
        System.out.println(sortedMap.get(position).numberOfGrains);

    }
}
