package cl.ucn.promA;

public class SistemaRhythmImpl implements SistemaRhythm {
    private final ListaInstrumentos lista_instrumentos;

    public SistemaRhythmImpl() {
        lista_instrumentos = new ListaInstrumentos(100);
    }

    @Override
    public boolean registrarCuerda(String nombre, String codigo, String material, int precio, int stock, String tipo_cuerda, String numero_cuerdas, String tipo) {
        Cuerda nueva_cuerda = new Cuerda(nombre, codigo, material, precio, stock, tipo_cuerda, numero_cuerdas, tipo);
        return this.lista_instrumentos.agregarInstrumento(nueva_cuerda);
    }

    @Override
    public boolean registrarPercusion(String nombre, String codigo, String material, int precio, int stock, String tipo_percusion, String altura) {
        Percusion nueva_percusion = new Percusion(nombre, codigo, material, precio, stock, tipo_percusion, altura);
        return this.lista_instrumentos.agregarInstrumento(nueva_percusion);
    }

    @Override
    public boolean registrarViento(String nombre, String codigo, String material, int precio, int stock) {
        Viento nuevo_viento = new Viento(nombre, codigo, material, precio, stock);
        return this.lista_instrumentos.agregarInstrumento(nuevo_viento);
    }

    @Override
    public String[] desplegarInstrumentos(int indice) {
        int cant_produtcos = 0;
        if (indice == 0) {
            for (int i = 0; i < this.lista_instrumentos.getCantInstrumentos(); i++) {
                if (this.lista_instrumentos.obtenerPorPosicion(i) instanceof Cuerda) {
                    cant_produtcos++;
                }
            }
            String[] lista = new String[cant_produtcos + 1];
            String mensaje = "~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~\nLista Actual: Cuerdas\n";
            lista[0] = mensaje;
            int aux = 1;
            for (int i = 0; i < this.lista_instrumentos.getCantInstrumentos(); i++) {
                if (this.lista_instrumentos.obtenerPorPosicion(i) instanceof Cuerda) {
                    Instrumento instrumento_actual = this.lista_instrumentos.obtenerPorPosicion(i);
                    mensaje = instrumento_actual.toString();
                    lista[aux] = mensaje;
                    aux++;
                }
            }
            return lista;
        } else if (indice == 1) {
            for (int i = 0; i < this.lista_instrumentos.getCantInstrumentos(); i++) {
                if (this.lista_instrumentos.obtenerPorPosicion(i) instanceof Percusion) {
                    cant_produtcos++;
                }
            }
            String[] lista = new String[cant_produtcos + 1];
            String mensaje = "~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~\nLista Actual: Percusión\n";
            lista[0] = mensaje;
            int aux = 1;
            for (int i = 0; i < this.lista_instrumentos.getCantInstrumentos(); i++) {
                if (this.lista_instrumentos.obtenerPorPosicion(i) instanceof Percusion) {
                    Instrumento instrumento_actual = this.lista_instrumentos.obtenerPorPosicion(i);
                    mensaje = instrumento_actual.toString();
                    lista[aux] = mensaje;
                    aux++;
                }
            }
            return lista;
        } else if (indice == 2) {
            for (int i = 0; i < this.lista_instrumentos.getCantInstrumentos(); i++) {
                if (this.lista_instrumentos.obtenerPorPosicion(i) instanceof Viento) {
                    cant_produtcos++;
                }
            }
            String[] lista = new String[cant_produtcos + 1];
            String mensaje = "~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~\nLista Actual: Viento\n";
            lista[0] = mensaje;
            int aux = 1;
            for (int i = 0; i < this.lista_instrumentos.getCantInstrumentos(); i++) {
                if (this.lista_instrumentos.obtenerPorPosicion(i) instanceof Viento) {
                    Instrumento instrumento_actual = this.lista_instrumentos.obtenerPorPosicion(i);
                    mensaje = instrumento_actual.toString();
                    lista[aux] = mensaje;
                    aux++;
                }
            }
            return lista;
        }
        return null;
    }

    @Override
    public String desplegarInstrumento(String codigo) {
        if (lista_instrumentos.buscarInstrumento(codigo) == null) {
            return "No existe instrumento con el codigo ingresado";
        }
        Instrumento instrumento = lista_instrumentos.buscarInstrumento(codigo);
        if (instrumento instanceof Cuerda) {
            Cuerda cuerda = (Cuerda) instrumento;
            String mensaje = "Nombre: " + cuerda.getNombre() + "\nCodigo: " + cuerda.getCodigo() + "\nStock: " + cuerda.getStock() + "\nPrecio: $" + cuerda.getPrecio() + "\nTipo de cuerda: " + cuerda.getTipo_cuerda() + "\nNumeros de cuerda: " + cuerda.getNumero_cuerdas() + "\n";
        }
        return null;
    }

}
