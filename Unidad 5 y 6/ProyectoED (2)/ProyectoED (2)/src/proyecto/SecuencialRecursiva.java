/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto;

import java.util.ArrayList;

/**
 *
 * @author HP OMEN
 */

    public class SecuencialRecursiva implements IBusqueda {
    public TipoElem Buscar(ArrayList<TipoElem> x, int lb,int ub, TipoElem key) {
        if(lb>ub){
         return new TipoElem("No se encontró");    
        }
        if(key.Nombre().equals(x.get(lb).Nombre()))
            return x.get(lb);
        
        return Buscar(x,lb+1,ub,key);
        
        
    }
}

