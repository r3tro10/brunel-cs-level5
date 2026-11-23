import java.util.*;
/*
    Context:
    Dijkstra's algorithm is used to find the shortest path between a given vertex s and every other vertex in a weighted graph in which all the weights are positive. The main idea is to perform a “weighted" breadth first search starting at s and using a priority queue Q.

    Question:
    Write a method public static int[] dijkstra(int[][] graph, PriorityQueue<Node> pq, int start) that computes Dijkstra's algorithm for a given input graph graph, represented by an adjacency matrix. Use a priority queue pq to solve this, given a starting vertex start. Assume the graph is connected.*

    Example:
    int[][] graph = {{0,2,5,0,0},{2,0,0,3,0},{5,0,0,0,4}, {0,3,0,0,1}, {0,0,4,1,0}}
    dijkstra(graph, pq, 0) would return {0, 2, 5, 5, 6}.

    *All java.util libraries have been imported for you already.
*/
public class Lab7_Question3 {
    static class Node implements Comparable<Node> {
        int node;
        int cost;

        Node(int node, int cost) {
            this.node = node;
            this.cost = cost;
        }

        @Override
        public int compareTo(Node other) {
            return Integer.compare(this.cost, other.cost);
        }
    }

    public static int[] dijkstra(int[][] graph, PriorityQueue<Node> pq, int start) {
        return null;
    }

    public static void main(String[] args) {
        
    }  
}
