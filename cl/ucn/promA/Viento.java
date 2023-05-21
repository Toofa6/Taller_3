package cl.ucn.promA;

public class Viento extends Instrumento{

    public Viento(String nombre, String codigo, String material, int precio, int stock) {
        super(nombre, codigo, material, precio, stock);
    }
    public Viento(Instrumento instrumento){
        super(instrumento.getNombre(),instrumento.getCodigo(), instrumento.getMaterial(), instrumento.getPrecio(),instrumento.getStock());
    }
}
