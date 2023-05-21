package cl.ucn.promA;

public class Percusion extends Instrumento{
    private String tipo_percusion;
    private String altura;

    public Percusion(String nombre, String codigo, String material, int precio, int stock, String tipo_percusion, String altura) {
        super(nombre, codigo, material, precio, stock);
        this.tipo_percusion = tipo_percusion;
        this.altura = altura;
    }
    public Percusion(Instrumento instrumento){
        super(instrumento.getNombre(),instrumento.getCodigo(), instrumento.getMaterial(), instrumento.getPrecio(),instrumento.getStock());
        this.tipo_percusion = ((Percusion) instrumento).getTipo_percusion();
        this.altura = ((Percusion) instrumento).getAltura();
    }
    public String getTipo_percusion() {
        return tipo_percusion;
    }

    public void setTipo_percusion(String tipo_percusion) {
        this.tipo_percusion = tipo_percusion;
    }

    public String getAltura() {
        return altura;
    }

    public void setAltura(String altura) {
        this.altura = altura;
    }
}
