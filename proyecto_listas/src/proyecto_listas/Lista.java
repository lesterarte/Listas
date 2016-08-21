
package proyecto_listas;

import java.util.Random;
import javax.swing.JOptionPane;

public class Lista {
    private Nodo head = null;
    private int longitud; 
    private class Nodo{
        public Alumno alumno; 
        public Nodo next = null; 
        public Nodo(Alumno alumno) {
            this.alumno = alumno;
        }
    }
     
    public void insert(Alumno alum){
        
        Nodo nuevo = new Nodo(alum); 
        if(this.head == null){
            nuevo.next = head;   
            head = nuevo; 
            longitud++;
        }
        else {
            Nodo puntero = head; 
            while(puntero.next != null ){
                puntero = puntero.next;                
            }
            puntero.next = nuevo;
            longitud++;
        }
                       
    }
    public Alumno seleccionarRandom(){
        
        if(this.head == null){
            return null;           
        }
        else{
            //seleccionar estudiante de forma aleatoria
            Random alumnoAleatorio = new Random();
            int position = alumnoAleatorio.nextInt(contar());
            Nodo puntero = head;
            int contador=0;
            while(puntero.next != null && contador <position ){
                puntero = puntero.next;  
                contador++;
            }             
            return puntero.alumno;
        }
    }
    
    public int contar(){
        return this.longitud;
    }
   
    
}
