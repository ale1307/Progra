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
public enum CorreccionesYRevision {
    libros(100), librosEstId(50), revistas(20);

    private double pages;

    private CorreccionesYRevision(double pages) {
        this.pages = pages;

    }
        public double getCost() {
            switch(this){
                case libros:
                    return pages * 800;
                case librosEstId:
                    return pages * 650;
                case revistas:
                    return pages * 900;
            }
                    
        return pages;
    }
}
