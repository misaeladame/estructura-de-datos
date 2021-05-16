/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica_01;

/**
 *
 * @author AM
 */
public class Mascota {
    // Atrib
    private String nombre;
    private String tipo;
    private int noVacunas;
    private double costoVacunas;
    private char sexo;
    private int edad;
    
    // Get
    public String getNombre(){
        return nombre;
    }
    
    public String getTipo(){
        return tipo;
    }
    
    public int getNoVacunas(){
        return noVacunas;
    }
    
    public double getCostoVacunas(){
        return costoVacunas;
    }
    
    public char getSexo(){
        return sexo;
    }
    
    public int getEdad(){
        return edad;
    }
    
    
    // Set
    public void setNombre(String nom){
        nombre = nom;
    }
    
    public void setTipo(String tip){
        tipo = tip;
    }
    
    public void setNoVacunas(int noV){
        noVacunas = noV;
    }
    
    public void setCostoVacunas(double cosV){
        costoVacunas = cosV;
    }
    
    public void setSexo(char sex){
        sexo = sex;
    }
    
    public void setEdad(int ed){
        edad = ed;
    }
    
    // Met
    public void Leer(String nom, String tip, int noV, double cosV, char sex, int ed){
        nombre = nom;
        tipo = tip;
        noVacunas = noV;
        costoVacunas = cosV;
        sexo = sex;
        edad = ed;
    }
}
