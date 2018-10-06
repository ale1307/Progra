/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package imprenta;

/**
 *
 * @author Ale
 */
public enum ImpresionesYFotocopias {
    BlancoYNegro(10), Color(15);//Precio por pagina a color y Blanco Y negro.

    private ImpresionesYFotocopias(double cost) {
        this.cost = cost;
    }

    public double getCost() {
        return cost;
    }
    
    private double cost;
}
