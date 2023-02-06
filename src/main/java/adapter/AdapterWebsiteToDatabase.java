package adapter;

public class AdapterWebsiteToDatabase extends Website implements Database {

    @Override
    public void create() {
        createData();
    }

    @Override
    public void read() {
        readData();
    }

    @Override
    public void update() {
        updateData();
    }

    @Override
    public void delete() {
        deleteData();
    }
}
