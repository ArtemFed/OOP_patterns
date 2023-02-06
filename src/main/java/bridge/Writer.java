package bridge;

public class Writer implements Artist {

    @Override
    public void inventArt() {
        System.out.println("The writer is writing a poem");
    }
}
