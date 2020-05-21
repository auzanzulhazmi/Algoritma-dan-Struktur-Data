/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tugas_6;

/**
 *
 * @author ROG STRIX
 */
public class Graph {
    int vertex;
    LinkedLists list[];
    
    public Graph(int vertex) {
        this.vertex = vertex;
        list = new LinkedLists[vertex];
        for (int i = 0; i < vertex; i++) {
            list[i] = new LinkedLists();
        }
    }
    
    public void addEdge(String source, String destination, int source2, int destination2) {
        //add edge
        list[source2].addFirst(destination);
        
        //add back edge (for undirected)
        list[destination2].addFirst(source);
    }
    
    public void degree(int source, String source2) throws Exception{
        //degree undirected graph
        System.out.println("degree vertex "+source +" : "+list[source].size());
        
        //degree directed graph
            //inDegree
        int k,totalIn = 0, totalOut = 0;
        for (int i = 0; i < vertex; i++) {
            for (int j = 0; j < list[i].size(); j++) {
                if(list[i].get(j).equals(source2)){
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
    
    public void removeEdge(int source, int destination, String destination2) throws Exception{
        for (int i = 0; i < vertex; i++) {
            if(i==destination) {
                list[source].remove(list[source].getByValue(destination2));
            }
        }
    }
    
    public void removeAllEdges() {
        for (int i = 0; i < vertex; i++) {
            list[i].clear();
        }
        System.out.println("Graph berhasil dikosongkan");
    }
    
    public void printGraph(String kota[]) throws Exception{
        for (int i = 0; i < vertex; i++) {
            if(list[i].size()>0) {
                System.out.print("Vertex " + kota[i] + " terhubung dengan: ");
                for (int j = 0; j < list[i].size(); j++) {
                    System.out.print(list[i].get(j) + ", ");
                }
                System.out.println("");
            }
        }
        System.out.println(" ");
    }
    
    public static void main(String[] args) throws Exception{
        Graph graph = new Graph(6);
        String kota[] = new String[5];
        
        kota[0] = ("Malang");
        kota[1] = ("Surabaya");
        kota[2] = ("Gresik");
        kota[3] = ("Bandung");
        kota[4] = ("Jakarta");
        
        graph.addEdge("Malang", "Surabaya",0, 1);
        graph.addEdge("Malang", "Jakarta",0, 4);
        graph.addEdge("Surabaya", "Gresik", 1, 2);
        graph.addEdge("Surabaya", "Bandung",1, 3);
        graph.addEdge("Surabaya", "Jakarta",1, 4);
        graph.addEdge("Gresik", "Bandung",2, 3);
        graph.addEdge("Bandung", "Jakarta",3, 4);
        graph.addEdge("Bandung", "Malang",3, 0);
        graph.printGraph(kota);
        graph.degree(2, "Gresik");
        
        //Langkah ke-13
        graph.removeEdge(1, 3, "Bandung");
        graph.printGraph(kota);
    }
}
