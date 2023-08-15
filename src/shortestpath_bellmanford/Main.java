/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package shortestpath_bellmanford;

/**
 *
 * @author yigit
 */
public class Main {
    public static void main(String[] args) {

        Graph graph = new Graph();
        graph.addNode("A");
        graph.addNode("B");
        graph.addNode("C");
        graph.addNode("D");
        graph.addNode("E");
        graph.addNode("F");
        graph.addNode("G");
        graph.addNode("H");
        graph.addNode("I");
        graph.addNode("J");
        graph.addNode("K");
        graph.addNode("L");
        graph.addNode("S");
        
       
        graph.addEdge("A","B", 3);
        graph.addEdge("A","S", 7);
        graph.addEdge("A","D", 4);
        graph.addEdge("B","S", 2);
        graph.addEdge("B","D", 4);
        graph.addEdge("B","H", 1);
        graph.addEdge("C","S", 3);
        graph.addEdge("C","L", 2);
        graph.addEdge("D","F", 2);
        graph.addEdge("E","G", 2);
        graph.addEdge("E","K", 5);
        graph.addEdge("F","H", 3);
        graph.addEdge("G","H", 2);
        graph.addEdge("I","J", 6);
        graph.addEdge("I","L", 4);
        graph.addEdge("I","K", 4);
        graph.addEdge("J","L", 4);
        graph.addEdge("J","K", 4);
        
        graph.BellmanFord();
        graph.printPath("B","K");
        
        
        
    }
}
