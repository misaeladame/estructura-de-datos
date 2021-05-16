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
public class Binaria implements IBusqueda {
    public TipoElem Buscar(ArrayList<TipoElem> x, int lb, int ub, TipoElem key) {
        int mid;
        while (lb <= ub) {
            mid = (lb + ub) / 2;
            if (key.Nombre().equals(x.get(mid).Nombre()))
                return x.get(mid);
            if (key.Nombre().compareTo(x.get(mid).Nombre())<0)
                ub = mid - 1;
            else
                lb = mid + 1;
        }
        return new TipoElem("No se encontró");
    }
}
