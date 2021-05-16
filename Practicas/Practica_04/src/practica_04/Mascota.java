/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica_04;

/**
 *
 * @author terry
 */
public class Mascota {

    private String nombre;
    private String tipo;
    private int noVacunas;
    private double costoVacunas;
    private String sexo;
    private int edad;

    public Mascota(String nombre, String tipo, int noVacunas, 
                   double costoVacunas, String sexo, int edad) {
        this.nombre = nombre;
        this.tipo = tipo;
        this.noVacunas = noVacunas;
        this.costoVacunas = costoVacunas;
        this.sexo = sexo;
        this.edad = edad;
    }
    
    public Mascota() {
        // Solo reservo espacio de memoria
    }

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
}
