package com.paa.vertexcover;
import java.util.LinkedList;
import java.util.List;


public class VCDinamico {   

    public List<Node> MinimumVertexCover(Graph graph){
        
        //Marcando as arestas como não visitadas
        for (Edge e:graph.Edges){
            e.Marked=false;
        } 
        //Marcando os nós como não visitados
        for (Node node: graph.NodeObjList){
            node.Marked=false;
        }       

        // Lista com nós que oferecem a cobertura completa
        List<Node> results = new LinkedList<Node>();
        
        //Iterando por todos os nós do grafo
        for (Node node : graph.NodeObjList) {
            if(!node.Marked){
                for (Edge connectedEdge : node.Edges){
                    if(!connectedEdge.Marked){
                        node.Marked=true;
                        connectedEdge.Marked=true;
                                                
                    }
                }
            } 
            //adicionando os nós marcados na lista
            if(node.Marked){
                results.add(node);
            }
        }

        return results;

    }
}
