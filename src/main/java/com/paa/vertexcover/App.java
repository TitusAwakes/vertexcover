package com.paa.vertexcover;

import java.util.LinkedList;
import java.util.List;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        long start;
        Chart chart = new Chart("Tempo de Execução", "");
        VCBruteForce vc = new VCBruteForce();

        // Teste 1 - 5 Nós
        Graph graph = new Graph();
        graph.AddNewNode(1);
        graph.AddNewNode(2);
        graph.AddNewNode(3);
        graph.AddNewNode(4);
        graph.AddNewNode(5);

        graph.AddNewEdge(1, 3);
        graph.AddNewEdge(3, 5);
        graph.AddNewEdge(2, 4);
        graph.AddNewEdge(3, 4);
        
        System.out.println("Teste 1: ");
        start = System.currentTimeMillis();
        List<Node> result = vc.MinimumVertexCover(graph);
        for(Node node: result){
            System.out.println(node.Id);
        }
        chart.addValueToDataset(System.currentTimeMillis() - start, "Grafo 1");

        // Teste 2 - 9 Nós
        graph = new Graph();
        graph.AddNewNode(1);
        graph.AddNewNode(2);
        graph.AddNewNode(3);
        graph.AddNewNode(4);
        graph.AddNewNode(5);
        graph.AddNewNode(6);
        graph.AddNewNode(7);
        graph.AddNewNode(8);
        graph.AddNewNode(9);

        graph.AddNewEdge(1, 2);
        graph.AddNewEdge(1, 4);
        graph.AddNewEdge(1, 3);
        graph.AddNewEdge(1, 9);
        graph.AddNewEdge(4, 8);
        graph.AddNewEdge(9, 6);
        graph.AddNewEdge(9, 5);
        graph.AddNewEdge(5, 7);
        
        System.out.println("Teste 2: ");
        start = System.currentTimeMillis();
        result = vc.MinimumVertexCover(graph);
        for(Node node: result){
            System.out.println(node.Id);
        }
        chart.addValueToDataset(System.currentTimeMillis() - start, "Grafo 2");

        // Teste 3 - 5 Nós
        graph = new Graph();
        graph.AddNewNode(0);
        graph.AddNewNode(1);
        graph.AddNewNode(2);
        graph.AddNewNode(3);
        graph.AddNewNode(4);

        graph.AddNewEdge(0, 3);
        graph.AddNewEdge(0, 2);
        graph.AddNewEdge(2, 4);
        graph.AddNewEdge(2, 3);
        graph.AddNewEdge(1, 2);
        graph.AddNewEdge(1, 4);
        
        System.out.println("Teste 3: ");
        start = System.currentTimeMillis();
        result = vc.MinimumVertexCover(graph);
        for(Node node: result){
            System.out.println(node.Id);
        }
        chart.addValueToDataset(System.currentTimeMillis() - start, "Grafo 3");
        
        // Teste 5.png - 6 Nós
        graph = new Graph();
        graph.AddNewNode(1);
        graph.AddNewNode(2);
        graph.AddNewNode(3);
        graph.AddNewNode(4);
        graph.AddNewNode(5);
        graph.AddNewNode(6);

        graph.AddNewEdge(1, 3);
        graph.AddNewEdge(3, 6);
        graph.AddNewEdge(6, 4);
        graph.AddNewEdge(4, 2);
        graph.AddNewEdge(2, 5);
        
        System.out.println("Teste 4: ");
        start = System.currentTimeMillis();
        result = vc.MinimumVertexCover(graph);
        for(Node node: result){
            System.out.println(node.Id);
        }
        chart.addValueToDataset(System.currentTimeMillis() - start, "Grafo 4");

        // Teste 7.png - 8 Nós
        graph = new Graph();
        graph.AddNewNode(1);
        graph.AddNewNode(2);
        graph.AddNewNode(3);
        graph.AddNewNode(4);
        graph.AddNewNode(5);
        graph.AddNewNode(6);
        graph.AddNewNode(7);
        graph.AddNewNode(8);

        graph.AddNewEdge(1, 2);
        graph.AddNewEdge(1, 4);
        graph.AddNewEdge(1, 3);
        graph.AddNewEdge(3, 8);
        graph.AddNewEdge(3, 7);
        graph.AddNewEdge(8, 6);
        graph.AddNewEdge(6, 5);
        
        System.out.println("Teste 5: ");
        start = System.currentTimeMillis();
        result = vc.MinimumVertexCover(graph);
        for(Node node: result){
            System.out.println(node.Id);
        }
        chart.addValueToDataset(System.currentTimeMillis() - start, "Grafo 5");

        // Teste 8.png - 9 Nós
        graph = new Graph();
        graph.AddNewNode(1);
        graph.AddNewNode(2);
        graph.AddNewNode(3);
        graph.AddNewNode(4);
        graph.AddNewNode(5);
        graph.AddNewNode(6);
        graph.AddNewNode(7);
        graph.AddNewNode(8);
        graph.AddNewNode(9);

        graph.AddNewEdge(1, 5);
        graph.AddNewEdge(5, 2);
        graph.AddNewEdge(2, 7);
        graph.AddNewEdge(5, 4);
        graph.AddNewEdge(4, 8);
        graph.AddNewEdge(8, 3);
        graph.AddNewEdge(3, 9);
        graph.AddNewEdge(3, 6);
        
        System.out.println("Teste 6: ");
        start = System.currentTimeMillis();
        result = vc.MinimumVertexCover(graph);
        for(Node node: result){
            System.out.println(node.Id);
        }
        chart.addValueToDataset(System.currentTimeMillis() - start, "Grafo 6");

        // Teste 9.png - 10 Nós
        graph = new Graph();
        graph.AddNewNode(1);
        graph.AddNewNode(2);
        graph.AddNewNode(3);
        graph.AddNewNode(4);
        graph.AddNewNode(5);
        graph.AddNewNode(6);
        graph.AddNewNode(7);
        graph.AddNewNode(8);
        graph.AddNewNode(9);
        graph.AddNewNode(10);

        graph.AddNewEdge(1, 2);
        graph.AddNewEdge(1, 4);
        graph.AddNewEdge(4, 5);
        graph.AddNewEdge(2, 7);
        graph.AddNewEdge(2, 8);
        graph.AddNewEdge(8, 9);
        graph.AddNewEdge(2, 5);
        graph.AddNewEdge(5, 10);
        graph.AddNewEdge(5, 6);
        graph.AddNewEdge(6, 3);
        
        System.out.println("Teste 6: ");
        start = System.currentTimeMillis();
        result = vc.MinimumVertexCover(graph);
        for(Node node: result){
            System.out.println(node.Id);
        }
        chart.addValueToDataset(System.currentTimeMillis() - start, "Grafo 6");

        // Teste 10.png - 11 Nós
        graph = new Graph();
        graph.AddNewNode(1);
        graph.AddNewNode(2);
        graph.AddNewNode(3);
        graph.AddNewNode(4);
        graph.AddNewNode(5);
        graph.AddNewNode(6);
        graph.AddNewNode(7);
        graph.AddNewNode(8);
        graph.AddNewNode(9);
        graph.AddNewNode(10);
        graph.AddNewNode(11);

        graph.AddNewEdge(1, 4);
        graph.AddNewEdge(1, 8);
        graph.AddNewEdge(1, 11);
        graph.AddNewEdge(11, 10);
        graph.AddNewEdge(11, 2);
        graph.AddNewEdge(11, 3);
        graph.AddNewEdge(11, 7);
        graph.AddNewEdge(7, 6);
        graph.AddNewEdge(4, 3);
        graph.AddNewEdge(3, 5);
        graph.AddNewEdge(3, 9);
        
        System.out.println("Teste 7: ");
        start = System.currentTimeMillis();
        result = vc.MinimumVertexCover(graph);
        for(Node node: result){
            System.out.println(node.Id);
        }
        chart.addValueToDataset(System.currentTimeMillis() - start, "Grafo 6");
    
        chart.pack( );              
        chart.setVisible( true );

    }
}
