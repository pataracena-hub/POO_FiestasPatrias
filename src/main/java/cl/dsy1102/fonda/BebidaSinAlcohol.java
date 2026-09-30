package cl.dsy1102.fonda;

public class BebidaSinAlcohol extends Bebida {
    private int azucarPorLitro;

    //Constructor
    public BebidaSinAlcohol(String nombre, int volumenML, int stock, int azucarPorLitro) {
        super(nombre, volumenML, stock);
        this.azucarPorLitro = azucarPorLitro;
    }
    //Getters and Setters
    public int getAzucarPorLitro() {
        return azucarPorLitro;
    }
    public void setAzucarPorLitro(int azucarPorLitro) {
        this.azucarPorLitro = azucarPorLitro;
    }
    //Metodos
    @Override
    public double calcularPrecio(){
        double precio = 2000;
        if(azucarPorLitro > 80){
            precio = (precio * 1.1);
        }
        return precio;
    }

    @Override
    public String obtenerDetalle() {
        return ("===================================\n" +
                "Nombre:               %s\n" +
                "Volumen(ml):          %s\n" +
                "Stock:                %d\n" +
                "Azucar/L(g):          %d\n" +
                "Precio:               $%.0f\n" +
                "===================================\n").formatted(getNombre(), getVolumenML(), getStock(), getAzucarPorLitro(), calcularPrecio());
    }

}
// terminado
