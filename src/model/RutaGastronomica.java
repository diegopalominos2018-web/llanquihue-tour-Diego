package model;

public class RutaGastronomica extends ServicioTuristico {

    private int numeroDeParadas;

    public RutaGastronomica(String nombre, int duracionHoras, int numeroDeParadas) {

        super(nombre, duracionHoras);

        if (numeroDeParadas <= 0) {
            throw new IllegalArgumentException("Debe tener al menos una parada.");
        }

        this.numeroDeParadas = numeroDeParadas;
    }

    public int getNumeroDeParadas() {
        return numeroDeParadas;
    }

    @Override
    public String toString() {
        return super.toString() +
                "\nNúmero de paradas: " + numeroDeParadas;
    }
}