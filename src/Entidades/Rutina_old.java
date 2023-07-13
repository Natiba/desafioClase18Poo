package Entidades;

public class Rutina {
    
    private int ID;
    private String nombre;
    private int duracion; 
    private String nivelDificultad;
    private String descripcion;

    public Rutina() {
    }

    public Rutina(int ID, String nombre, int duracion, String nivelDificultad, String descripcion) {
        this.ID = ID;
        this.nombre = nombre;
        this.duracion = duracion;
        this.nivelDificultad = nivelDificultad;
        this.descripcion = descripcion;
    }

    public int getID() {
        return ID;
    }

    public String getNombre() {
        return nombre;
    }

    public int getDuracion() {
        return duracion;
    }

    public String getNivelDificultad() {
        return nivelDificultad;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setDuracion(int duracion) {
        this.duracion = duracion;
    }

    public void setNivelDificultad(String nivelDificultad) {
        this.nivelDificultad = nivelDificultad;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    @Override
    public String toString() {
        return "Rutina{" + "ID=" + ID + ", nombre=" + nombre + ", duracion=" + duracion + ", nivelDificultad=" + nivelDificultad + ", descripcion=" + descripcion + '}';
    }
    
}

// CLASES:

//Crea una clase de entidad llamada "Rutina" con los siguientes atributos: id, nombre, duracion, 
//nivelDificultad, descripcion
//Crea una clase ServicioCliente y una clase ServicioRutina.