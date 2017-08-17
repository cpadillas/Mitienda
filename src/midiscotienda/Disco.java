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
public class Disco {
    private String nombre;
    private String artista;
    private String genero;
    private String imagen;
    private Cancion[] cancion ;
    private int n;
  
    public Disco(String nombre, String artista, String genero, String imagen) {
        this.nombre = nombre;
        this.artista = artista;
        this.genero = genero;
        this.imagen = imagen;
        this.n=1;
        this.cancion= new Cancion[10];
    }
    public String getNombre() {
        return nombre;
    }
    
    public void setCancion(Cancion can) {
        if(this.n<10){
            this.cancion[n] = can;
            this.n++;
        }
        else
            System.out.println("Limite de canciones alcanzados en el disco "+this.nombre);
    }
    
    
}
