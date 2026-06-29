package model;

public class PaseoLacustre extends ServicioTuristico {

    private String tipoEmbarcacion;

    public PaseoLacustre(String nombre, int duracionHoras, String tipoEmbarcacion) {

        super(nombre, duracionHoras);

        if (tipoEmbarcacion == null || tipoEmbarcacion.isBlank()) {
            throw new IllegalArgumentException("Debe indicar el tipo de embarcación.");
        }

        this.tipoEmbarcacion = tipoEmbarcacion;
    }

    public String getTipoEmbarcacion() {
        return tipoEmbarcacion;
    }

    @Override
    public String toString() {
        return super.toString() +
                "\nTipo de embarcación: " + tipoEmbarcacion;
    }
}