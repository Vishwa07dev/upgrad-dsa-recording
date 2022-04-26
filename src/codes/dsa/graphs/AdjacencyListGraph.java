package codes.dsa.graphs;

public class AdjacencyListGraph {

    private Vertex[] vertices ;

    private int vertexCount ;

    public AdjacencyListGraph(int vertexCount){
        this.vertexCount = vertexCount;
        vertices = new Vertex[vertexCount];
    }

    /**
     * This method will add vertex2 as the neighbour of vertex1 -- it's directed graph
     * @param vertex1
     * @param vertex2
     *
     * TC : O(1)
     */

    public void addNeighbour(Vertex vertex1 , Vertex vertex2){
        if(vertex1!=null && vertex2!=null){
            vertex1.addNeighbour(vertex2);
            //vertex2.addNeighbour(vertex1);  -- this step will be needed in the case of undirected graph
        }
    }

    /**
     * This method will be used to print all the edges of the graph
     *
     * TC= O(V + E)
     */
    public void printAllEdges(){
        for(Vertex v : vertices){
            v.showNeighbours();
        }
    }

    public Vertex[] getVertices() {
        return vertices;
    }

    public void setVertices(Vertex[] vertices) {
        this.vertices = vertices;
    }

    public int getVertexCount() {
        return vertexCount;
    }

    public void setVertexCount(int vertexCount) {
        this.vertexCount = vertexCount;
    }
}

