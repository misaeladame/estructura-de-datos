package proyecto;

import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author friosa
 */
public class Hashing implements IOrdenacion {
    Lista[] tablaHash;
    
    public Lista[] Tabla() {
        return tablaHash;
    }

    public void Ordenar(ArrayList<TipoElem> x, int lb, int ub) {
        tablaHash = new Lista[26];
        for (int i = 0; i < tablaHash.length; i++)
            tablaHash[i] = new Lista();
        for (int i = 0; i < ub + 1; i++) {
            char c = x.get(i).Nombre().charAt(0);
            int indice = (int) c - 65;
            tablaHash[indice].InsOrden(x.get(i));
        }
        int j=0;
        for (int i = 0; i < tablaHash.length; i++) {
            Nodo p = tablaHash[i].Cab();
            while (p != null) {
                x.set(j++,p.Info());
                p = p.Sig();
            }
        }
    }
    
    public Lista[] Lista(ArrayList<TipoElem> x, int lb, int ub) {
        tablaHash = new Lista[26];
        for (int i = 0; i < tablaHash.length; i++)
            tablaHash[i] = new Lista();
        for (int i = lb; i <= ub; i++) {
            char c = Character.toUpperCase(x.get(i).Nombre().charAt(0));
            int indice = (int) c - 65;
            tablaHash[indice].InsOrden(x.get(i));
        }
        return tablaHash;
    }
}
