package proyecto_listas;


import java.awt.Dimension;
import java.awt.Toolkit;
import java.io.BufferedReader;
import java.io.FileReader;
import javafx.stage.FileChooser;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileNameExtensionFilter;


public class inicio extends javax.swing.JFrame {
    
    private FileNameExtensionFilter filter = new  FileNameExtensionFilter("txt","txt");
    Lista listadoALumnos = new Lista();
    ListaNotas listaNotas = new ListaNotas();
    
    public inicio() {
        initComponents();
        centrarVentana();
    }
    
    public void centrarVentana(){
        
        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
        Dimension frameSize = getSize();
        if(frameSize.height > screenSize.height){
            frameSize.height = screenSize.height;
        }
        if(frameSize.width > screenSize.width){
            frameSize.width = screenSize.width;
        }
        setLocation ((screenSize.width - frameSize.width)/2,
                (screenSize.height - frameSize.height)/2);        
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        txtstudent = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        btnrandom = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        txtnota = new javax.swing.JTextField();
        btnagregarNota = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        txtpromedio = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        btnSeleccionarArchivo = new javax.swing.JButton();
        btnpromedio = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("PROYECTO LISTAS");

        txtstudent.setEnabled(false);

        jLabel1.setFont(new java.awt.Font("Trebuchet MS", 1, 18)); // NOI18N
        jLabel1.setText("Seleccione un Estudiante");

        btnrandom.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnrandom.setText("Random");
        btnrandom.setEnabled(false);
        btnrandom.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnrandomActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Trebuchet MS", 1, 18)); // NOI18N
        jLabel2.setText("Agregar Nota");

        txtnota.setEnabled(false);

        btnagregarNota.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnagregarNota.setText("Agregar");
        btnagregarNota.setEnabled(false);
        btnagregarNota.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnagregarNotaActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setText("Promedio del Alumno");

        txtpromedio.setEnabled(false);

        jLabel4.setFont(new java.awt.Font("Trebuchet MS", 1, 18)); // NOI18N
        jLabel4.setText("Seleccione un archivo");

        btnSeleccionarArchivo.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnSeleccionarArchivo.setText("Seleccionar");
        btnSeleccionarArchivo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSeleccionarArchivoActionPerformed(evt);
            }
        });

        btnpromedio.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnpromedio.setText("Promedio");
        btnpromedio.setEnabled(false);
        btnpromedio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnpromedioActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(txtstudent, javax.swing.GroupLayout.PREFERRED_SIZE, 370, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 214, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(84, 84, 84)
                                        .addComponent(btnrandom, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel2)
                                        .addGap(40, 40, 40)
                                        .addComponent(txtnota, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(41, 41, 41)
                                        .addComponent(btnagregarNota, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(138, 138, 138))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addGap(18, 18, 18)
                                .addComponent(txtpromedio, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(39, 39, 39)
                                .addComponent(btnpromedio))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(120, 120, 120)
                        .addComponent(jLabel4))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(168, 168, 168)
                        .addComponent(btnSeleccionarArchivo, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnSeleccionarArchivo, javax.swing.GroupLayout.DEFAULT_SIZE, 36, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnrandom, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(txtstudent, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtnota, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnagregarNota, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(2, 2, 2)
                        .addComponent(jLabel2)))
                .addGap(57, 57, 57)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtpromedio, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnpromedio, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(43, 43, 43))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnrandomActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnrandomActionPerformed
        this.btnrandom.setEnabled(false);
        this.btnagregarNota.setEnabled(true);
        this.txtnota.setEnabled(true);
        Alumno seleccionadoAleatoriamente = this.listadoALumnos.seleccionarRandom();
        String mostrarAlumno = seleccionadoAleatoriamente.getNombre() + "," +
                seleccionadoAleatoriamente.getCuenta() + "," + seleccionadoAleatoriamente.getCarrera();
        this.txtstudent.setText(mostrarAlumno);
    }//GEN-LAST:event_btnrandomActionPerformed

    private void btnSeleccionarArchivoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSeleccionarArchivoActionPerformed
       
       
        JFileChooser FSArchivo = new JFileChooser();
        FSArchivo.setFileFilter(filter);
        int opcion = FSArchivo.showOpenDialog(this);
        String nombreArchivo = FSArchivo.getSelectedFile().toString();
        
        if(opcion == JFileChooser.APPROVE_OPTION){
            try {
                //abrir archivo
                FileReader archivo = new FileReader(nombreArchivo);
                BufferedReader buffer = new BufferedReader(archivo);
                String linea;
                
                while((linea = buffer.readLine()) != null){
                    
                    String[] tokens = linea.split(",");
                    this.listadoALumnos.insert(new Alumno(tokens[0],tokens[1],tokens[2]));    
                } 
                this.btnrandom.setEnabled(true);
                this.btnSeleccionarArchivo.setEnabled(false);
                
                
            } catch (Exception e) {
                System.err.println("Problemas al leer archivo");
            }              
        }
    }//GEN-LAST:event_btnSeleccionarArchivoActionPerformed

    private void btnagregarNotaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnagregarNotaActionPerformed
       
      
       String cadenaObtenida[] = this.txtstudent.getText().split(",");    
       listaNotas.insert(new Notas(cadenaObtenida[1],Double.parseDouble(this.txtnota.getText())));
       this.txtnota.setEnabled(false);
       this.btnagregarNota.setEnabled(false);
       this.btnpromedio.setEnabled(true);
    }//GEN-LAST:event_btnagregarNotaActionPerformed

    private void btnpromedioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnpromedioActionPerformed
        
        String cadenaObtenida[] = this.txtstudent.getText().split(",");    
        this.txtpromedio.setText(Double.toString(listaNotas.promedio(cadenaObtenida[1])));
        
       int opcionContinuar = Integer.parseInt(JOptionPane.showInputDialog("Agregar otra nota?\n"
               + "1.Si\n2. No. Salir"));
       
       if(opcionContinuar == 1){
           this.btnrandom.setEnabled(true);
           this.txtnota.setText(" ");
           this.txtpromedio.setText(" ");
           this.txtstudent.setText("");
           this.btnpromedio.setEnabled(false);
       }
       else {
           System.exit(0);
       }
    }//GEN-LAST:event_btnpromedioActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(inicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(inicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(inicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(inicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new inicio().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnSeleccionarArchivo;
    private javax.swing.JButton btnagregarNota;
    private javax.swing.JButton btnpromedio;
    private javax.swing.JButton btnrandom;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JTextField txtnota;
    private javax.swing.JTextField txtpromedio;
    private javax.swing.JTextField txtstudent;
    // End of variables declaration//GEN-END:variables
}
