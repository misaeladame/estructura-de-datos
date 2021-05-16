/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AppGrafica;
import java.util.ArrayList;

/**
 *
 * @author friosa
 */
public class Pila {
    ArrayList<TipoElem> _elems;
    int _capacidad;
    
    public Pila() {
        _elems = new ArrayList<>();
        _capacidad = 0;
    }
    public Pila(int capacidad) {
        _elems = new ArrayList<>();
        _capacidad = capacidad <= 0 ? 0 : capacidad;
    }
    public boolean Full() {
        return _capacidad > 0 && _capacidad == _elems.size();
    }
    public boolean Empty() {
        return _elems.isEmpty();
    }
    public void Push(TipoElem elem) {
        if (!Full()) 
            _elems.add(elem);
    } 
    public TipoElem Pop() {
        if (! Empty()) {
            TipoElem tope = _elems.get(_elems.size()-1);
            _elems.remove(_elems.size()-1);
            return tope;
        } 
        else
            return new TipoElem();
    }
    public int Length() {
        return _elems.size();
    }
    public TipoElem Tope() {
        return ! Empty() ? _elems.get(_elems.size()-1) : new TipoElem();
    }
    
    public void eliminarMenosTresFondos() {
        while(_elems.size() > 3)
            _elems.remove(_elems.size()-1);
    }
    
    public void IntercambiarFondos() {
        if(_elems.size() > 1) {
            TipoElem fondo = _elems.get(0);
            _elems.set(0, _elems.get(1));
            _elems.set(1, fondo);
        }
    }
    
    public void IntercambiarTopes() {
        if(_elems.size() > 1) {
            TipoElem tope = _elems.get(_elems.size()-1);
            _elems.set(_elems.size()-1, _elems.get(_elems.size()-2));
            _elems.set(_elems.size()-2, tope);
        }
    }
}
