package bridge;

public abstract class Art {
    protected Artist artist;

    protected Art(Artist artist) {
        this.artist = artist;
    }
    public abstract void createArt();
}
