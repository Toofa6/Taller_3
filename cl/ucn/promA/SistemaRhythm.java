package cl.ucn.promA;

public interface SistemaRhythm {
    boolean registrarCuerda(String nombre, String codigo, String material, int precio, int stock, String tipo_cuerda, String numero_cuerdas, String tipo);
    boolean registrarPercusion(String nombre, String codigo, String material, int precio, int stock, String tipo_percusion, String altura);
    boolean registrarViento(String nombre, String codigo, String material, int precio, int stock);
    String[] desplegarInstrumentos(int indice);
    String desplegarInstrumento(String codigo);

}
