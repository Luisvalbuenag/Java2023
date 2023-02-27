public class Persona extends Estudio{

    private String nombre;
    String apellido;

 public Persona (String nombre, String apellido){

     this.apellido = apellido;
     this.nombre = nombre;

 }

 public void imprimir(){

     System.out.println(nombre+" "+apellido);
     super.imprimirestudio();
 }



}