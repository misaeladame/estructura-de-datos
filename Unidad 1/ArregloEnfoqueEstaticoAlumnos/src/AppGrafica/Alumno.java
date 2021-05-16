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
public class Alumno {
    private String _noCon;
    private String _nombre;
    private char _sexo;
    private int _calif; 
    
    public void Copia(Alumno alu) {
        _noCon = alu._noCon;
        _nombre = alu._nombre;
        _sexo = alu._sexo;
        _calif = alu._calif;
    }
    
    public String getNoCon() {
        return _noCon;
    }
    public String getNombre() {
        return _nombre;
    }
    public char getSexo() {
        return _sexo;
    }
    public int getCalif() {
        return _calif;
    }
    public void Leer(String noCon,String nombre,char sexo,int calif) {
        _noCon = noCon;
        _nombre = nombre;
        _sexo = sexo;
        _calif = calif;
    }
    
}
