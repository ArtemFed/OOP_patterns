package bridge;

public class ArtExhibition extends Art {
    protected ArtExhibition(Artist artist){
        super(artist);
    }

    @Override
    public void createArt() {
        System.out.println("Art Exhibition preparation is underway");
        artist.inventArt();
    }
}
