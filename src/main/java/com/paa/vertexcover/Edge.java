package com.paa.vertexcover;

public class Edge {
   private int EdgeId;
   private Node Node1;
   private Node Node2;
   public boolean Marked;
   
   public Edge(int edgeId, Node node1, Node node2){
       this.EdgeId = edgeId;
       this.Node1 = node1;
       this.Node2 = node2;
       this.Marked = false;
   }
}
