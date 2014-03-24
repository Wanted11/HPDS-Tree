/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package operator;

import sintaxis.Node;

/**
 *
 * @author Aeros
 */
public class TangNode extends UnaryNode{

    public TangNode(Node node) {
        super(node);
    }
 
    @Override
    public double evaluate(){
        return 0.00;
    }
    
}
