import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.util.Comparator;
import java.util.Map;
import java.util.TreeMap;

public class BoardComputer {
    private TreeMap<Position, Wheat> sortedMap;
    final int fieldSize;


    public BoardComputer(Wheat wheatField[][], int fieldSize){
        this.fieldSize = fieldSize;
        Comparator c=new MyComparator(wheatField);
        sortedMap = new TreeMap<Position, Wheat>(c);

        for(int x = 0; x < wheatField.length; x++){
            for(int y = 0; y < wheatField[x].length; y++){
                sortedMap.put(new Position(x,y), wheatField[x][y]);
            }
        }

        safeField();
    }

    public boolean safeField(){
        String path = "field.txt";

        try {
            if(!(new File(path).exists())){
                new File(path).createNewFile();

            }

            FileWriter fr = new FileWriter(path);
            BufferedWriter br = new BufferedWriter(fr);
            int counter = 0;

            for (Map.Entry<Position, Wheat> entry : sortedMap.entrySet()) {
                br.write(entry.getValue().getNumberOfGrains() + " ");
                if(counter >= fieldSize -1){
                    br.write("\n");
                    counter = 0;
                }

            }

            br.close();

        }catch (Exception ex){
            System.out.println(ex);
            return false;
        }

        return true;
    }



}
