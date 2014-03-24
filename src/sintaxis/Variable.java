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
public class Variable{
    private  String x;
    private  double number;

    public Variable(String x, double number) {
        this.x = x;
        this.number = number;
    }
    public String getX() {
        return x;
    }
    public void setX(String x) {
        this.x = x;
    }
    public double getNumber() {
        return number;
    }
    public void setNumber(double number) {
        this.number = number;
    }
    public double get(){
        return number;
    }
}
