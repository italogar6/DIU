/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Practica2;

/**
 *
 * @author usuario
 */
public class MainFrame extends javax.swing.JFrame {

    /**
     * Creates new form MainFrame
     */
    public MainFrame() {
        initComponents();
        deslizador.setValue(0);
        barraProgreso.setValue(0);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        deslizador = new javax.swing.JSlider();
        autor = new javax.swing.JLabel();
        barraProgreso = new javax.swing.JProgressBar();
        infoEstado = new javax.swing.JLabel();
        estadoPosicion = new javax.swing.JTextField();
        estadoTecla = new javax.swing.JTextField();
        infoValor = new javax.swing.JLabel();
        valor = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        deslizador.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                deslizadorStateChanged(evt);
            }
        });
        deslizador.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                deslizadorMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                deslizadorMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                deslizadorMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                deslizadorMouseReleased(evt);
            }
        });

        autor.setText("Autor: Italo Garleni");
        autor.setToolTipText("");

        infoEstado.setText("Estado del Ratón");

        infoValor.setText("Valor del Deslizador");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(deslizador, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(autor)
                    .addComponent(barraProgreso, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(estadoPosicion)
                    .addComponent(estadoTecla)
                    .addComponent(infoValor, javax.swing.GroupLayout.DEFAULT_SIZE, 170, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(infoEstado)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(valor))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(deslizador, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(infoEstado))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(estadoPosicion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(2, 2, 2)
                .addComponent(barraProgreso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(estadoTecla, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(infoValor)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(valor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 104, Short.MAX_VALUE)
                .addComponent(autor))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void deslizadorStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_deslizadorStateChanged
        int value = deslizador.getValue();
        barraProgreso.setValue(value);
        valor.setText(String.valueOf(value));
    }//GEN-LAST:event_deslizadorStateChanged

    private void deslizadorMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_deslizadorMouseEntered
        // TODO add your handling code here:
        estadoPosicion.setText("Dentro");
    }//GEN-LAST:event_deslizadorMouseEntered

    private void deslizadorMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_deslizadorMouseExited
        // TODO add your handling code here:
        estadoPosicion.setText("Fuera");
    }//GEN-LAST:event_deslizadorMouseExited

    private void deslizadorMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_deslizadorMousePressed
        // TODO add your handling code here:
        estadoTecla.setText("Presionado");
    }//GEN-LAST:event_deslizadorMousePressed

    private void deslizadorMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_deslizadorMouseReleased
        // TODO add your handling code here:
        estadoTecla.setText("Liberado");
    }//GEN-LAST:event_deslizadorMouseReleased

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
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel autor;
    private javax.swing.JProgressBar barraProgreso;
    private javax.swing.JSlider deslizador;
    private javax.swing.JTextField estadoPosicion;
    private javax.swing.JTextField estadoTecla;
    private javax.swing.JLabel infoEstado;
    private javax.swing.JLabel infoValor;
    private javax.swing.JTextField valor;
    // End of variables declaration//GEN-END:variables
}
