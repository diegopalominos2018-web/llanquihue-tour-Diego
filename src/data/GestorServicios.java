package data;

import model.RutaGastronomica;
import model.PaseoLacustre;
import model.ExcursionCultural;

public class GestorServicios {

    public void mostrarServicios() {

        RutaGastronomica ruta1 =
                new RutaGastronomica(
                        "Ruta del Salmón",
                        5,
                        4);

        RutaGastronomica ruta2 =
                new RutaGastronomica(
                        "Ruta Cervecera",
                        6,
                        5);

        PaseoLacustre paseo1 =
                new PaseoLacustre(
                        "Lago Llanquihue",
                        3,
                        "Catamarán");

        PaseoLacustre paseo2 =
                new PaseoLacustre(
                        "Lago Todos los Santos",
                        4,
                        "Lancha");

        ExcursionCultural excursion1 =
                new ExcursionCultural(
                        "Puerto Varas Histórico",
                        2,
                        "Iglesia del Sagrado Corazón");

        ExcursionCultural excursion2 =
                new ExcursionCultural(
                        "Frutillar Patrimonial",
                        3,
                        "Teatro del Lago");

        System.out.println(ruta1);
        System.out.println();

        System.out.println(ruta2);
        System.out.println();

        System.out.println(paseo1);
        System.out.println();

        System.out.println(paseo2);
        System.out.println();

        System.out.println(excursion1);
        System.out.println();

        System.out.println(excursion2);
    }

}