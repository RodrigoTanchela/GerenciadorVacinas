/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Visao;

import Modelo.Veiculo;



/**
 *
 * @author Rodrigo
 */
public class ConsultarVeiculoView extends javax.swing.JFrame {

    private final GerenciadorTransporteVacina sistemaView;

    /**
     * Creates new form ConsultarVeiculoView
     */
    public ConsultarVeiculoView(GerenciadorTransporteVacina sistemaView) {
        this.sistemaView = sistemaView;
        initComponents();
        for(Veiculo cam: this.sistemaView.getCaminhao()){
         taVeiculo.append(cam.toString());
             taVeiculo.append("\n");
        }
        for(Veiculo avi: this.sistemaView.getAviao()){
        taVeiculo.append(avi.toString());
             taVeiculo.append("\n");
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        taVeiculo = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        taVeiculo.setColumns(20);
        taVeiculo.setRows(5);
        jScrollPane1.setViewportView(taVeiculo);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 534, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(22, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

   

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea taVeiculo;
    // End of variables declaration//GEN-END:variables
}
