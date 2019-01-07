public class Main {

    private static Field wheatField;

    public static void main(String[] args) {

        //New Harvester
        Harvester harvester = new Harvester(650,  9, 10, false, 6500);

        wheatField = new Field(10000);

        System.out.println("finished");
    }
}
