/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package utfpr.ct.dainf.if62c.pratica;

/**
 *
 * @author a1611810
 */
import java.lang.Math;

public class Elipse {
    protected double s;
    protected double r;
    
    public Elipse (double semieixoX, double semieixoY)
    {
        this.s = semieixoX;
        this.r = semieixoY;
    }
    
    public double getArea()
    {
        return (Math.PI * s * r);        
    }
   
    public double getPerimetro()
    {
        return (Math.PI*(3*(r + s) - Math.sqrt((3*r + s)*(r + 3*s))));
    }
}
