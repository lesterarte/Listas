
package proyecto_listas;

import java.io.*;


public class Lista {
    private Nodo head = null;     
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
        }
        else {
            Nodo puntero = head; 
            while(puntero.next != null ){
                puntero = puntero.next;                
            }
        }
                       
    }
    
}
