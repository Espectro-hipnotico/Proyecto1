package com.menus;

public class Menus extends javax.swing.JFrame {

    /**
     * Creates new form Menus
     */
    public Menus() {
        initComponents();
        jPTraductor.setVisible(false);
        jPComunes.setVisible(false);
        jPanel3.setVisible(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPTraductor = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTArea1 = new javax.swing.JTextArea();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTArea2 = new javax.swing.JTextArea();
        jBtn_traducir = new javax.swing.JButton();
        jPComunes = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jPanel3 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMTraductor = new javax.swing.JMenu();
        jMComunes = new javax.swing.JMenu();
        jMAdmin = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPTraductor.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTArea1.setColumns(20);
        jTArea1.setRows(5);
        jScrollPane1.setViewportView(jTArea1);

        jPTraductor.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 150, 270, 120));

        jTArea2.setColumns(20);
        jTArea2.setRows(5);
        jScrollPane2.setViewportView(jTArea2);

        jPTraductor.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 270, 120));

        jBtn_traducir.setText("Traducir");
        jPTraductor.add(jBtn_traducir, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 30, -1, -1));

        getContentPane().add(jPTraductor, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 500, 300));

        jPComunes.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setText("Comunes");
        jPComunes.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 30, -1, -1));

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "Title 1", "Title 2"
            }
        ));
        jScrollPane3.setViewportView(jTable1);

        jPComunes.add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 240, 300));

        getContentPane().add(jPComunes, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 500, 300));

        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setText("Admin");
        jPanel3.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(229, 110, 110, 90));

        getContentPane().add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 500, 300));

        jMTraductor.setText("Traductor");
        jMTraductor.setName("Btn_Traductor"); // NOI18N
        jMTraductor.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMTraductorMouseClicked(evt);
            }
        });
        jMenuBar1.add(jMTraductor);

        jMComunes.setText("Comunes");
        jMComunes.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMComunesMouseClicked(evt);
            }
        });
        jMenuBar1.add(jMComunes);

        jMAdmin.setText("Admin");
        jMAdmin.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMAdminMouseClicked(evt);
            }
        });
        jMenuBar1.add(jMAdmin);

        setJMenuBar(jMenuBar1);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jMTraductorMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMTraductorMouseClicked
        jMAdmin.removeAll();
        jPTraductor.setVisible(true);
        jPComunes.setVisible(false);
        jPanel3.setVisible(false);
        System.out.println(jPTraductor.getName());
         System.out.println(jPTraductor.getUIClassID());
    }//GEN-LAST:event_jMTraductorMouseClicked

    private void jMComunesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMComunesMouseClicked
        jMAdmin.removeAll();
        jPComunes.setVisible(true);
        jPTraductor.setVisible(false);
        jPanel3.setVisible(false);
    }//GEN-LAST:event_jMComunesMouseClicked

    private void jMAdminMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMAdminMouseClicked
        jMAdmin.removeAll();
        jPanel3.setVisible(true);
        jPTraductor.setVisible(false);
        jPComunes.setVisible(false);
    }//GEN-LAST:event_jMAdminMouseClicked

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
            java.util.logging.Logger.getLogger(Menus.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Menus.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Menus.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Menus.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Menus().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBtn_traducir;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    public javax.swing.JMenu jMAdmin;
    private javax.swing.JMenu jMComunes;
    private javax.swing.JMenu jMTraductor;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPComunes;
    private javax.swing.JPanel jPTraductor;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTextArea jTArea1;
    private javax.swing.JTextArea jTArea2;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables
}
