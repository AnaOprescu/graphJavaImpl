/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package implementationgraph;

import graph.UndirectedEdge;
import graph.Vertex;

/**
 *
 * @author ana.maria and erick
 */
public class TestImpl {
 
    public static void main(String[] args) {
    /**
     * create a graph with a given n numbers of vertices
     */
    System.out.println("Creating a graph with n given vertices");
    AdjMatrix graph = new AdjMatrix(3);
    double v1Coord[] = {0.1, 0.0};
    double v2Coord[] = {1.0, 1.2};
    double v3Coord[] = {2.0, 2.1};
    Vertex v1= new Vertex(0);
    Vertex v2= new Vertex(1);
    Vertex v3= new Vertex(2);
    
    UndirectedEdge edge1 = new UndirectedEdge(v1, v2);
    UndirectedEdge edge2 = new UndirectedEdge(v2, v3);
    graph.addEdge(v1, v2);
    graph.addEdge(v3, v1);
    graph.addEdge(v2, v3);
    
    System.out.println("Adding Edge e1 ( v1, v2 ) was successfully done  :  " + graph.addEdge(v1, v2));
    System.out.println("Adding Edge e2 ( v2, v3 ) was successfully done  :  " + graph.addEdge(v2, v3));
    
    //int[][] adjacentMatrix=adjacentMatrix.getAdjacencyMatrix();
    System.out.println("\nThe graph has\n" + graph);
  
   
   
   
    }}
    

