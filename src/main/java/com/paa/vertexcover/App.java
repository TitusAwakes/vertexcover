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
        VCDinamico vc = new VCDinamico();
       
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
        chart.addValueToDataset(System.currentTimeMillis() - start, "5 Vértices");

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
        chart.addValueToDataset(System.currentTimeMillis() - start, "9 Vértices");

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
        chart.addValueToDataset(System.currentTimeMillis() - start, "5 Vértices");
        
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
        chart.addValueToDataset(System.currentTimeMillis() - start, "6 Vértices");

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
        chart.addValueToDataset(System.currentTimeMillis() - start, "8 Vértices");

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
        chart.addValueToDataset(System.currentTimeMillis() - start, "9 Vértices");

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
        chart.addValueToDataset(System.currentTimeMillis() - start, "10 Vértices");

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
        chart.addValueToDataset(System.currentTimeMillis() - start, "11 Vértices");

        // Teste 11.png - 12 Nós
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
        graph.AddNewNode(12);

        graph.AddNewEdge(1, 2);
        graph.AddNewEdge(1, 5);
        graph.AddNewEdge(1, 11);
        graph.AddNewEdge(1, 10);
        graph.AddNewEdge(5, 7);
        graph.AddNewEdge(8, 9);
        graph.AddNewEdge(8, 4);
        graph.AddNewEdge(11, 4);
        graph.AddNewEdge(11, 12);
        graph.AddNewEdge(10, 3);
        graph.AddNewEdge(10, 9);
        graph.AddNewEdge(3, 9);
        graph.AddNewEdge(9, 6);
        
        System.out.println("Teste 8: ");
        start = System.currentTimeMillis();
        result = vc.MinimumVertexCover(graph);
        for(Node node: result){
            System.out.println(node.Id);
        }
        chart.addValueToDataset(System.currentTimeMillis() - start, "12 Vértices");

        // Teste 12.png - 13 Nós
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
        graph.AddNewNode(12);
        graph.AddNewNode(13);

        graph.AddNewEdge(1, 4);
        graph.AddNewEdge(1, 5);
        graph.AddNewEdge(1, 13);
        graph.AddNewEdge(9, 3);
        graph.AddNewEdge(9, 4);
        graph.AddNewEdge(9, 10);
        graph.AddNewEdge(4, 8);
        graph.AddNewEdge(7, 2);
        graph.AddNewEdge(13, 7);
        graph.AddNewEdge(13, 12);
        graph.AddNewEdge(12, 11);
        graph.AddNewEdge(2, 6);
        graph.AddNewEdge(2, 9);
        
        System.out.println("Teste 9: ");
        start = System.currentTimeMillis();
        result = vc.MinimumVertexCover(graph);
        for(Node node: result){
            System.out.println(node.Id);
        }
        chart.addValueToDataset(System.currentTimeMillis() - start, "13 Vértices");

        
        // Teste 13.png - 14 Nós
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
        graph.AddNewNode(12);
        graph.AddNewNode(13);
        graph.AddNewNode(14);

        graph.AddNewEdge(1, 14);
        graph.AddNewEdge(1, 10);
        graph.AddNewEdge(10, 11);
        graph.AddNewEdge(10, 2);
        graph.AddNewEdge(2, 3);
        graph.AddNewEdge(2, 5);
        graph.AddNewEdge(2, 7);
        graph.AddNewEdge(5, 6);
        graph.AddNewEdge(14, 6);
        graph.AddNewEdge(5, 7);
        graph.AddNewEdge(7, 8);
        graph.AddNewEdge(6, 9);
        graph.AddNewEdge(12, 9);
        graph.AddNewEdge(3, 4);
        graph.AddNewEdge(3, 13);
        graph.AddNewEdge(3, 12);
        
        System.out.println("Teste 10: ");
        start = System.currentTimeMillis();
        result = vc.MinimumVertexCover(graph);
        for(Node node: result){
            System.out.println(node.Id);
        }
        chart.addValueToDataset(System.currentTimeMillis() - start, "14 Vértices");

        // Teste 14.png - 15 Nós
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
        graph.AddNewNode(12);
        graph.AddNewNode(13);
        graph.AddNewNode(14);
        graph.AddNewNode(15);

        graph.AddNewEdge(1, 2);
        graph.AddNewEdge(1, 10);
        graph.AddNewEdge(10, 4);
        graph.AddNewEdge(2, 3);
        graph.AddNewEdge(5, 13);
        graph.AddNewEdge(13, 15);
        graph.AddNewEdge(15, 9);
        graph.AddNewEdge(9, 8);
        graph.AddNewEdge(9, 14);
        graph.AddNewEdge(9, 4);
        graph.AddNewEdge(4, 6);
        graph.AddNewEdge(6, 11);
        graph.AddNewEdge(14, 7);
        graph.AddNewEdge(12, 13);
        graph.AddNewEdge(3, 5);
        graph.AddNewEdge(4, 5);
        graph.AddNewEdge(7, 12);
        graph.AddNewEdge(4, 14);
        graph.AddNewEdge(4, 12);

        
        System.out.println("Teste 11: ");
        start = System.currentTimeMillis();
        result = vc.MinimumVertexCover(graph);
        for(Node node: result){
            System.out.println(node.Id);
        }
        chart.addValueToDataset(System.currentTimeMillis() - start, "15 Vértices");
    
        chart.pack( );              
        chart.setVisible( true );

    }
}
