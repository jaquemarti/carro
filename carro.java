
/**
 * Write a description of class carro here.
 * 
 * @author (jaquemarti) 
 * @version (1.0)
 */
public class carro
{
    // En esta parte vamos a definir 3 aributos y un valor 1 atributo que nos dira si es carro esta o no encendido
    //siempre seguiremos esta estructura private gestiona la ocultacion, el tipo de datos, nombre del articulo
    private String color;// cadena de texto
    private double galones;//por que es de tipo decimal
    private boolean encendido;
    
    /**
     * Constructor for objects of class carro
     */
    public carro()
    {
        // vamos a darle valor a los atributos en esta seccion (el constructor)
        this.color = "negro";  //usaremos la palabra resrvada  this que hace referencia a la propia clase 
        this.galones = 30.5;
        this.encendido = false; // por defecto lo dejaremos que no esta arrancado
       
    }
 public carro(String newColor, double newGalones,boolean newArrancado)
 //que tendremos que hacer con estos tributos que nos pasan aqui? pues tendriamos asignarlos a los atributosde la clase.
    {
        // vamos a darle valor a los atributos en esta seccion (el constructor)
        this.color = newColor;  //usaremos la palabra resrvada  this que hace referencia a la propia clase 
        this.galones = newGalones;
        this.encendido = newArrancado; // por defecto lo dejaremos que no esta arrancado
       
    }
}
