/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package TestTree.Operator;

import operator.AddNode;
import static org.junit.Assert.assertEquals;
import org.junit.Test;
import node.Constans;

/**
 *
 * @author Aeros
 */
public class AddNodeTest {
    
    @Test
    public void addTest(){
        assertEquals(5.00 , new AddNode(new Constans(3.00), new Constans(2.00)).evaluate(),0.001);
    }
}
