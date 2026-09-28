package cl.dsy1102.fonda;

public class BebidaSinAlcohol extends Bebida{
    private int azucarPorLitro;

    public BebidaSinAlcohol(int azucarPorLitro) {
        super(nombre,volumenML,stock);
        this.azucarPorLitro = azucarPorLitro;
    }

    public int getAzucarPorLitro() {return azucarPorLitro;}

    public void setAzucarPorLitro(int azucarPorLitro) {this.azucarPorLitro = azucarPorLitro;}

    @Override
    public double calcularPrecio() {
        return 0;
    }

    @Override
    public String obtenerDetalle() {
        return "";
    }

}
