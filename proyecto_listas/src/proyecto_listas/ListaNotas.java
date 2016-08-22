
package proyecto_listas;

import java.io.FileWriter;
import javax.swing.JOptionPane;

public class ListaNotas {
    
    private Node head = null;
    private int longitud; 
    private class Node{
        public Notas notas; 
        public Node next = null; 
        public Node(Notas notas) {
            this.notas = notas;
        }
        
    }
    
    public void insert(Notas nots){
        
        Node nodoNuevo = new Node(nots); 
        if(this.head == null){
            nodoNuevo.next = this.head;  
            this.head = nodoNuevo; 
            longitud++;
        }
        else {
            Node puntero = this.head; 
            while(puntero.next != null ){
                puntero = puntero.next;                
            }
            puntero.next = nodoNuevo;
            this.longitud++;
        }     
    }
    
     public int contar(){
        return this.longitud;
    }
     
     public double promedio(String nCuenta){
        int cantidadNotas=0;
        double acumuladorNotas = 0.0;
        Node puntero = this.head;
        while(puntero != null){
            
            if(puntero.notas.getCuenta().equals(nCuenta)){
                acumuladorNotas += puntero.notas.getNota();
                cantidadNotas++;                
            }
            puntero = puntero.next;
        }
        return acumuladorNotas/cantidadNotas;        
    
     }
     public void guardarArchivoCSV(){
         Node puntero = head; 
         try {
               FileWriter fichero = new FileWriter("Notas.csv");
               while(puntero != null){
                   fichero.write(puntero.notas.getCuenta() + "," + 
                           puntero.notas.getNota() + "\n");
                   puntero = puntero.next;
               }
               fichero.close();
      
           } catch (Exception e) {
               e.printStackTrace();
           }
     }
    
}
