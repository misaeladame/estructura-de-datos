/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejer2AmigosWinApp;

/**
 *
 * @author friosa
 */
public class Persona {
    private String _nombre;
    private int _edad;
    private char _sexo;
    private String _correo;
    
    public void setNombre(String nombre) {
        _nombre = nombre;
    }
    public void setEdad(int edad) {
        _edad = edad;
    }
    public void setSexo(char sexo) {
        _sexo = sexo;
    }
    public void setCorreo(String correo) {
       _correo = correo;
    }
    public String getNombre() {
        return _nombre;
    }
    public int getEdad() {
        return _edad;
    }
    public char getSexo() {
        return _sexo;
    }
    public String getCorreo() {
        return _correo;
    }

    public void Copia(Persona pers) {
        _nombre = pers._nombre;
        _edad = pers._edad;
        _sexo = pers._sexo;
        _correo = pers._correo;
    }
}
