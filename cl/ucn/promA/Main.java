package cl.ucn.promA;
import ucn.StdIn;
import ucn.StdOut;
import ucn.ArchivoEntrada;
import ucn.Registro;
import java.io.IOException;
import java.util.Locale;
import ucn.ArchivoSalida;
public class Main {

    public static void main(String[] args) throws Exception{
        SistemaRhythm sistema = new SistemaRhythmImpl();
        leerArchivoClientesProductos(sistema);
        menuListas(sistema);
    }
    private static void leerArchivoClientesProductos(SistemaRhythm sistema) throws IOException {
        ArchivoEntrada arch1 = new ArchivoEntrada("Instrumentos.txt");
        while (!arch1.isEndFile()) {
            Registro regEnt = arch1.getRegistro();
            try {
                String codigo = regEnt.getString();
                int precio = regEnt.getInt();
                int stock = regEnt.getInt();
                String tipo = regEnt.getString();
                String nombre = regEnt.getString();
                if (tipo.equals("Cuerda")) {
                    String tipo_cuerda = regEnt.getString();
                    String numero_cuerdas = regEnt.getString();
                    String material = regEnt.getString();
                    String ElecAcustc = regEnt.getString();
                    sistema.registrarCuerda(nombre, codigo, material, precio, stock, tipo_cuerda, numero_cuerdas, tipo);
                } else if (tipo.equals("Percusión")) {
                    String tipo_percusion = regEnt.getString();
                    String material = regEnt.getString();
                    String altura = regEnt.getString();
                    sistema.registrarPercusion(nombre, codigo, material, precio, stock, tipo_percusion, altura);
                } else {
                    String material = regEnt.getString();
                    sistema.registrarViento(nombre,codigo,material,precio,stock);
                }

            } catch (Exception e) {
                break;
            }
        }
    }
    private static void menuPrincipal(SistemaRhythm sistema) throws Exception{
        StdOut.println("1) Buscar un instrumento por codigo");
        StdOut.println("2) Ver listas de instrumentos por tipo");
        StdOut.println("3) Vender instrumento");
        String opcion = StdIn.readString();
        if(opcion.equals("1")){
            StdOut.println("Ingrese el codigo: ");
            String code = StdIn.readString();

        }
    }
    private static void menuListas(SistemaRhythm sistema) throws Exception{
        int indice = 0;
        while (true){
            String[] lista = sistema.desplegarInstrumentos(indice);
            for (String s: lista){
                StdOut.println("**********************");
                StdOut.println(s);
                StdOut.println("**********************");
            }
            StdOut.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
            StdOut.println("1) Siguiente Lista");
            StdOut.println("2) Anterior Lista");
            String opcion = StdIn.readString();
            if(opcion.equals("1")){
                indice++;
                if (indice>2){indice = 0;}
            }
            else if(opcion.equals("2")){
                indice++;
                if(indice<0){indice = 3;}
            }
        }

    }
}
