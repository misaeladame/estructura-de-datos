/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto;

/**
 *
 * @author friosa
 */
public class TipoElem {
    private int _noctrl;
    private String _nombre;
    private int _calif;
    
    public TipoElem(int noctrl,String nombre,int calif) {
        _noctrl = noctrl;
        _nombre = nombre;
        _calif = calif;
    }
     public TipoElem() {
        _noctrl = 0;
        _nombre = "";
        _calif = 0;
    }
     public TipoElem(String nom) {
        _noctrl = 0;
        _nombre = nom;
        _calif = 0;
    }
    public int NoCtrl() {
        return _noctrl;
    }
    public String Nombre() {
        return _nombre;
    }
    public int Calif() {
        return _calif;
    }
    public void Nombre(String n) {
        _nombre = n;
    }
    public void Calif(int c) {
        _calif = c;
    }
    public void NoCtrl(int n){
        _noctrl = n;
    }

}
