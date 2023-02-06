package adapter;

public class RestApi {
    public static void main(String[] args) {
        Database database = new AdapterWebsiteToDatabase();

        database.create();
        database.read();
        database.update();
        database.delete();
    }
}
