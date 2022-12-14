/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package telas;

import java.awt.CardLayout;
import java.awt.Component;
import java.awt.Container;
import java.awt.PopupMenu;
import java.awt.event.MouseAdapter;
import java.util.Arrays;
import javax.swing.JButton;


/**
 *
 * @author GABRIEL
 */
public class GerenciarProjetos extends javax.swing.JPanel {

    MouseParaProjeto mouseProj;
    
    
    public GerenciarProjetos() {
        initComponents();
        
        mouseProj = new MouseParaProjeto();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel3 = new javax.swing.JPanel();
        filler6 = new javax.swing.Box.Filler(new java.awt.Dimension(10, 0), new java.awt.Dimension(10, 0), new java.awt.Dimension(10, 32767));
        jPanel1 = new javax.swing.JPanel();
        filler1 = new javax.swing.Box.Filler(new java.awt.Dimension(0, 60), new java.awt.Dimension(0, 60), new java.awt.Dimension(32767, 60));
        jButton1 = new javax.swing.JButton();
        filler2 = new javax.swing.Box.Filler(new java.awt.Dimension(0, 15), new java.awt.Dimension(0, 15), new java.awt.Dimension(32767, 15));
        filler13 = new javax.swing.Box.Filler(new java.awt.Dimension(0, 40), new java.awt.Dimension(0, 40), new java.awt.Dimension(32767, 40));
        jButton2 = new javax.swing.JButton();
        filler3 = new javax.swing.Box.Filler(new java.awt.Dimension(0, 15), new java.awt.Dimension(0, 15), new java.awt.Dimension(32767, 15));
        filler14 = new javax.swing.Box.Filler(new java.awt.Dimension(0, 40), new java.awt.Dimension(0, 40), new java.awt.Dimension(32767, 40));
        jButton3 = new javax.swing.JButton();
        filler5 = new javax.swing.Box.Filler(new java.awt.Dimension(0, 0), new java.awt.Dimension(0, 0), new java.awt.Dimension(0, 32767));
        jButton4 = new javax.swing.JButton();
        filler8 = new javax.swing.Box.Filler(new java.awt.Dimension(0, 15), new java.awt.Dimension(0, 15), new java.awt.Dimension(32767, 15));
        filler15 = new javax.swing.Box.Filler(new java.awt.Dimension(0, 20), new java.awt.Dimension(0, 20), new java.awt.Dimension(32767, 20));
        btn_ajustes = new javax.swing.JButton();
        filler4 = new javax.swing.Box.Filler(new java.awt.Dimension(0, 40), new java.awt.Dimension(0, 40), new java.awt.Dimension(32767, 40));
        filler7 = new javax.swing.Box.Filler(new java.awt.Dimension(10, 0), new java.awt.Dimension(10, 0), new java.awt.Dimension(10, 32767));
        jPanel2 = new javax.swing.JPanel();
        ajustes = new telas.Ajustes();
        jPanel8 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jPanel4 = new javax.swing.JPanel();
        jButton6 = new javax.swing.JButton();
        filler9 = new javax.swing.Box.Filler(new java.awt.Dimension(50, 50), new java.awt.Dimension(50, 50), new java.awt.Dimension(50, 50));
        filler10 = new javax.swing.Box.Filler(new java.awt.Dimension(50, 50), new java.awt.Dimension(50, 50), new java.awt.Dimension(50, 50));
        filler11 = new javax.swing.Box.Filler(new java.awt.Dimension(50, 50), new java.awt.Dimension(50, 50), new java.awt.Dimension(50, 50));
        filler12 = new javax.swing.Box.Filler(new java.awt.Dimension(50, 50), new java.awt.Dimension(50, 50), new java.awt.Dimension(50, 50));
        jPanel7 = new javax.swing.JPanel();
        atencao1 = new telas.Atencao();

        setPreferredSize(new java.awt.Dimension(400, 800));
        setLayout(new java.awt.BorderLayout());

        jPanel3.setBackground(new java.awt.Color(96, 164, 178));
        jPanel3.setPreferredSize(new java.awt.Dimension(350, 100));
        jPanel3.setRequestFocusEnabled(false);
        jPanel3.setLayout(new java.awt.BorderLayout());
        jPanel3.add(filler6, java.awt.BorderLayout.WEST);

        jPanel1.setBackground(new java.awt.Color(96, 164, 178));
        jPanel1.setLayout(new javax.swing.BoxLayout(jPanel1, javax.swing.BoxLayout.Y_AXIS));
        jPanel1.add(filler1);

        jButton1.setBackground(new java.awt.Color(96, 164, 178));
        jButton1.setFont(new java.awt.Font("Helvetica Neue", 0, 30)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Novo Projeto");
        jButton1.setAlignmentX(0.5F);
        jButton1.setBorder(null);
        jButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                novoProjeto(evt);
            }
        });
        jPanel1.add(jButton1);
        jPanel1.add(filler2);
        jPanel1.add(filler13);

        jButton2.setBackground(new java.awt.Color(96, 164, 178));
        jButton2.setFont(new java.awt.Font("Helvetica Neue", 0, 30)); // NOI18N
        jButton2.setForeground(new java.awt.Color(255, 255, 255));
        jButton2.setText("Todos projetos");
        jButton2.setAlignmentX(0.5F);
        jButton2.setBorder(null);
        jButton2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                irParaTodosProjetos(evt);
            }
        });
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2);
        jPanel1.add(filler3);
        jPanel1.add(filler14);

        jButton3.setBackground(new java.awt.Color(96, 164, 178));
        jButton3.setFont(new java.awt.Font("Helvetica Neue", 0, 30)); // NOI18N
        jButton3.setForeground(new java.awt.Color(255, 255, 255));
        jButton3.setText("Exportar projeto");
        jButton3.setAlignmentX(0.5F);
        jButton3.setBorder(null);
        jPanel1.add(jButton3);
        jPanel1.add(filler5);

        jButton4.setBackground(new java.awt.Color(96, 164, 178));
        jButton4.setFont(new java.awt.Font("Helvetica Neue", 0, 30)); // NOI18N
        jButton4.setForeground(new java.awt.Color(255, 255, 255));
        jButton4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icones/ajuda_ajustes.png"))); // NOI18N
        jButton4.setText("  Ajuda");
        jButton4.setToolTipText("");
        jButton4.setAlignmentX(0.5F);
        jButton4.setBorder(null);
        jButton4.setPreferredSize(new java.awt.Dimension(50, 60));
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton4);
        jPanel1.add(filler8);
        jPanel1.add(filler15);

        btn_ajustes.setBackground(new java.awt.Color(96, 164, 178));
        btn_ajustes.setFont(new java.awt.Font("Helvetica Neue", 0, 30)); // NOI18N
        btn_ajustes.setForeground(new java.awt.Color(255, 255, 255));
        btn_ajustes.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icones/configuracao_ajustes.png"))); // NOI18N
        btn_ajustes.setText("  Ajustes");
        btn_ajustes.setAlignmentX(0.5F);
        btn_ajustes.setBorder(null);
        btn_ajustes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_ajustesActionPerformed(evt);
            }
        });
        jPanel1.add(btn_ajustes);
        jPanel1.add(filler4);

        jPanel3.add(jPanel1, java.awt.BorderLayout.CENTER);
        jPanel3.add(filler7, java.awt.BorderLayout.EAST);

        add(jPanel3, java.awt.BorderLayout.WEST);

        jPanel2.setPreferredSize(new java.awt.Dimension(100, 100));
        jPanel2.setLayout(new java.awt.CardLayout());
        jPanel2.add(ajustes, "Ajustes");

        jPanel8.setMinimumSize(new java.awt.Dimension(450, 208));
        jPanel8.setLayout(new java.awt.BorderLayout());

        jLabel1.setFont(new java.awt.Font("Helvetica Neue", 0, 48)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(88, 88, 88));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icones/lampada.png"))); // NOI18N
        jLabel1.setText("  Todos projetos");
        jLabel1.setAlignmentX(0.5F);
        jLabel1.setMaximumSize(new java.awt.Dimension(500, 58));
        jLabel1.setPreferredSize(new java.awt.Dimension(500, 100));
        jLabel1.setRequestFocusEnabled(false);
        jPanel8.add(jLabel1, java.awt.BorderLayout.PAGE_START);

        jPanel6.setLayout(new java.awt.BorderLayout());

        jPanel4.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.LEFT));

        jButton6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icones/add.png"))); // NOI18N
        jButton6.setToolTipText("novo projeto");
        jButton6.setPreferredSize(new java.awt.Dimension(190, 250));
        jButton6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                novoProjeto(evt);
            }
        });
        jPanel4.add(jButton6);

        jScrollPane1.setViewportView(jPanel4);

        jPanel6.add(jScrollPane1, java.awt.BorderLayout.CENTER);
        jPanel6.add(filler9, java.awt.BorderLayout.NORTH);
        jPanel6.add(filler10, java.awt.BorderLayout.SOUTH);
        jPanel6.add(filler11, java.awt.BorderLayout.WEST);
        jPanel6.add(filler12, java.awt.BorderLayout.EAST);

        jPanel8.add(jPanel6, java.awt.BorderLayout.CENTER);

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 999, Short.MAX_VALUE)
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        jPanel8.add(jPanel7, java.awt.BorderLayout.PAGE_END);

        jPanel2.add(jPanel8, "Todos projetos");
        jPanel2.add(atencao1, "Atencao");

        add(jPanel2, java.awt.BorderLayout.CENTER);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
      
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed

        CardLayout cl = (CardLayout) jPanel2.getLayout();
        
        cl.show(jPanel2, "Atencao");
    }//GEN-LAST:event_jButton4ActionPerformed

    private void btn_ajustesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_ajustesActionPerformed

        CardLayout cl = (CardLayout) jPanel2.getLayout();
        
        cl.show(jPanel2, "Ajustes");
        
        
    }//GEN-LAST:event_btn_ajustesActionPerformed

    private void novoProjeto(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_novoProjeto
        Container pai = this.getParent();
        Projeto novoProj = new Projeto();
        
        novoProj.setName(novoProj.getClass().getSimpleName()+pai.getComponentCount());
        pai.add(novoProj, novoProj.getName());
        
        CardLayout cl = (CardLayout) pai.getLayout();

        cl.show(pai, novoProj.getName());
        
        JButton novoBotao = new JButton();
        novoBotao.setName(novoProj.getName());
        novoBotao.setPreferredSize(jButton6.getPreferredSize());
        novoBotao.addMouseListener(mouseProj);
        
        jPanel4.add(novoBotao, 1);
    }//GEN-LAST:event_novoProjeto

    private void irParaTodosProjetos(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_irParaTodosProjetos
        CardLayout cl = (CardLayout) jPanel2.getLayout();
        
        cl.show(jPanel2, "Todos projetos");
    }//GEN-LAST:event_irParaTodosProjetos
    
    private void irParaProjeto(java.awt.event.MouseEvent evt){
        CardLayout cl = (CardLayout) this.getParent().getLayout();

        cl.show(this.getParent(), evt.getComponent().getName());
    }
    
    private class MouseParaProjeto extends MouseAdapter{
        
       @Override
       public void mouseReleased(java.awt.event.MouseEvent evt){
           irParaProjeto(evt);
       }
    }
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private telas.Ajustes ajustes;
    private telas.Atencao atencao1;
    private javax.swing.JButton btn_ajustes;
    private javax.swing.Box.Filler filler1;
    private javax.swing.Box.Filler filler10;
    private javax.swing.Box.Filler filler11;
    private javax.swing.Box.Filler filler12;
    private javax.swing.Box.Filler filler13;
    private javax.swing.Box.Filler filler14;
    private javax.swing.Box.Filler filler15;
    private javax.swing.Box.Filler filler2;
    private javax.swing.Box.Filler filler3;
    private javax.swing.Box.Filler filler4;
    private javax.swing.Box.Filler filler5;
    private javax.swing.Box.Filler filler6;
    private javax.swing.Box.Filler filler7;
    private javax.swing.Box.Filler filler8;
    private javax.swing.Box.Filler filler9;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton6;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables

}
