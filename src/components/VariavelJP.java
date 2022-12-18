package components;

import java.awt.Component;
import java.awt.Point;
import javax.swing.JButton;
import javax.swing.JLayeredPane;
import menuComponents.MenuVariavelJP;

public class VariavelJP extends Elemento {
    private final MenuVariavelJP menuVar;
    private final JButton VariavelMenuJP;
    
    
    public VariavelJP(MenuVariavelJP menuVar, JButton VariavelMenuJP) {
        initComponents();
        
        this.menuVar = menuVar;
        this.VariavelMenuJP = VariavelMenuJP;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        IconJL = new javax.swing.JLabel();
        Agrupar = new javax.swing.JPanel();
        filler7 = new javax.swing.Box.Filler(new java.awt.Dimension(20, 0), new java.awt.Dimension(20, 0), new java.awt.Dimension(20, 32767));
        NomeJL = new javax.swing.JLabel();
        filler5 = new javax.swing.Box.Filler(new java.awt.Dimension(20, 0), new java.awt.Dimension(20, 0), new java.awt.Dimension(20, 32767));
        ValorJTF = new javax.swing.JTextField();

        setPreferredSize(new java.awt.Dimension(200, 75));
        addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                alterarMenu(evt);
            }
        });
        setLayout(new java.awt.BorderLayout());

        IconJL.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icones/grande/bloco variavel.png"))); // NOI18N
        add(IconJL, java.awt.BorderLayout.WEST);

        Agrupar.setBackground(getBackground());
        Agrupar.setLayout(new javax.swing.BoxLayout(Agrupar, javax.swing.BoxLayout.LINE_AXIS));
        Agrupar.add(filler7);

        NomeJL.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        Agrupar.add(NomeJL);
        Agrupar.add(filler5);

        ValorJTF.setEditable(false);
        ValorJTF.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        ValorJTF.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        ValorJTF.setBorder(null);
        ValorJTF.setHighlighter(null);
        ValorJTF.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                criarCopiaValor(evt);
            }
        });
        Agrupar.add(ValorJTF);

        add(Agrupar, java.awt.BorderLayout.CENTER);
    }// </editor-fold>//GEN-END:initComponents

    private void criarCopiaValor(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_criarCopiaValor
        
        if(!ValorJTF.getText().equals("")){
            ValorJP teste = new ValorJP(ValorJTF.getText());
            this.getParent().add(teste, JLayeredPane.MODAL_LAYER);

            teste.setSize(teste.getPreferredSize());

            Point pos = new Point();
            pos.x = evt.getX()+ValorJTF.getX()+this.getX()+Agrupar.getX();
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
    
    public void alterarVariavel(String nome, String valor){
        NomeJL.setText(nome);
        ValorJTF.setText(valor);
        novoTamanho();
    }
    
    public void alterarValor(String valor){
        ValorJTF.setText(valor);
        novoTamanho();
    }
    
    public void alterarNome(String nome){
        NomeJL.setText(nome);
        novoTamanho();
    }
    
    private void novoTamanho(){
        int novoWeight = 0;
        
        novoWeight = ValorJTF.getFontMetrics(ValorJTF.getFont()).stringWidth(ValorJTF.getText());
        ValorJTF.setSize(novoWeight, ValorJTF.getHeight());
        
        novoWeight = NomeJL.getFontMetrics(NomeJL.getFont()).stringWidth(NomeJL.getText());
        NomeJL.setSize(novoWeight, NomeJL.getHeight());
        
        novoWeight = 0;
        for(Component comp : Agrupar.getComponents()){
            novoWeight += comp.getWidth();
        }
        novoWeight += IconJL.getWidth();
        novoWeight += 15;//margem

        this.setSize(novoWeight, this.getHeight());
        
        revalidate();
        repaint();
    }
    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Agrupar;
    private javax.swing.JLabel IconJL;
    private javax.swing.JLabel NomeJL;
    private javax.swing.JTextField ValorJTF;
    private javax.swing.Box.Filler filler5;
    private javax.swing.Box.Filler filler7;
    // End of variables declaration//GEN-END:variables
}
