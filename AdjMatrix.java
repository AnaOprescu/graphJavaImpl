/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package implementationgraph;

import graph.DirectedEdge;
import graph.Edge;
import graph.Graph;
import graph.Vertex;
import java.util.Arrays;

/**
 *
 * @author ana.maria and erick
 */
public class AdjMatrix implements Graph{
    private int[][] adjacentMatrix;

	public AdjMatrix(int nbVertex)
	{
		adjacentMatrix = new int[nbVertex][nbVertex];
		for(int i = 0; i<nbVertex; i++)
		{
			for(int j = 0; j<nbVertex; j++)
			{
				adjacentMatrix[i][j] = 0;
			}
		}
	}
        
   /**
    * Returns true if this graph contains the specified vertex. 
    * @param vertex whose presence in this graph is to be tested
    * @return true if this graph contains the specified vertex
    */
      
        public boolean containsVertex(Vertex vertex)
	{
		return ((int) vertex.getObjet()) < adjacentMatrix.length;
	}
        
        
        /**
         * 
         * @param point1 source of the Vertex
         * @param point2 target of the vertex 
         * @return true if this graph contains the specified edge
         */
        public boolean hasEdge(Vertex point1, Vertex point2) {
          if (containsVertex(point1) && containsVertex(point2)) {
           return false;
         } else {
             return true;
         }
        }
    
       /**
        * 
        * @param point1 represents a vertex
        * @param point2 represents a vertex
        * @return the matrix with the new element
        */
  
        public int addEdge(Vertex point1, Vertex point2) {
            for(int i = 0; i<adjacentMatrix.length; i++){
	
		for(int j = 0; j<adjacentMatrix[i].length; j++){
		if ( !(containsVertex(point1)) && !(containsVertex(point2))) {
                   if( hasEdge(point1,point2 )) {
                    adjacentMatrix= Arrays.copyOf(adjacentMatrix, adjacentMatrix.length +1);    
                           } 
                }
		}
            }
      return adjacentMatrix[(int)point1.getObjet()][(int)point2.getObjet()];
         }   
        
        /**
         * 
         * @param v the vertex to be add
         * @return the new array
         */
        
      public int[][] addVertex(Vertex v){
          int[][] newMatrix= new int[adjacentMatrix[0].length+1][adjacentMatrix[0].length+1];
          for (int i=0 ; i< adjacentMatrix[i].length; i++){
              for (int j=0; j<adjacentMatrix[i].length; j++){
                  newMatrix[i][j]=adjacentMatrix[i][j];
              }
          }
             for(int i = 0; i<newMatrix[0].length; i++)
		{
			newMatrix[adjacentMatrix.length][i] = 0;
			newMatrix[i][adjacentMatrix.length] = 0;
		}
		adjacentMatrix = adjacentMatrix;
	    return adjacentMatrix;
	}
      
      /**
       * Removes the specified edge from the graph
       * @param point1 the origin of the vertex
       * @param point2 the target of the vertex
       * return the new array
       */
     public void removeEdge(Vertex point1, Vertex point2) {
    if (containsVertex(point1) && containsVertex(point2)) {
      if ( ! hasEdge(point1,point2)) {
	
	adjacentMatrix= Arrays.copyOf(adjacentMatrix, adjacentMatrix.length -1);
      }
    }
     }
     public int[][] getAdjacencyMatrix(){
		return this.adjacentMatrix;
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
}
        

    