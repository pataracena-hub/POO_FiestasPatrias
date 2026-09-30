package cl.dsy1102.fonda;

public class BebidaAlcoholica extends Bebida implements ConsumoResponsable {
    private double gradosAlcohol;
    private boolean certificada;
    private boolean ventaRestringida;
    private int limiteUnidadesCliente;

    public BebidaAlcoholica(String nombre, int volumenML, int stock,double gradosAlcohol, boolean certificada, boolean ventaRestringida, int limiteUnidadesCliente){
        super(nombre, volumenML, stock);
        this.gradosAlcohol = gradosAlcohol;
        this.certificada = certificada;
        this.ventaRestringida = ventaRestringida;
        this.limiteUnidadesCliente = limiteUnidadesCliente;
    }

    public double getGradosAlcohol() {
        return gradosAlcohol;
    }

    public void setGradosAlcohol(double gradosAlcohol) {
        this.gradosAlcohol = gradosAlcohol;
    }

    public boolean isCertificada() {
        return certificada;
    }

    public void setCertificada(boolean certificada) {
        this.certificada = certificada;
    }

    public boolean isVentaRestringida() {
        return ventaRestringida;
    }

    public void setVentaRestringida(boolean ventaRestringida) {
        this.ventaRestringida = ventaRestringida;
    }

    public int getLimiteUnidadesCliente() {
        return limiteUnidadesCliente;
    }

    public void setLimiteUnidadesCliente(int limiteUnidadesCliente) {
        this.limiteUnidadesCliente = limiteUnidadesCliente;
    }

    @Override
    public double calcularPrecio() {
        return 0;
    }

    @Override
    public String obtenerDetalle() {
        return "";
    }
}
