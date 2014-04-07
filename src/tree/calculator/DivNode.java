/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package tree.calculator;

import tree.Node;
import tree.Value;
import tree.operator.BinaryNode;

/**
 *
 * @author Aeros
 */
public class DivNode extends BinaryNode{

    public DivNode(Value leftNode, Value rightNode) {
        super(leftNode, rightNode);
    }
    
    public Value evaluate(){
        return null;
    }
}
