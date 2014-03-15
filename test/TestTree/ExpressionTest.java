package TestTree;


import treehpds.*;
import static org.junit.Assert.*;
import org.junit.Test;

public class ExpressionTest {
    @Test
    public void testNumberConstant() {
        Constant constInt = new ConstInt(2);
        Constant constDouble = new ConstDouble(3.0);
        
        assertEquals(2, (int) constInt.evaluate());
        assertEquals(3.0,(double) constDouble.evaluate(), 0.001);
    }
    
    @Test
    public void testNumberAddition() {
        Addition addA = new Addition(new ConstDouble(2.0), new ConstDouble(3));
        Addition addB = new Addition(new ConstDouble(2.0), new ConstDouble(3));
        
        assertEquals(5.0, (double) addA.evaluate(), 0.001);
        
//        assertEquals(5.0, (double) new Addition().evaluate(), 0.001);
//        assertEquals(5.0, (double) new Addition(new Constant(2), new Constant(3.0)).evaluate(), 0.001);
//        assertEquals(5.0, (double) new Addition(new Constant(2.0), new Constant(3.0)).evaluate(), 0.001);
//        assertEquals(5.0, (double) new Addition(new Constant(2.0), new Addition(new Constant(1.0), new Constant(2))).evaluate(), 0.001);
    }

}
