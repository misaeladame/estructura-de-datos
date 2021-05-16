/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica_03;
import java.util.ArrayList;

/**
 *
 * @author friosa
 */
public class Pila {
    ArrayList<Mascota> elems;
    int capacidad;
    
    public Pila() {
        elems = new ArrayList<>();
        capacidad = 0;
    }
    
    public Pila(int capacidad) {
        elems = new ArrayList<>();
        this.capacidad = capacidad <= 0 ? 0 : capacidad;
    }
    
    public boolean Full() {
        return capacidad > 0 && capacidad == elems.size();
    }
    
    public boolean Empty() {
        return elems.isEmpty();
    }
    
    public void Push(Mascota elem) {
        if (!Full()) 
            elems.add(elem);
    }
    
    public Mascota Pop() {
        if (! Empty()) {
            Mascota tope = elems.get(elems.size()-1);
            elems.remove(elems.size()-1);
            return tope;
        } 
        else
            return new Mascota();
    }
    
    public int Length() {
        return elems.size();
    }
    
    public Mascota Tope() {
        return ! Empty() ? elems.get(elems.size()-1) : new Mascota();
    }
    
    public void Invertir() {
        if(elems.size() > 1) 
            for(int i=0; i<elems.size()-1; i++)
                elems.add(i,elems.remove(elems.size()-1));
        
    }
    // Método para intercambiar las mascotas de ambos grupos menos el tope 
    // (COMPETENCIA 7)
    
    public void IntercambiarMenosTope(Pila p) {
        final int tam1 = elems.size()-1;
        final int tam2 = p.elems.size();
        
        Mascota tope1 = elems.remove(elems.size()-1);
        
        for(int i = 0; i < tam2; i++)
            elems.add(p.elems.remove(0));
        
        for(int i = 0; i < tam1; i++)
            p.elems.add(elems.remove(0));
        
        p.elems.add(elems.remove(elems.size()-1));
        elems.add(tope1);
    } 
}
