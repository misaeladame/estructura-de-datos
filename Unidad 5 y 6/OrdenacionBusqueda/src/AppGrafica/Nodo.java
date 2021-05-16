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
    private Nodo _sig;
    
    public Nodo(TipoElem elem) {
        _info = elem;
        _sig = null;
    }
    public TipoElem Info() {
        return _info;
    }
    public Nodo Sig() {
        return _sig;
    }
    public void Info(TipoElem elem) {
        _info = elem;
    }
    public void Sig(Nodo sig) {
        _sig = sig;
    }
}
