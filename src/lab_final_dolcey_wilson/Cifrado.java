package lab_final_dolcey_wilson;

public class Cifrado extends javax.swing.JFrame {
    public static String letras[] = new String[4];
    static int i = 0;
    static String pass;

    public Cifrado() {
        initComponents();
        setLocationRelativeTo(null);
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
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txt_Propio = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txt_Palabra = new javax.swing.JTextField();
        txt_Propio_Vigenere = new javax.swing.JTextField();
        txt_Vigenere = new javax.swing.JTextField();
        txt_Propio_Vigenere_BInario = new javax.swing.JTextField();
        btn_Siguiente = new javax.swing.JButton();

        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosed(java.awt.event.WindowEvent evt) {
                formWindowClosed(evt);
            }
        });

        jLabel1.setText("PALABRA");

        jLabel2.setText("PROPIO");

        jLabel3.setText("VIGENÉRE");

        jLabel4.setText("PROPIO > VIGENERE");

        txt_Propio.setEditable(false);
        txt_Propio.setText(":)");

        jLabel5.setText("PROPIO > VIGENERE > BINARIO");

        txt_Palabra.setEditable(false);
        txt_Palabra.setText(":)");
        txt_Palabra.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_PalabraActionPerformed(evt);
            }
        });

        txt_Propio_Vigenere.setEditable(false);
        txt_Propio_Vigenere.setText(":)");

        txt_Vigenere.setEditable(false);
        txt_Vigenere.setText(":)");

        txt_Propio_Vigenere_BInario.setEditable(false);
        txt_Propio_Vigenere_BInario.setText(":)");

        btn_Siguiente.setText("SIG. >");
        btn_Siguiente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_SiguienteActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5)
                            .addComponent(txt_Propio, javax.swing.GroupLayout.DEFAULT_SIZE, 374, Short.MAX_VALUE)
                            .addComponent(txt_Vigenere)
                            .addComponent(txt_Propio_Vigenere)
                            .addComponent(txt_Propio_Vigenere_BInario))
                        .addContainerGap(16, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(txt_Palabra, javax.swing.GroupLayout.PREFERRED_SIZE, 251, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btn_Siguiente)
                        .addGap(25, 25, 25))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(13, 13, 13)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_Palabra, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_Siguiente))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txt_Propio, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel3)
                .addGap(12, 12, 12)
                .addComponent(txt_Vigenere, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txt_Propio_Vigenere, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel5)
                .addGap(18, 18, 18)
                .addComponent(txt_Propio_Vigenere_BInario, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(23, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_SiguienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_SiguienteActionPerformed
    }//GEN-LAST:event_btn_SiguienteActionPerformed

    private void txt_PalabraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_PalabraActionPerformed
    }//GEN-LAST:event_txt_PalabraActionPerformed

    private void formWindowClosed(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosed
    }//GEN-LAST:event_formWindowClosed

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
            java.util.logging.Logger.getLogger(Cifrado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Cifrado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Cifrado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Cifrado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Cifrado().setVisible(true);
            }
        });
    }
    
    public static void pasarPalabras(String[] palabras, String clave) {
        for (int j = 0; j < palabras.length; j++) {
            letras[j] = palabras[j];
        }
        pass = clave;
        
        txt_Palabra.setText(letras[i]);
        txt_Propio.setText(MetodoEncript.encrip(letras[i]));
        txt_Vigenere.setText(EncriptarVigenere.Encript(letras[i], pass));
        txt_Propio_Vigenere.setText(EncriptarVigenere.Encript(txt_Propio.getText(), pass));
        String temp = "";
        
        for (int j = 0; j < letras[i].length(); j++) {
            temp += Binario.Convertir(txt_Propio_Vigenere.getText()) + " ";            
        }
            
        txt_Propio_Vigenere_BInario.setText(temp);
    }
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_Siguiente;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    public static javax.swing.JTextField txt_Palabra;
    public static javax.swing.JTextField txt_Propio;
    public static javax.swing.JTextField txt_Propio_Vigenere;
    public static javax.swing.JTextField txt_Propio_Vigenere_BInario;
    public static javax.swing.JTextField txt_Vigenere;
    // End of variables declaration//GEN-END:variables
}
