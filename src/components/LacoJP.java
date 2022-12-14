/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package components;

import java.awt.Component;

/**
 *
 * @author GABRIEL
 */
public class LacoJP extends Elemento {

    private boolean permitir = true;
    
    public LacoJP() {
        super();
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

        AgruparJP = new javax.swing.JPanel();
        filler2 = new javax.swing.Box.Filler(new java.awt.Dimension(20, 0), new java.awt.Dimension(20, 0), new java.awt.Dimension(20, 32767));
        jLabel1 = new javax.swing.JLabel();
        filler1 = new javax.swing.Box.Filler(new java.awt.Dimension(20, 0), new java.awt.Dimension(20, 0), new java.awt.Dimension(20, 32767));
        jTextField1 = new javax.swing.JTextField();

        setPreferredSize(new java.awt.Dimension(200, 75));
        setLayout(new java.awt.BorderLayout());

        AgruparJP.setBackground(getBackground());
        AgruparJP.setLayout(new javax.swing.BoxLayout(AgruparJP, javax.swing.BoxLayout.LINE_AXIS));
        AgruparJP.add(filler2);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icones/grande/bloco while.png"))); // NOI18N
        AgruparJP.add(jLabel1);
        AgruparJP.add(filler1);

        jTextField1.setEditable(false);
        jTextField1.setBackground(new java.awt.Color(255, 255, 255));
        jTextField1.setBorder(null);
        AgruparJP.add(jTextField1);

        add(AgruparJP, java.awt.BorderLayout.CENTER);
    }// </editor-fold>//GEN-END:initComponents

    public void adicionarCondicao(Component cond){
        if(permitir){
            int novoWidht = this.getSize().width;
            novoWidht -= jTextField1.getWidth();
            novoWidht += cond.getWidth();
            
            AgruparJP.remove(jTextField1);
            AgruparJP.add(cond);
            this.setSize(novoWidht,this.getHeight());
            permitir = false;
            
            revalidate();
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel AgruparJP;
    private javax.swing.Box.Filler filler1;
    private javax.swing.Box.Filler filler2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JTextField jTextField1;
    // End of variables declaration//GEN-END:variables
}
