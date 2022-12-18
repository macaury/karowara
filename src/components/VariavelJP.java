package components;

import java.awt.Component;
import java.awt.Point;
import javax.swing.JButton;
import javax.swing.JLayeredPane;
import menuComponents.MenuVariavelJP;

public class VariavelJP extends Elemento {
    private MenuVariavelJP menuVar;
    private JButton VariavelMenuJP;
    
    
    public VariavelJP(MenuVariavelJP menuVar, JButton VariavelMenuJP) {
        super();
        initComponents();
        
        this.menuVar = menuVar;
        this.VariavelMenuJP = VariavelMenuJP;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        filler8 = new javax.swing.Box.Filler(new java.awt.Dimension(20, 0), new java.awt.Dimension(20, 0), new java.awt.Dimension(20, 32767));
        IconJL = new javax.swing.JLabel();
        filler7 = new javax.swing.Box.Filler(new java.awt.Dimension(20, 0), new java.awt.Dimension(20, 0), new java.awt.Dimension(20, 32767));
        NomeJL = new javax.swing.JLabel();
        filler5 = new javax.swing.Box.Filler(new java.awt.Dimension(20, 0), new java.awt.Dimension(20, 0), new java.awt.Dimension(20, 32767));
        ValorJTF = new javax.swing.JTextField();
        filler6 = new javax.swing.Box.Filler(new java.awt.Dimension(20, 0), new java.awt.Dimension(20, 0), new java.awt.Dimension(20, 32767));

        jLabel1.setText("jLabel1");

        setPreferredSize(new java.awt.Dimension(200, 50));
        addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                alterarMenu(evt);
            }
        });
        setLayout(new javax.swing.BoxLayout(this, javax.swing.BoxLayout.LINE_AXIS));
        add(filler8);

        IconJL.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icones/icones_das_funcoes/icon_var.png"))); // NOI18N
        add(IconJL);
        add(filler7);
        add(NomeJL);
        add(filler5);

        ValorJTF.setEditable(false);
        ValorJTF.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        ValorJTF.setBorder(null);
        ValorJTF.setHighlighter(null);
        ValorJTF.addCaretListener(new javax.swing.event.CaretListener() {
            public void caretUpdate(javax.swing.event.CaretEvent evt) {
                mudarTamanho(evt);
            }
        });
        ValorJTF.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                criarCopiaValor(evt);
            }
        });
        add(ValorJTF);
        add(filler6);
    }// </editor-fold>//GEN-END:initComponents

    private void criarCopiaValor(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_criarCopiaValor
        
        if(!ValorJTF.getText().equals("")){
            ValorJP teste = new ValorJP(ValorJTF.getText());
            this.getParent().add(teste, JLayeredPane.MODAL_LAYER);

            teste.setSize(teste.getPreferredSize());

            Point pos = new Point();
            pos.x = evt.getX()+ValorJTF.getX()+this.getX();
            pos.y = evt.getY()+this.getY();
            pos.x -= teste.getPreferredSize().getWidth()/2;
            pos.y -= teste.getPreferredSize().getHeight()/2;
            teste.setLocation(pos);
            //teste.setBounds(100, 100, 100, 100);
            revalidate();
        }
    }//GEN-LAST:event_criarCopiaValor

    private void alterarMenu(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_alterarMenu
        VariavelMenuJP.setVisible(true);
        menuVar.alterarMenu(this, NomeJL.getText(), ValorJTF.getText());
    }//GEN-LAST:event_alterarMenu

    private void mudarTamanho(javax.swing.event.CaretEvent evt) {//GEN-FIRST:event_mudarTamanho
        
        /*int novoWeight = (int) (this.getSize().getWidth() - ValorJTF.getSize().getWidth() - NomeJL.getSize().getWidth());
        novoWeight += ValorJTF.getFontMetrics(ValorJTF.getFont()).stringWidth(ValorJTF.getText());
        novoWeight += NomeJL.getFontMetrics(NomeJL.getFont()).stringWidth(NomeJL.getText());
        
        System.out.println(ValorJTF.getText() + " " + NomeJL.getText());

        this.setSize(novoWeight, this.getHeight());
        revalidate();*/
    }//GEN-LAST:event_mudarTamanho
    
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
    private javax.swing.Box.Filler filler5;
    private javax.swing.Box.Filler filler6;
    private javax.swing.Box.Filler filler7;
    private javax.swing.Box.Filler filler8;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}
