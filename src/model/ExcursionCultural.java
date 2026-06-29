package model;

public class ExcursionCultural extends ServicioTuristico {

    private String lugarHistorico;

    public ExcursionCultural(String nombre, int duracionHoras, String lugarHistorico) {

        super(nombre, duracionHoras);

        if (lugarHistorico == null || lugarHistorico.isBlank()) {
            throw new IllegalArgumentException("Debe indicar un lugar histórico.");
        }

        this.lugarHistorico = lugarHistorico;
    }

    public String getLugarHistorico() {
        return lugarHistorico;
    }

    @Override
    public String toString() {
        return super.toString() +
                "\nLugar histórico: " + lugarHistorico;
    }
}