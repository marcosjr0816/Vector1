/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfaz;

import javax.swing.JOptionPane;

/**
 *
 * @author msarmien19
 */
public class Principal extends javax.swing.JFrame {

    /**
     * Creates new form Principal
     */
    double v[];
    public Principal() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        txtLongitud = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        cmdCrear = new javax.swing.JButton();
        cmdLlenadoManual = new javax.swing.JButton();
        cmdLlenadoAutomatico = new javax.swing.JButton();
        cmdSumatoria = new javax.swing.JButton();
        cmdProductoria = new javax.swing.JButton();
        cmdMayorElemento = new javax.swing.JButton();
        cmdMenorElemento = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtResultado = new javax.swing.JTextArea();
        jPanel4 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        cmdCalcular = new javax.swing.JButton();
        cmdBorrar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 51, 51));
        jLabel1.setText("        vector");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 10, 170, 30));

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Longitud", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Times New Roman", 0, 14), new java.awt.Color(255, 51, 51))); // NOI18N
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setText("Longitud");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(16, 30, -1, -1));

        txtLongitud.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtLongitudKeyTyped(evt);
            }
        });
        jPanel1.add(txtLongitud, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 30, 90, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 70, 180, 70));

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Opciones\n", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Times New Roman", 0, 14), new java.awt.Color(255, 51, 51))); // NOI18N
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(16, 19, -1, -1));

        cmdCrear.setText("Crear");
        cmdCrear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdCrearActionPerformed(evt);
            }
        });
        jPanel2.add(cmdCrear, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 30, 140, -1));

        cmdLlenadoManual.setText("Llenado manual");
        cmdLlenadoManual.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdLlenadoManualActionPerformed(evt);
            }
        });
        jPanel2.add(cmdLlenadoManual, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 70, 140, -1));

        cmdLlenadoAutomatico.setText("Llenado automatico");
        cmdLlenadoAutomatico.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdLlenadoAutomaticoActionPerformed(evt);
            }
        });
        jPanel2.add(cmdLlenadoAutomatico, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 110, 140, -1));

        cmdSumatoria.setText("Sumatoria");
        cmdSumatoria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdSumatoriaActionPerformed(evt);
            }
        });
        jPanel2.add(cmdSumatoria, new org.netbeans.lib.awtextra.AbsoluteConstraints(21, 150, 140, -1));

        cmdProductoria.setText("Productoria");
        cmdProductoria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdProductoriaActionPerformed(evt);
            }
        });
        jPanel2.add(cmdProductoria, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 190, 140, -1));

        cmdMayorElemento.setText("Mayor Elemento");
        cmdMayorElemento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdMayorElementoActionPerformed(evt);
            }
        });
        jPanel2.add(cmdMayorElemento, new org.netbeans.lib.awtextra.AbsoluteConstraints(19, 230, 140, -1));

        cmdMenorElemento.setText("Menor Elemento");
        cmdMenorElemento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdMenorElementoActionPerformed(evt);
            }
        });
        jPanel2.add(cmdMenorElemento, new org.netbeans.lib.awtextra.AbsoluteConstraints(19, 270, 140, -1));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 80, 180, 310));

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Resultado", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Times New Roman", 0, 14), new java.awt.Color(255, 51, 51))); // NOI18N
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel3.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(16, 30, -1, -1));

        txtResultado.setColumns(20);
        txtResultado.setRows(5);
        jScrollPane1.setViewportView(txtResultado);

        jPanel3.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 30, 150, -1));

        getContentPane().add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 160, 200, 140));

        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel4.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(31, 28, -1, -1));

        cmdCalcular.setText("Calcular");
        cmdCalcular.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdCalcularActionPerformed(evt);
            }
        });
        jPanel4.add(cmdCalcular, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 30, -1, -1));

        cmdBorrar.setText("Borrar");
        cmdBorrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdBorrarActionPerformed(evt);
            }
        });
        jPanel4.add(cmdBorrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 30, -1, -1));

        getContentPane().add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 320, 190, 80));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cmdCrearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdCrearActionPerformed
         int longitud;
        if(txtLongitud.getText().trim().isEmpty()){
      JOptionPane.showMessageDialog(this,"Digite la longitud del vector","Error",JOptionPane.ERROR_MESSAGE);
       txtLongitud.requestFocusInWindow();
       
        }   
      else if(Integer.parseInt(txtLongitud.getText().trim())==0){
      JOptionPane.showMessageDialog(this,"La longitud no puede ser 0","Error",JOptionPane.ERROR_MESSAGE); 
      txtLongitud.requestFocusInWindow();
      txtLongitud.selectAll();
   }
      else{
          longitud=Integer.parseInt(txtLongitud.getText().trim());
          v=new double[longitud];
          JOptionPane.showMessageDialog(this,"El vector ha sido creado exitoxamente");     
      }
    }//GEN-LAST:event_cmdCrearActionPerformed

    private void txtLongitudKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtLongitudKeyTyped
        char c=evt.getKeyChar(); 
       
          if(!Character.isDigit(c)) { 
              getToolkit().beep();    
              evt.consume(); 
          }
    }//GEN-LAST:event_txtLongitudKeyTyped

    private void cmdLlenadoManualActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdLlenadoManualActionPerformed
        double n;
  if(txtLongitud.getText().trim().isEmpty()){
      JOptionPane.showMessageDialog(this,"Digite la longitud del vector","Error",JOptionPane.ERROR_MESSAGE); 
      txtLongitud.requestFocusInWindow();
      
   }
     else{ 
  for (int i=0; i<v.length; i++){
  n=Double.parseDouble(JOptionPane.showInputDialog(this,"Ingrese el elemento número "+(i+1)));
  v[i]=n;
   } 
 }
    }//GEN-LAST:event_cmdLlenadoManualActionPerformed

    private void cmdCalcularActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdCalcularActionPerformed
        if(txtLongitud.getText().trim().isEmpty()){
      JOptionPane.showMessageDialog(this,"Digite la longitud del vector","Error",JOptionPane.ERROR_MESSAGE);
       txtLongitud.requestFocusInWindow();
       
        }
        else{
        for (int i=0 ; i<v.length ; i++){
        txtResultado.append(v[i]+"\n");
        }
}
    }//GEN-LAST:event_cmdCalcularActionPerformed

    private void cmdBorrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdBorrarActionPerformed
    txtLongitud.setText(" ");
    txtResultado.setText(" ");
    v=null;
    txtLongitud.requestFocusInWindow();
    }//GEN-LAST:event_cmdBorrarActionPerformed

    private void cmdLlenadoAutomaticoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdLlenadoAutomaticoActionPerformed
    double n, f;
    if(txtLongitud.getText().trim().isEmpty()){
      JOptionPane.showMessageDialog(this,"Digite la longitud del vector","Error",JOptionPane.ERROR_MESSAGE);
       txtLongitud.requestFocusInWindow();
       
        }
    else{
        f= Double.parseDouble (JOptionPane.showInputDialog(this, "Digite el numero hasta donde quiere el llenado automatico "));
           while (f<v.length){
            JOptionPane.showMessageDialog(this, "Digite un numero mayor a : "+v.length);
            f= Double.parseDouble (JOptionPane.showInputDialog(this, "Digite el numero hasta donde quiere el llenado automatico "));
           }
        for (int i = 0; i < v.length; i++) {
            
        n=(int)(Math.random()*f + 1);  
        v[i]=n;
        }
      JOptionPane.showMessageDialog(this,"Vector llenado con éxito");  
    }
    }//GEN-LAST:event_cmdLlenadoAutomaticoActionPerformed

    private void cmdSumatoriaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdSumatoriaActionPerformed
        double total=0;
        if(txtLongitud.getText().trim().isEmpty()){
        JOptionPane.showMessageDialog(this,"Digite la longitud del vector","Error",JOptionPane.ERROR_MESSAGE);
        txtLongitud.requestFocusInWindow();
       
        }     
        else{ for (int i = 0; i < v.length; i++) {
           
            total=total+v[i];     
        }
        txtResultado.append("\nSumatoria: "+total);
     }    
    }//GEN-LAST:event_cmdSumatoriaActionPerformed

    private void cmdProductoriaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdProductoriaActionPerformed
        double  producto=1;
        if(txtLongitud.getText().trim().isEmpty()){
        JOptionPane.showMessageDialog(this,"Digite la longitud del vector","Error",JOptionPane.ERROR_MESSAGE);
        txtLongitud.requestFocusInWindow();
       
        }
        else{
        for (int i = 0; i < v.length; i++) {
           
           producto= (producto*v[i]);
        }
        txtResultado.append("\nProducto: "+producto);
 }
    }//GEN-LAST:event_cmdProductoriaActionPerformed

    private void cmdMayorElementoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdMayorElementoActionPerformed
        double mayor=0;
        if(txtLongitud.getText().trim().isEmpty()){
        JOptionPane.showMessageDialog(this,"Digite la longitud del vector","Error",JOptionPane.ERROR_MESSAGE);
        txtLongitud.requestFocusInWindow();      
        }
        else{
        for (int i = 0; i < v.length; i++) {
            if (v[i]>mayor){
                mayor = v[i];
            }  
     } 
     txtResultado.append("Número mayor: "+mayor);
} 
    }//GEN-LAST:event_cmdMayorElementoActionPerformed

    private void cmdMenorElementoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdMenorElementoActionPerformed
        double menor=9999999;
        if(txtLongitud.getText().trim().isEmpty()){
        JOptionPane.showMessageDialog(this,"Digite la longitud del vector","Error",JOptionPane.ERROR_MESSAGE);
        txtLongitud.requestFocusInWindow();
       
        }
        else{
        for (int i = 0; i < v.length; i++) {
            if (v[i]<menor){
                menor = v[i];
            }
      }
      txtResultado.append("\nNúmero menor : "+menor);  
     }
    }//GEN-LAST:event_cmdMenorElementoActionPerformed

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
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Principal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton cmdBorrar;
    private javax.swing.JButton cmdCalcular;
    private javax.swing.JButton cmdCrear;
    private javax.swing.JButton cmdLlenadoAutomatico;
    private javax.swing.JButton cmdLlenadoManual;
    private javax.swing.JButton cmdMayorElemento;
    private javax.swing.JButton cmdMenorElemento;
    private javax.swing.JButton cmdProductoria;
    private javax.swing.JButton cmdSumatoria;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField txtLongitud;
    private javax.swing.JTextArea txtResultado;
    // End of variables declaration//GEN-END:variables
}
