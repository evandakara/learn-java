package excercise;

public class Train {
    private int id;
    private String carriageName;
    private int totalPassenger;

    public Train(){};

    public Train(int id, String carriageName, int totalPassenger) {
        this.id = id;
        this.carriageName = carriageName;
        this.totalPassenger = totalPassenger;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCarriageName() {
        return carriageName;
    }

    public void setCarriageName(String carriageName) {
        this.carriageName = carriageName;
    }

    public int getTotalPassenger() {
        return totalPassenger;
    }

    public void setTotalPassenger(int totalPassenger) {
        this.totalPassenger = totalPassenger;
    }
}
