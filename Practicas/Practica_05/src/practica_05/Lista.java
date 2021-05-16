/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica_05;

/**
 *
 * @author friosa
 */
public class Lista {
    private Nodo _cab;
    private int _noNodos;
    
    public Lista() {
        _cab = null;
        _noNodos = 0;
    }
    public void Clear() {
        _cab = null;
        _noNodos = 0;
    }
    public boolean Empty() {
        return _cab == null;
    }
    public int Length() {
        return _noNodos;
    }
    public void Length(int valor) {
        _noNodos = valor;
    }
    public Nodo Cab() {
        return _cab;
    }
    public void Cab(Nodo cab) {
        _cab = cab;
    }
    public void InsBegin(TipoElem elem) {
        Nodo p = new Nodo(elem);
        p.Sig(_cab);
        Cab(p);
        _noNodos++;
    }
    public void InsEnd(TipoElem elem) {
        Nodo p = new Nodo(elem);
        Nodo q = _cab;
        if (q == null)
            _cab = p;
        else {
            while(q.Sig() != null)
                q = q.Sig();
            q.Sig(p);
        }
        _noNodos++;
    }
    
    public void EliminarSegundo() {
        if(_noNodos > 1) {
            _cab.Sig(_cab.Sig().Sig());
            _noNodos--;
        }
    }
    
    public void EliminarMenosPrimYUlt() {
        if(_noNodos > 2) {
            Nodo p = _cab;
            while(p.Sig() != null)
                p = p.Sig();
            _cab.Sig(p);
            _noNodos=2;
        }        
    }
    
    public boolean CompararPrimYUlt() {
        if(_noNodos > 1) {           
            Nodo p = _cab;
            while(p.Sig() != null)
                p = p.Sig();
            return _cab.Info().compararAlums(p.Info());
        }
        return false;
    }
}
