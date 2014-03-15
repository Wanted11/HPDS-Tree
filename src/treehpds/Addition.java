/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package treehpds;

/**
 *
 * @author Aeros
 */
public class Addition implements Constant{
    
    private final Object result;

    public Addition(ConstDouble constA, ConstDouble constB) {
        result = (double) constA.evaluate() + (double) constB.evaluate();
    }
    
    @Override
    public Object evaluate() {
        return result;
    }
    
    
}
