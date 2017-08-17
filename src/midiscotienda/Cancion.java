/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package midiscotienda;

/**
 *
 * @author Estudiante
 */
public class Cancion {
    private String nombre;
    private double precio;
    private double duracion;
    private double tamaño;
    private double calidad;

    public Cancion(String nombre, double precio, double duracion, double tamaño, double calidad) {
        this.nombre = nombre;
        this.precio = precio;
        this.duracion = duracion;
        this.tamaño = tamaño;
        this.calidad = calidad;
    }

    public String getNombre() {
        return nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public double getDuracion() {
        return duracion;
    }

    public double getTamaño() {
        return tamaño;
    }

    public double getCalidad() {
        return calidad;
    }
    
    
}
