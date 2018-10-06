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
public enum DiseñoGrafico {
    nuevosDis(20000), disExist(15000);

    private double cost;

    private DiseñoGrafico(double cost) {
        this.cost = cost;
    }

    public double getCost() {
        return cost;
    }
}
