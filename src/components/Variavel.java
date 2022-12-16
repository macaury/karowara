package components;

import java.awt.Component;
import javax.swing.JButton;
import menuComponents.MenuVariavelJP;
import telas.principal;

public class Variavel extends Elemento {
    public static Variavel selecionado;
    private MenuVariavelJP menuVar;
    private JButton VariavelMenuJP;
    public Variavel(MenuVariavelJP menuVar, JButton VariavelMenuJP) {
        super();
        initComponents();
        
        this.menuVar = menuVar;
        this.VariavelMenuJP = VariavelMenuJP;
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
        ValorJTF = new javax.swing.JTextField();
        filler3 = new javax.swing.Box.Filler(new java.awt.Dimension(0, 0), new java.awt.Dimension(20, 0), new java.awt.Dimension(0, 0));

        jLabel1.setText("jLabel1");

        setPreferredSize(new java.awt.Dimension(200, 50));
        addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                alterarMenu(evt);
            }
        });
        setLayout(new javax.swing.BoxLayout(this, javax.swing.BoxLayout.LINE_AXIS));
        add(filler1);

        IconJL.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icones/icones_das_funcoes/icon_var.png"))); // NOI18N
        add(IconJL);
        add(filler4);
        add(NomeJL);
        add(filler2);

        ValorJTF.setEditable(false);
        ValorJTF.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                criarCopiaValor(evt);
            }
        });
        add(ValorJTF);
        add(filler3);
    }// </editor-fold>//GEN-END:initComponents

    private void criarCopiaValor(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_criarCopiaValor

        ValorJP teste = new ValorJP(ValorJTF.getText());
        this.getParent().add(teste);
        
        teste.setSize(teste.getPreferredSize());
        teste.setLocation(evt.getPoint());
        //teste.setBounds(100, 100, 100, 100);
        revalidate();
    }//GEN-LAST:event_criarCopiaValor

    private void alterarMenu(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_alterarMenu
        //selecionado = this;
        VariavelMenuJP.setVisible(true);
        menuVar.alterarMenu(this, NomeJL.getText(), ValorJTF.getText());
    }//GEN-LAST:event_alterarMenu
    
    public void alterarVariavel(String nome, String valor){
        NomeJL.setText(nome);
        ValorJTF.setText(valor);
    }
    
    public void alterarValor(String valor){
        ValorJTF.setText(valor);
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
    // End of variables declaration//GEN-END:variables
}
