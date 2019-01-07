public class Storage {
    final int maxStorage;
    private int currentStorage = 0;

    public Storage(int maxStorage){
        this.maxStorage = maxStorage;
    }

    public void unloadStorage(){
        currentStorage = 0;
    }

    public void fillStorage(int volume){
        currentStorage += volume;
    }
}
