public class Pipe {
    final int length;
    private boolean isOpen;

    public Pipe(int length, boolean isOpen){
        this.length = length;
        this.isOpen = isOpen;
    }
    private boolean isopen;

    public void closePipe(){
        isopen = false;
    }

    public void openPipe(){
        isopen = true;
    }
    
}
