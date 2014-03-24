/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package sintaxis;

/**
 *
 * @author Aeros
 */
public abstract class  Constans implements Node{
    
    private final Value value;

    public Constans(Value value) {
        this.value = value;
    }

    @Override
    public abstract double evaluate();

   
}
