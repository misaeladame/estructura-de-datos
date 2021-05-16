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
public class Lista {
     private Nodo _cab;
    private int _noNodos;
    
    public Lista() {
        _cab = null;
        _noNodos = 0;
    }
    public boolean Empty() {
        return _cab == null;
    }
    public int Length() {
        return _noNodos;
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
    public void InsOrden(TipoElem oElem) {
            Nodo r = new Nodo(oElem);
            Nodo p = _cab;
            Nodo q = null;
            while (p != null && oElem.Calif() > p.Info().Calif())
            {
                q = p;
                p = p.Sig();
            }
            if (q == null)
            {
                r.Sig(_cab);
                _cab = r;
            }
            else
            {
                q.Sig(r);
                r.Sig(p);
            }
            _noNodos++;
        }
}
