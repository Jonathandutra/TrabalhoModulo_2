/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package interfaces;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Calendar;
import javax.swing.JOptionPane;
import javax.swing.Timer;

/**
 *
 * @author professor
 */
public class TelaPrincipal extends javax.swing.JFrame {

    int numero;
    // CONSTRUTOR
    public TelaPrincipal() 
    {
        initComponents();
        this.setLocationRelativeTo(null);  // Definindo esta janela (TelaPrincipal) como centralizada
        
        this.getContentPane().setBackground(new Color(59,135,199)); // Definindo a cor de fundo desta janela como uma nova cor.
        
               
        
    }
    
   

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        btUsuarios = new javax.swing.JToggleButton();
        btCursos = new javax.swing.JToggleButton();
        jPanel4 = new javax.swing.JPanel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        miSair = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        jMenu3 = new javax.swing.JMenu();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenuItem3 = new javax.swing.JMenuItem();
        imAlunoCadastro = new javax.swing.JMenuItem();
        jMenu4 = new javax.swing.JMenu();
        jMenuItem4 = new javax.swing.JMenuItem();
        imCursoBuscar = new javax.swing.JMenuItem();
        jMenu5 = new javax.swing.JMenu();
        jMenu6 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenu7 = new javax.swing.JMenu();
        jMenuItem6 = new javax.swing.JMenuItem();
        jMenuItem8 = new javax.swing.JMenuItem();
        jMenuItem7 = new javax.swing.JMenuItem();
        jMenu8 = new javax.swing.JMenu();
        jMenuItem9 = new javax.swing.JMenuItem();
        jMenu9 = new javax.swing.JMenu();
        jMenuItem5 = new javax.swing.JMenuItem();
        jMenuItem11 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Tela Principal");
        setAutoRequestFocus(false);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        btUsuarios.setText("Alunos");
        btUsuarios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btUsuariosActionPerformed(evt);
            }
        });

        btCursos.setText("Cursos");
        btCursos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btCursosActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btUsuarios)
                .addGap(18, 18, 18)
                .addComponent(btCursos)
                .addContainerGap(479, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btUsuarios)
                    .addComponent(btCursos))
                .addContainerGap())
        );

        jPanel4.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 617, Short.MAX_VALUE)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 240, Short.MAX_VALUE)
        );

        jMenu1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/icons 1/cog.png"))); // NOI18N
        jMenu1.setText("Options");

        miSair.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/icons 1/door_out.png"))); // NOI18N
        miSair.setText("Sair");
        miSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                miSairActionPerformed(evt);
            }
        });
        jMenu1.add(miSair);

        jMenuBar1.add(jMenu1);

        jMenu2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/icons 1/application_double.png"))); // NOI18N
        jMenu2.setText("Gerenciar");
        jMenu2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenu2ActionPerformed(evt);
            }
        });

        jMenu3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/icons 1/group.png"))); // NOI18N
        jMenu3.setText("Alunos");

        jMenuItem2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/icons 1/user_edit.png"))); // NOI18N
        jMenuItem2.setText("Atualizar");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        jMenu3.add(jMenuItem2);

        jMenuItem3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/icons 1/magnifier.png"))); // NOI18N
        jMenuItem3.setText("Buscar");
        jMenuItem3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem3ActionPerformed(evt);
            }
        });
        jMenu3.add(jMenuItem3);

        imAlunoCadastro.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/icons 1/user_add.png"))); // NOI18N
        imAlunoCadastro.setText("Cadastrar");
        imAlunoCadastro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                imAlunoCadastroActionPerformed(evt);
            }
        });
        jMenu3.add(imAlunoCadastro);

        jMenu2.add(jMenu3);

        jMenu4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/icons 1/application_form.png"))); // NOI18N
        jMenu4.setText("Cursos");

        jMenuItem4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/icons 1/application_form_edit.png"))); // NOI18N
        jMenuItem4.setText("Atualizar");
        jMenuItem4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem4ActionPerformed(evt);
            }
        });
        jMenu4.add(jMenuItem4);

        imCursoBuscar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/icons 1/magnifier.png"))); // NOI18N
        imCursoBuscar.setText("Buscar");
        imCursoBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                imCursoBuscarActionPerformed(evt);
            }
        });
        jMenu4.add(imCursoBuscar);

        jMenu2.add(jMenu4);

        jMenuBar1.add(jMenu2);

        jMenu5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/icons 1/application_osx_terminal.png"))); // NOI18N
        jMenu5.setText("Sistema");

        jMenu6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/icons 1/application_form.png"))); // NOI18N
        jMenu6.setText("Cursos");

        jMenuItem1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/icons 1/application_form_add.png"))); // NOI18N
        jMenuItem1.setText("Cadastrar");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu6.add(jMenuItem1);

        jMenu5.add(jMenu6);

        jMenu7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/icons 1/group.png"))); // NOI18N
        jMenu7.setText("Usuários");

        jMenuItem6.setText("Atualizar");
        jMenu7.add(jMenuItem6);

        jMenuItem8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/icons 1/user_add.png"))); // NOI18N
        jMenuItem8.setText("Novo");
        jMenuItem8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem8ActionPerformed(evt);
            }
        });
        jMenu7.add(jMenuItem8);

        jMenuItem7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/icons 1/application_form_delete.png"))); // NOI18N
        jMenuItem7.setText("Remover");
        jMenu7.add(jMenuItem7);

        jMenu5.add(jMenu7);

        jMenu8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/icons 1/door.png"))); // NOI18N
        jMenu8.setText("Suporte");

        jMenuItem9.setText("Supremo");
        jMenu8.add(jMenuItem9);

        jMenu5.add(jMenu8);

        jMenuBar1.add(jMenu5);

        jMenu9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/icons 1/lightbulb_off.png"))); // NOI18N
        jMenu9.setText("Ajuda");

        jMenuItem5.setText("Conteúdo da Ajuda");
        jMenu9.add(jMenuItem5);

        jMenuItem11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/icons 1/information.png"))); // NOI18N
        jMenuItem11.setText("Sobre");
        jMenuItem11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem11ActionPerformed(evt);
            }
        });
        jMenu9.add(jMenuItem11);

        jMenuBar1.add(jMenu9);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jMenu2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenu2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenu2ActionPerformed

    private void miSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_miSairActionPerformed
       
      JOptionPane.showMessageDialog(this, "Realmente deseja sair", null, WIDTH, null);
              System.exit(0); 
    }//GEN-LAST:event_miSairActionPerformed

    private void btCursosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btCursosActionPerformed
       TelaBuscarCursos TelaGradCurso = new TelaBuscarCursos(this,rootPaneCheckingEnabled);
       TelaGradCurso.setVisible(true);
               
    }//GEN-LAST:event_btCursosActionPerformed

    private void jMenuItem4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItem4ActionPerformed

    private void imCursoBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_imCursoBuscarActionPerformed
        TelaBuscarCursos TelaGrad = new TelaBuscarCursos(this,rootPaneCheckingEnabled);
        TelaGrad.setVisible(true);
    }//GEN-LAST:event_imCursoBuscarActionPerformed

    private void imAlunoCadastroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_imAlunoCadastroActionPerformed
        TelaCadastroAluno TelaCadastro = new TelaCadastroAluno(this, rootPaneCheckingEnabled);
        TelaCadastro.setVisible(true);
    }//GEN-LAST:event_imAlunoCadastroActionPerformed

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
        TelaAlunoAtualizar TelaAtualizar = new TelaAlunoAtualizar(this, rootPaneCheckingEnabled);
        TelaAtualizar.setVisible(true);
        
        
    }//GEN-LAST:event_jMenuItem2ActionPerformed

    private void jMenuItem8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem8ActionPerformed
        TelaNovoUsuario TelaUsuario = new TelaNovoUsuario(this,rootPaneCheckingEnabled);
        TelaUsuario.setVisible(true);
    }//GEN-LAST:event_jMenuItem8ActionPerformed

    private void btUsuariosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btUsuariosActionPerformed
        TelaAlunos TelaAluno = new TelaAlunos(this, rootPaneCheckingEnabled);
        TelaAluno.setVisible(true);
    }//GEN-LAST:event_btUsuariosActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
      TelaCadastroCurso TelaCadCurso = new TelaCadastroCurso(this, rootPaneCheckingEnabled);
      TelaCadCurso.setVisible(true);
      
      
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void jMenuItem3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem3ActionPerformed
        TelaBuscarAluno TelaBuscar = new TelaBuscarAluno(this, rootPaneCheckingEnabled);
        TelaBuscar.setVisible(true);
    }//GEN-LAST:event_jMenuItem3ActionPerformed

    private void jMenuItem11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem11ActionPerformed
        TelaSobre TelaSobre = new TelaSobre(this, rootPaneCheckingEnabled);
        TelaSobre.setVisible(true);
    }//GEN-LAST:event_jMenuItem11ActionPerformed

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
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JToggleButton btCursos;
    private javax.swing.JToggleButton btUsuarios;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JMenuItem imAlunoCadastro;
    private javax.swing.JMenuItem imCursoBuscar;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenu jMenu5;
    private javax.swing.JMenu jMenu6;
    private javax.swing.JMenu jMenu7;
    private javax.swing.JMenu jMenu8;
    private javax.swing.JMenu jMenu9;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem11;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JMenuItem jMenuItem5;
    private javax.swing.JMenuItem jMenuItem6;
    private javax.swing.JMenuItem jMenuItem7;
    private javax.swing.JMenuItem jMenuItem8;
    private javax.swing.JMenuItem jMenuItem9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JMenuItem miSair;
    // End of variables declaration//GEN-END:variables
}
