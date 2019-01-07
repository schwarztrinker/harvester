public class Pipe {
    final int length;

    public Pipe(int length){
        this.length = length;
    }
    private boolean isopen;

    public Pipe(){
        this.isopen = isopen;
    }

    public void closePipe(){
        isopen = false;
    }

    public void openPipe(){
        isopen = true;
    }
    
}
