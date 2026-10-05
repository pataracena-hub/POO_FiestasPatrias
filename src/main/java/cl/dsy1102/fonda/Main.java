package cl.dsy1102.fonda;

public class Main {
    public static void main(String[] args) {
        // Inicializar el gestor de la fonda
        GestorFonda gestor = new GestorFonda();

        System.out.println("========== 1. INSTANCIAR BEBIDAS ==========");

        BebidaAlcoholica chichaAlcohol = new BebidaAlcoholica("Chicha", 1000, 40, 12.0, false, false);
        BebidaAlcoholica piscoSour = new BebidaAlcoholica("Pisco Sour", 500, 25, 18.0, true, false);
        BebidaSinAlcohol chichaSinAlcohol = new BebidaSinAlcohol("Chicha Sin Alcohol", 1000, 60, 95);
        BebidaSinAlcohol mote = new BebidaSinAlcohol("Mote con Huesillo", 400, 50, 70);


        System.out.println("\n========== 2. REQUERIMIENTO: RESTRINGIR VENTA ==========");
        chichaAlcohol.restringirVenta();
        System.out.println("[INFO] - Venta restringida activada para: " + chichaAlcohol.getNombre());


        System.out.println("\n========== 3. REGISTRAR BEBIDAS EN EL GESTOR ==========");
        gestor.registrar(chichaAlcohol);
        gestor.registrar(piscoSour);
        gestor.registrar(chichaSinAlcohol);
        gestor.registrar(mote);


        System.out.println("\n========== 4. PROCESAR VENTAS SOLICITADAS ==========");
        // Venta 1: 2 unidades de Pisco Sour (Debe ser exitosa)
        System.out.println("\n-> Solicitando Venta 1: 2 unidades de Pisco Sour");
        gestor.vender("Pisco Sour", 2);

        // Venta 2: 5 unidades de Pisco Sour (Debe rechazarse por superar el límite de 3)
        System.out.println("\n-> Solicitando Venta 2: 5 unidades de Pisco Sour");
        gestor.vender("Pisco Sour", 5);

        // Venta 3: 1 unidad de Chicha alcohólica (Debe rechazarse porque está restringida)
        System.out.println("\n-> Solicitando Venta 3: 1 unidad de Chicha");
        gestor.vender("Chicha", 1);

        // Venta 4: 6 unidades de Mote con Huesillo (Debe ser exitosa ya que no tiene límites de alcohol)
        System.out.println("\n-> Solicitando Venta 4: 6 unidades de Mote con Huesillo");
        gestor.vender("Mote con Huesillo", 6);


        System.out.println("\n========== 5. OPERACIONES DE BÚSQUEDA Y LISTADO ==========");

        // Requerimiento: Buscar por nombre
        String criterioBusqueda = "Pisco Sour";
        System.out.println("\n--- Buscando bebidas que coincidan con '" + criterioBusqueda + "' ---");
        for (Bebida b : gestor.buscarPorNombre(criterioBusqueda)) {
            System.out.println("- Encontrada: " + b.getNombre() + " | Stock actual: " + b.getStock());
        }

        System.out.println("\n--- Listado resumido de todas las bebidas (toString) ---");
        for (Bebida b : gestor.obtenerTodas()) {
            System.out.println(b.toString());

        }
    }
}
