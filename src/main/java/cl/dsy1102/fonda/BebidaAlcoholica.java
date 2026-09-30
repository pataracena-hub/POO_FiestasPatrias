package cl.dsy1102.fonda;

public class BebidaAlcoholica extends Bebida implements ConsumoResponsable {
    private double gradosAlcohol;
    private boolean certificada;
    private boolean ventaRestringida;
    public static final int MAX_UNIDADES = 3;

    public BebidaAlcoholica(String nombre, int volumenML, int stock, double gradosAlcohol, boolean certificada, boolean ventaRestringida){
        super(nombre, volumenML, stock);
        if(gradosAlcohol <= 0.5 || gradosAlcohol >= 45) {
            throw new IllegalArgumentException("ERROR!!, los grados de alcohol deben estar entre 0.5 y 45");
        }

        this.gradosAlcohol = gradosAlcohol;
        this.certificada = certificada;
        this.ventaRestringida = ventaRestringida;
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

    @Override
    public double calcularPrecio() {
        double precio = 3500;
        if(!certificada){
            precio = precio * 1.2;
        }
        return precio;
    }

    @Override
    public String obtenerDetalle() {
        return ("======================== \n" +
                "Nombre:                %s\n" +
                "Volumen(ml):           %d\n" +
                "Stock:                 %d\n" +
                "Grados Alcohol:      %.1f\n" +
                "Certificada            %s\n" +
                "Restringida:           %s\n" +
                "Precio:             $%.0f\n" +
                "========================\n").formatted(getNombre(),getVolumenML(),getStock(),getGradosAlcohol(),isCertificada(),isVentaRestringida(),calcularPrecio());
    }

    @Override
    public boolean tieneVentaRestringida() {
        return this.ventaRestringida;
    }

    @Override
    public void restringirVenta() {
        this.ventaRestringida = true;
    }

    @Override
    public boolean superaLimite(int cantidad) {
        return cantidad > MAX_UNIDADES;
    }





}


