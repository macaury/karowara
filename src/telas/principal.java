/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package telas;




public class Principal extends javax.swing.JFrame {

    
    public Principal() {
        initComponents();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        ferramentasGrupo = new javax.swing.ButtonGroup();
        testePrincipal = new telas.Projeto();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));
        getContentPane().add(testePrincipal, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void zoomIn(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_zoomIn
        //workSpace.setSize(workSpace.getWidth()*2, workSpace.getHeight()*2);
        /*for (Component comp : workSpace.getComponents()) {
            comp.setSize(comp.getWidth()*2,comp.getHeight()*2);
        }
        repaint();*/

    }//GEN-LAST:event_zoomIn

    
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Principal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup ferramentasGrupo;
    private telas.Projeto testePrincipal;
    // End of variables declaration//GEN-END:variables
}
