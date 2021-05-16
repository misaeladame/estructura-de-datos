/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica_04;

import java.util.ArrayList;

/**
 *
 * @author friosa
 */
public class Cola {
    private ArrayList<Mascota> _elems;
    private int _capacidad;
    
    public Cola() {
        _elems = new ArrayList<>();
        _capacidad = 0;  // cola sin limites
    }
    public Cola(int dimension) {
        _elems = new ArrayList<>();
        _capacidad = dimension > 0? dimension : 0;
    }
    public boolean Empty() {
        return _elems.isEmpty();
    }
    public boolean Full() {
        return _capacidad > 0 && _elems.size() == _capacidad;
    }
    public int Length() {
        return _elems.size();
    }
    public void Insert(Mascota elem) {
        if (!Full()) 
            _elems.add(elem);
    }
    public Mascota Remove() {
       return !Empty()? _elems.remove(0) : new Mascota();
    }
    
    public void EliminarUltimo() {
        if(_elems.size() > 0)
            _elems.remove(_elems.size()-1);
    } 
    
    public void EliminarMenosPrimero() {
        while(_elems.size() > 1)
            _elems.remove(1);
    }
    
    public void EliminarMenosPenultimo() {
        if(_elems.size() > 0) {
            _elems.remove(_elems.size()-1);
            while(_elems.size() > 1)
                _elems.remove(0);
        }       
    }
    
    public void Examen() {
        if(_elems.size() > 2) {
            Mascota segundo = _elems.remove(1);
            Mascota ultimo = _elems.remove(_elems.size()-1);
            _elems.add(ultimo);
            _elems.add(segundo);           
        }
    }
}
