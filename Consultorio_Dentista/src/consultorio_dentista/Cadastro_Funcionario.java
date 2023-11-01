/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package consultorio_dentista;

import java.awt.Color;
import java.awt.Font;
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
        
        jTfuncionarios.getTableHeader().setFont(new Font("Segoe UI", Font.BOLD, 14));
        jTfuncionarios.getTableHeader().setOpaque(false);
        jTfuncionarios.getTableHeader().setBackground(new Color (132,191,214));
        jTfuncionarios.getTableHeader().setForeground(new Color (5, 5, 5));
        
        
        
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
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        txttelefone = new javax.swing.JTextField();
        txtemail = new javax.swing.JTextField();
        jLabel21 = new javax.swing.JLabel();
        jComboBoxentrada = new javax.swing.JComboBox<>();
        jComboBoxsaida = new javax.swing.JComboBox<>();
        jLabel22 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jComboBoxcargo = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Cadastro de Funcionario");
        setPreferredSize(new java.awt.Dimension(1300, 950));
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(132, 191, 214));
        jPanel1.setPreferredSize(new java.awt.Dimension(1350, 950));
        jPanel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel1MouseClicked(evt);
            }
        });
        jPanel1.setLayout(null);

        jLabel1.setFont(new java.awt.Font("Book Antiqua", 0, 28)); // NOI18N
        jLabel1.setText("Funcionários Cadastrados");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(510, 440, 340, 34);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/consultorio_dentista/Images/Black.png"))); // NOI18N
        jPanel1.add(jLabel2);
        jLabel2.setBounds(1010, 90, 270, 10);

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/consultorio_dentista/Images/Black.png"))); // NOI18N
        jPanel1.add(jLabel3);
        jLabel3.setBounds(0, 90, 270, 10);

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/consultorio_dentista/Images/Black.png"))); // NOI18N
        jPanel1.add(jLabel4);
        jLabel4.setBounds(270, 90, 270, 10);

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/consultorio_dentista/Images/_82034fd4-4d25-4fd5-9910-ca4e1a14046d-removebg-preview.png"))); // NOI18N
        jPanel1.add(jLabel5);
        jLabel5.setBounds(1160, 0, 120, 90);

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
                "ID Funcionario", "Nome Completo", "RG", "Endereço", "Telefone", "Email", "Cargo", "Entrada", "Saida"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTfuncionarios.setOpaque(false);
        jTfuncionarios.setRowHeight(30);
        jTfuncionarios.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTfuncionariosMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTfuncionarios);

        jPanel1.add(jScrollPane1);
        jScrollPane1.setBounds(10, 530, 1260, 360);

        jLabel7.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel7.setText("RG:");
        jPanel1.add(jLabel7);
        jLabel7.setBounds(140, 190, 32, 30);

        jLabel6.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel6.setText("Cargo:");
        jPanel1.add(jLabel6);
        jLabel6.setBounds(680, 250, 90, 30);

        jLabel8.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel8.setText("Endereço:");
        jPanel1.add(jLabel8);
        jLabel8.setBounds(140, 250, 82, 30);

        txtnome.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        txtnome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtnomeActionPerformed(evt);
            }
        });
        jPanel1.add(txtnome);
        txtnome.setBounds(320, 130, 340, 32);

        txtrg.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        txtrg.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtrgActionPerformed(evt);
            }
        });
        jPanel1.add(txtrg);
        txtrg.setBounds(320, 190, 340, 32);

        txtendereco.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        txtendereco.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtenderecoActionPerformed(evt);
            }
        });
        jPanel1.add(txtendereco);
        txtendereco.setBounds(320, 250, 340, 32);

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
        jButton2.setBounds(1090, 390, 160, 30);

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
        jButton4.setBounds(890, 390, 160, 30);

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
        jButton3.setBounds(30, 400, 160, 30);

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/consultorio_dentista/Images/Black.png"))); // NOI18N
        jPanel1.add(jLabel9);
        jLabel9.setBounds(1030, 490, 270, 10);

        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/consultorio_dentista/Images/Black.png"))); // NOI18N
        jPanel1.add(jLabel10);
        jLabel10.setBounds(750, 90, 270, 10);

        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/consultorio_dentista/Images/Black.png"))); // NOI18N
        jPanel1.add(jLabel11);
        jLabel11.setBounds(1030, 90, 270, 10);

        jLabel12.setFont(new java.awt.Font("Book Antiqua", 0, 28)); // NOI18N
        jLabel12.setText("Cadastro de Funcionário");
        jPanel1.add(jLabel12);
        jLabel12.setBounds(510, 30, 304, 34);

        jLabel13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/consultorio_dentista/Images/Black.png"))); // NOI18N
        jPanel1.add(jLabel13);
        jLabel13.setBounds(490, 90, 270, 10);

        jLabel14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/consultorio_dentista/Images/Black.png"))); // NOI18N
        jPanel1.add(jLabel14);
        jLabel14.setBounds(0, 490, 270, 10);

        jLabel15.setIcon(new javax.swing.ImageIcon(getClass().getResource("/consultorio_dentista/Images/Black.png"))); // NOI18N
        jPanel1.add(jLabel15);
        jLabel15.setBounds(270, 490, 270, 10);

        jLabel16.setIcon(new javax.swing.ImageIcon(getClass().getResource("/consultorio_dentista/Images/Black.png"))); // NOI18N
        jPanel1.add(jLabel16);
        jLabel16.setBounds(540, 490, 270, 10);

        jLabel17.setIcon(new javax.swing.ImageIcon(getClass().getResource("/consultorio_dentista/Images/Black.png"))); // NOI18N
        jPanel1.add(jLabel17);
        jLabel17.setBounds(810, 490, 270, 10);

        jLabel18.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel18.setText("Nome Completo:");
        jPanel1.add(jLabel18);
        jLabel18.setBounds(140, 130, 133, 30);

        jLabel19.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel19.setText("Telefone:");
        jPanel1.add(jLabel19);
        jLabel19.setBounds(680, 130, 90, 30);

        jLabel20.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel20.setText("Email:");
        jPanel1.add(jLabel20);
        jLabel20.setBounds(680, 190, 90, 30);

        txttelefone.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        txttelefone.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txttelefoneActionPerformed(evt);
            }
        });
        jPanel1.add(txttelefone);
        txttelefone.setBounds(780, 130, 340, 32);

        txtemail.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        txtemail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtemailActionPerformed(evt);
            }
        });
        jPanel1.add(txtemail);
        txtemail.setBounds(780, 190, 340, 32);

        jLabel21.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel21.setText("Saida:");
        jPanel1.add(jLabel21);
        jLabel21.setBounds(790, 310, 60, 30);

        jComboBoxentrada.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jComboBoxentrada.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "8:00", "9:00", "10:00" }));
        jComboBoxentrada.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxentradaActionPerformed(evt);
            }
        });
        jPanel1.add(jComboBoxentrada);
        jComboBoxentrada.setBounds(690, 310, 89, 30);

        jComboBoxsaida.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jComboBoxsaida.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "18:00", "19:00", "20:00" }));
        jPanel1.add(jComboBoxsaida);
        jComboBoxsaida.setBounds(860, 310, 90, 27);

        jLabel22.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel22.setText("Horario De Trabalho:");
        jPanel1.add(jLabel22);
        jLabel22.setBounds(400, 310, 190, 30);

        jLabel23.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel23.setText("Entrada:");
        jPanel1.add(jLabel23);
        jLabel23.setBounds(600, 310, 80, 30);

        jComboBoxcargo.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jComboBoxcargo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Gerente da Clínica", "Dentista", "Assistente de Dentista", "Recepcionista", "Auxiliar de Limpeza" }));
        jPanel1.add(jComboBoxcargo);
        jComboBoxcargo.setBounds(780, 250, 340, 30);

        getContentPane().add(jPanel1, java.awt.BorderLayout.CENTER);

        getAccessibleContext().setAccessibleName("Cadastro De Funcionario");

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
        String telefone = txttelefone.getText();
        String email = txtemail.getText();
        String cargo = (String) (jComboBoxcargo.getSelectedItem());
        String entrada = (String) (jComboBoxentrada.getSelectedItem());
        String saida = (String) (jComboBoxsaida.getSelectedItem());

        if (nome.isEmpty() || rg.isEmpty() || endereco.isEmpty() || telefone.isEmpty() || email.isEmpty()){
            JOptionPane.showMessageDialog(this, "Preencha todos os campos para continuar");
        }
        else{
        
        try {
            Class.forName("com.mysql.cj.jdbc.Driver"); //Register the mysql driver
            con1 = DriverManager.getConnection("jdbc:mysql://localhost:3308/teste","root","887091");
            insert = con1.prepareStatement("insert into funcionario (Nome,RG,Endereco,Telefone,Email,Cargo,Entrada,Saida)values(?,?,?,?,?,?,?,?)");
            insert.setString(1,nome);
            insert.setString(2,rg);
            insert.setString(3,endereco);
            insert.setString(4,telefone);
            insert.setString(5,email);
            insert.setString(6,cargo);
            insert.setString(7,entrada);
            insert.setString(8,saida);
            insert.executeUpdate();
            JOptionPane.showMessageDialog(this, "Registro Feito Com Sucesso!");

            txtnome.setText("");
            txtrg.setText("");
            txtendereco.setText("");
            txttelefone.setText("");
            txtemail.setText("");
            jComboBoxcargo.setSelectedItem("Gerente da Clínica");
            jComboBoxentrada.setSelectedItem("8:00");
            jComboBoxsaida.setSelectedItem("18:00");
            table_update();
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Cadastro_Cliente.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(Cadastro_Cliente.class.getName()).log(Level.SEVERE, null, ex);
        }
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
                String telefone = txttelefone.getText();
                String email = txtemail.getText();
                String cargo = (String) (jComboBoxcargo.getSelectedItem());
                String entrada = (String) (jComboBoxentrada.getSelectedItem());
                String saida = (String) (jComboBoxsaida.getSelectedItem());

                Class.forName("com.mysql.cj.jdbc.Driver");
                con1 = DriverManager.getConnection("jdbc:mysql://localhost:3308/teste","root","887091");
                insert = con1.prepareStatement("update funcionario set Nome= ?,RG= ?,Endereco= ?, Telefone= ?, Email= ?, Cargo= ?, Entrada= ?, Saida= ? where idFuncionario= ?");
                insert.setString(1,nome);
                insert.setString(2,rg);
                insert.setString(3,endereco);
                insert.setString(4,telefone);
                insert.setString(5,email);
                insert.setString(6,cargo);
                insert.setString(7,entrada);
                insert.setString(8,saida);
                insert.setInt(9,idFuncionario);
                insert.executeUpdate();
                JOptionPane.showMessageDialog(this, "Registro Atualizado Com Sucesso!");
                txtnome.setText("");
                txtrg.setText("");
                txtendereco.setText("");
                txttelefone.setText("");
                txtemail.setText("");
                jComboBoxcargo.setSelectedItem("Gerente da Clínica");
                jComboBoxentrada.setSelectedItem("8:00");
                jComboBoxsaida.setSelectedItem("18:00");
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
                    txttelefone.setText("");
                    txtemail.setText("");
                    jComboBoxcargo.setSelectedItem("Gerente da Clínica");
                    jComboBoxentrada.setSelectedItem("8:00");
                    jComboBoxsaida.setSelectedItem("18:00");
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
        txttelefone.setText(model.getValueAt(selectedIndex, 4).toString());
        txtemail.setText(model.getValueAt(selectedIndex, 5).toString());
        jComboBoxcargo.setSelectedItem(model.getValueAt(selectedIndex, 6).toString());
        jComboBoxentrada.setSelectedItem(model.getValueAt(selectedIndex, 7).toString());
        jComboBoxsaida.setSelectedItem(model.getValueAt(selectedIndex, 8).toString());
    }//GEN-LAST:event_jTfuncionariosMouseClicked

    private void txttelefoneActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txttelefoneActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txttelefoneActionPerformed

    private void txtemailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtemailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtemailActionPerformed

    private void jComboBoxentradaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxentradaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBoxentradaActionPerformed

    private void jPanel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel1MouseClicked
        // TODO add your handling code here:
        // Codigo Para Deselecionar Linhas Do Jtable
        txtnome.setText("");
        txtrg.setText("");
        txtendereco.setText("");
        txttelefone.setText("");
        txtemail.setText("");
        jComboBoxcargo.setSelectedItem("Gerente da Clínica");
        jComboBoxentrada.setSelectedItem("8:00");
        jComboBoxsaida.setSelectedItem("18:00");
        table_update();
    }//GEN-LAST:event_jPanel1MouseClicked

    
    
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
                    v2.add(Rs.getString("Telefone"));
                    v2.add(Rs.getString("Email"));
                    v2.add(Rs.getString("Cargo"));
                    v2.add(Rs.getString("Entrada"));
                    v2.add(Rs.getString("Saida"));
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
    javax.swing.JComboBox<String> jComboBoxcargo;
    javax.swing.JComboBox<String> jComboBoxentrada;
    javax.swing.JComboBox<String> jComboBoxsaida;
    javax.swing.JLabel jLabel1;
    javax.swing.JLabel jLabel10;
    javax.swing.JLabel jLabel11;
    javax.swing.JLabel jLabel12;
    javax.swing.JLabel jLabel13;
    javax.swing.JLabel jLabel14;
    javax.swing.JLabel jLabel15;
    javax.swing.JLabel jLabel16;
    javax.swing.JLabel jLabel17;
    javax.swing.JLabel jLabel18;
    javax.swing.JLabel jLabel19;
    javax.swing.JLabel jLabel2;
    javax.swing.JLabel jLabel20;
    javax.swing.JLabel jLabel21;
    javax.swing.JLabel jLabel22;
    javax.swing.JLabel jLabel23;
    javax.swing.JLabel jLabel3;
    javax.swing.JLabel jLabel4;
    javax.swing.JLabel jLabel5;
    javax.swing.JLabel jLabel6;
    javax.swing.JLabel jLabel7;
    javax.swing.JLabel jLabel8;
    javax.swing.JLabel jLabel9;
    javax.swing.JPanel jPanel1;
    javax.swing.JScrollPane jScrollPane1;
    javax.swing.JTable jTfuncionarios;
    javax.swing.JTextField txtemail;
    javax.swing.JTextField txtendereco;
    javax.swing.JTextField txtnome;
    javax.swing.JTextField txtrg;
    javax.swing.JTextField txttelefone;
    // End of variables declaration//GEN-END:variables
}
