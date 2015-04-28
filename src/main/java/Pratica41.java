
import utfpr.ct.dainf.if62c.pratica.Elipse;
import utfpr.ct.dainf.if62c.pratica.Circulo;


/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author a1611810
 */
public class Pratica41 {
    public static void main(String[] args)
    {
        Elipse nova = new Elipse(2, 5);
        System.out.println("Área da Elipse: " + nova.getArea() + "Perímetro da Elise: " + nova.getPerimetro());
        Circulo novo = new Circulo(2);
        System.out.println("Área do círculo: " + novo.getArea() + "Perímetro do círculo: " + novo.getPerimetro());
    }
}
