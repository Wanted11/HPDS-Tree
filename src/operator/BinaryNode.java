/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package operator;

import sintaxis.Node;
import sintaxis.Value;

/**
 *
 * @author Aeros
 */
public abstract class BinaryNode implements Node{
    
    private final Value leftNode;
    private final Value rightNode;

    public BinaryNode(Value leftNode, Value rightNode) {
        this.leftNode = leftNode;
        this.rightNode = rightNode;
    }

    public Node getLeftNode() {
        return getLeftNode();
    }

    public void setLeftNode(Value leftNode) {
        setLeftNode(leftNode);
    }

    public Node getRightNode() {
        return getRightNode();
    }

    public void setRightNode(Value rightNode) {
        setRightNode(rightNode);
    }
}
