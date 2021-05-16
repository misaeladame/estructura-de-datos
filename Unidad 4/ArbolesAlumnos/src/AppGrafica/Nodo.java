/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AppGrafica;

/**
 *
 * @author friosa
 */
public class Nodo {
    private TipoElem _info;
    private Nodo _izq;
    private Nodo _der;
    
    public Nodo(TipoElem elem) {
        _info = elem;
        _izq = null;
        _der = null;
    }
    public TipoElem Info() {
        return _info;
    }
    public Nodo Izq() {
        return _izq;
    }
    public Nodo Der() {
        return _der;
    }
    public void Info(TipoElem elem) {
        _info = elem;
    }
    public void Izq(Nodo p) {
         _izq = p;
    }
    public void Der(Nodo p) {
        _der = p;
    }
    
}
