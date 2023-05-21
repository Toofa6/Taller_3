package cl.ucn.promA;

public class ListaInstrumentos {
    private Instrumento[] vectorIntrumentos;
    private int cantInstrumentos;

    public ListaInstrumentos(int cantCustom) {
        this.vectorIntrumentos = new Instrumento[cantCustom];
        this.cantInstrumentos = 0;
    }
    public Instrumento buscarInstrumento(String codigo){
        for(int i = 0; i < this.cantInstrumentos; i++){
            Instrumento instrumento_actual = this.vectorIntrumentos[i];
            if(instrumento_actual.equals(codigo)){return this.vectorIntrumentos[i];}
        }
        return null;
    }
    public  boolean agregarInstrumento(Instrumento instrumento){
        if(buscarInstrumento(instrumento.getCodigo())!=null){return false;}
        this.vectorIntrumentos[this.cantInstrumentos] = instrumento;
        this.cantInstrumentos++;
        return true;
    }
    public Instrumento obtenerPorPosicion(int pos){
        if(pos < 0 || pos >= this.cantInstrumentos){return null;}
        return this.vectorIntrumentos[pos];
    }
    public boolean eliminarInstrumento(String codigo){
        for(int i = 0; i < this.cantInstrumentos; i++){
            Instrumento instrumento_actual = this.vectorIntrumentos[i];
            if (codigo.equals(instrumento_actual.getCodigo())) {
                this.vectorIntrumentos[i] = this.vectorIntrumentos[cantInstrumentos];
                vectorIntrumentos[cantInstrumentos] = null;
                return true;
            }
            return false;
        }
        return false;
    }

    public int getCantInstrumentos() {
        return cantInstrumentos;
    }

    public void setCantInstrumentos(int cantInstrumentos) {
        this.cantInstrumentos = cantInstrumentos;
    }
}
