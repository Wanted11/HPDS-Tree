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
public class AddNode extends BinaryNode{

    public AddNode(Value leftNode, Value rightNode) {
        super(leftNode, rightNode);
    }
    
    @Override
    public double evaluate() {
    }
    
}
