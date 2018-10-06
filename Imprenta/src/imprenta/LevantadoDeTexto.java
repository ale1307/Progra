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
public enum LevantadoDeTexto {
    porPag(200), mediaPag(10), masDe500Pags(600); //Cantidad de paginas de cada uno de los precios

    private LevantadoDeTexto(double pages) {
        this.pages = pages;
    }

    public double getCost() {
        switch (this) {
            case porPag:
                return pages * 150;

            case mediaPag:
                return pages * 100;
            case masDe500Pags:
                return pages * 130;
        }
        return pages;
    }
    private double pages;
}
