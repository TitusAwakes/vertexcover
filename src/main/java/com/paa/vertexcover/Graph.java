package com.paa.vertexcover;

import java.util.LinkedList;


public class Graph {
    public LinkedList<Node> NodeObjList;
    public LinkedList<Edge> Edges;

    public Graph(){
        // this.Nodes = new LinkedList<Integer>();
        this.Edges = new LinkedList<Edge>();
        this.NodeObjList = new LinkedList<Node>();
    }

    public void AddNewNode(int newNode){
        Node newNodeObj = new Node(newNode);
        NodeObjList.add(newNodeObj);
    }

    public void AddNewEdge(int node1, int node2){
       Node nodeObj1 = new Node(-1);
       Node nodeObj2 = new Node(-1);
       for(Node n: this.NodeObjList){
          if (n.Id == node1){
              nodeObj1 = n;
          }
          if (n.Id == node2){
              nodeObj2 = n;
          }
       }

       Edge newEdge = new Edge(this.Edges.size() ,nodeObj1, nodeObj2);
       this.Edges.add(newEdge);

       nodeObj1.Edges.add(newEdge);
       nodeObj2.Edges.add(newEdge);
    }

    public int size(){
        return NodeObjList.size();
    }
}

class UndefinedNodeException extends Exception{
    String message;
    UndefinedNodeException(String str){
        message = str;
    }

    public String toString(){
        return ("Couldn't find node : " + message + " in this graph.");
    }
}
