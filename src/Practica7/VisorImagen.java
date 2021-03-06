package Practica7;


import java.io.File;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Italo
 */
public class VisorImagen extends javax.swing.JPanel {

    /**
     * Creates new form VisorImagen
     */
    public VisorImagen() {
        initComponents();
    }
    
    public void setImagen(File file){
        
        if(file != null){
            Imagen.setIcon(new javax.swing.ImageIcon(file.getAbsolutePath()));
        }
        else{
            Imagen.setIcon(null);
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Scroll = new javax.swing.JScrollPane();
        Imagen = new javax.swing.JLabel();
        Institucion = new javax.swing.JLabel();

        Scroll.setViewportView(Imagen);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(Institucion)
                .addGap(0, 186, Short.MAX_VALUE))
            .addComponent(Scroll)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(Scroll, javax.swing.GroupLayout.DEFAULT_SIZE, 275, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Institucion)
                .addGap(5, 5, 5))
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Imagen;
    private javax.swing.JLabel Institucion;
    private javax.swing.JScrollPane Scroll;
    // End of variables declaration//GEN-END:variables
}
