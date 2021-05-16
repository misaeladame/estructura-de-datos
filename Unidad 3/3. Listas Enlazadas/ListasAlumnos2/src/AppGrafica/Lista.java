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
    
    public void EliPrimero() {
        if(_noNodos >= 1) {
            _cab = _cab.Sig();
            _noNodos--;
        }   
    }
    
    public void EliDosPrimeros() {
        if(_noNodos >= 2) {
            _cab = _cab.Sig().Sig();
            _noNodos-=2;
        }
    }
    
    public void EliUltimo() {
        if(_noNodos<=1) {
            _cab = null;
            _noNodos = 0;
        }
        else {
            Nodo p = _cab, q = null;
            while(p.Sig()!= null) {
                q = p;
                p = p.Sig();
            }
            q.Sig(null);
            _noNodos--;
        }
    }
    
    public Nodo getPenultimo() {
        if(_noNodos >= 2) {
            
            Nodo p = _cab;
            while(p.Sig().Sig()!= null) {
                p = p.Sig();
            }
            return p;
        } else
            return null;
    }
    
    public void InterPrimUlt() {
        if(_noNodos >= 2) {
            TipoElem aux = _cab.Info();
            Nodo ult = _cab;
            while(ult.Sig()!=null)
                ult = ult.Sig();
            _cab.Info(ult.Info());
            ult.Info(aux);
        }
    }
    
    public void EliCuarto() {
        if(_noNodos >= 4) {
            _cab.Sig().Sig().Sig(_cab.Sig().Sig().Sig().Sig());
            _noNodos--;
        }
    }
    
    public void EliUltimosDos() {
        if(_noNodos <= 2) {
            _cab = null;
            _noNodos = 0;
        } else {
            Nodo p = _cab, q = null;
            while(p.Sig().Sig() != null) {
                q = p;
                p = p.Sig();
            }
            q.Sig(null);
            _noNodos-=2;
        }
    }
    
    public void EliAntepenultYUltimo () {
        if(_noNodos == 1) {
            _cab = null;
            _noNodos = 0;
        }
        if(_noNodos == 2) {
            _cab.Sig(null);
            _noNodos--;  
        }       
        if(_noNodos >=3)
        {
            Nodo p = _cab, q = null;
            while(p.Sig().Sig().Sig() != null) {
                q = p;
                p = p.Sig();
            }
            q.Sig(q.Sig().Sig());  //  q.Sig(p.Sig());
            q.Sig().Sig(null);
            _noNodos -= 2;
        }
    }
    
    public void MantenerAntepenultYUltimo() {
        if(_noNodos == 2) {
            _cab = _cab.Sig();
            _noNodos = 1;
        }
        if(_noNodos == 3) {
            _cab.Sig(_cab.Sig().Sig());
           _noNodos = 2; 
        }
        if(_noNodos >= 4) {
            Nodo p = _cab;
            while(p.Sig().Sig().Sig() != null) {
                p = p.Sig();
            }
            _cab = p;
            _cab.Sig(_cab.Sig().Sig());
            _noNodos = 2;
        }
    }
    
    public void EliMenosTerYUlt() {
        if(_noNodos <= 2) {
            _cab = null;
            _noNodos = 0;
        } 
        if(_noNodos == 3) {
            _cab = _cab.Sig().Sig();
            _noNodos = 1;
        }
        if(_noNodos >= 4) {
            _cab = _cab.Sig().Sig();
            Nodo p = _cab;
            while(p.Sig()!= null) {
                p = p.Sig();
            }
            _cab.Sig(p);
            _noNodos=2;
        }
    }
    
    public void EliMenosPenult() {
        if(_noNodos == 1) {
            _cab = null;
            _noNodos = 0;
        }
        if(_noNodos == 2) {
            _cab.Sig(null);
            _noNodos = 1;
        }
        if(_noNodos >= 3) {
            Nodo p = _cab;
            while(p.Sig().Sig()!=null)
                p = p.Sig();
            _cab = p;
            _cab.Sig(null);
            _noNodos = 1;
        }
    }
    
    public void EliTresPrimeros() {
        if(_noNodos >= 3) {
            _cab = _cab.Sig().Sig().Sig();
            _noNodos -= 3;
        }
    }
    
    public void EliMenosUltimo() {
        if(_noNodos >= 2) {
            Nodo p = _cab;
            while(p.Sig() != null)
                p = p.Sig();
            _cab = p;
            _noNodos = 1;
        }
    }
    
    public void IntPenultUlt() {
        if(_noNodos >= 2) {
            Nodo penult = _cab, ult = _cab;
            while(penult.Sig().Sig() != null) {
                penult = penult.Sig();
            }
            while(ult.Sig()!=null)
                ult = ult.Sig();
            TipoElem aux = penult.Info();
            penult.Info(ult.Info());
            ult.Info(aux);
        }
    }    
    
    public void IntPrimerSegundo() {
        if(_noNodos >= 2) {
            TipoElem prim = _cab.Info();
            TipoElem segundo = _cab.Sig().Info();
            _cab.Info(segundo);
            _cab.Sig().Info(prim);
        }
    }
    
    public void EliMenosPrimeroYUltimo() {
        if(_noNodos >= 3) {
            Nodo p = _cab;
            while(p.Sig() != null)
                p = p.Sig();
            _cab.Sig(p);
            _noNodos = 2;
        }
    }
    
    public void EliPrimYUlt() {
        if(_noNodos <= 2) {
            _cab = null;
            _noNodos = 0;
        } else {
            _cab = _cab.Sig();
            Nodo p = _cab, q = null;
            while(p.Sig() != null) {
                q = p;
                p = p.Sig();
            }
            q.Sig(null);
            _noNodos-=2;
        }
            
    }
}
