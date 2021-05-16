/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AppGrafica;

import java.util.ArrayList;

/**
 *
 * @author friosa
 */
public class BinariaRecursiva implements IBusqueda {
    public TipoElem Buscar(ArrayList<TipoElem> x, int lb, int ub, TipoElem key) {
        int mid = (lb + ub) / 2;
        if (lb <= ub)
            if (key.Calif() == x.get(mid).Calif())
                return x.get(mid);
            else if (key.Calif() < x.get(mid).Calif())
                return Buscar(x,lb,mid - 1,key);
            else
                return Buscar(x,mid + 1,ub,key);
        else
            return new TipoElem("NO SE ENCONTRO");
    }
}
