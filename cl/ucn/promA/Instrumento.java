package cl.ucn.promA;

public class Instrumento {
    private String nombre;
    private String codigo;
    private String material;
    private int precio;
    private int stock;

    public Instrumento(String nombre, String codigo, String material, int precio, int stock) {
        this.nombre = nombre;
        this.codigo = codigo;
        this.material = material;
        this.precio = precio;
        this.stock = stock;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }
    public String toString(){
        return "Nombre: "+this.nombre+"\nCodigo: "+this.codigo+"\nStock: "+this.stock+"\nPrecio: $"+this.precio;
    }
}
