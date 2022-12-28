package ar.com.example.proyectocodoacodo2022.dto;
import java.util.Date;
public class estudiantecac {
private int idPersona;
private String nombre;
private String apellido;
private int edad;

    public estudiantecac(int idPersona, String nombre, String apellido, int edad) {
        super();
        this.idPersona = idPersona;
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;

    }

    public int getidPersona() {
        return idPersona;
    }

    public void setidPersona(int idPersona) { this.idPersona = idPersona;}

    public String getnombre() {        return nombre;    }

    public void setnombre(String nombre) {     this.nombre = nombre;    }

    public String getapellido() {        return apellido;    }

    public void setapellido(String apellido) {        this.apellido = apellido;    }

    public int getedad() {        return edad;    }

    public void setedad(int edad) {        this.edad = edad;    }
}

