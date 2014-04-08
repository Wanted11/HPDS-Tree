package TestTree.Operator;

import org.junit.Test;
import operator.*;
import static org.junit.Assert.assertEquals;
import node.Constans;

public class DivNodeTest {
    
    @Test
    public void divNodeTest(){
         DivNode divNode = new DivNode(new Constans(10.00), new Constans(5.00));
         assertEquals (2.00, divNode.evaluate(),0.001);
    }
}
