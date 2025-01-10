package comunicacion;

public class Libro extends Escrito{
    
    private String co_autor;
    private String editorial;
    private String edicion;
    private String interpretacion;

    //Constructor
    public Libro(String origen, String titulo, String autor, int paginas, 
    String coautor, String editorial, String edicion, String interpretar){

        super(origen, titulo, autor, paginas);

        this.co_autor=coautor;
        this.editorial=editorial;
        this.edicion=edicion;
        this.interpretacion=interpretar;

    }

    //Getters setters
    public String getCo_autor() {
        return co_autor;
    }
    public void setCo_autor(String co_autor) {
        this.co_autor = co_autor;
    }

    public String getEditorial() {
        return editorial;
    }
    public void setEditorial(String editorial) {
        this.editorial = editorial;
    }

    public String getEdicion() {
        return this.edicion;
    }
    public void setEdicion(String edicion) {
        this.edicion = edicion;
    }

    public String getInterpretacion() {
        return interpretacion;
    }
    public void setInterpretacion(String interpretacion) {
        this.interpretacion = interpretacion;
    }

    //interpretación
    public String interpretacion(){

        return this.interpretacion;
    
    }

    //Tostring
    @Override
    public String toString() {

        return this.getOrigen()+"\n"+this.getTitulo()+"\n"+this.getPaginas()+"\n"+
               this.getCo_autor()+"\n"+this.getEditorial()+this.getEdicion();

    }

    @Override
    public int palabrasTotales(int palabrasPagina) {

        return getPaginas()*palabrasPagina*2; //Cantidad de páginas * Palabras por página * Valor específico

    }

}
