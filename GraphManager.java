package com.avanseus.test;

import java.util.LinkedList;

/**
 * Created by madan on 25/7/18
 */
public class GraphManager {
    static class Graph {
        int V;
        LinkedList<Integer> adjListArray[];

        public Graph(int V) {
            this.V = V;
            adjListArray = new LinkedList[V];

            for (int i=0;i<V;i++){
                adjListArray[i] = new LinkedList<>();
            }
        }

    }


    public static void addEdge(Graph graph, int src, int dest){
        graph.adjListArray[src].addFirst(dest);
        graph.adjListArray[dest].addFirst(src);
    }

    public static void printGraph(Graph graph){
            for (int v =0 ;v <graph.V;v++){
                /*for (int i =0;i<graph.adjListArray.length;i++){
                    System.out.println(graph.adjListArray[i]);
                }*/
                for (Integer value : graph.adjListArray[v]){
                    System.out.print(" ->"+value);
                }
                System.out.println();
            }
    }

    public static void main(String[] args) {
        /*GraphManager graphManager = new GraphManager();
        int V =5;
        Graph graph = new Graph(V);
        addEdge(graph, 0, 1);
        addEdge(graph, 0, 4);
        addEdge(graph, 1, 2);
        addEdge(graph, 1, 3);
        addEdge(graph, 1, 4);
        addEdge(graph, 2, 3);
        addEdge(graph, 3, 4);
        printGraph(graph);*/
        System.out.println(5%6);
    }
}
