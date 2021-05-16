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
public class ShellSort implements IOrdenacion {
    public void Ordenar(ArrayList<TipoElem> x, int lb, int ub) {
        int[] increments = { 100000,10000,1000, 100,1 };
        int numIncs = increments.length;
        int j, k, span,incr;
        TipoElem y;
        for (incr = 0; incr < numIncs; incr++) {
            span = increments[incr];
            for (j = span; j < ub + 1; j++) {
                y = x.get(j);
                for (k = j - span; k >= 0 && y.Nombre().compareTo(x.get(k).Nombre()) < 0; k -= span)
                    x.set(k + span,x.get(k));
                x.set(k + span,y);
            }
        }
    }
}
// for (j = span; j < ub + 1; j++) {
//                y = x.get(j);
//                for (k = j - span; k >= 0 && y.Calif() < x.get(k).Calif(); k -= span)
//                    x.set(k + span,x.get(k));
//                x.set(k + span,y);
//            }
