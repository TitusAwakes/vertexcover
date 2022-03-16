package com.paa.vertexcover;

import java.util.LinkedList;

// Utilizada no algoritmo de Vertex Cover
public class Node {

    public Node(int nodeId){
        this.Id = nodeId;
    }

    LinkedList<Node> Edges = new LinkedList<Node>();

    public int Id;
    public boolean marked = false;
}
