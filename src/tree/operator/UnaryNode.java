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
public abstract class UnaryNode extends Node{

    private Value node;
    
    public UnaryNode(Value node) {
        this.node = node;
    }

    public Value getNode() {
        return node;
    }

    public void setNode(Value node) {
        this.node = node;
    }

    @Override
    public abstract Value evaluate();
    
}
