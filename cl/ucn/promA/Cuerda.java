package cl.ucn.promA;

public class Cuerda extends Instrumento{
    private String tipo_cuerda;
    private String numero_cuerdas;
    private String tipo;

    public Cuerda(String nombre, String codigo, String material, int precio, int stock, String tipo_cuerda, String numero_cuerdas, String tipo) {
        super(nombre, codigo, material, precio, stock);
        this.tipo_cuerda = tipo_cuerda;
        this.numero_cuerdas = numero_cuerdas;
        this.tipo = tipo;
    }
    public Cuerda(Instrumento instrumento){
        super(instrumento.getNombre(),instrumento.getCodigo(), instrumento.getMaterial(), instrumento.getPrecio(),instrumento.getStock());
        this.tipo_cuerda = ((Cuerda) instrumento).getTipo_cuerda();
        this.numero_cuerdas = ((Cuerda) instrumento).getNumero_cuerdas();
        this.tipo = ((Cuerda) instrumento).getTipo();
    }
    public String getTipo_cuerda() {
        return tipo_cuerda;
    }

    public void setTipo_cuerda(String tipo_cuerda) {
        this.tipo_cuerda = tipo_cuerda;
    }

    public String getNumero_cuerdas() {
        return numero_cuerdas;
    }

    public void setNumero_cuerdas(String numero_cuerdas) {
        this.numero_cuerdas = numero_cuerdas;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
}
