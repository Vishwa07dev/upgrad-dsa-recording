package codes.dsa.graphs.bfs;

public class Test {

    public static void main(String[] args) {

        Vertex v1 = new Vertex("A");
        Vertex v2 = new Vertex("B");
        Vertex v3 = new Vertex("C");
        Vertex v4 = new Vertex("D");
        Vertex v5 = new Vertex("E");
        Vertex v6 = new Vertex("F");
        Vertex v7 = new Vertex("G");

        v1.addNeighbour(v2);
        v1.addNeighbour(v3);
        v1.addNeighbour(v4);
        v1.addNeighbour(v5);
        v3.addNeighbour(v6);
        v6.addNeighbour(v7);

        BFSTraversal bfsTraversal = new BFSTraversal();

        bfsTraversal.bfsTraverse(v1);
    }
}
