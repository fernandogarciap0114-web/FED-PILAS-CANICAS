

public class FPilasEsferas extends javax.swing.JFrame {

   
    
    
    public FPilasEsferas() {
        initComponents();
        setLocationRelativeTo(this);
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        BIniciar = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        CBMeter = new javax.swing.JComboBox();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        CBSacar = new javax.swing.JComboBox();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        BMover = new javax.swing.JButton();
        PStack1 = new javax.swing.JPanel();
        L10 = new javax.swing.JLabel();
        L11 = new javax.swing.JLabel();
        L12 = new javax.swing.JLabel();
        L13 = new javax.swing.JLabel();
        L14 = new javax.swing.JLabel();
        PStack2 = new javax.swing.JPanel();
        L20 = new javax.swing.JLabel();
        L21 = new javax.swing.JLabel();
        L22 = new javax.swing.JLabel();
        L23 = new javax.swing.JLabel();
        L24 = new javax.swing.JLabel();
        PStack3 = new javax.swing.JPanel();
        L30 = new javax.swing.JLabel();
        L31 = new javax.swing.JLabel();
        L32 = new javax.swing.JLabel();
        L33 = new javax.swing.JLabel();
        L29 = new javax.swing.JLabel();
        PStack4 = new javax.swing.JPanel();
        L40 = new javax.swing.JLabel();
        L41 = new javax.swing.JLabel();
        L42 = new javax.swing.JLabel();
        L43 = new javax.swing.JLabel();
        L44 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("BANCO");
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(0, 51, 51));
        jPanel1.setLayout(null);

        jLabel1.setFont(new java.awt.Font("Comic Sans MS", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Apilando esferas");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(140, 60, 350, 51);

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/esferas.png"))); // NOI18N
        jPanel1.add(jLabel5);
        jLabel5.setBounds(20, 20, 100, 100);

        BIniciar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/prueba-de-sangre.png"))); // NOI18N
        BIniciar.setText("INICIAR");
        BIniciar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        BIniciar.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        BIniciar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BIniciarActionPerformed(evt);
            }
        });
        jPanel1.add(BIniciar);
        BIniciar.setBounds(510, 20, 120, 100);

        jPanel2.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel2.setLayout(null);

        CBMeter.setFont(new java.awt.Font("sansserif", 0, 24)); // NOI18N
        CBMeter.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "1", "2", "3" }));
        CBMeter.setBorder(null);
        jPanel2.add(CBMeter);
        CBMeter.setBounds(40, 180, 190, 60);

        jLabel6.setBackground(new java.awt.Color(204, 51, 255));
        jLabel6.setFont(new java.awt.Font("sansserif", 0, 24)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("2");
        jLabel6.setOpaque(true);
        jPanel2.add(jLabel6);
        jLabel6.setBounds(280, 110, 50, 60);

        jLabel7.setBackground(new java.awt.Color(0, 51, 204));
        jLabel7.setFont(new java.awt.Font("sansserif", 0, 24)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(204, 204, 204));
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("1");
        jLabel7.setOpaque(true);
        jPanel2.add(jLabel7);
        jLabel7.setBounds(280, 40, 50, 60);

        jLabel8.setBackground(new java.awt.Color(255, 204, 0));
        jLabel8.setFont(new java.awt.Font("sansserif", 0, 24)); // NOI18N
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setText("3");
        jLabel8.setOpaque(true);
        jPanel2.add(jLabel8);
        jLabel8.setBounds(280, 180, 50, 60);

        CBSacar.setFont(new java.awt.Font("sansserif", 0, 24)); // NOI18N
        CBSacar.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "1", "2", "3" }));
        CBSacar.setBorder(null);
        jPanel2.add(CBSacar);
        CBSacar.setBounds(40, 70, 190, 60);

        jLabel2.setBackground(new java.awt.Color(0, 51, 0));
        jLabel2.setFont(new java.awt.Font("sansserif", 0, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("METER A:");
        jLabel2.setOpaque(true);
        jPanel2.add(jLabel2);
        jLabel2.setBounds(40, 140, 190, 40);

        jLabel3.setBackground(new java.awt.Color(204, 51, 0));
        jLabel3.setFont(new java.awt.Font("sansserif", 0, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("SACAR DE:");
        jLabel3.setOpaque(true);
        jPanel2.add(jLabel3);
        jLabel3.setBounds(40, 30, 190, 40);

        BMover.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/mover-flechas.png"))); // NOI18N
        BMover.setText("MOVER");
        BMover.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        BMover.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        BMover.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BMoverActionPerformed(evt);
            }
        });
        jPanel2.add(BMover);
        BMover.setBounds(40, 250, 190, 70);

        PStack1.setBackground(new java.awt.Color(0, 0, 0));
        PStack1.setMinimumSize(new java.awt.Dimension(100, 60));
        PStack1.setPreferredSize(new java.awt.Dimension(100, 60));
        PStack1.setLayout(new java.awt.GridLayout(1, 5));

        L10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/blue.png"))); // NOI18N
        PStack1.add(L10);

        L11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/purple.png"))); // NOI18N
        PStack1.add(L11);

        L12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/yellow.png"))); // NOI18N
        PStack1.add(L12);

        L13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/purple.png"))); // NOI18N
        PStack1.add(L13);

        L14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/blue.png"))); // NOI18N
        PStack1.add(L14);

        jPanel2.add(PStack1);
        PStack1.setBounds(330, 40, 330, 60);

        PStack2.setBackground(new java.awt.Color(0, 0, 0));
        PStack2.setMinimumSize(new java.awt.Dimension(100, 60));
        PStack2.setPreferredSize(new java.awt.Dimension(100, 60));
        PStack2.setLayout(new java.awt.GridLayout(1, 0));

        L20.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/purple.png"))); // NOI18N
        PStack2.add(L20);

        L21.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/blue.png"))); // NOI18N
        PStack2.add(L21);

        L22.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/yellow.png"))); // NOI18N
        PStack2.add(L22);

        L23.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/purple.png"))); // NOI18N
        PStack2.add(L23);

        L24.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/purple.png"))); // NOI18N
        PStack2.add(L24);

        jPanel2.add(PStack2);
        PStack2.setBounds(330, 110, 330, 60);

        PStack3.setBackground(new java.awt.Color(0, 0, 0));
        PStack3.setMinimumSize(new java.awt.Dimension(100, 60));
        PStack3.setPreferredSize(new java.awt.Dimension(100, 60));
        PStack3.setLayout(new java.awt.GridLayout(1, 0));

        L30.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/blue.png"))); // NOI18N
        PStack3.add(L30);

        L31.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/yellow.png"))); // NOI18N
        PStack3.add(L31);

        L32.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/yellow.png"))); // NOI18N
        PStack3.add(L32);

        L33.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/blue.png"))); // NOI18N
        PStack3.add(L33);

        L29.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/yellow.png"))); // NOI18N
        PStack3.add(L29);

        jPanel2.add(PStack3);
        PStack3.setBounds(330, 180, 330, 60);

        PStack4.setBackground(new java.awt.Color(0, 0, 0));
        PStack4.setMinimumSize(new java.awt.Dimension(100, 60));
        PStack4.setPreferredSize(new java.awt.Dimension(100, 60));
        PStack4.setLayout(new java.awt.GridLayout());
        PStack4.add(L40);
        PStack4.add(L41);
        PStack4.add(L42);
        PStack4.add(L43);
        PStack4.add(L44);

        jPanel2.add(PStack4);
        PStack4.setBounds(330, 250, 330, 60);

        jLabel9.setBackground(new java.awt.Color(51, 51, 51));
        jLabel9.setFont(new java.awt.Font("sansserif", 0, 24)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(204, 204, 204));
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setText("4");
        jLabel9.setOpaque(true);
        jPanel2.add(jLabel9);
        jLabel9.setBounds(280, 250, 50, 60);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 675, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 345, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BMoverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BMoverActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_BMoverActionPerformed

    private void BIniciarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BIniciarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_BIniciarActionPerformed

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
            java.util.logging.Logger.getLogger(FPilasEsferas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FPilasEsferas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FPilasEsferas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FPilasEsferas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FPilasEsferas().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BIniciar;
    private javax.swing.JButton BMover;
    private javax.swing.JComboBox CBMeter;
    private javax.swing.JComboBox CBSacar;
    private javax.swing.JLabel L10;
    private javax.swing.JLabel L11;
    private javax.swing.JLabel L12;
    private javax.swing.JLabel L13;
    private javax.swing.JLabel L14;
    private javax.swing.JLabel L20;
    private javax.swing.JLabel L21;
    private javax.swing.JLabel L22;
    private javax.swing.JLabel L23;
    private javax.swing.JLabel L24;
    private javax.swing.JLabel L29;
    private javax.swing.JLabel L30;
    private javax.swing.JLabel L31;
    private javax.swing.JLabel L32;
    private javax.swing.JLabel L33;
    private javax.swing.JLabel L40;
    private javax.swing.JLabel L41;
    private javax.swing.JLabel L42;
    private javax.swing.JLabel L43;
    private javax.swing.JLabel L44;
    private javax.swing.JPanel PStack1;
    private javax.swing.JPanel PStack2;
    private javax.swing.JPanel PStack3;
    private javax.swing.JPanel PStack4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    // End of variables declaration//GEN-END:variables
}
