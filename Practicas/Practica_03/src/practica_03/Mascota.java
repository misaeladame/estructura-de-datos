/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica_03;

/**
 *
 * @author AM
 */
public class Mascota {
    // Atributos
    private String nombre;
    private String tipo;
    private int noVacunas;
    private double costoVacunas;
    private String sexo;
    private int edad;

    // Constructores
    public Mascota() {
        nombre = "NoId";
        tipo = "NoId";
        noVacunas = 0;
        costoVacunas = 0;
        sexo = "NoId";
        edad = 0; 
    }
    
    public Mascota(String nombre, String tipo, int noVacunas, double costoVacunas, String sexo, int edad) {
        this.nombre = nombre;
        this.tipo = tipo;
        this.noVacunas = noVacunas;
        this.costoVacunas = costoVacunas;
        this.sexo = sexo;
        this.edad = edad;
    }
    
    // Métodos get/set
    public String getNombre() {
        return nombre;
    }

    public String getTipo() {
        return tipo;
    }

    public int getNoVacunas() {
        return noVacunas;
    }

    public double getCostoVacunas() {
        return costoVacunas;
    }

    public String getSexo() {
        return sexo;
    }

    public int getEdad() {
        return edad;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public void setNoVacunas(int noVacunas) {
        this.noVacunas = noVacunas;
    }

    public void setCostoVacunas(double costoVacunas) {
        this.costoVacunas = costoVacunas;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }
}
