/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package components;

import java.awt.Component;
import java.awt.Point;
import javax.swing.JTextField;

/**
 *
 * @author GABRIEL
 */
public class CondicaoJP extends Elemento {

    /**
     * Creates new form CondicaoJP
     */
    public CondicaoJP() {
        super();
        initComponents();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Agrupar = new javax.swing.JPanel();
        filler7 = new javax.swing.Box.Filler(new java.awt.Dimension(20, 0), new java.awt.Dimension(20, 0), new java.awt.Dimension(20, 32767));
        jLabel1 = new javax.swing.JLabel();
        filler6 = new javax.swing.Box.Filler(new java.awt.Dimension(20, 0), new java.awt.Dimension(20, 0), new java.awt.Dimension(20, 32767));
        AgruparCondicaoJP = new javax.swing.JPanel();
        Valor1JTF = new javax.swing.JTextField();
        CompararJCB = new javax.swing.JComboBox<>();
        Valor2JTF = new javax.swing.JTextField();

        setPreferredSize(new java.awt.Dimension(500, 75));
        addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                moverParaWhile(evt);
            }
        });
        setLayout(new java.awt.BorderLayout());

        Agrupar.setBackground(getBackground());
        Agrupar.setLayout(new javax.swing.BoxLayout(Agrupar, javax.swing.BoxLayout.LINE_AXIS));
        Agrupar.add(filler7);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icones/grande/bloco if.png"))); // NOI18N
        Agrupar.add(jLabel1);
        Agrupar.add(filler6);

        AgruparCondicaoJP.setBackground(getBackground());
        AgruparCondicaoJP.setLayout(new javax.swing.BoxLayout(AgruparCondicaoJP, javax.swing.BoxLayout.LINE_AXIS));

        Valor1JTF.setEditable(false);
        Valor1JTF.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        Valor1JTF.setAutoscrolls(false);
        Valor1JTF.setBorder(null);
        Valor1JTF.setHighlighter(null);
        AgruparCondicaoJP.add(Valor1JTF);

        CompararJCB.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "==", "!=", ">=", "<=", ">", "<" }));
        CompararJCB.setBorder(null);
        AgruparCondicaoJP.add(CompararJCB);

        Valor2JTF.setEditable(false);
        Valor2JTF.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        Valor2JTF.setBorder(null);
        AgruparCondicaoJP.add(Valor2JTF);

        Agrupar.add(AgruparCondicaoJP);

        add(Agrupar, java.awt.BorderLayout.CENTER);
    }// </editor-fold>//GEN-END:initComponents

    private void moverParaWhile(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_moverParaWhile
        for (Component componente : this.getParent().getComponents()) {
            if(isOver(this,componente)){
                if(componente instanceof LacoJP laco){
                    laco.adicionarCondicao(AgruparCondicaoJP);
                    this.getParent().remove(this);
                    revalidate();
                }
            }
        }
    }//GEN-LAST:event_moverParaWhile
       
    private boolean isOver(Component a, Component b){
        if(a.getX() >= b.getLocation().getX() && a.getX() < b.getWidth()+b.getLocation().getX()){
            if(a.getY() >= b.getLocation().getY() && a.getY() < b.getHeight()+b.getLocation().getY()){
                return true;
            }
        }
        return false;
    }
    
    public void alterarValor(String valor, Point coordenada){
        coordenada.x -= this.getLocation().x;
        coordenada.y -= this.getLocation().y;
        
        coordenada.x -= AgruparCondicaoJP.getLocation().x;
        
        ((JTextField)AgruparCondicaoJP.getComponentAt(coordenada)).setText(valor);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Agrupar;
    private javax.swing.JPanel AgruparCondicaoJP;
    private javax.swing.JComboBox<String> CompararJCB;
    private javax.swing.JTextField Valor1JTF;
    private javax.swing.JTextField Valor2JTF;
    private javax.swing.Box.Filler filler6;
    private javax.swing.Box.Filler filler7;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}
