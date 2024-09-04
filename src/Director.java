/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author vina
 */
public class Director {
    
    private String nombre,nacionalidad;
    private int edad,cantidadProyectos;

    public Director() {
    }

    public Director(String nombre, String nacionalidad, int edad, int cantidadProyectos) {
        this.nombre = nombre;
        this.nacionalidad = nacionalidad;
        this.edad = edad;
        this.cantidadProyectos = cantidadProyectos;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNacionalidad() {
        return nacionalidad;
    }

    public void setNacionalidad(String nacionalidad) {
        this.nacionalidad = nacionalidad;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public int getCantidadProyectos() {
        return cantidadProyectos;
    }

    public void setCantidadProyectos(int cantidadProyectos) {
        this.cantidadProyectos = cantidadProyectos;
    }

    @Override
    public String toString() {
        return "Director{" + "nombre=" + nombre + ", nacionalidad=" + nacionalidad + ", edad=" + edad + ", cantidadProyectos=" + cantidadProyectos + '}';
    }
    
    public void saludoDirector(){
        System.out.println("Hola a todos mid seguidores!!! les habla" + this.getNombre());
    
    }
        
    
    
    
    
}
