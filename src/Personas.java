/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author vina
 */
public class Personas {
    private String nombre;
    private int edad;

    public Personas() {
    }

    public Personas(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }
    
     public void pruebaPersonas()
    {
        if (this.edad > 18)
        {
            System.out.println("Usted es mayor de edad");
        }
        else
        {
            if (this.edad >=12 && this.getEdad()<=17){
                System.out.println("Usted es joven");
            }
            else
            {
            System.out.println("Usted es menor de edad, es un niño");
            }
        }
    } 
     public static void main(String[] args) {
         
         Personas con1 = new Personas("Juan",15);
         con1.pruebaPersonas();
         System.out.println(con1.getEdad());
         con1.setEdad(4);
         con1.pruebaPersonas();
         System.out.println(con1.getEdad());
         con1.setEdad(15);
         con1.pruebaPersonas();
         System.out.println("");
        
    }
}
