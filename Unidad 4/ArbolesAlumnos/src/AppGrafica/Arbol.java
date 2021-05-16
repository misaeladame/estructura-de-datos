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
public class Arbol {
    private Nodo _raiz;
    private int _noNodos;
    
    public int Nodos2HijosAp(Nodo p) {
        if (p == null)
            return 0;
        else
            return Nodos2HijosAp(p.Izq()) + Nodos2HijosAp(p.Der())+
                    (p.Izq()!=null && p.Der()!= null && p.Izq().Info().Calif() >= 70 &&
                    p.Der().Info().Calif() >= 70? 1 : 0);
    }
    public Arbol() {
        _raiz = null;
        _noNodos = 0;
    }
    public Nodo Raiz() {
        return _raiz;
    }
    public void Raiz(Nodo p) {
        _raiz = p;
    }
    public boolean Empty() {
        return _raiz == null;
    }
    public int Length() {
        return _noNodos;
    }
    public Nodo Buscar(TipoElem elem) {
        Nodo p = _raiz;
        while (p != null) {
            if (p.Info().Calif()==elem.Calif())
                return p;
            if (elem.Calif() >= p.Info().Calif())
                p = p.Der();
            else
                p = p.Izq();
        }
        return p;  // return null;
    }
    public void Add(TipoElem elem) {
        Nodo p = new Nodo(elem);
        Nodo q = null, r = _raiz;
        while (r != null) {
            q = r;
            r = elem.Calif() >= q.Info().Calif()? r.Der() : r.Izq();
        }
        if (q == null)
            _raiz = p;
        else if (elem.Calif() >= q.Info().Calif())
            q.Der(p);
        else
            q.Izq(p);
        _noNodos++;
    }
    public void Delete(Nodo p) {
        Nodo ant=null,q=_raiz;
        Nodo temp;
        while (q != p) {
            ant = q;
            q = p.Info().Calif() >= q.Info().Calif() ? q.Der() : q.Izq();
        }
        // SI NODO(P) ES UNA HOJA
        if (p.Der() == null && p.Izq() == null)
            if (ant == null)    // es la raiz
                _raiz = null;
            else if (ant.Der() == p)
                ant.Der(null);
            else
                ant.Izq(null);
            else  // tiene 2 hijos
                if (p.Der() != null && p.Izq() != null) {
                    ant = p;
                    temp = p.Der();
                    while (temp.Izq() != null)
                    {
                        ant = temp;
                        temp = temp.Izq();
                    }
                    p.Info(temp.Info());
                    if (ant == p)
                        ant.Der(temp.Der());
                    else
                        ant.Izq(temp.Der());
                }
                else  // tiene un hijo el nodo
                    if (p.Der() != null)
                        if (ant == null)
                            _raiz = p.Der();
                        else
                            if (ant.Der() == p)
                                ant.Der(p.Der());
                            else
                                ant.Izq(p.Der());
                    else
                        if (ant == null)
                            _raiz = p.Izq();
                        else
                            if (ant.Der() == p)
                                ant.Der(p.Izq());
                            else
                                ant.Izq(p.Izq());
            _noNodos--;
        }
}
