package com.paa.vertexcover;

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

        // Teste 1
        start = System.currentTimeMillis();
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
        for(Node node: vc.MinimumVertexCover(graph)){
            System.out.println(node.Id);
        }
        chart.addValueToDataset(System.currentTimeMillis() - start, "Grafo 1");

        // Teste 2
        start = System.currentTimeMillis();
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
        for(Node node: vc.MinimumVertexCover(graph)){
            System.out.println(node.Id);
        }
        chart.addValueToDataset(System.currentTimeMillis() - start, "Grafo 2");

        // Teste 3
        start = System.currentTimeMillis();
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
        for(Node node: vc.MinimumVertexCover(graph)){
            System.out.println(node.Id);
        }
        chart.addValueToDataset(System.currentTimeMillis() - start, "Grafo 3");

        /* Teste 4
        graph = new Graph();
        for (int i = 1; i <= 32; i++){
            graph.AddNewNode(i);
        }

        graph.AddNewEdge(1, 32);
        graph.AddNewEdge(1, 20);

        graph.AddNewEdge(20, 21);
        graph.AddNewEdge(20, 19);

        graph.AddNewEdge(19, 4);
        graph.AddNewEdge(19, 24);

        graph.AddNewEdge(24, 15);
        graph.AddNewEdge(15, 13);

        graph.AddNewEdge(15, 13);

        graph.AddNewEdge(13, 18);
        graph.AddNewEdge(13, 8);
        graph.AddNewEdge(13, 3);

        graph.AddNewEdge(8, 11);

        graph.AddNewEdge(11, 12);
        graph.AddNewEdge(11, 29);
        graph.AddNewEdge(11, 28);

        graph.AddNewEdge(3, 30);
        graph.AddNewEdge(3, 17);

        graph.AddNewEdge(30, 28);

        graph.AddNewEdge(17, 16);
        graph.AddNewEdge(16, 7);
        graph.AddNewEdge(7, 22);

        graph.AddNewEdge(21, 31);
        graph.AddNewEdge(31, 5);
        graph.AddNewEdge(5, 2);
        graph.AddNewEdge(31, 10);

        graph.AddNewEdge(10, 27);
        graph.AddNewEdge(27, 14);

        graph.AddNewEdge(27, 9);

        graph.AddNewEdge(9, 26);
        graph.AddNewEdge(26, 25);
        graph.AddNewEdge(25, 6);
        graph.AddNewEdge(6, 23);
        
        System.out.println("Teste 4: ");
        for(Node node: vc.MinimumVertexCover(graph)){
            System.out.println(node.Id);
        }
        */
    
        chart.pack( );              
        chart.setVisible( true ); 

    }
}
