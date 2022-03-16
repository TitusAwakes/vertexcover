package com.paa.vertexcover;

public class Edge {
   private int EdgeId;
   private int Node1;
   private int Node2;
   
   public Edge(int edgeId, int node1, int node2){
       this.EdgeId = edgeId;
       this.Node1 = node1;
       this.Node2 = node2;
   }
}
