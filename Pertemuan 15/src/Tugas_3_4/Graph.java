/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tugas_3_4;
import java.util.Scanner;

/**
 *
 * @author ROG STRIX
 */
public class Graph {
    int vertex;
    LinkedLists list[];
    static String jenis;

    public Graph(int vertex) {
        this.vertex = vertex;
        list = new LinkedLists[vertex];
        for (int i = 0; i < vertex; i++) {
            list[i] = new LinkedLists();
        }
    }

    public boolean graphType() {
        return jenis.equalsIgnoreCase("directed");
    }

    public void addEdge(int source, int destination) {
        if (graphType()) {
            //add edge
            list[source].addFirst(destination);
        } else {
            //add edge
            list[source].addFirst(destination);

            //add back edge (for undirected)
            list[destination].addFirst(source);
        }
    }

    public void degree(int source) throws Exception {
        if (!graphType()) {
            //degree undirected graph
            System.out.println("degree vertex " + source + " : " + list[source].size());
        } else {
            //degree directed graph
            //inDegree
            int k, totalIn = 0, totalOut = 0;
            for (int i = 0; i < vertex; i++) {
                for (int j = 0; j < list[i].size(); j++) {
                    if (list[i].get(j) == source) {
                        ++totalIn;
                    }
                }
                //outDegree
                for (k = 0; k < list[source].size(); k++) {
                    list[source].get(k);
                }
                totalOut = k;
            }
            System.out.println("Indegree dari vertex " + source + " : " + totalIn);
            System.out.println("Outdegree dari vertex " + source + " : " + totalOut);
            System.out.println("degree vertex " + source + " : " + (totalIn + totalOut));
        }
    }

    public void removeEdge(int source, int destination) throws Exception {
        for (int i = 0; i < vertex; i++) {
            if (i == destination) {
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

    public void printGraph() throws Exception {
        for (int i = 0; i < vertex; i++) {
            if (list[i].size() > 0) {
                System.out.print("Vertex " + i + " terhubung dengan: ");
                for (int j = 0; j < list[i].size(); j++) {
                    System.out.print(list[i].get(j) + " ");
                }
                System.out.println("");
            }
        }
        System.out.println(" ");
    }

    public static void menu() {
        System.out.println("==============================");
        System.out.println("\tMENU GRAPH");
        System.out.println("==============================");
        System.out.println("Memilih menu");
        System.out.println("1. Jenis Graph (directed/undirected)");
        System.out.println("2. Input jumlah vertex");
        System.out.println("3. addEdge");
        System.out.println("4. removeEdge");
        System.out.println("5. removeAllEdges");
        System.out.println("6. printGraph");
        System.out.println("7. Keluar");
        System.out.println("==============================");
        System.out.print("Pilih menu : ");
    }

    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        Scanner sc2 = new Scanner(System.in);

        Graph graph = new Graph(10);
        int pilih, source, destination, vertex;
        do {
            menu();
            pilih = sc.nextInt();
            System.out.println("==============================");
            switch (pilih) {
                case 1:
                    System.out.print("Masukkan jenis Graph : ");
                    jenis = sc2.nextLine();
                    break;
                case 2:
                    System.out.print("Masukkan jumlah vertex : ");
                    vertex = sc.nextInt();
                    graph = new Graph(vertex);
                    break;
                case 3:
                    System.out.println("Tambahkan edge");
                    System.out.print("Source : ");
                    source = sc.nextInt();
                    System.out.print("Destination : ");
                    destination = sc.nextInt();
                    graph.addEdge(source, destination);
                    break;
                case 4:
                    System.out.println("Hapus Edge");
                    System.out.print("Source : ");
                    source = sc.nextInt();
                    System.out.print("Destination : ");
                    destination = sc.nextInt();
                    graph.removeEdge(source, destination);
                    break;
                case 5:
                    graph.removeAllEdges();
                    break;
                case 6:
                    graph.printGraph();
                    break;
                case 7:
                    System.out.println("Terimakasih telah menggunakan program ini");
                    System.exit(0);
                default:
                    System.out.println("Pilihan tidak tersedia");
            }
        } while (pilih > 0 || pilih < 7);
    }
}
