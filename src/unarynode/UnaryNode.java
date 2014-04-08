/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package operator;

import treehpds.Node;

/**
 *
 * @author Aeros
 */
public abstract class UnaryNode implements Node{

    private Node node;
    
    public UnaryNode(Node node) {
        this.node = node;
    }

    public Node getNode() {
        return node;
    }

    public void setNode(Node node) {
        this.node = node;
    }
    
}
