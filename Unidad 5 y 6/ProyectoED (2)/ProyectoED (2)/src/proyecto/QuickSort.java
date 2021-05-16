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
public class QuickSort implements IOrdenacion {
    public void Ordenar(ArrayList<TipoElem> x, int lb, int ub) {
        if (lb >= ub)
            return;
        int[] j = {0};
        Partition(x, lb, ub,j);
        Ordenar(x, lb, j[0] - 1);
        Ordenar(x, j[0] + 1, ub);
    } 
    public void Partition(ArrayList<TipoElem> x, int lb, int ub, int[] j) {
        int down, up;
        TipoElem temp, a;
        a = x.get(lb);
        up = ub;
        down = lb;
        while (down < up) {
            while (x.get(down).Nombre().compareTo(a.Nombre()) <= 0 && down < ub)
                down++;
            while (x.get(up).Nombre().compareTo(a.Nombre()) > 0)
                up--;
            if (down < up) {
                temp = x.get(down);
                x.set(down,x.get(up));
                x.set(up,temp);
            }
        }
        x.set(lb,x.get(up));
        x.set(up,a);
        j[0] = up;
    }
}

//while (down < up) {
//            while (x.get(down).Calif() <= a.Calif() && down < ub)
//                down++;
//            while (x.get(up).Calif() > a.Calif())
//                up--;
//            if (down < up) {
//                temp = x.get(down);
//                x.set(down,x.get(up));
//                x.set(up,temp);
//            }
//        }
