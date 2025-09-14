/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package nuevos.amigos;

/**
 *
 * @author KUAA
 */
public class NuevosAmigos {
    private String nombre;
    private String apellido;
    private String direccion;
    private int edad;
    private String estadoCivil;

    public NuevosAmigos(String nombre, String apellido, String direccion, int edad, String estadoCivil) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.direccion = direccion;
        this.edad = edad;
        this.estadoCivil = estadoCivil;
    }

    public String getEstadoCivil() {
        return estadoCivil;
    }
    
    @Override
    public String toString() {
        return nombre + " " + apellido + " | " + edad + " años | direccion:" + direccion + " | estadoCivil: " + estadoCivil;      
    }
    
}



