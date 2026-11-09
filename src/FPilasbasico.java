
import java.util.Stack;
import javax.swing.JOptionPane;


public class FPilasbasico extends javax.swing.JFrame {
    
        Stack<String> nombres = new Stack();
        Stack<String> elegidos = new Stack();
        Stack<String> enviados = new Stack();
     
    
    public FPilasbasico() {
        initComponents();
    }
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        TNombre = new javax.swing.JTextField();
        BAgregar = new javax.swing.JButton();
        BSacar = new javax.swing.JButton();
        BVaciar = new javax.swing.JButton();
        LPila = new javax.swing.JLabel();
        BTransferir = new javax.swing.JButton();
        LElegidos = new javax.swing.JLabel();
        BEnviar = new javax.swing.JButton();
        LEnviados = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Nombre");

        BAgregar.setText("agregar");
        BAgregar.addActionListener(this::BAgregarActionPerformed);

        BSacar.setText("sacar");
        BSacar.addActionListener(this::BSacarActionPerformed);

        BVaciar.setText("vaciar");
        BVaciar.addActionListener(this::BVaciarActionPerformed);

        LPila.setBackground(new java.awt.Color(204, 0, 255));
        LPila.setOpaque(true);

        BTransferir.setText("Transferir");
        BTransferir.addActionListener(this::BTransferirActionPerformed);

        LElegidos.setBackground(new java.awt.Color(255, 204, 0));
        LElegidos.setOpaque(true);

        BEnviar.setText("Enviar");
        BEnviar.addActionListener(this::BEnviarActionPerformed);

        LEnviados.setBackground(new java.awt.Color(0, 255, 204));
        LEnviados.setOpaque(true);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(LEnviados, javax.swing.GroupLayout.PREFERRED_SIZE, 355, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(LElegidos, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 355, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(LPila, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 355, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jLabel1)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(TNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 299, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(BAgregar)
                                    .addGap(63, 63, 63)
                                    .addComponent(BSacar)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(BVaciar)))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(148, 148, 148)
                        .addComponent(BTransferir))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(150, 150, 150)
                        .addComponent(BEnviar)))
                .addContainerGap(25, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(TNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(34, 34, 34)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BAgregar, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BSacar)
                    .addComponent(BVaciar))
                .addGap(18, 18, 18)
                .addComponent(LPila, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(BTransferir)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(LElegidos, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(BEnviar)
                .addGap(18, 18, 18)
                .addComponent(LEnviados, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(26, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BAgregarActionPerformed
       String nom = TNombre.getText();
       if(nom == null || nom.equals("")){
           JOptionPane.showMessageDialog(this, "Introduce un nombre");
           return;
       }
       nombres.push(nom);
       LPila.setText(nombres.toString());
       TNombre.setText("");
    }//GEN-LAST:event_BAgregarActionPerformed
       
    private void BVaciarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BVaciarActionPerformed
        nombres.clear();
        LPila.setText(nombres.toString());
    }//GEN-LAST:event_BVaciarActionPerformed

    private void BSacarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BSacarActionPerformed
        if (nombres.empty() == false) {
            nombres.pop();
        } else {
        JOptionPane.showMessageDialog(this, "La pila está vacia");
        }
        LPila.setText(nombres.toString());
        
    }//GEN-LAST:event_BSacarActionPerformed

    private void BTransferirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTransferirActionPerformed
       
        if(nombres.empty() == true){
            JOptionPane.showMessageDialog(this, "La pila está vacia");
            return;
        }
        String sacado = nombres.pop();
        elegidos.push(sacado);
         LPila.setText(nombres.toString());
         LElegidos.setText(elegidos.toString());
         
         
    }//GEN-LAST:event_BTransferirActionPerformed

    private void BEnviarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BEnviarActionPerformed
         if(elegidos.empty() == true){
            JOptionPane.showMessageDialog(this, "La pila está vacia");
            return;
        }
        String sacado = elegidos.pop();
        enviados.push(sacado);
        
         LElegidos.setText(elegidos.toString());
        LEnviados.setText(enviados.toString());
         
    }//GEN-LAST:event_BEnviarActionPerformed

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
        } catch (ReflectiveOperationException | javax.swing.UnsupportedLookAndFeelException ex) {
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> new FPilasbasico().setVisible(true));
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BAgregar;
    private javax.swing.JButton BEnviar;
    private javax.swing.JButton BSacar;
    private javax.swing.JButton BTransferir;
    private javax.swing.JButton BVaciar;
    private javax.swing.JLabel LElegidos;
    private javax.swing.JLabel LEnviados;
    private javax.swing.JLabel LPila;
    private javax.swing.JTextField TNombre;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}
