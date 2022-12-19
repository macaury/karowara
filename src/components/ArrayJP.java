package components;

import java.awt.Color;
import java.awt.Component;
import java.awt.GridLayout;
import java.awt.Point;
import java.awt.event.MouseAdapter;
import javax.swing.JButton;
import javax.swing.JLayeredPane;
import javax.swing.JTextField;
import javax.swing.border.LineBorder;
import menuComponents.MenuArrayJP;


public class ArrayJP extends Elemento {
    private MenuArrayJP menuArray;
    private JButton arrayMenuJP;
    
    private String[] valores;
    
    
    private MouseParaValorExterno meuMouse;
    public ArrayJP(MenuArrayJP menuArray, JButton arrayMenuJP) {
        super();
        initComponents();
        
        this.menuArray = menuArray;
        this.arrayMenuJP = arrayMenuJP;
        
        meuMouse = new MouseParaValorExterno();
        ValorJTF.addMouseListener(meuMouse);
    }

    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        filler1 = new javax.swing.Box.Filler(new java.awt.Dimension(10, 0), new java.awt.Dimension(10, 0), new java.awt.Dimension(5, 32767));
        IconJL = new javax.swing.JLabel();
        filler5 = new javax.swing.Box.Filler(new java.awt.Dimension(10, 0), new java.awt.Dimension(10, 0), new java.awt.Dimension(5, 32767));
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
        setPreferredSize(new java.awt.Dimension(250, 75));
        addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                alterarMenu(evt);
            }
        });
        setLayout(new javax.swing.BoxLayout(this, javax.swing.BoxLayout.LINE_AXIS));
        add(filler1);

        IconJL.setFont(new java.awt.Font("Helvetica Neue", 0, 16)); // NOI18N
        IconJL.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icones/grande/bloco array.png"))); // NOI18N
        add(IconJL);
        add(filler5);

        NomeJL.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        add(NomeJL);
        add(filler4);

        AdicionarLinhaJB.setText("+L");
        AdicionarLinhaJB.setBorder(null);
        AdicionarLinhaJB.setPreferredSize(new java.awt.Dimension(50, 23));
        AdicionarLinhaJB.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                adicionarLinha(evt);
            }
        });
        add(AdicionarLinhaJB);
        add(filler3);

        AdicionarColunaJB1.setText("+C");
        AdicionarColunaJB1.setBorder(null);
        AdicionarColunaJB1.setPreferredSize(new java.awt.Dimension(50, 23));
        AdicionarColunaJB1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                adicionarColuna(evt);
            }
        });
        add(AdicionarColunaJB1);
        add(filler2);

        AgruparJP.setPreferredSize(new java.awt.Dimension(75, 75));
        AgruparJP.setLayout(new java.awt.GridLayout(1, 1));

        ValorJTF.setEditable(false);
        ValorJTF.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        ValorJTF.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 102, 102)));
        ValorJTF.setHighlighter(null);
        ValorJTF.setMargin(new java.awt.Insets(4, 10, 4, 10));
        ValorJTF.setMinimumSize(new java.awt.Dimension(22, 22));
        ValorJTF.setPreferredSize(new java.awt.Dimension(75, 75));
        AgruparJP.add(ValorJTF);

        add(AgruparJP);
    }// </editor-fold>//GEN-END:initComponents
    
    public int getLinha(){
        return ((GridLayout)AgruparJP.getLayout()).getRows();
    }
    
    public int getColuna(){
        return ((GridLayout)AgruparJP.getLayout()).getColumns();
    }
    
    public void alterarArray(String nome, String[]valores){
        NomeJL.setText(nome);

        Component[] caixas = AgruparJP.getComponents();
        int i = 0;
        for (Component comp : caixas) {
            ((JTextField)comp).setText(valores[i++]);
        }
       
    }
    
    public void alterarNome(String nome){
        NomeJL.setText(nome);
    }
    
    public void alterarValor(String valor, Point coordenada){
        coordenada.x -= this.getLocation().x;
        coordenada.y -= this.getLocation().y;
        
        coordenada.x -= AgruparJP.getLocation().x;
        
        ((JTextField)AgruparJP.getComponentAt(coordenada)).setText(valor);
    }
    
    private void adicionarColuna(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_adicionarColuna
        GridLayout layoutAgruparJP = (GridLayout)AgruparJP.getLayout();
        
        int novoWidth = 0;
        for(int i = 0; i < layoutAgruparJP.getRows(); i++){
            JTextField novoValor = new JTextField();
            AgruparJP.add(novoValor);
            
            novoValor.setEditable(false);
            novoValor.setBorder(javax.swing.BorderFactory.createLineBorder(new Color(102,102,102)));
            novoValor.setFont(ValorJTF.getFont());
            novoValor.addMouseListener(meuMouse);
            novoValor.setHighlighter(null);
        }
        novoWidth = this.getWidth();
        novoWidth += ValorJTF.getPreferredSize().getWidth();
        
        this.setSize( novoWidth, this.getHeight());
        
        layoutAgruparJP.setColumns(layoutAgruparJP.getColumns()+1);
        
        revalidate();
        repaint();

    }//GEN-LAST:event_adicionarColuna

    private void adicionarLinha(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_adicionarLinha
        GridLayout layoutAgruparJP = (GridLayout)AgruparJP.getLayout();
        
        int novoHeight = 0;
        for(int i = 0; i < layoutAgruparJP.getColumns(); i++){
            JTextField novoValor = new JTextField();
            AgruparJP.add(novoValor);
            
            novoValor.setEditable(false);
            novoValor.setBorder(javax.swing.BorderFactory.createLineBorder(new Color(102,102,102)));
            novoValor.setFont(ValorJTF.getFont());
            novoValor.addMouseListener(meuMouse);
            novoValor.setHighlighter(null);
            
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


    private void criarCopiaValor(java.awt.event.MouseEvent evt) {                                 
        Point pos = this.getLocation();
        pos.x += AgruparJP.getX();
        pos.x += evt.getComponent().getX();
        pos.y += evt.getComponent().getY();
        pos.x += evt.getX();
        pos.y += evt.getY();
        
        String valor = ((JTextField)evt.getComponent()).getText();
        if(!valor.equals("")){
            ValorJP teste = new ValorJP(valor);
            this.getParent().add(teste, JLayeredPane.MODAL_LAYER);
            teste.setSize(teste.getPreferredSize());
            teste.setLocation(pos);
            revalidate();
        }
        
    }  
    
    private class MouseParaValorExterno extends MouseAdapter{
        
       @Override
       public void mouseReleased(java.awt.event.MouseEvent evt){
           criarCopiaValor(evt);
       }
    }
    
    
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
    private javax.swing.Box.Filler filler5;
    // End of variables declaration//GEN-END:variables
}
