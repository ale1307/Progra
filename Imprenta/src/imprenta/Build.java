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
public class Build {

    private ImpresionesYFotocopias impYFoto;
    private LevantadoDeTexto levanDeTxt;
    private CorreccionesYRevision correcYRev;
    private DiseñoGrafico disGrafico;

    public Build(ImpresionesYFotocopias impYFoto, LevantadoDeTexto levanDeTxt, CorreccionesYRevision correcYRev, DiseñoGrafico disGrafico) {
        this.impYFoto = impYFoto;
        this.levanDeTxt = levanDeTxt;
        this.correcYRev = correcYRev;
        this.disGrafico = disGrafico;
    }


    public String print()

    {
        return "Total: "+ (impYFoto.getCost() + levanDeTxt.getCost() + correcYRev.getCost() + disGrafico.getCost());
    }

}
