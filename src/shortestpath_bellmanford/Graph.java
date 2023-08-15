/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package shortestpath_bellmanford;

import java.util.ArrayList;
import java.util.Collections;

/**
 *
 * @author yigit
 */
public class Graph {
   ArrayList<Node> nodes; 
    ArrayList<Edge> edges;

    public Graph(){
       this.nodes = new ArrayList<Node>();
       this.edges = new ArrayList<Edge>(); 
   } 
    public void addEdge(String src, String dst,int weight){
        edges.add(new Edge(src,dst,weight));
        edges.add(new Edge(dst,src,weight));
    }
    public void addNode(String character){
        nodes.add(new Node(character));
    }
    public Node getNodeByChar(String s){
        for(Node node : nodes){
            if(node.character.equals(s)){
                return node;
            }
        }
        return null;
    }
    
    public void initializeSingleSource(Node root){
        for(Node node:nodes){
            if(node.character.equals(root.character)){
                node.cost=0;
            }
            else{
                node.cost=9999999;
            }
            node.parent=null;
        }
}
    public int getNodeCount(){
        int j=0;
        for(Node node: nodes){
            j++;
        }
        return j;
    }
    public int getCost(String src,String dst){
    for(Edge edge: edges){
        if(edge.src.equals(src) && edge.dst.equals(dst)){
            return edge.weight;
        }
    }
    return 0;
}
    public void Relax(Node u,Node v, int cost){
        if(v.cost>(u.cost+cost)){
            v.cost = (u.cost+cost);
            v.parent=u;
        }
    }
    public Boolean BellmanFord(){
        initializeSingleSource(getNodeByChar("A"));
        for(int i=1;i<getNodeCount()-1;i++){
            for(Edge edge: edges){
                Relax(getNodeByChar(edge.src),getNodeByChar(edge.dst),getCost(edge.src,edge.dst));
            }
        }
        for(Edge edge:edges){
            if(getNodeByChar(edge.dst).cost>(getNodeByChar(edge.src).cost+getCost(edge.src,edge.dst))){
                System.out.println("Bu Grafta En Kisa Yol Bulunamaz!");
                return false;
            }
        }
        return true;
    }
    public void printPath(String src,String dst){
    ArrayList<String> path = new ArrayList<>();
    Node ds = getNodeByChar(dst);
    Node sr = getNodeByChar(src);
    while(ds!=sr){
        path.add(ds.character);
        ds = ds.parent;
    }
    path.add(sr.character);
    Collections.reverse(path);
    System.out.print(path.get(0)+"->");
    for (int i=1;i<path.size()-1;i++) {
        System.out.print(path.get(i)+"->");   
    }   
    System.out.print(path.get(path.size()-1));
    System.out.println();
}
}
