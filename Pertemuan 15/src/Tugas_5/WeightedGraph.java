/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tugas_5;

/**
 *
 * @author ROG STRIX
 */
public class WeightedGraph {
    int vertex;
    LinkedLists list[];
    
    public WeightedGraph(int vertex) {
        this.vertex = vertex;
        list = new LinkedLists[vertex];
        for (int i = 0; i < vertex; i++) {
            list[i] = new LinkedLists();
        }
    }
    
    public void addEdge(int source, int destination, int weight) {
        //add edge
        list[source].addFirst(destination, weight);
        
        //add back edge (for undirected)
        list[destination].addFirst(source, weight);
    }
    
    public void degree(int source) throws Exception{
        //degree undirected graph
        System.out.println("degree vertex "+source +" : "+list[source].size());
        
        //degree directed graph
            //inDegree
        int k,totalIn = 0, totalOut = 0;
        for (int i = 0; i < vertex; i++) {
            for (int j = 0; j < list[i].size(); j++) {
                if(list[i].get(j)==source){
                    ++totalIn;
                }
            }
            //outDegree
            for (k = 0; k < list[source].size(); k++) {
                list[source].get(k);
            }
            totalOut = k;
        }
        System.out.println("Indegree dari vertex "+ source +" : "+totalIn);
        System.out.println("Outdegree dari vertex "+ source +" : "+totalOut);
        System.out.println("degree vertex "+ source +" : " + (totalIn+totalOut));
    }
    
    public void removeEdge(int source, int destination) throws Exception{
        for (int i = 0; i < vertex; i++) {
            if(i==destination) {
                list[source].remove(list[source].getByValue(destination));
            }
        }
    }
    
    public void removeAllEdges() {
        for (int i = 0; i < vertex; i++) {
            list[i].clear();
        }
        System.out.println("Graph berhasil dikosongkan");
    }
    
    public void printGraph() throws Exception{
        for (int i = 0; i < vertex; i++) {
            if(list[i].size()>0) {
                System.out.println("Vertex " + i + " terhubung dengan: ");
                for (int j = 0; j < list[i].size(); j++) {
                    System.out.println(list[i].get(j) + " dengan edge weight = " + list[i].getWeight(j));
                }
                System.out.println("");
            }
        }
        System.out.println(" ");
    }
    
    public static void main(String[] args) throws Exception{
        WeightedGraph graph = new WeightedGraph(6);
        graph.addEdge(0, 1, 10);
        graph.addEdge(0, 4, 12);
        graph.addEdge(1, 2, 15);
        graph.addEdge(1, 3, 8);
        graph.addEdge(1, 4, 5);
        graph.addEdge(2, 3, 20);
        graph.addEdge(3, 4, 17);
        graph.addEdge(3, 0, 25);
        graph.printGraph();
        graph.degree(2);
        
        //Langkah ke-13
        graph.removeEdge(1, 3);
        graph.printGraph();
    }
}
