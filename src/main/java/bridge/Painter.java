package bridge;

public class Painter implements Artist {

    @Override
    public void inventArt() {
        System.out.println("The writer is painting a picture");
    }
}
