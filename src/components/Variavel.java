package components;

import javax.swing.JLabel;

public class Variavel extends Elemento {


    public Variavel() {
        super();
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        filler1 = new javax.swing.Box.Filler(new java.awt.Dimension(0, 0), new java.awt.Dimension(20, 0), new java.awt.Dimension(0, 0));
        IconJL = new javax.swing.JLabel();
        filler4 = new javax.swing.Box.Filler(new java.awt.Dimension(0, 0), new java.awt.Dimension(20, 0), new java.awt.Dimension(0, 0));
        NomeJL = new javax.swing.JLabel();
        filler2 = new javax.swing.Box.Filler(new java.awt.Dimension(0, 0), new java.awt.Dimension(20, 0), new java.awt.Dimension(0, 0));
        filler3 = new javax.swing.Box.Filler(new java.awt.Dimension(0, 0), new java.awt.Dimension(20, 0), new java.awt.Dimension(0, 0));
        textField1 = new java.awt.TextField();
        ValorJTF = new javax.swing.JTextField();

        jLabel1.setText("jLabel1");

        setPreferredSize(new java.awt.Dimension(200, 50));
        setLayout(new javax.swing.BoxLayout(this, javax.swing.BoxLayout.LINE_AXIS));
        add(filler1);

        IconJL.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icones/icones_das_funcoes/icon_var.png"))); // NOI18N
        add(IconJL);
        add(filler4);
        add(NomeJL);
        add(filler2);
        add(filler3);

        textField1.setBackground(new java.awt.Color(255, 255, 255));
        textField1.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        textField1.setEditable(false);
        textField1.setFont(new java.awt.Font("Lucida Grande", 0, 20)); // NOI18N
        textField1.setPreferredSize(new java.awt.Dimension(40, 40));
        textField1.setText("A");
        textField1.setSize(new java.awt.Dimension(5, 5));
        textField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textField1ActionPerformed(evt);
            }
        });
        add(textField1);

        ValorJTF.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                aleatorioParadeletar(evt);
            }
        });
        ValorJTF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ValorJTFActionPerformed(evt);
            }
        });
        add(ValorJTF);
    }// </editor-fold>//GEN-END:initComponents

    private void aleatorioParadeletar(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_aleatorioParadeletar

        //JLabel teste = new JLabel("asdadadsada");
        
        //FUNCIONA
        //this.getParent().getParent().add(teste);
        //TAMBEM FUNCIONA
        //this.getTopLevelAncestor().add(teste);
        
        
        //teste.setBounds(100, 100, 100, 100);
        //PROTOTIPO TESTE FUNCIONA
    }//GEN-LAST:event_aleatorioParadeletar

    private void ValorJTFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ValorJTFActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ValorJTFActionPerformed

    private void textField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textField1ActionPerformed

    public void refazer(){
        initComponents();
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel IconJL;
    private javax.swing.JLabel NomeJL;
    private javax.swing.JTextField ValorJTF;
    private javax.swing.Box.Filler filler1;
    private javax.swing.Box.Filler filler2;
    private javax.swing.Box.Filler filler3;
    private javax.swing.Box.Filler filler4;
    private javax.swing.JLabel jLabel1;
    private java.awt.TextField textField1;
    // End of variables declaration//GEN-END:variables
}
