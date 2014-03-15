package treehpds;


import treehpds.Constant;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Aeros
 */
public class ConstDouble implements Constant{

    private final double number;

    public ConstDouble(double number) {
        this.number = number;
    }
    
    @Override
    public Object evaluate() {
        return number;
    }
    
}
