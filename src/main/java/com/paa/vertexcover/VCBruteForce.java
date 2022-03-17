package com.paa.vertexcover;

import java.util.LinkedList;
import java.util.List;

import org.paukov.combinatorics3.Generator;

public class VCBruteForce {
   
    static List<List<Node>> CombinationsGenerator(LinkedList<Node> nodeList){
            List<List<Node>> combinations = new LinkedList<List<Node>>();

            Generator.subset(nodeList).simple().stream().forEach(combinations::add);

            return combinations;
    }

    static void ClearMarkedFlags(Graph graph){
        // Itera sobre todos os nós do grafo, os marcando como ainda não visitados
        for (Edge e: graph.Edges){
            e.Marked = false;
        }
    }

    List<Node> MinimumVertexCover(Graph graph){

            // Lista com todos os sets de nós que cobrem o grafo
            List<List<Node>> results = new LinkedList<List<Node>>();

            // Uma vez com os nós marcados, pega-se todas as combinações possíveis de nós no grafo
            List<List<Node>> combinations = CombinationsGenerator(graph.NodeObjList);

            // Limpa todas as flags antes de iniciar
            ClearMarkedFlags(graph);

            // Itera sobre todas as combinações.  
            for (List<Node> combination: combinations){
                for (Node node : combination){
                    // Itera pela lista de arestas daquele nó específico e as marca
                    for (Edge connectedEdge : node.Edges){
                            connectedEdge.Marked = true; // Marca o nó
                        }
                    } 
                boolean solution = true;
                // Ao fim de testar uma combinação, checar se ela cobre todas as arestas, que se caracteriza em checar se todos elas estão marcadas
                for(Edge edge : graph.Edges){
                // Se existe pelo menos uma aresta que não está marcada, sabemos que aquela não é uma solução   
                        if (!edge.Marked){
                            solution = false;
                            break;
                        }
                }
                
                if (solution){
                    results.add(combination);
                }
    
                // Ao fim de todo teste de combinação, limpa as flags de visitado em cada nó
                ClearMarkedFlags(graph);
            }
            
        List<Node> temp;
            for(int i = 0; i < results.size(); i++){
                for(int j = i + 1; j < results.size(); j++){
                    if (results.get(i).size() >  results.get(j).size()){
                        temp = results.get(i);
                        results.set(i, results.get(j));
                        results.set(j, temp);
                    }
                }
              }

        return results.get(0);
    }
}
