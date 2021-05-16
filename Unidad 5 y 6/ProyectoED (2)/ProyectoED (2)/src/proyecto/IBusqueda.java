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
public interface IBusqueda {
    TipoElem Buscar(ArrayList<TipoElem> x,int lb,int ub,TipoElem key);
}
