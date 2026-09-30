package cl.dsy1102.fonda;

public abstract class Bebida {
    private String nombre;
    private int volumenML;
    private int stock;

    public Bebida(String nombre, int volumenML, int stock){
        this.nombre = nombre;
        this.volumenML = volumenML;
        this.stock = stock;
    }

    //Getters y Setters
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        if (nombre == null || nombre.isEmpty()) {
            throw new IllegalArgumentException("ERROR!!, el nombre no puede ser nulo ni estar vacio");
        }
        this.nombre = nombre;
    }

    public int getVolumenML() {
        return volumenML;
    }

    public void setVolumenML(int volumenML) {
        if(volumenML < 100 || volumenML > 3000) {
            throw new IllegalArgumentException("ERROR!!, el volumen debe ser mayor a 100ml y menor a 3000ml");
        }
        this.volumenML = volumenML;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        if (stock <= 0) {
            throw new IllegalArgumentException("ERROR!!, el stock debe ser un numero positivo");
        }
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
//terminado