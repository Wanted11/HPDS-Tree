/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package operator;

import binarynode.BinaryNode;
import node.Node;

/**
 *
 * @author Aeros
 */
public class DivNode extends BinaryNode{

    public DivNode(Node leftNode, Node rightNode) {
        super(leftNode, rightNode);
    }
    
    public double evaluate(){
        return getLeftNode().evaluate()/getRightNode().evaluate();
    }
}
