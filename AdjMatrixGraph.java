/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package graphimpl;

import java.util.LinkedList;

/**
 *
 * @author 
 */
public class AdjMatrixGraph implements Graph{
    
  private boolean[][] adjMatrix;
  private int vertices;
  private int edges;  
  private Vertex vertexList[];

  /**
   *  Constructs a graph with n vertices and no edges.
   */
  public AdjMatrixGraph(int n) {
    vertices = n;
    edges = 0;
    adjMatrix = new boolean[n][n];
    for (int i = 0; i < vertices; i++ ) {
      for (int j = 0; j < vertices; j++ ) {
	adjMatrix[i][j] = false;
      }
    }
  }
   /**
   *  Returns true if v is a valid vertex number; false otherwise.
   *  @param v the vertex.
   *  @return boolean indicating existence of vertex number v.
   */
  public boolean validVertex(int v) {
    return (v >= 0) && (v < vertices);
  }
  
  /**
   *  Returns true if edge (origin, destination) exists; false otherwise.
   *  @param point1 the origin vertex.
   *  @param point2 the destination vertex.
   *  @return boolean indicating the presence of edge (origin, destination).
   */
  public boolean hasEdge(int point1, int point2) {
    if (validVertex(point1) && validVertex(point2)) {
      return adjMatrix[point1][point2];
    } else {
      return false;
    }
  }
    /**
   *  Creates the edge (origin, destination).  If the edge did not already
   *    exists, increments the edge count.
   *  @param point1 the origin vertex.
   *  @param point2 the destination vertex.
   */
  public void addEdge(int point1, int point2) {
    if (validVertex(point1) && validVertex(point2)) {
      if (!adjMatrix[point1][point2]) {
	adjMatrix[point1][point2] = true;
        edges++;
      }
    }    
  }
  /**
   *  Deletes the edge (origin, destination).  If the edge existed, decrements
   *    the edge count.
   *  @param point1 the origin vertex.
   *  @param point2 the destination vertex.
   */
  public void removeEdge(int point1, int point2) {
    if (validVertex(point1) && validVertex(point2)) {
      if (adjMatrix[point1][point2]) {
	adjMatrix[point1][point2] = false;
	edges--;
      }
    }        
  }
   /**
   *  Returns a String representing the adjacency matrix, including the number
   *    of vertices and edges.
   *  @return a String representing the adjacency matrix.
   */
  public String toString() {
    int i, j;
    String s = vertices + " vertices and " + edges + " edges\n";
    for (i = 0; i < vertices; i++) {
      for (j = 0; j < vertices - 1; j++) {
	s = s + (adjMatrix[i][j] ? "t" : ".")  + " ";
      }
      s = s + (adjMatrix[i][j] ? "t" : ".")  + "\n";
    }
    return s;
  }

  public boolean addVertex(Vertex v) {
        boolean isAdd = false;
        int i = 0;
        do {
        	if (vertexList[i] == null) {
        		vertexList[i] = v;
        		isAdd = true;
        	}
        	i++;
        } while (i <= vertices && isAdd == false);
        return isAdd;
    }

    @Override
    public int ordre() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean estSimple() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean estComplet() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int[][] matrice() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean sontLies(Vertex a, Vertex b) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean connexe() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int distance(Vertex a, Vertex b) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int diametre() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean estEulerien() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean estSousGraphe(Graph a) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean estStable() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int addEdge(Edge e) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}