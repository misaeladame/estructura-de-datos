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
public class InsSimple implements IOrdenacion {
    public void Ordenar(ArrayList<TipoElem> x, int lb, int ub) {
        int i, k;
        TipoElem y;
        for (k = 1; k < ub + 1; k++) {
            y = x.get(k);
            for (i = k - 1; i >= 0 && y.Calif() < x.get(i).Calif(); i--)
                x.set(i + 1,x.get(i));
            x.set(i + 1,y);
        }
    }
}
