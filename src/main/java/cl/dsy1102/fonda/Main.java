package cl.dsy1102.fonda;

/**
 * Punto de entrada de la Tarea Fiestas Patrias - Fonda San Belarmino.
 *
 * Revisa el enunciado en README.md. Debes crear, en este mismo paquete,
 * las clases del diagrama: Bebida, BebidaAlcoholica, BebidaSinAlcohol,
 * la interfaz ConsumoResponsable y la clase GestorFonda.
 */
public class Main {
    public static void main(String[] args) {
        System.out.println("========== INICIANDO PRUEBAS DE BEBIDAS ==========\n");

        BebidaAlcoholica chichaAlcohol = new BebidaAlcoholica("Chicha", 1000, 40, 12.0, false, true);
        BebidaAlcoholica piscoSour = new BebidaAlcoholica("Pisco_Sour", 500, 25, 18.0, true, false);
        BebidaSinAlcohol chichaSinAlcohol = new BebidaSinAlcohol("Chicha", 1000, 60, 95);
        BebidaSinAlcohol moteConHuesillo = new BebidaSinAlcohol("Mote", 400, 50, 70);

        System.out.println("[SOLUCION] Objetos instanciados correctamente!!");
        System.out.println("============= APLICAR RESTRICCION ==================");
        chichaAlcohol.restringirVenta();
        System.out.println("Estado de Restriccion de la chicha: " + chichaAlcohol.tieneVentaRestringida());

        System.out.println("============ VISUALIZACION DETALLE ==============");
        System.out.println(chichaAlcohol.obtenerDetalle());
        System.out.println(chichaSinAlcohol.obtenerDetalle());
        System.out.println(piscoSour.obtenerDetalle());
        System.out.println(moteConHuesillo.obtenerDetalle());
    }
}