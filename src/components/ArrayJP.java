package components;

import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JTextField;
import menuComponents.MenuArrayJP;


public class ArrayJP extends Elemento {
    private MenuArrayJP menuArray;
    private JButton arrayMenuJP;
    
    private String[] valores;
    public ArrayJP(MenuArrayJP menuArray, JButton arrayMenuJP) {
        super();
        initComponents();
        
        this.menuArray = menuArray;
        this.arrayMenuJP = arrayMenuJP;
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        filler1 = new javax.swing.Box.Filler(new java.awt.Dimension(10, 0), new java.awt.Dimension(10, 0), new java.awt.Dimension(5, 32767));
        IconJL = new javax.swing.JLabel();
        NomeJL = new javax.swing.JLabel();
        filler4 = new javax.swing.Box.Filler(new java.awt.Dimension(5, 0), new java.awt.Dimension(10, 0), new java.awt.Dimension(5, 32767));
        AdicionarLinhaJB = new javax.swing.JButton();
        filler3 = new javax.swing.Box.Filler(new java.awt.Dimension(5, 0), new java.awt.Dimension(10, 0), new java.awt.Dimension(5, 32767));
        AdicionarColunaJB1 = new javax.swing.JButton();
        filler2 = new javax.swing.Box.Filler(new java.awt.Dimension(5, 0), new java.awt.Dimension(10, 0), new java.awt.Dimension(5, 32767));
        AgruparJP = new javax.swing.JPanel();
        ValorJTF = new javax.swing.JTextField();

        setFont(new java.awt.Font("Helvetica Neue", 1, 18)); // NOI18N
        setMinimumSize(new java.awt.Dimension(250, 50));
        setName(""); // NOI18N
        setPreferredSize(new java.awt.Dimension(250, 50));
        addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                alterarMenu(evt);
            }
        });
        setLayout(new javax.swing.BoxLayout(this, javax.swing.BoxLayout.LINE_AXIS));
        add(filler1);

        IconJL.setFont(new java.awt.Font("Helvetica Neue", 0, 16)); // NOI18N
        IconJL.setText("ARRAY");
        add(IconJL);
        add(NomeJL);
        add(filler4);

        AdicionarLinhaJB.setText("+L");
        AdicionarLinhaJB.setPreferredSize(new java.awt.Dimension(50, 23));
        AdicionarLinhaJB.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                adicionarLinha(evt);
            }
        });
        add(AdicionarLinhaJB);
        add(filler3);

        AdicionarColunaJB1.setText("+C");
        AdicionarColunaJB1.setPreferredSize(new java.awt.Dimension(50, 23));
        AdicionarColunaJB1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                adicionarColuna(evt);
            }
        });
        add(AdicionarColunaJB1);
        add(filler2);

        AgruparJP.setLayout(new java.awt.GridLayout(1, 1));

        ValorJTF.setBackground(new java.awt.Color(242, 242, 242));
        ValorJTF.setMargin(new java.awt.Insets(4, 10, 4, 10));
        ValorJTF.setMinimumSize(new java.awt.Dimension(22, 22));
        ValorJTF.setPreferredSize(new java.awt.Dimension(22, 22));
        AgruparJP.add(ValorJTF);

        add(AgruparJP);
    }// </editor-fold>//GEN-END:initComponents
 
    private void adicionarColuna(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_adicionarColuna
        GridLayout layoutAgruparJP = (GridLayout)AgruparJP.getLayout();
        
        int novoWidth = 10;
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
        GridLayout layoutAgruparJP = (GridLayout)AgruparJP.getLayout();
        
        int novoHeight = 4;
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

    private void alterarMenu(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_alterarMenu
        arrayMenuJP.setVisible(true);
        menuArray.alterarMenu(this, NomeJL.getText(), valores);
    }//GEN-LAST:event_alterarMenu


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AdicionarColunaJB1;
    private javax.swing.JButton AdicionarLinhaJB;
    private javax.swing.JPanel AgruparJP;
    private javax.swing.JLabel IconJL;
    private javax.swing.JLabel NomeJL;
    private javax.swing.JTextField ValorJTF;
    private javax.swing.Box.Filler filler1;
    private javax.swing.Box.Filler filler2;
    private javax.swing.Box.Filler filler3;
    private javax.swing.Box.Filler filler4;
    // End of variables declaration//GEN-END:variables
}
