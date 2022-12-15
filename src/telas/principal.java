/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package telas;

import components.ArrayJP;
import components.Elemento;
import components.Variavel;
import java.awt.CardLayout;
import java.awt.Component;
import java.awt.Point;
import javax.swing.JButton;
import javax.swing.JLabel;
/**
 *
 * @author macaurycarvalho
 */
public class principal extends javax.swing.JFrame {
    private enum elemento{VARIAVEL,ARRAY};
    private JLabel elemTransparente;
    
    public principal() {
        initComponents();
        
        VariavelMenuJP.setVisible(false);
        ArrayMenuJP.setVisible(false);
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        ferramentasGrupo = new javax.swing.ButtonGroup();
        barraDeFerramentas = new javax.swing.JToolBar();
        filler6 = new javax.swing.Box.Filler(new java.awt.Dimension(0, 15), new java.awt.Dimension(0, 15), new java.awt.Dimension(32767, 15));
        btn_home = new javax.swing.JToggleButton();
        filler1 = new javax.swing.Box.Filler(new java.awt.Dimension(0, 60), new java.awt.Dimension(0, 60), new java.awt.Dimension(32767, 60));
        btn_variavel = new javax.swing.JToggleButton();
        filler2 = new javax.swing.Box.Filler(new java.awt.Dimension(0, 60), new java.awt.Dimension(0, 60), new java.awt.Dimension(32767, 60));
        btn_for = new javax.swing.JToggleButton();
        filler3 = new javax.swing.Box.Filler(new java.awt.Dimension(0, 60), new java.awt.Dimension(0, 60), new java.awt.Dimension(32767, 60));
        btn_array = new javax.swing.JToggleButton();
        filler4 = new javax.swing.Box.Filler(new java.awt.Dimension(0, 60), new java.awt.Dimension(0, 60), new java.awt.Dimension(32767, 60));
        btn_IF = new javax.swing.JToggleButton();
        filler5 = new javax.swing.Box.Filler(new java.awt.Dimension(0, 60), new java.awt.Dimension(0, 60), new java.awt.Dimension(32767, 60));
        btn_while = new javax.swing.JToggleButton();
        filler8 = new javax.swing.Box.Filler(new java.awt.Dimension(0, 0), new java.awt.Dimension(0, 0), new java.awt.Dimension(0, 32767));
        btn_help = new javax.swing.JButton();
        filler9 = new javax.swing.Box.Filler(new java.awt.Dimension(0, 40), new java.awt.Dimension(0, 40), new java.awt.Dimension(32767, 40));
        btn_ajustes = new javax.swing.JButton();
        filler7 = new javax.swing.Box.Filler(new java.awt.Dimension(0, 15), new java.awt.Dimension(0, 15), new java.awt.Dimension(32767, 15));
        workSpace = new javax.swing.JLayeredPane();
        menuAuxiliar = new javax.swing.JPanel();
        BarraFerramentaJTB = new javax.swing.JToolBar();
        filler11 = new javax.swing.Box.Filler(new java.awt.Dimension(0, 0), new java.awt.Dimension(0, 0), new java.awt.Dimension(32767, 0));
        jButton12 = new javax.swing.JToggleButton();
        filler12 = new javax.swing.Box.Filler(new java.awt.Dimension(30, 0), new java.awt.Dimension(30, 0), new java.awt.Dimension(30, 32767));
        jToggleButton2 = new javax.swing.JToggleButton();
        filler13 = new javax.swing.Box.Filler(new java.awt.Dimension(30, 0), new java.awt.Dimension(30, 0), new java.awt.Dimension(30, 32767));
        jToggleButton3 = new javax.swing.JToggleButton();
        filler14 = new javax.swing.Box.Filler(new java.awt.Dimension(30, 0), new java.awt.Dimension(30, 0), new java.awt.Dimension(30, 32767));
        jButton1 = new javax.swing.JButton();
        filler15 = new javax.swing.Box.Filler(new java.awt.Dimension(30, 0), new java.awt.Dimension(30, 0), new java.awt.Dimension(30, 32767));
        jButton2 = new javax.swing.JButton();
        filler10 = new javax.swing.Box.Filler(new java.awt.Dimension(0, 0), new java.awt.Dimension(0, 0), new java.awt.Dimension(32767, 0));
        Slide_ElementoJP = new javax.swing.JPanel();
        Menu_Slide_ElementoJP = new javax.swing.JPanel();
        SlidesJB = new javax.swing.JButton();
        VariavelMenuJP = new javax.swing.JButton();
        ArrayMenuJP = new javax.swing.JButton();
        Agrupar_SlideElementoJP = new javax.swing.JPanel();
        SlideJP = new javax.swing.JPanel();
        btn_slide_atual = new javax.swing.JButton();
        btn_novo_slide = new javax.swing.JButton();
        menuArrayJP1 = new menuComponents.MenuArrayJP();
        menuVariavelJP = new menuComponents.MenuVariavelJP();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));
        addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                formMouseClicked(evt);
            }
        });

        barraDeFerramentas.setBackground(new java.awt.Color(96, 164, 178));
        barraDeFerramentas.setBorder(null);
        barraDeFerramentas.setOrientation(javax.swing.SwingConstants.VERTICAL);
        barraDeFerramentas.add(filler6);

        btn_home.setBackground(new java.awt.Color(96, 164, 178));
        ferramentasGrupo.add(btn_home);
        btn_home.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icones/home.png"))); // NOI18N
        btn_home.setAlignmentX(0.5F);
        btn_home.setFocusable(false);
        btn_home.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn_home.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        barraDeFerramentas.add(btn_home);
        barraDeFerramentas.add(filler1);

        btn_variavel.setBackground(new java.awt.Color(96, 164, 178));
        ferramentasGrupo.add(btn_variavel);
        btn_variavel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icones/Union-2.png"))); // NOI18N
        btn_variavel.setAlignmentX(0.5F);
        btn_variavel.setBorder(null);
        btn_variavel.setFocusable(false);
        btn_variavel.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn_variavel.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        barraDeFerramentas.add(btn_variavel);
        barraDeFerramentas.add(filler2);

        btn_for.setBackground(new java.awt.Color(96, 164, 178));
        ferramentasGrupo.add(btn_for);
        btn_for.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icones/for.png"))); // NOI18N
        btn_for.setAlignmentX(0.5F);
        btn_for.setBorder(null);
        btn_for.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn_for.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        barraDeFerramentas.add(btn_for);
        barraDeFerramentas.add(filler3);

        btn_array.setBackground(new java.awt.Color(96, 164, 178));
        ferramentasGrupo.add(btn_array);
        btn_array.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icones/[][].png"))); // NOI18N
        btn_array.setAlignmentX(0.5F);
        btn_array.setBorder(null);
        btn_array.setFocusable(false);
        btn_array.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn_array.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        barraDeFerramentas.add(btn_array);
        barraDeFerramentas.add(filler4);

        btn_IF.setBackground(new java.awt.Color(96, 164, 178));
        ferramentasGrupo.add(btn_IF);
        btn_IF.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icones/VF.png"))); // NOI18N
        btn_IF.setAlignmentX(0.5F);
        btn_IF.setBorder(null);
        btn_IF.setFocusable(false);
        btn_IF.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn_IF.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        barraDeFerramentas.add(btn_IF);
        barraDeFerramentas.add(filler5);

        btn_while.setBackground(new java.awt.Color(96, 164, 178));
        ferramentasGrupo.add(btn_while);
        btn_while.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icones/Vector 2.png"))); // NOI18N
        btn_while.setAlignmentX(0.5F);
        btn_while.setBorder(null);
        btn_while.setFocusable(false);
        btn_while.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn_while.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        barraDeFerramentas.add(btn_while);
        barraDeFerramentas.add(filler8);

        btn_help.setBackground(new java.awt.Color(96, 164, 178));
        btn_help.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icones/ajuda.png"))); // NOI18N
        btn_help.setAlignmentX(0.5F);
        btn_help.setBorder(null);
        btn_help.setFocusable(false);
        btn_help.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn_help.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        barraDeFerramentas.add(btn_help);
        barraDeFerramentas.add(filler9);

        btn_ajustes.setBackground(new java.awt.Color(96, 164, 178));
        btn_ajustes.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icones/configuracao.png"))); // NOI18N
        btn_ajustes.setAlignmentX(0.5F);
        btn_ajustes.setBorder(null);
        btn_ajustes.setFocusable(false);
        btn_ajustes.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn_ajustes.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        barraDeFerramentas.add(btn_ajustes);
        barraDeFerramentas.add(filler7);

        getContentPane().add(barraDeFerramentas, java.awt.BorderLayout.WEST);

        workSpace.setBackground(new java.awt.Color(255, 255, 255));
        workSpace.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                moverFerramentaSelecionada(evt);
            }
        });
        workSpace.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                adicionarComponente(evt);
                esconderBotaoMenuAux(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                mostrarFerramentaSelecionada(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                esconderFerramenta(evt);
            }
        });

        menuAuxiliar.setLayout(new java.awt.BorderLayout());

        BarraFerramentaJTB.setBackground(new java.awt.Color(244, 242, 242));
        BarraFerramentaJTB.setBorder(null);
        BarraFerramentaJTB.setAlignmentY(0.5F);
        BarraFerramentaJTB.setRequestFocusEnabled(false);
        BarraFerramentaJTB.add(filler11);

        jButton12.setBackground(new java.awt.Color(244, 242, 242));
        ferramentasGrupo.add(jButton12);
        jButton12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icones/navegacao.png"))); // NOI18N
        jButton12.setBorder(null);
        jButton12.setFocusable(false);
        jButton12.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton12.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        BarraFerramentaJTB.add(jButton12);
        BarraFerramentaJTB.add(filler12);

        jToggleButton2.setBackground(new java.awt.Color(244, 242, 242));
        ferramentasGrupo.add(jToggleButton2);
        jToggleButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icones/editar.png"))); // NOI18N
        jToggleButton2.setBorder(null);
        jToggleButton2.setFocusable(false);
        jToggleButton2.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jToggleButton2.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        BarraFerramentaJTB.add(jToggleButton2);
        BarraFerramentaJTB.add(filler13);

        jToggleButton3.setBackground(new java.awt.Color(244, 242, 242));
        ferramentasGrupo.add(jToggleButton3);
        jToggleButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icones/apagar.png"))); // NOI18N
        jToggleButton3.setBorder(null);
        jToggleButton3.setFocusable(false);
        jToggleButton3.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jToggleButton3.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        BarraFerramentaJTB.add(jToggleButton3);
        BarraFerramentaJTB.add(filler14);

        jButton1.setBackground(new java.awt.Color(244, 242, 242));
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icones/aumentar-zoom.png"))); // NOI18N
        jButton1.setBorder(null);
        jButton1.setFocusable(false);
        jButton1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton1.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        BarraFerramentaJTB.add(jButton1);
        BarraFerramentaJTB.add(filler15);

        jButton2.setBackground(new java.awt.Color(244, 242, 242));
        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icones/diminuir-zoom.png"))); // NOI18N
        jButton2.setBorder(null);
        jButton2.setFocusable(false);
        jButton2.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton2.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        BarraFerramentaJTB.add(jButton2);
        BarraFerramentaJTB.add(filler10);

        menuAuxiliar.add(BarraFerramentaJTB, java.awt.BorderLayout.PAGE_START);

        Slide_ElementoJP.setBackground(new java.awt.Color(244, 242, 242));
        Slide_ElementoJP.setLayout(new javax.swing.BoxLayout(Slide_ElementoJP, javax.swing.BoxLayout.PAGE_AXIS));

        Menu_Slide_ElementoJP.setLayout(new javax.swing.BoxLayout(Menu_Slide_ElementoJP, javax.swing.BoxLayout.LINE_AXIS));

        SlidesJB.setBackground(new java.awt.Color(96, 164, 178));
        SlidesJB.setFont(new java.awt.Font("Helvetica Neue", 1, 20)); // NOI18N
        SlidesJB.setForeground(new java.awt.Color(255, 255, 255));
        SlidesJB.setText("Slides");
        SlidesJB.setAlignmentX(0.5F);
        SlidesJB.setOpaque(true);
        SlidesJB.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                mudarParaMenuSlide(evt);
            }
        });
        Menu_Slide_ElementoJP.add(SlidesJB);

        VariavelMenuJP.setBackground(new java.awt.Color(96, 164, 178));
        VariavelMenuJP.setFont(new java.awt.Font("Helvetica Neue", 1, 20)); // NOI18N
        VariavelMenuJP.setForeground(new java.awt.Color(255, 255, 255));
        VariavelMenuJP.setText("Variavel");
        VariavelMenuJP.setAlignmentX(0.5F);
        VariavelMenuJP.setBorderPainted(false);
        VariavelMenuJP.setFocusPainted(false);
        VariavelMenuJP.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                mudarMenuParaVariavelMenuJP(evt);
            }
        });
        Menu_Slide_ElementoJP.add(VariavelMenuJP);

        ArrayMenuJP.setBackground(new java.awt.Color(96, 164, 178));
        ArrayMenuJP.setFont(new java.awt.Font("Helvetica Neue", 1, 20)); // NOI18N
        ArrayMenuJP.setForeground(new java.awt.Color(255, 255, 255));
        ArrayMenuJP.setText("Array");
        ArrayMenuJP.setAlignmentX(0.5F);
        ArrayMenuJP.setBorderPainted(false);
        ArrayMenuJP.setFocusPainted(false);
        ArrayMenuJP.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                mudarMenuParaArrayMenuJP(evt);
            }
        });
        Menu_Slide_ElementoJP.add(ArrayMenuJP);

        Slide_ElementoJP.add(Menu_Slide_ElementoJP);

        Agrupar_SlideElementoJP.setLayout(new java.awt.CardLayout());

        SlideJP.setBackground(new java.awt.Color(244, 242, 242));
        SlideJP.setPreferredSize(new java.awt.Dimension(530, 170));

        btn_slide_atual.setBackground(new java.awt.Color(255, 250, 255));
        btn_slide_atual.setFont(new java.awt.Font("Helvetica Neue", 0, 18)); // NOI18N
        btn_slide_atual.setText("atual");

        btn_novo_slide.setBackground(new java.awt.Color(255, 250, 255));
        btn_novo_slide.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icones/add.png"))); // NOI18N
        btn_novo_slide.setMaximumSize(null);
        btn_novo_slide.setPreferredSize(new java.awt.Dimension(150, 150));

        javax.swing.GroupLayout SlideJPLayout = new javax.swing.GroupLayout(SlideJP);
        SlideJP.setLayout(SlideJPLayout);
        SlideJPLayout.setHorizontalGroup(
            SlideJPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(SlideJPLayout.createSequentialGroup()
                .addGap(154, 154, 154)
                .addComponent(btn_slide_atual, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btn_novo_slide, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(58, Short.MAX_VALUE))
        );
        SlideJPLayout.setVerticalGroup(
            SlideJPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, SlideJPLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(SlideJPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btn_novo_slide, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_slide_atual, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(13, 13, 13))
        );

        Agrupar_SlideElementoJP.add(SlideJP, "SLIDE");
        Agrupar_SlideElementoJP.add(menuArrayJP1, "ARRAY");
        Agrupar_SlideElementoJP.add(menuVariavelJP, "VARIAVEL");

        Slide_ElementoJP.add(Agrupar_SlideElementoJP);

        menuAuxiliar.add(Slide_ElementoJP, java.awt.BorderLayout.CENTER);

        workSpace.setLayer(menuAuxiliar, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout workSpaceLayout = new javax.swing.GroupLayout(workSpace);
        workSpace.setLayout(workSpaceLayout);
        workSpaceLayout.setHorizontalGroup(
            workSpaceLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, workSpaceLayout.createSequentialGroup()
                .addContainerGap(417, Short.MAX_VALUE)
                .addComponent(menuAuxiliar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(132, 132, 132))
        );
        workSpaceLayout.setVerticalGroup(
            workSpaceLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, workSpaceLayout.createSequentialGroup()
                .addContainerGap(482, Short.MAX_VALUE)
                .addComponent(menuAuxiliar, javax.swing.GroupLayout.PREFERRED_SIZE, 266, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(62, 62, 62))
        );

        getContentPane().add(workSpace, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public void criarMenuElemento(Component menu){
        JButton botaoMenu = new JButton("VAR-MUDARDEPOIS");
        Slide_ElementoJP.add(botaoMenu, 1);
        botaoMenu.setSize(SlidesJB.getSize());
        botaoMenu.setBackground(SlideJP.getBackground());
        
    }
    
    private void adicionarComponente(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_adicionarComponente
        if(btn_variavel.isSelected()){
            Variavel v1 = new Variavel(menuVariavelJP,VariavelMenuJP);
            workSpace.add(v1);
            v1.setSize(v1.getPreferredSize());
            v1.setLocation(evt.getPoint());
            //v1.setLocation(evt.getX()-v1.getWidth()/2, evt.getY()-v1.getHeight()/2-MENU_WINDOWS);
            revalidate();
        }
        else if(btn_array.isSelected()){
            ArrayJP a1 = new ArrayJP();
            workSpace.add(a1);
            a1.setSize(a1.getPreferredSize());
            //a1.setLocation(evt.getX()-a1.getWidth()/2, evt.getY()-a1.getHeight()/2-MENU_WINDOWS);
            revalidate();
        }
    }//GEN-LAST:event_adicionarComponente

    private void moverFerramentaSelecionada(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_moverFerramentaSelecionada
        if(elemTransparente != null){
            elemTransparente.setLocation(evt.getPoint());
        }
    }//GEN-LAST:event_moverFerramentaSelecionada

/**/
    
    private void esconderFerramenta(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_esconderFerramenta
        if(elemTransparente != null){
            workSpace.remove(elemTransparente);
            repaint();
        }
    }//GEN-LAST:event_esconderFerramenta

    private void mostrarFerramentaSelecionada(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_mostrarFerramentaSelecionada
        if(elemTransparente != null){
            workSpace.add(elemTransparente);
            repaint();
        }
    }//GEN-LAST:event_mostrarFerramentaSelecionada

    private void formMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMouseClicked
        System.out.println("clcks");
    }//GEN-LAST:event_formMouseClicked

    private void mudarParaMenuSlide(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_mudarParaMenuSlide
        CardLayout cl = (CardLayout) Agrupar_SlideElementoJP.getLayout();
        
        cl.show(Agrupar_SlideElementoJP, "SLIDE");
    }//GEN-LAST:event_mudarParaMenuSlide

    private void mudarMenuParaVariavelMenuJP(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_mudarMenuParaVariavelMenuJP
        CardLayout cl = (CardLayout) Agrupar_SlideElementoJP.getLayout();
        
        cl.show(Agrupar_SlideElementoJP, "VARIAVEL");
    }//GEN-LAST:event_mudarMenuParaVariavelMenuJP

    private void mudarMenuParaArrayMenuJP(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_mudarMenuParaArrayMenuJP
        CardLayout cl = (CardLayout) Agrupar_SlideElementoJP.getLayout();
        
        cl.show(Agrupar_SlideElementoJP, "ARRAY");
    }//GEN-LAST:event_mudarMenuParaArrayMenuJP

    private void esconderBotaoMenuAux(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_esconderBotaoMenuAux
        
        if(!mouseIsOverComponent( evt.getPoint(), menuAuxiliar)){
            VariavelMenuJP.setVisible(false);
            ArrayMenuJP.setVisible(false);
        }
    }//GEN-LAST:event_esconderBotaoMenuAux

    private boolean mouseIsOverComponent(Point mouse, Component obj){
        if(mouse.getX() >= obj.getLocation().getX() && mouse.getX() < obj.getWidth()+obj.getLocation().getX()){
            if(mouse.getY() >= obj.getLocation().getY() && mouse.getY() < obj.getHeight()+obj.getLocation().getY()){
                return true;
            }
        }
        return false;
    }
    
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new principal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Agrupar_SlideElementoJP;
    private javax.swing.JButton ArrayMenuJP;
    private javax.swing.JToolBar BarraFerramentaJTB;
    private javax.swing.JPanel Menu_Slide_ElementoJP;
    private javax.swing.JPanel SlideJP;
    private javax.swing.JPanel Slide_ElementoJP;
    private javax.swing.JButton SlidesJB;
    private javax.swing.JButton VariavelMenuJP;
    private javax.swing.JToolBar barraDeFerramentas;
    private javax.swing.JToggleButton btn_IF;
    private javax.swing.JButton btn_ajustes;
    private javax.swing.JToggleButton btn_array;
    private javax.swing.JToggleButton btn_for;
    private javax.swing.JButton btn_help;
    private javax.swing.JToggleButton btn_home;
    private javax.swing.JButton btn_novo_slide;
    private javax.swing.JButton btn_slide_atual;
    private javax.swing.JToggleButton btn_variavel;
    private javax.swing.JToggleButton btn_while;
    private javax.swing.ButtonGroup ferramentasGrupo;
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
    private javax.swing.JToggleButton jButton12;
    private javax.swing.JButton jButton2;
    private javax.swing.JToggleButton jToggleButton2;
    private javax.swing.JToggleButton jToggleButton3;
    private menuComponents.MenuArrayJP menuArrayJP1;
    private javax.swing.JPanel menuAuxiliar;
    private menuComponents.MenuVariavelJP menuVariavelJP;
    private javax.swing.JLayeredPane workSpace;
    // End of variables declaration//GEN-END:variables
}
