/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package consultorio_dentista;

import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.Vector;

public class Cadastro_Funcionario extends javax.swing.JFrame {

    /**
     * Creates new form Cadastro_Funcionario
     */
    public Cadastro_Funcionario() {
        initComponents();
        table_update();
        
        // Codigo para ativar a ordenação da Jtable
        DefaultTableModel modelo = (DefaultTableModel) jTfuncionarios.getModel();
        jTfuncionarios.setRowSorter(new TableRowSorter(modelo));
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTfuncionarios = new javax.swing.JTable();
        jLabel7 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        txtnome = new javax.swing.JTextField();
        txtrg = new javax.swing.JTextField();
        txtendereco = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(132, 191, 214));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 0, 12), new java.awt.Color(0, 0, 153))); // NOI18N
        jPanel1.setPreferredSize(new java.awt.Dimension(760, 820));
        jPanel1.setLayout(null);

        jLabel1.setFont(new java.awt.Font("Book Antiqua", 0, 28)); // NOI18N
        jLabel1.setText("Cadastro De Funcionario");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(240, 30, 309, 34);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/consultorio_dentista/Images/Black.png"))); // NOI18N
        jPanel1.add(jLabel2);
        jLabel2.setBounds(490, 90, 270, 10);

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/consultorio_dentista/Images/Black.png"))); // NOI18N
        jPanel1.add(jLabel3);
        jLabel3.setBounds(0, 90, 270, 10);

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/consultorio_dentista/Images/Black.png"))); // NOI18N
        jPanel1.add(jLabel4);
        jLabel4.setBounds(270, 90, 270, 10);

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/consultorio_dentista/Images/_82034fd4-4d25-4fd5-9910-ca4e1a14046d-removebg-preview.png"))); // NOI18N
        jPanel1.add(jLabel5);
        jLabel5.setBounds(640, 0, 120, 90);

        jButton1.setBackground(new java.awt.Color(153, 255, 255));
        jButton1.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jButton1.setText("Menu");
        jButton1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 0, 12), new java.awt.Color(0, 0, 0))); // NOI18N
        jButton1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1);
        jButton1.setBounds(30, 30, 150, 30);

        jTfuncionarios.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID Funcionario", "Nome Completo", "RG", "Endereço"
            }
        ));
        jTfuncionarios.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTfuncionariosMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTfuncionarios);

        jPanel1.add(jScrollPane1);
        jScrollPane1.setBounds(20, 390, 720, 406);

        jLabel7.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel7.setText("RG:");
        jPanel1.add(jLabel7);
        jLabel7.setBounds(110, 210, 32, 22);

        jLabel6.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel6.setText("Nome Completo:");
        jPanel1.add(jLabel6);
        jLabel6.setBounds(110, 140, 133, 22);

        jLabel8.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel8.setText("Endereço:");
        jPanel1.add(jLabel8);
        jLabel8.setBounds(110, 270, 82, 22);

        txtnome.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        txtnome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtnomeActionPerformed(evt);
            }
        });
        jPanel1.add(txtnome);
        txtnome.setBounds(320, 140, 370, 32);

        txtrg.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        txtrg.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtrgActionPerformed(evt);
            }
        });
        jPanel1.add(txtrg);
        txtrg.setBounds(320, 200, 370, 32);

        txtendereco.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        txtendereco.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtenderecoActionPerformed(evt);
            }
        });
        jPanel1.add(txtendereco);
        txtendereco.setBounds(320, 270, 370, 32);

        jButton2.setBackground(new java.awt.Color(153, 255, 255));
        jButton2.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jButton2.setText("Cadastrar");
        jButton2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 0, 12), new java.awt.Color(0, 0, 0))); // NOI18N
        jButton2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2);
        jButton2.setBounds(570, 340, 160, 30);

        jButton4.setBackground(new java.awt.Color(153, 255, 255));
        jButton4.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jButton4.setText("Atualizar");
        jButton4.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 0, 12), new java.awt.Color(0, 0, 0))); // NOI18N
        jButton4.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton4);
        jButton4.setBounds(380, 340, 160, 30);

        jButton3.setBackground(new java.awt.Color(153, 255, 255));
        jButton3.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jButton3.setText("Excluir");
        jButton3.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 0, 12), new java.awt.Color(0, 0, 0))); // NOI18N
        jButton3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton3);
        jButton3.setBounds(30, 340, 160, 30);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(57, 57, 57)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(63, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // Botão de Cadastro

        /* DefaultTableModel dtmClientes = (DefaultTableModel) jTclientes.getModel();
        Object[] dados = {txtnome.getText(), txtrg.getText(), txtendereco.getText()};
        dtmClientes.addRow(dados);
        Codigo para inserir manualmente dados na tabela*/

        String nome = txtnome.getText();
        String rg = txtrg.getText();
        String endereco = txtendereco.getText();

        try {
            Class.forName("com.mysql.cj.jdbc.Driver"); //Register the mysql driver
            con1 = DriverManager.getConnection("jdbc:mysql://localhost:3308/teste","root","887091");
            insert = con1.prepareStatement("insert into funcionario (Nome,RG,Endereco)values(?,?,?)");
            insert.setString(1,nome);
            insert.setString(2,rg);
            insert.setString(3,endereco);
            insert.executeUpdate();
            JOptionPane.showMessageDialog(this, "Registro Feito Com Sucesso!");

            txtnome.setText("");
            txtrg.setText("");
            txtendereco.setText("");
            table_update();
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Cadastro_Cliente.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(Cadastro_Cliente.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void txtenderecoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtenderecoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtenderecoActionPerformed

    private void txtrgActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtrgActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtrgActionPerformed

    private void txtnomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtnomeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtnomeActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // Botão para voltar ao Menu
        Menu Telademenu = new Menu();
        Telademenu.setVisible(true); // Deixa a tela do menu visivel
        this.dispose(); // Fecha a tela atual
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // Botão de Atualizar
        /*if (jTclientes.getSelectedRow() != -1) {
            jTclientes.setValueAt(txtnome.getText(), jTclientes.getSelectedRow(), 0);
            jTclientes.setValueAt(txtrg.getText(), jTclientes.getSelectedRow(), 1);
            jTclientes.setValueAt(txtendereco.getText(), jTclientes.getSelectedRow(), 2);
        } */
        DefaultTableModel model = (DefaultTableModel) jTfuncionarios.getModel();
        int selectedIndex = jTfuncionarios.getSelectedRow();
        if (jTfuncionarios.getSelectedRow() != -1){
            try {
                int idFuncionario = Integer.parseInt(model.getValueAt(selectedIndex, 0).toString());
                String nome = txtnome.getText();
                String rg = txtrg.getText();
                String endereco = txtendereco.getText();

                Class.forName("com.mysql.cj.jdbc.Driver");
                con1 = DriverManager.getConnection("jdbc:mysql://localhost:3308/teste","root","887091");
                insert = con1.prepareStatement("update funcionario set Nome= ?,RG= ?,Endereco= ? where idFuncionario= ?");
                insert.setString(1,nome);
                insert.setString(2,rg);
                insert.setString(3,endereco);
                insert.setInt(4,idFuncionario);
                insert.executeUpdate();
                JOptionPane.showMessageDialog(this, "Registro Atualizado Com Sucesso!");
                txtnome.setText("");
                txtrg.setText("");
                txtendereco.setText("");
                table_update();

            }
            catch (ClassNotFoundException ex) {

            }
            catch (SQLException ex) {

            }

        }
        else{
            JOptionPane.showMessageDialog(null, "Selecione um cadastro para Atualizar!");
        }
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // Botão de Excluir
        /*

        jTclientes.getSelectedRow();
        // System.out.println("Linha selecionada" + jTclientes.getSelectedRow());

        if (jTclientes.getSelectedRow() != -1) {
            DefaultTableModel dtmClientes = (DefaultTableModel) jTclientes.getModel();
            dtmClientes.removeRow(jTclientes.getSelectedRow());
        }
        else{
            JOptionPane.showMessageDialog(null, "Selecione um cadastro para excluir");
        }
        */

        DefaultTableModel model = (DefaultTableModel) jTfuncionarios.getModel();
        int selectedIndex = jTfuncionarios.getSelectedRow();

        if (jTfuncionarios.getSelectedRow() != -1){
            try {

                int idFuncionario = Integer.parseInt(model.getValueAt(selectedIndex, 0).toString());
                int dialogResult = JOptionPane.showConfirmDialog (null, "Você Realmente Quer Apagar Esse Registro?","AVISO",JOptionPane.YES_NO_OPTION);
                if(dialogResult == JOptionPane.YES_OPTION){
                    Class.forName("com.mysql.cj.jdbc.Driver");
                    con1 = DriverManager.getConnection("jdbc:mysql://localhost:3308/teste","root","887091");
                    insert = con1.prepareStatement("delete from funcionario where idFuncionario = ?");
                    insert.setInt(1,idFuncionario);
                    insert.executeUpdate();
                    JOptionPane.showMessageDialog(this, "Registro Deletedo Com Êxito");
                    txtnome.setText("");
                    txtrg.setText("");
                    txtendereco.setText("");
                    table_update();

                }
            } catch (ClassNotFoundException | SQLException ex) {

            }
        }
        else{
            JOptionPane.showMessageDialog(null, "Selecione um cadastro para excluir!");
        }

    }//GEN-LAST:event_jButton3ActionPerformed

    private void jTfuncionariosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTfuncionariosMouseClicked
        // TODO add your handling code here:
        DefaultTableModel model = (DefaultTableModel) jTfuncionarios.getModel();
        int selectedIndex = jTfuncionarios.getSelectedRow();
      
        txtnome.setText(model.getValueAt(selectedIndex, 1).toString());
        txtrg.setText(model.getValueAt(selectedIndex, 2).toString());
        txtendereco.setText(model.getValueAt(selectedIndex, 3).toString());
    }//GEN-LAST:event_jTfuncionariosMouseClicked

    
    
    Connection con1;
    PreparedStatement insert;
    
    private void table_update(){
        int CC;
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            con1 = DriverManager.getConnection("jdbc:mysql://localhost:3308/teste","root","887091");
            insert = con1.prepareStatement("SELECT * FROM funcionario");
            ResultSet Rs = insert.executeQuery();
            
            ResultSetMetaData RSMD = Rs.getMetaData();
            CC = RSMD.getColumnCount();
            DefaultTableModel DFT = (DefaultTableModel) jTfuncionarios.getModel();
             DFT.setRowCount(0);
            while (Rs.next()) {
                Vector v2 = new Vector();
           
                for (int ii = 1; ii <= CC; ii++) {
                    v2.add(Rs.getString("idFuncionario"));
                    v2.add(Rs.getString("Nome"));
                    v2.add(Rs.getString("RG"));
                    v2.add(Rs.getString("Endereco"));
                }
                DFT.addRow(v2);
            }
        } catch (Exception e) {
        }
    }
    
    
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
            java.util.logging.Logger.getLogger(Cadastro_Funcionario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Cadastro_Funcionario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Cadastro_Funcionario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Cadastro_Funcionario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Cadastro_Funcionario().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    javax.swing.JButton jButton1;
    javax.swing.JButton jButton2;
    javax.swing.JButton jButton3;
    javax.swing.JButton jButton4;
    javax.swing.JLabel jLabel1;
    javax.swing.JLabel jLabel2;
    javax.swing.JLabel jLabel3;
    javax.swing.JLabel jLabel4;
    javax.swing.JLabel jLabel5;
    javax.swing.JLabel jLabel6;
    javax.swing.JLabel jLabel7;
    javax.swing.JLabel jLabel8;
    javax.swing.JPanel jPanel1;
    javax.swing.JScrollPane jScrollPane1;
    javax.swing.JTable jTfuncionarios;
    javax.swing.JTextField txtendereco;
    javax.swing.JTextField txtnome;
    javax.swing.JTextField txtrg;
    // End of variables declaration//GEN-END:variables
}
