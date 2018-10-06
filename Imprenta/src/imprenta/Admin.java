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
public class Admin {
    private Build build;
    
    public Admin(){
        build = new Build(ImpresionesYFotocopias.BlancoYNegro,LevantadoDeTexto.masDe500Pags,CorreccionesYRevision.libros,DiseñoGrafico.disExist);
    }
    public void Bill(){
        System.out.println(build.print());
    }
}
