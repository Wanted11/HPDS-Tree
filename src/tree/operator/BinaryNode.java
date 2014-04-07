/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package tree.operator;

import tree.Node;
import tree.Value;

/**
 *
 * @author Aeros
 */
public abstract class BinaryNode extends Node{
    
    private final Value leftNode;
    private final Value rightNode;

    public BinaryNode(Value leftNode, Value rightNode) {
        this.leftNode = leftNode;
        this.rightNode = rightNode;
    }

    public Value getLeftNode() {
        return getLeftNode();
    }

    public void setLeftNode(Value leftNode) {
        setLeftNode(leftNode);
    }

    public Value getRightNode() {
        return getRightNode();
    }

    public void setRightNode(Value rightNode) {
        setRightNode(rightNode);
    }
}
