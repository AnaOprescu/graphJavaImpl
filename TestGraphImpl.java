/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package graphimpl;

/**
 *
 * @author ana.maria
 */
public class TestGraphImpl {
    public static void main(String[] args) {

   

    // Create an 11-vertex graph.
    System.out.println("Creating a graph with n given vertices");
    AdjMatrixGraph graph = new AdjMatrixGraph(3);
    graph.addEdge(0, 1);
    graph.addEdge(2, 0);
    graph.addEdge(1, 2);
    //.graph.removeEdge(0,1);
    
   System.out.println("\nThe result graph is :\n" + graph);
    
    }}
