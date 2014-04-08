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
public class Constans implements Node{
    
    private final double number;

    public Constans(double number) {
        this.number = number;
    }

    @Override
    public double evaluate() {
        return number;
    }
}
