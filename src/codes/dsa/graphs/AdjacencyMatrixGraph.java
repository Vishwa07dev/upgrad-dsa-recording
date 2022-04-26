package codes.dsa.graphs;

public class AdjacencyMatrixGraph {

    private boolean[][] adjMatrix;
    private int vertexCount;

    /**
     *  adjMatrix[i][j] - > true
     *                       false - No edge between i to j
     * @param vertexCount
     */
    public AdjacencyMatrixGraph(int vertexCount) {
        this.vertexCount = vertexCount;
        adjMatrix = new boolean[vertexCount][vertexCount];
    }


    public void addEdge(int i, int j) { // TC : O(1)
        //validate the arguments
        if (i >= 0 && i < vertexCount && j >= 0 && j < vertexCount) {
            this.adjMatrix[i][j] = true;  // i has an edge towards j

        }

    }


    public void removeEdge(int i, int j) { // TC : O(1)
        if (i >= 0 && i < vertexCount && j >= 0 && j < vertexCount) {
            this.adjMatrix[i][j] = false;
        }
    }


    public boolean isEdge(int i, int j) { // TC = O(1)
        if (i < 0 || i >= vertexCount || j < 0 || j > vertexCount) {
            return false;
        }
        return adjMatrix[i][j];
    }


    public void getAllEdges() { // TC : O(n2)
        for (int i = 0; i < vertexCount; i++) {
            for (int j = 0; j < vertexCount; j++) {
                if (adjMatrix[i][j]) {
                    System.out.println("Edge between vertex : " + i + " and " + j);
                }
            }
        }
    }


}
