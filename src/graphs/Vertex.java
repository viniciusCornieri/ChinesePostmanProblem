package graphs;

public class Vertex implements Comparable<Vertex> {

    private final String key;
    private final int id;
    public boolean white;
    public String father;
    public int distance;
    public int heuristic;
    public int finish;

    public Vertex(String key) {
        this.key = key;
        this.id = -1;
    }

    public Vertex(String key, int id){
        this.key = key;
        this.id = id;
    }

    public int getId() {
        return id;
    }
    
    public String getKey() {
        return this.key;
    }

    @Override
    public int compareTo(Vertex anotherVertex) {
        if (this.distance <= anotherVertex.distance) {
            return -1;
        }
        return 1;
    }
}
