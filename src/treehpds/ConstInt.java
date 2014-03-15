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
public class ConstInt implements Constant{
    
    private final int number;

    public ConstInt(int number) {
        this.number = number;
    }

    @Override
    public Object evaluate() {
        return number;
    }

    
    
    
}
