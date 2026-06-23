package model;

public class Guia {

    private String nombre;
    private String experiencia;

    public Guia(String nombre, String experiencia) {
        this.nombre = nombre;
        this.experiencia = experiencia;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getExperiencia() {
        return experiencia;
    }

    public void setExperiencia(String experiencia) {
        this.experiencia = experiencia;
    }

    @Override
    public String toString() {
        return nombre + " (" + experiencia + ")";
    }
}