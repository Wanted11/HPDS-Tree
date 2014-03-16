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
public class AddNode extends BinaryNode{

    public AddNode(Node leftNode, Node rightNode) {
        super(leftNode, rightNode);
    }
    
    public double evaluate(){
        return getLeftNode().evaluate() + getRightNode().evaluate();
    }
    
}
