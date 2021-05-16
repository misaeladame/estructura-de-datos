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
public class BinariaRecursiva implements IBusqueda {
    public TipoElem Buscar(ArrayList<TipoElem> x, int lb, int ub, TipoElem key) {
        int mid = (lb + ub) / 2;
        if (lb <= ub)
            if (key.Nombre().equals(x.get(mid).Nombre()))
                return x.get(mid);
            else if (key.Nombre().compareTo(x.get(mid).Nombre())<0)
                return Buscar(x,lb,mid - 1,key);
            else
                return Buscar(x,mid + 1,ub,key);
        else
            return new TipoElem("No se encontró");
    }
}
