
package proyecto_listas;

import javax.swing.JOptionPane;

public class ListaNotas {
    
    private Nodo head = null;
    private int longitud; 
    private class Nodo{
        public Notas notas; 
        public Nodo next = null; 
        public Nodo(Notas notas) {
            this.notas = notas;
        }
        
    }
    
    public void insert(Notas nots){
        
        Nodo nuevo = new Nodo(nots); 
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
    
     public int contar(){
        return this.longitud;
    }
     
     public double promedio(String nCuenta){
        double acumulandoValoresNotas = 0;
        int contandoCantidadNotas = 0;
        Nodo puntero = head;
        
        while(puntero.next != null ){
            
            if(puntero.notas.getCuenta().equals(nCuenta)){
                acumulandoValoresNotas+=puntero.notas.getNota();
                contandoCantidadNotas++;
            }
            puntero = puntero.next;    
        }
        
        if(acumulandoValoresNotas ==0 && contandoCantidadNotas==0 ){
            
            return 300;
        }
        
        return (acumulandoValoresNotas/contandoCantidadNotas);
                
     }
    
}
