package boot.topics;

/**
 * Created by HeroDishonest on 16.04.2017.
 */
public class Topics {
    private String id;
    private String name;
    private String cost;

    public Topics() {
    }

    public Topics(String id, String name, String cost) {
        this.id = id;
        this.name = name;
        this.cost = cost;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCost() {
        return cost;
    }

    public void setCost(String cost) {
        this.cost = cost;
    }
}
