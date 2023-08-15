/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package shortestpath_bellmanford;

import java.util.ArrayList;


/**
 *
 * @author yigit
 */
public class Node {
    public String character;
   ArrayList<Node> adjective;
   public int cost;
    public Node parent;
    
    public Node(String character){
        this.character=character;
        this.parent=null;
    }
    
}
