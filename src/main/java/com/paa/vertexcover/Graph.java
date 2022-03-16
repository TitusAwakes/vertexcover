package com.paa.vertexcover;

import java.util.LinkedList;
import java.util.Properties;

public class Graph {
    private int Size;
    public LinkedList<Integer> Nodes;
    public LinkedList<Node> NodeObjList;
    // public LinkedList<Edge> Edges;

    public Graph(){
        this.Size = 0;
        this.Nodes = new LinkedList<Integer>();
        // this.Edges = new LinkedList<Edge>();
        this.NodeObjList = new LinkedList<Node>();
    }

    public void AddNewNode(int newNode){
        Nodes.add(newNode);

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

       nodeObj1.Edges.add(nodeObj2);
       nodeObj2.Edges.add(nodeObj1);
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
