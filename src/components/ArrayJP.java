package components;

import java.awt.GridLayout;
import javax.swing.JTextField;

public class ArrayJP extends Elemento {
   
    public ArrayJP() {
        initComponents();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        IconJL = new javax.swing.JLabel();
        NomeJL = new javax.swing.JLabel();
        AdicionarLinhaJB = new javax.swing.JButton();
        AdicionarColunaJB1 = new javax.swing.JButton();
        AgruparJP = new javax.swing.JPanel();
        ValorJTF = new javax.swing.JTextField();

        setLayout(new javax.swing.BoxLayout(this, javax.swing.BoxLayout.LINE_AXIS));

        IconJL.setText("ARRAY");
        add(IconJL);
        add(NomeJL);

        AdicionarLinhaJB.setText("+L");
        AdicionarLinhaJB.setPreferredSize(new java.awt.Dimension(50, 23));
        AdicionarLinhaJB.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                adicionarLinha(evt);
            }
        });
        add(AdicionarLinhaJB);

        AdicionarColunaJB1.setText("+C");
        AdicionarColunaJB1.setPreferredSize(new java.awt.Dimension(50, 23));
        AdicionarColunaJB1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                adicionarColuna(evt);
            }
        });
        add(AdicionarColunaJB1);

        AgruparJP.setLayout(new java.awt.GridLayout(1, 1));

        ValorJTF.setMinimumSize(new java.awt.Dimension(22, 22));
        ValorJTF.setPreferredSize(new java.awt.Dimension(22, 22));
        AgruparJP.add(ValorJTF);

        add(AgruparJP);
    }// </editor-fold>//GEN-END:initComponents


    
    private void adicionarColuna(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_adicionarColuna
        GridLayout layoutAgruparJP =(GridLayout)AgruparJP.getLayout();
        
        int novoWidth = 0;
        for(int i = 0; i < layoutAgruparJP.getRows(); i++){
            AgruparJP.add(new JTextField());

            novoWidth = this.getWidth();
            novoWidth += ValorJTF.getWidth();
        }
        this.setSize( novoWidth, this.getHeight());
        
        layoutAgruparJP.setColumns(layoutAgruparJP.getColumns()+1);
        
        revalidate();
        repaint();

    }//GEN-LAST:event_adicionarColuna

    private void adicionarLinha(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_adicionarLinha
        GridLayout layoutAgruparJP =(GridLayout)AgruparJP.getLayout();
        
        int novoHeight = 0;
        for(int i = 0; i < layoutAgruparJP.getColumns(); i++){
            AgruparJP.add(new JTextField());

            novoHeight = this.getHeight();
            novoHeight += ValorJTF.getHeight();
        }
        this.setSize(this.getWidth(), novoHeight);
        
        layoutAgruparJP.setRows(layoutAgruparJP.getRows()+1);
        
        revalidate();
        repaint();
    }//GEN-LAST:event_adicionarLinha


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AdicionarColunaJB1;
    private javax.swing.JButton AdicionarLinhaJB;
    private javax.swing.JPanel AgruparJP;
    private javax.swing.JLabel IconJL;
    private javax.swing.JLabel NomeJL;
    private javax.swing.JTextField ValorJTF;
    // End of variables declaration//GEN-END:variables
}
