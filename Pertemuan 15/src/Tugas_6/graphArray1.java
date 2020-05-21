/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tugas_6;
import java.util.Scanner;
/**
 *
 * @author ROG STRIX
 */
public class graphArray1 {
    private final int vertices;
    private final int[][] twoD_array;

    public graphArray1(int v) {
        vertices = v;
        twoD_array = new int[vertices + 1][vertices + 1];
    }

    public void makeEdge(int to, int from, int edge) {
        try {
            twoD_array[to][from] = edge;
        } catch (ArrayIndexOutOfBoundsException index) {
            System.out.println("Vertex tidak ada");
        }
    }

    public int getEdge(int to, int from) {
        try {
            return twoD_array[to][from];
        } catch (ArrayIndexOutOfBoundsException index) {
            System.out.println("Vertex tidak ada");
        }
        return -1;
    }

    public static void main(String[] args) {
        int e, count = 1, to = 0, from = 0;
        String v[] = new String[5];
        Scanner sc = new Scanner(System.in);
        graphArray1 graph;
        try {
            v[0] = ("Malang");
            v[1] = ("Surabaya");
            v[2] = ("Gresik");
            v[3] = ("Bandung");
            v[4] = ("Jakarta");

            System.out.println("Masukkan jumlah edges: ");
            e = sc.nextInt();

            graph = new graphArray1(v.length);

            System.out.println("Masukkan edges: <to> <from>");
            while (count <= e) {
                to = sc.nextInt();
                from = sc.nextInt();

                graph.makeEdge(to, from, 1);
                count++;
            }
            System.out.println("Array 2D sebagai representasi graph sbb: ");
            System.out.print("  \t");
            for (int i = 0; i < v.length; i++) {
                System.out.print(v[i] + "|");
            }
            System.out.println();

            for (int i = 0; i < v.length; i++) {
                System.out.print(v[i] + "\t ");
                for (int j = 1; j <= v.length; j++) {
                    System.out.print(graph.getEdge(i, j) + "\t ");
                }
                System.out.println();
            }
        } catch (Exception E) {
            System.out.println("Error. Silahkan cek kembali\n" + E.getMessage());
        }
        sc.close();
    }
}
