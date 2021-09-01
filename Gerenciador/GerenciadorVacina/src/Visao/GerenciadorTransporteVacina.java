/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Visao;

import Modelo.Caminhao;
import Modelo.Empresa;
import Modelo.Hospital;
import Modelo.Vacina;
import Modelo.Veiculo;
import Modelo.Local;
import Modelo.Prefeitura;
import Modelo.Transportadora;
import java.util.ArrayList;

/**
 *
 * @author Rodrigo
 */
public class GerenciadorTransporteVacina extends javax.swing.JFrame {
    private ArrayList<Veiculo>caminhao;
    private ArrayList<Veiculo>veiculo;
    private ArrayList<Veiculo>aviao;
    private ArrayList<Vacina>vacina;
    private ArrayList<Local>local;
    private ArrayList<Hospital>hospital;
    private ArrayList<Prefeitura>prefeitura;
    private ArrayList<Transportadora>trasportadora;
    private ArrayList<Empresa>empresa;
    
    /**
     * Creates new form GerenciadorTransporteVacina
     */
    public GerenciadorTransporteVacina() {
       this.caminhao = new ArrayList<Veiculo>();
       this.veiculo = new ArrayList<Veiculo>();
       this.aviao = new ArrayList<Veiculo>();
       this.vacina = new ArrayList<Vacina>();
       this.local = new ArrayList<Local>();
       this.hospital = new ArrayList<Hospital>();
       this.prefeitura = new ArrayList<Prefeitura>();
       this.trasportadora = new ArrayList<Transportadora>();
       this.empresa = new ArrayList<Empresa>();
       initComponents();
       
    }

    public ArrayList<Empresa> getEmpresa(){
        return this.empresa;
    }
    
    public ArrayList<Vacina> getVacina(){
        return this.vacina;
    }
    
    public ArrayList<Transportadora> getTransporte(){
        return this.trasportadora;
    }
    
    public ArrayList<Veiculo> getCaminhao(){
        return this.caminhao;
    }
    
    public ArrayList<Veiculo> getAviao(){
        return this.aviao;
    }
     public ArrayList<Veiculo> getVeiculo(){
        return this.veiculo;
    }
     public ArrayList<Local> getLocal(){
        return this.local;
    }
     public ArrayList<Hospital>getHospital(){
         return this.hospital;
     }
      public ArrayList<Prefeitura>getPrefeitura(){
         return this.prefeitura;
     }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuBar1 = new javax.swing.JMenuBar();
        mnCadastro = new javax.swing.JMenu();
        miCadastroEmpresa = new javax.swing.JRadioButtonMenuItem();
        miVacina = new javax.swing.JRadioButtonMenuItem();
        miCaminhao = new javax.swing.JRadioButtonMenuItem();
        miAviao = new javax.swing.JRadioButtonMenuItem();
        miTransportadora = new javax.swing.JRadioButtonMenuItem();
        miHospital = new javax.swing.JRadioButtonMenuItem();
        miLocal = new javax.swing.JRadioButtonMenuItem();
        miPrefeitura = new javax.swing.JRadioButtonMenuItem();
        mnConsulta = new javax.swing.JMenu();
        miConsultarEmpresa = new javax.swing.JRadioButtonMenuItem();
        miConsultarVacina = new javax.swing.JRadioButtonMenuItem();
        miConsultarVeiculo = new javax.swing.JRadioButtonMenuItem();
        miConsultarTransportadora = new javax.swing.JRadioButtonMenuItem();
        miConsultarHospital = new javax.swing.JRadioButtonMenuItem();
        miConsultarLocal = new javax.swing.JMenuItem();
        miConsultarPrefeitura = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Gerenciador de Vacinas");

        mnCadastro.setText("Cadastro");

        miCadastroEmpresa.setSelected(true);
        miCadastroEmpresa.setText("Empresa");
        miCadastroEmpresa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                miCadastroEmpresaActionPerformed(evt);
            }
        });
        mnCadastro.add(miCadastroEmpresa);

        miVacina.setSelected(true);
        miVacina.setText("Vacina");
        miVacina.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                miVacinaActionPerformed(evt);
            }
        });
        mnCadastro.add(miVacina);

        miCaminhao.setSelected(true);
        miCaminhao.setText("Caminhao");
        miCaminhao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                miCaminhaoActionPerformed(evt);
            }
        });
        mnCadastro.add(miCaminhao);

        miAviao.setSelected(true);
        miAviao.setText("Aviao");
        miAviao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                miAviaoActionPerformed(evt);
            }
        });
        mnCadastro.add(miAviao);

        miTransportadora.setSelected(true);
        miTransportadora.setText("Transportadora");
        miTransportadora.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                miTransportadoraActionPerformed(evt);
            }
        });
        mnCadastro.add(miTransportadora);

        miHospital.setSelected(true);
        miHospital.setText("Hospital");
        miHospital.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                miHospitalActionPerformed(evt);
            }
        });
        mnCadastro.add(miHospital);

        miLocal.setSelected(true);
        miLocal.setText("Local");
        miLocal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                miLocalActionPerformed(evt);
            }
        });
        mnCadastro.add(miLocal);

        miPrefeitura.setSelected(true);
        miPrefeitura.setText("Prefeitura");
        miPrefeitura.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                miPrefeituraActionPerformed(evt);
            }
        });
        mnCadastro.add(miPrefeitura);

        jMenuBar1.add(mnCadastro);

        mnConsulta.setText("Consultar");

        miConsultarEmpresa.setSelected(true);
        miConsultarEmpresa.setText("Empresa");
        miConsultarEmpresa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                miConsultarEmpresaActionPerformed(evt);
            }
        });
        mnConsulta.add(miConsultarEmpresa);

        miConsultarVacina.setSelected(true);
        miConsultarVacina.setText("Vacina");
        miConsultarVacina.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                miConsultarVacinaActionPerformed(evt);
            }
        });
        mnConsulta.add(miConsultarVacina);

        miConsultarVeiculo.setSelected(true);
        miConsultarVeiculo.setText("Veiculo");
        miConsultarVeiculo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                miConsultarVeiculoActionPerformed(evt);
            }
        });
        mnConsulta.add(miConsultarVeiculo);

        miConsultarTransportadora.setSelected(true);
        miConsultarTransportadora.setText("Trasnportadora");
        miConsultarTransportadora.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                miConsultarTransportadoraActionPerformed(evt);
            }
        });
        mnConsulta.add(miConsultarTransportadora);

        miConsultarHospital.setSelected(true);
        miConsultarHospital.setText("Hospital");
        miConsultarHospital.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                miConsultarHospitalActionPerformed(evt);
            }
        });
        mnConsulta.add(miConsultarHospital);

        miConsultarLocal.setText("Local");
        miConsultarLocal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                miConsultarLocalActionPerformed(evt);
            }
        });
        mnConsulta.add(miConsultarLocal);

        miConsultarPrefeitura.setText("Prefeitura");
        miConsultarPrefeitura.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                miConsultarPrefeituraActionPerformed(evt);
            }
        });
        mnConsulta.add(miConsultarPrefeitura);

        jMenuBar1.add(mnConsulta);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 274, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void miCadastroEmpresaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_miCadastroEmpresaActionPerformed
        CadastroEmpresaView cadEmpresaView = new CadastroEmpresaView(this);
        cadEmpresaView.setVisible(true);
    }//GEN-LAST:event_miCadastroEmpresaActionPerformed

    private void miHospitalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_miHospitalActionPerformed
        CadastroHospitalView cadHospitalView = new CadastroHospitalView(this);
        cadHospitalView.setVisible(true);
    }//GEN-LAST:event_miHospitalActionPerformed

    private void miPrefeituraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_miPrefeituraActionPerformed
        CadastroPrefeituraView cadPrefeituraView = new CadastroPrefeituraView(this);
        cadPrefeituraView.setVisible(true);
    }//GEN-LAST:event_miPrefeituraActionPerformed

    private void miVacinaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_miVacinaActionPerformed
        CadastroVacinaView cadVacinaView = new CadastroVacinaView(this);
        cadVacinaView.setVisible(true);
    }//GEN-LAST:event_miVacinaActionPerformed

    private void miCaminhaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_miCaminhaoActionPerformed
        CadastroCaminhao cadCaminhaoView = new CadastroCaminhao(this);
        cadCaminhaoView.setVisible(true);
    }//GEN-LAST:event_miCaminhaoActionPerformed

    private void miAviaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_miAviaoActionPerformed
        CadastroAviaoView cadAviaoView = new CadastroAviaoView(this);
        cadAviaoView.setVisible(true);
    }//GEN-LAST:event_miAviaoActionPerformed

    private void miTransportadoraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_miTransportadoraActionPerformed
        CadastroTransporteView cadTrasView = new CadastroTransporteView(this);
        cadTrasView.setVisible(true);
    }//GEN-LAST:event_miTransportadoraActionPerformed

    private void miLocalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_miLocalActionPerformed
        CadastroDeLocalView cadLocalView = new CadastroDeLocalView(this);
        cadLocalView.setVisible(true);
    }//GEN-LAST:event_miLocalActionPerformed

    private void miConsultarEmpresaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_miConsultarEmpresaActionPerformed
        ConsultarEmpresaView conInfoView = new ConsultarEmpresaView(this);
        conInfoView.setVisible(true);
    }//GEN-LAST:event_miConsultarEmpresaActionPerformed

    private void miConsultarLocalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_miConsultarLocalActionPerformed
       ConsultarLocalView conInfoView = new ConsultarLocalView(this);
        conInfoView.setVisible(true);
    }//GEN-LAST:event_miConsultarLocalActionPerformed

    private void miConsultarVeiculoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_miConsultarVeiculoActionPerformed
        ConsultarVeiculoView conInfoView = new ConsultarVeiculoView(this);
        conInfoView.setVisible(true);
    }//GEN-LAST:event_miConsultarVeiculoActionPerformed

    private void miConsultarTransportadoraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_miConsultarTransportadoraActionPerformed
       ConsultarransporteView conInfoView = new ConsultarransporteView(this);
        conInfoView.setVisible(true);
    }//GEN-LAST:event_miConsultarTransportadoraActionPerformed

    private void miConsultarHospitalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_miConsultarHospitalActionPerformed
       ConsultarHospitalView conInfoView = new ConsultarHospitalView(this);
        conInfoView.setVisible(true);
    }//GEN-LAST:event_miConsultarHospitalActionPerformed

    private void miConsultarVacinaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_miConsultarVacinaActionPerformed
        ConsultalVacinaView conInfoView = new ConsultalVacinaView(this);
        conInfoView.setVisible(true);
    }//GEN-LAST:event_miConsultarVacinaActionPerformed

    private void miConsultarPrefeituraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_miConsultarPrefeituraActionPerformed
        ConsultarPrefeituraView conInfoView = new ConsultarPrefeituraView(this);
        conInfoView.setVisible(true);
    }//GEN-LAST:event_miConsultarPrefeituraActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(GerenciadorTransporteVacina.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GerenciadorTransporteVacina.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GerenciadorTransporteVacina.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GerenciadorTransporteVacina.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GerenciadorTransporteVacina().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JRadioButtonMenuItem miAviao;
    private javax.swing.JRadioButtonMenuItem miCadastroEmpresa;
    private javax.swing.JRadioButtonMenuItem miCaminhao;
    private javax.swing.JRadioButtonMenuItem miConsultarEmpresa;
    private javax.swing.JRadioButtonMenuItem miConsultarHospital;
    private javax.swing.JMenuItem miConsultarLocal;
    private javax.swing.JMenuItem miConsultarPrefeitura;
    private javax.swing.JRadioButtonMenuItem miConsultarTransportadora;
    private javax.swing.JRadioButtonMenuItem miConsultarVacina;
    private javax.swing.JRadioButtonMenuItem miConsultarVeiculo;
    private javax.swing.JRadioButtonMenuItem miHospital;
    private javax.swing.JRadioButtonMenuItem miLocal;
    private javax.swing.JRadioButtonMenuItem miPrefeitura;
    private javax.swing.JRadioButtonMenuItem miTransportadora;
    private javax.swing.JRadioButtonMenuItem miVacina;
    private javax.swing.JMenu mnCadastro;
    private javax.swing.JMenu mnConsulta;
    // End of variables declaration//GEN-END:variables


    
}
