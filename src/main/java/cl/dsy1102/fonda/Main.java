package cl.dsy1102.fonda;

public class Main {
    public static void main(String[] args) {
        System.out.println("========== INICIANDO PRUEBAS DE BEBIDAS ============\n");

        BebidaAlcoholica chichaAlcohol = new BebidaAlcoholica("Chicha", 1000, 40, 12.0, false, true);
        BebidaAlcoholica piscoSour = new BebidaAlcoholica("Pisco_Sour", 500, 25, 18.0, true, false);
        BebidaSinAlcohol chichaSinAlcohol = new BebidaSinAlcohol("Chicha", 1000, 60, 95);
        BebidaSinAlcohol moteConHuesillo = new BebidaSinAlcohol("Mote", 400, 50, 70);

        System.out.println("[SOLUCION] Objetos instanciados correctamente!!\n");
        System.out.println("============= APLICAR RESTRICCION ==================\n");
        chichaAlcohol.restringirVenta();
        System.out.println("Estado de Restriccion de la chicha: " + chichaAlcohol.tieneVentaRestringida() + "\n");

        System.out.println("============ VISUALIZACION DETALLE =================");
        System.out.println(chichaAlcohol.obtenerDetalle());
        System.out.println(chichaSinAlcohol.obtenerDetalle());
        System.out.println(piscoSour.obtenerDetalle());
        System.out.println(moteConHuesillo.obtenerDetalle());
    }
}

//terminado transitorio