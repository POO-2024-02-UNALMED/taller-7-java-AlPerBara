package comunicacion;
//import java.util.ArrayList;

public class Alfabeto extends Pictograma{

    private String[] letras;
    private String interpretacion;

    //Constructor
    public Alfabeto(String orginario, String[] letras, String interpretar){
        
        super(orginario);

        this.letras=letras;
        this.interpretacion=interpretar;
        
    }

    //Getters y setters
    public String[] getLetras() {
        return this.letras;
    }
    public void setLetras(String[] letras) {
        this.letras = letras;
    }

    public String getInterpretacion() {
        return this.interpretacion;
    }
    public void setInterpretacion(String interpretacion) {
        this.interpretacion = interpretacion;
    }

    //Interpretación
    @Override
    public String interpretacion(){
        
        return this.interpretacion;
    }

    //toString retorna las letras con una coma en el medio
    @Override
    public String toString() {

        return String.join(", ", this.letras);
        
    }

    //Cantidad de letras
    public int cantidadLetras(){

        return this.letras.length;

    }

}
