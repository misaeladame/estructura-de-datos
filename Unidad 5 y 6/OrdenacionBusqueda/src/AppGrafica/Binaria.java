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
public class Binaria implements IBusqueda {
    public TipoElem Buscar(ArrayList<TipoElem> x, int lb, int ub, TipoElem key) {
        int mid;
        while (lb <= ub) {
            mid = (lb + ub) / 2;
            if (key.Calif() == x.get(mid).Calif())
                return x.get(mid);
            if (key.Calif() < x.get(mid).Calif())
                ub = mid - 1;
            else
                lb = mid + 1;
        }
        return new TipoElem("NO SE ENCONTRO");
    }
}
