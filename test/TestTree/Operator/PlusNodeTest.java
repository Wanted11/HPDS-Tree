/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package TestTree.Operator;

import operator.PlusNode;
import static org.junit.Assert.assertEquals;
import org.junit.Test;
import treehpds.Constans;

/**
 *
 * @author Aeros
 */
public class PlusNodeTest {
    
    @Test
    public void plusTest(){
        assertEquals(10.00 , new PlusNode(new Constans(5.00), new Constans(2.00)).evaluate(),0.001);
    }
}
