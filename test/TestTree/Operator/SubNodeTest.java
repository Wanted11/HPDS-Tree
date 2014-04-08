/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package TestTree.Operator;

import static org.junit.Assert.assertEquals;
import org.junit.Test;
import node.Constans;

/**
 *
 * @author Aeros
 */
public class SubNodeTest {
    
    @Test
    public void subNode(){
        assertEquals(5.00, new SubNode(new Constans(15.00),new Constans(10.00)).evaluate(),0.001);
    }
}
