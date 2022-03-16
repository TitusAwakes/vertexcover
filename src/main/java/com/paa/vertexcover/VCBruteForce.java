package com.paa.vertexcover;

import java.util.LinkedList;
import java.util.List;

import org.paukov.combinatorics3.Generator;

public class VCBruteForce {
   
    static List<List<Integer>> CombinationsGenerator(LinkedList<Integer> nodeList){
            List<List<Integer>> combinations = new LinkedList<List<Integer>>();

            Generator.subset(nodeList).simple().stream().forEach(combinations::add);

            return combinations;
    }

    static void ClearMarkedFlags(Graph graph){
        // Itera sobre todos os nós do grafo, os marcando como ainda não visitados
        for (Node n: graph.NodeObjList){
            n.marked = false;
        }
    }

    List<Integer> MinimumVertexCover(Graph graph){

            // Lista com todos os sets de nós que cobrem o grafo
            List<List<Integer>> results = new LinkedList<List<Integer>>();

            // Uma vez com os nós marcados, pega-se todas as combinações possíveis de nós no grafo
            List<List<Integer>> combinations = CombinationsGenerator(graph.Nodes);

            // Limpa todas as flags antes de iniciar
            ClearMarkedFlags(graph);

            // Itera sobre todas as combinações.  
            for (List<Integer> combination: combinations){
            for (int nodeInt : combination){
                // Procura o objeto node a qual aquele nó (inteiro) está associado
                    for (Node node : graph.NodeObjList){
                        if (nodeInt == node.Id){
                            // Marca o nó atual como visitado e também as arestas
                            node.marked = true;

                            for (Node connectedNode : node.Edges){
                                connectedNode.marked = true; // Marca o nó
                            }
                        }
                    } 
            }
            boolean solution = true;
            // Ao fim de testar uma combinação, checar se ela cobre todo o vértice, que se caracteriza em checar se todos os nós estão marcados
            for(Node node : graph.NodeObjList){
            // Se existe pelo menos um nó que não está marcado, sabemos que aquela não é uma solução   
                    if (!node.marked){
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
        List<Integer> temp;
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
