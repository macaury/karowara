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

        filler1 = new javax.swing.Box.Filler(new java.awt.Dimension(0, 0), new java.awt.Dimension(20, 0), new java.awt.Dimension(0, 0));
        IconJL = new javax.swing.JLabel();
        filler4 = new javax.swing.Box.Filler(new java.awt.Dimension(0, 0), new java.awt.Dimension(20, 0), new java.awt.Dimension(0, 0));
        NomeJL = new javax.swing.JLabel();
        filler2 = new javax.swing.Box.Filler(new java.awt.Dimension(0, 0), new java.awt.Dimension(20, 0), new java.awt.Dimension(0, 0));
        ValorJTF = new javax.swing.JTextField();
        filler3 = new javax.swing.Box.Filler(new java.awt.Dimension(0, 0), new java.awt.Dimension(20, 0), new java.awt.Dimension(0, 0));

        setPreferredSize(new java.awt.Dimension(200, 34));
        setLayout(new javax.swing.BoxLayout(this, javax.swing.BoxLayout.LINE_AXIS));
        add(filler1);

        IconJL.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icones/icones_das_funcoes/icon_var.png"))); // NOI18N
        add(IconJL);
        add(filler4);
        add(NomeJL);
        add(filler2);

        ValorJTF.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                aleatorioParadeletar(evt);
            }
        });
        add(ValorJTF);
        add(filler3);
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
    // End of variables declaration//GEN-END:variables
}
