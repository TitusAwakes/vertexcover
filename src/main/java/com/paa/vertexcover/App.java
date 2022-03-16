package com.paa.vertexcover;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        Graph graph = new Graph();
        graph.AddNewNode(1);
        graph.AddNewNode(2);
        graph.AddNewNode(3);
        graph.AddNewNode(4);

        graph.AddNewEdge(1, 4);
        graph.AddNewEdge(2, 3);

        VCBruteForce vc = new VCBruteForce();
        
        for(Integer node: vc.MinimumVertexCover(graph)){
            System.out.println(node.toString());
        }
    }
}
