/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package TestTree.Operator;

import operator.BinaryNode;
import treehpds.Node;

/**
 *
 * @author Aeros
 */
class SubNode extends BinaryNode{

    public SubNode(Node number1, Node number2) {
        super(number1, number2);
    }

    @Override
    public double evaluate() {
        return getLeftNode().evaluate()-getRightNode().evaluate();
    }
    
}
