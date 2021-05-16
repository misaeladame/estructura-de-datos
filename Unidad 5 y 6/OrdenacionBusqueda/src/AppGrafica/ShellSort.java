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
public class ShellSort implements IOrdenacion {
    public void Ordenar(ArrayList<TipoElem> x, int lb, int ub) {
        int[] increments = { 5, 3, 1 };
        int numIncs = 3;
        int j, k, span,incr;
        TipoElem y;
        for (incr = 0; incr < numIncs; incr++) {
            span = increments[incr];
            for (j = span; j < ub + 1; j++) {
                y = x.get(j);
                for (k = j - span; k >= 0 && y.Calif() < x.get(k).Calif(); k -= span)
                    x.set(k + span,x.get(k));
                x.set(k + span,y);
            }
        }
    }
}
