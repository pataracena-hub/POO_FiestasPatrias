package cl.dsy1102.fonda;

public abstract class Bebida {
    protected String nombre;
    protected int volumenML;
    protected int stock;

    public Bebida(String nombre, int volumenML, int stock){
        this.nombre = nombre;
        this.volumenML = volumenML;
        this.stock = stock;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getVolumenML() {
        return volumenML;
    }

    public void setVolumenML(int volumenML) {
        this.volumenML = volumenML;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public abstract double calcularPrecio();
    public abstract String obtenerDetalle();
    public String toString(){
        // "Me llamo "+this.nombre+" y tengo "+this.volumenML+" litros de bebida"
        //Patricio100
        return "Nombre: "+ this.nombre +" | Volumen: " + this.volumenML;

    }

}
