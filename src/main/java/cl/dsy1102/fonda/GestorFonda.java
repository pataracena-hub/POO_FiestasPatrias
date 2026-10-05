package cl.dsy1102.fonda;

import java.util.ArrayList;
import java.util.List;

public class GestorFonda {
    private List<Bebida> bebidas;

    // Constructor: Inicializando la lista vacía
    public GestorFonda() {
        this.bebidas = new ArrayList<>();
    }

    // 1. Registrar una bebida
    public void registrar(Bebida bebida) {
        this.bebidas.add(bebida);
        System.out.println("[SISTEMA] - " + bebida.getNombre() + " fue incorporada correctamente.");
    }

    // 2. Buscar bebidas por nombre
    public List<Bebida> buscarPorNombre(String nombre) {
        List<Bebida> encontradas = new ArrayList<>();
        for (Bebida b : bebidas) {
            // Compara ignorando mayúsculas/minúsculas o si contiene el texto
            if (b.getNombre().equalsIgnoreCase(nombre)) {
                encontradas.add(b);
            }
        }
        return encontradas;
    }

    // 3. Retornar todas las bebidas
    public List<Bebida> obtenerTodas() {
        return this.bebidas;
    }

    // 4. Vendiendo una bebida
    public void vender(String nombre, int unidades) {
        // Buscamos si la bebida existe en nuestro inventario
        Bebida bebidaEncontrada = null;
        for (Bebida b : bebidas) {
            if (b.getNombre().equalsIgnoreCase(nombre)) {
                bebidaEncontrada = b;
                break; // Terminamos la búsqueda al encontrar la primera coincidencia
            }
        }

        // Si no existe la bebida
        if (bebidaEncontrada == null) {
            System.out.println("[RECHAZADO] - La bebida '" + nombre + "' no existe en el sistema.");
            return;
        }

        // Preguntamos si la bebida firmó el contrato de "ConsumoResponsable"
        if (bebidaEncontrada instanceof ConsumoResponsable) {
            // Hacemos un "cast" para poder usar los métodos de la interfaz
            ConsumoResponsable alcoholica = (ConsumoResponsable) bebidaEncontrada;

            // Regla A: Rechazar si la venta está restringida
            if (alcoholica.tieneVentaRestringida()) {
                System.out.println("[RECHAZADO] - Venta denegada. La bebida '" + nombre + "' tiene la venta restringida.");
                return;
            }

            // Regla B: Rechazar si las unidades superan el límite (las 3 unidades)
            if (alcoholica.superaLimite(unidades)) {
                System.out.println("[RECHAZADO] - Venta denegada. Supera el límite máximo permitido por cliente.");
                return;
            }
        }

        // Validar si hay suficiente stock físico
        if (bebidaEncontrada.getStock() < unidades) {
            System.out.println("[RECHAZADO] - No hay suficiente stock. Disponible: " + bebidaEncontrada.getStock());
            return;
        }

        // Si superó todas las pruebas, se procesa la venta exitosamente
        bebidaEncontrada.setStock(bebidaEncontrada.getStock() - unidades); // Descontamos del inventario
        double totalAPagar = bebidaEncontrada.calcularPrecio() * unidades;

        System.out.println("[VENTA EXITOSA] - Producto: " + bebidaEncontrada.getNombre());
        System.out.println("                  Cantidad: " + unidades);
        System.out.println("                  Total a pagar: $" + String.format("%.0f", totalAPagar));
    }
}
