/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package TestTree.Operator;

import operator.MinusNode;
import static org.junit.Assert.assertEquals;
import org.junit.Test;
import treehpds.Constans;

/**
 *
 * @author Aeros
 */
public class MinusNodeTest {
    
    @Test
    public void minusTest(){
        assertEquals(5.00 , new MinusNode(new Constans(7.00), new Constans(2.00)).evaluate(),0.001);
    }
}
