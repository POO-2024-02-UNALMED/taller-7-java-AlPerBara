package comunicacion;

public class Fabula extends Escrito{
    
    private String ensenanza;
    private String interpretacion;

    //Constructor
    public Fabula(String origen, String titulo, String autor, int paginas, String ensenanza, String interpretacion){

        super(origen, titulo, autor, paginas);

        this.ensenanza=ensenanza;
        this.interpretacion=interpretacion;

    }

    //Getters setters
    public String getEnsenanza() {
        return this.ensenanza;
    }
    public void setEnsenanza(String ensenanzas) {
        this.ensenanza = ensenanzas;
    }

    public String getInterpretacion() {
        return this.interpretacion;
    }
    public void setInterpretacion(String interpretacion) {
        this.interpretacion = interpretacion;
    }

    //Interpretación
    public String interpretacion(){
        return this.interpretacion;
    }

    //Tostring
    @Override
    public String toString() {

        return this.getOrigen()+"\n"+this.getTitulo()+"\n"+this.getPaginas()+"\n"+
        this.getEnsenanza();

    }

    //Palabras totales
    @Override
    int palabrasTotales(int palabrasPagina) {

        return getPaginas()*palabrasPagina*1; //Cantidad de páginas * Palabras por página * Valor específico
        
    }

}
