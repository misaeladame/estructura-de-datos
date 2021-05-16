/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto;

import java.util.ArrayList;

/**
 *
 * @author friosa
 */
public class Secuencial implements IBusqueda {
    public TipoElem Buscar(ArrayList<TipoElem> x, int lb,int ub, TipoElem key) {
        for(int i = 0;i<x.size();i++){
            if(key.Nombre().equals(x.get(i).Nombre()))
                return x.get(i);
        }
        return new TipoElem("No se encontró");
    }
}
