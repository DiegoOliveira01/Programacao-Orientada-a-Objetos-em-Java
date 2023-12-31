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
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.Vector;

/**
 *
 * @author diego
 */
public class Cadastro_Horario extends javax.swing.JFrame {

    /**
     * Creates new form Cadastro_Horario01
     */
    public Cadastro_Horario() {
        initComponents();
        
        table_update();
        table_C_update();
        table_F_update();
        
        jTfuncionarios.getTableHeader().setFont(new Font("Segoe UI", Font.BOLD, 14));
        jTfuncionarios.getTableHeader().setOpaque(false);
        jTfuncionarios.getTableHeader().setBackground(new Color (132,191,214));
        jTfuncionarios.getTableHeader().setForeground(new Color (5, 5, 5));
        
        jTclientes.getTableHeader().setFont(new Font("Segoe UI", Font.BOLD, 14));
        jTclientes.getTableHeader().setOpaque(false);
        jTclientes.getTableHeader().setBackground(new Color (132,191,214));
        jTclientes.getTableHeader().setForeground(new Color (5, 5, 5));
        
        jTConsulta.getTableHeader().setFont(new Font("Segoe UI", Font.BOLD, 14));
        jTConsulta.getTableHeader().setOpaque(false);
        jTConsulta.getTableHeader().setBackground(new Color (132,191,214));
        jTConsulta.getTableHeader().setForeground(new Color (5, 5, 5));
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTfuncionarios = new javax.swing.JTable();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTclientes = new javax.swing.JTable();
        jDateChooser1 = new com.toedter.calendar.JDateChooser();
        jComboBoxhorario = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        txtcliente = new javax.swing.JTextField();
        txtfuncionario = new javax.swing.JTextField();
        txtdata = new javax.swing.JTextField();
        txthorario = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        txtidfuncionario = new javax.swing.JTextField();
        txtidcliente = new javax.swing.JTextField();
        jLabel20 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTConsulta = new javax.swing.JTable();
        jLabel16 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Agendamento de Horário");
        setResizable(false);

        jPanel2.setBackground(new java.awt.Color(132, 191, 214));
        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 0, 12), new java.awt.Color(0, 0, 204))); // NOI18N
        jPanel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel2MouseClicked(evt);
            }
        });
        jPanel2.setLayout(null);

        jPanel1.setBackground(new java.awt.Color(132, 191, 214));
        jPanel1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        jPanel1.setToolTipText("Dados");
        jPanel1.setName(""); // NOI18N
        jPanel1.setLayout(null);

        jTfuncionarios.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID Funcionario", "Nome Completo", "RG", "Telefone", "Cargo"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTfuncionarios.setOpaque(false);
        jTfuncionarios.setRowHeight(30);
        jTfuncionarios.setSelectionBackground(new java.awt.Color(51, 51, 255));
        jTfuncionarios.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTfuncionariosMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(jTfuncionarios);

        jPanel1.add(jScrollPane2);
        jScrollPane2.setBounds(20, 260, 750, 160);

        jTclientes.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID Cliente", "Nome Completo", "RG", "Telefone", "Email"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTclientes.setOpaque(false);
        jTclientes.setRowHeight(30);
        jTclientes.setSelectionBackground(new java.awt.Color(51, 51, 255));
        jTclientes.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTclientesMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTclientes);

        jPanel1.add(jScrollPane1);
        jScrollPane1.setBounds(20, 50, 750, 160);

        jDateChooser1.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jDateChooser1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jDateChooser1MouseClicked(evt);
            }
        });
        jDateChooser1.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                jDateChooser1PropertyChange(evt);
            }
        });
        jPanel1.add(jDateChooser1);
        jDateChooser1.setBounds(60, 470, 220, 30);

        jComboBoxhorario.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jComboBoxhorario.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "8:00", "9:00", "10:00", "11:00", "12:00", "13:00", "14:00", "15:00", "16:00", "17:00", "18:00" }));
        jComboBoxhorario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxhorarioActionPerformed(evt);
            }
        });
        jPanel1.add(jComboBoxhorario);
        jComboBoxhorario.setBounds(560, 470, 100, 30);

        jLabel2.setFont(new java.awt.Font("Arial", 0, 26)); // NOI18N
        jLabel2.setText("Selecione um Horário:");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(480, 430, 260, 31);

        jLabel13.setFont(new java.awt.Font("Arial", 0, 26)); // NOI18N
        jLabel13.setText("Selecione um Cliente");
        jPanel1.add(jLabel13);
        jLabel13.setBounds(270, 10, 250, 31);

        jLabel17.setFont(new java.awt.Font("Arial", 0, 26)); // NOI18N
        jLabel17.setText("Selecione uma Data:");
        jPanel1.add(jLabel17);
        jLabel17.setBounds(50, 430, 250, 31);

        jLabel21.setFont(new java.awt.Font("Arial", 0, 26)); // NOI18N
        jLabel21.setText("Selecione um Funcionario");
        jPanel1.add(jLabel21);
        jLabel21.setBounds(240, 220, 300, 31);

        jPanel2.add(jPanel1);
        jPanel1.setBounds(30, 120, 790, 530);

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
        jPanel2.add(jButton1);
        jButton1.setBounds(20, 30, 150, 30);

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
        jPanel2.add(jButton2);
        jButton2.setBounds(1110, 560, 160, 30);

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/consultorio_dentista/Images/Black.png"))); // NOI18N
        jPanel2.add(jLabel3);
        jLabel3.setBounds(10, 100, 280, 10);

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/consultorio_dentista/Images/Black.png"))); // NOI18N
        jPanel2.add(jLabel4);
        jLabel4.setBounds(1030, 100, 280, 10);

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/consultorio_dentista/Images/Black.png"))); // NOI18N
        jPanel2.add(jLabel5);
        jLabel5.setBounds(420, 100, 280, 10);

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/consultorio_dentista/Images/Black.png"))); // NOI18N
        jPanel2.add(jLabel9);
        jLabel9.setBounds(150, 100, 280, 10);

        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/consultorio_dentista/Images/_82034fd4-4d25-4fd5-9910-ca4e1a14046d-removebg-preview.png"))); // NOI18N
        jPanel2.add(jLabel10);
        jLabel10.setBounds(1200, -10, 140, 120);

        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/consultorio_dentista/Images/Black.png"))); // NOI18N
        jPanel2.add(jLabel11);
        jLabel11.setBounds(690, 100, 280, 10);

        jLabel12.setFont(new java.awt.Font("Book Antiqua", 0, 28)); // NOI18N
        jLabel12.setText("Agendamento de Horário");
        jPanel2.add(jLabel12);
        jLabel12.setBounds(530, 40, 330, 34);

        jLabel14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/consultorio_dentista/Images/Black.png"))); // NOI18N
        jPanel2.add(jLabel14);
        jLabel14.setBounds(1070, 100, 280, 10);

        jButton3.setBackground(new java.awt.Color(153, 255, 255));
        jButton3.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jButton3.setText("Atualizar");
        jButton3.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 0, 12), new java.awt.Color(0, 0, 0))); // NOI18N
        jButton3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton3);
        jButton3.setBounds(890, 560, 160, 30);

        jButton4.setBackground(new java.awt.Color(153, 255, 255));
        jButton4.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jButton4.setText("Excluir");
        jButton4.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 0, 12), new java.awt.Color(0, 0, 0))); // NOI18N
        jButton4.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton4);
        jButton4.setBounds(1000, 610, 160, 30);

        jPanel3.setBackground(new java.awt.Color(132, 191, 214));
        jPanel3.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        jPanel3.setLayout(null);

        txtcliente.setEditable(false);
        txtcliente.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jPanel3.add(txtcliente);
        txtcliente.setBounds(150, 120, 240, 32);

        txtfuncionario.setEditable(false);
        txtfuncionario.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        txtfuncionario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtfuncionarioActionPerformed(evt);
            }
        });
        jPanel3.add(txtfuncionario);
        txtfuncionario.setBounds(150, 240, 240, 32);

        txtdata.setEditable(false);
        txtdata.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        txtdata.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtdataActionPerformed(evt);
            }
        });
        jPanel3.add(txtdata);
        txtdata.setBounds(150, 300, 240, 32);

        txthorario.setEditable(false);
        txthorario.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jPanel3.add(txthorario);
        txthorario.setBounds(150, 360, 240, 32);

        jLabel1.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel1.setText("Horário:");
        jPanel3.add(jLabel1);
        jLabel1.setBounds(20, 360, 90, 30);

        jLabel8.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel8.setText("Data:");
        jPanel3.add(jLabel8);
        jLabel8.setBounds(20, 300, 80, 30);

        jLabel7.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel7.setText("Funcionario:");
        jPanel3.add(jLabel7);
        jLabel7.setBounds(20, 240, 120, 30);

        jLabel6.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel6.setText("Cliente:");
        jPanel3.add(jLabel6);
        jLabel6.setBounds(20, 120, 80, 30);

        jLabel15.setFont(new java.awt.Font("Arial", 0, 26)); // NOI18N
        jLabel15.setText("Ficha de Agendamento");
        jPanel3.add(jLabel15);
        jLabel15.setBounds(80, 10, 280, 31);

        jLabel18.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel18.setText("ID Cliente:");
        jPanel3.add(jLabel18);
        jLabel18.setBounds(20, 60, 100, 30);

        jLabel19.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel19.setText("ID Funcionario:");
        jPanel3.add(jLabel19);
        jLabel19.setBounds(20, 180, 130, 30);

        txtidfuncionario.setEditable(false);
        txtidfuncionario.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jPanel3.add(txtidfuncionario);
        txtidfuncionario.setBounds(150, 180, 240, 32);

        txtidcliente.setEditable(false);
        txtidcliente.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jPanel3.add(txtidcliente);
        txtidcliente.setBounds(150, 60, 240, 32);

        jPanel2.add(jPanel3);
        jPanel3.setBounds(870, 120, 420, 420);

        jLabel20.setIcon(new javax.swing.ImageIcon(getClass().getResource("/consultorio_dentista/Images/Black.png"))); // NOI18N
        jPanel2.add(jLabel20);
        jLabel20.setBounds(790, 100, 280, 10);

        jTConsulta.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID Consulta", "ID Cliente", "Nome do Cliente", "ID Funcionario", "Nome do Funcionario", "Data", "Horario"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTConsulta.setRowHeight(30);
        jTConsulta.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTConsultaMouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(jTConsulta);

        jPanel2.add(jScrollPane3);
        jScrollPane3.setBounds(30, 700, 1270, 190);

        jLabel16.setFont(new java.awt.Font("Arial", 0, 26)); // NOI18N
        jLabel16.setText("Lista de Agendamentos:");
        jPanel2.add(jLabel16);
        jLabel16.setBounds(570, 660, 300, 31);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1350, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 1350, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 900, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 900, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jTfuncionariosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTfuncionariosMouseClicked
        // TODO add your handling code here:
        
        DefaultTableModel model = (DefaultTableModel) jTfuncionarios.getModel();
        int selectedIndex = jTfuncionarios.getSelectedRow();

        txtidfuncionario.setText(model.getValueAt(selectedIndex, 0).toString());
        txtfuncionario.setText(model.getValueAt(selectedIndex, 1).toString());
        
    }//GEN-LAST:event_jTfuncionariosMouseClicked

    private void jTclientesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTclientesMouseClicked
        // TODO add your handling code here:
        
        DefaultTableModel model = (DefaultTableModel) jTclientes.getModel();
        int selectedIndex = jTclientes.getSelectedRow();

        txtidcliente.setText(model.getValueAt(selectedIndex, 0).toString());
        txtcliente.setText(model.getValueAt(selectedIndex, 1).toString());
           
    }//GEN-LAST:event_jTclientesMouseClicked

    private void jDateChooser1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jDateChooser1MouseClicked

    }//GEN-LAST:event_jDateChooser1MouseClicked

    private void jDateChooser1PropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_jDateChooser1PropertyChange
        

        if ("date".equals(evt.getPropertyName())) {
            // Obtém a data selecionada no JDateChooser
            Date selectedDate = jDateChooser1.getDate();

            // Formata a data como uma string (você pode escolher o formato desejado)
            SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
            String formattedDate = dateFormat.format(selectedDate);

            // Define o texto do JTextField com a data formatada
            txtdata.setText(formattedDate);
        }
        
    }//GEN-LAST:event_jDateChooser1PropertyChange

    private void jComboBoxhorarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxhorarioActionPerformed
        // TODO add your handling code here:
        // Obtém o item selecionado no JComboBox
        
        Object selectedItem = jComboBoxhorario.getSelectedItem();

        // Verifica se o item selecionado não é nulo e é uma String
        if (selectedItem != null && selectedItem instanceof String) {
            // Define o texto do JTextField com o item selecionado
            txthorario.setText((String) selectedItem);

        }
        
    }//GEN-LAST:event_jComboBoxhorarioActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // Botão para voltar ao Menu
        Menu Telademenu = new Menu();
        Telademenu.setVisible(true); // Deixa a tela do menu visivel
        this.dispose(); // Fecha a tela atual
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // Botão de Cadastro
        
        String idcliente = txtidcliente.getText();
        String nome_cliente = txtcliente.getText();
        String idfuncionario = txtidfuncionario.getText();
        String nome_funcionario = txtfuncionario.getText();
        String data = txtdata.getText();
        String horario = (String) (jComboBoxhorario.getSelectedItem());
        

        try {
            Class.forName("com.mysql.cj.jdbc.Driver"); //Register the mysql driver
            con1 = DriverManager.getConnection("jdbc:mysql://localhost:3308/teste","root","887091");
            insert = con1.prepareStatement("insert into consulta (idCliente,Nome_Cliente,idFuncionario,Nome_Funcionario,Data,Horario)values(?,?,?,?,?,?)");
            insert.setString(1,idcliente);
            insert.setString(2,nome_cliente);
            insert.setString(3,idfuncionario);
            insert.setString(4,nome_funcionario);
            insert.setString(5,data);
            insert.setString(6,horario);
            insert.executeUpdate();
            JOptionPane.showMessageDialog(this, "Registro Feito Com Sucesso!");

            txtidcliente.setText("");
            txtcliente.setText("");
            txtidfuncionario.setText("");
            txtfuncionario.setText("");
            txtdata.setText("");
            jComboBoxhorario.setSelectedItem("8:00");
            txthorario.setText("");
            table_update();
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Cadastro_Cliente.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(Cadastro_Cliente.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // Botão de Atualizar
        
        DefaultTableModel model = (DefaultTableModel) jTConsulta.getModel();
        int selectedIndex = jTConsulta.getSelectedRow();
        if (jTConsulta.getSelectedRow() != -1){
            try {
            int idConsulta = Integer.parseInt(model.getValueAt(selectedIndex, 0).toString());
            String idcliente = txtidcliente.getText();
            String nome_cliente = txtcliente.getText();
            String idfuncionario = txtidfuncionario.getText();
            String nome_funcionario = txtfuncionario.getText();
            String data = txtdata.getText();
            String horario = (String) (jComboBoxhorario.getSelectedItem());
            
            Class.forName("com.mysql.cj.jdbc.Driver"); //Register the mysql driver
            con1 = DriverManager.getConnection("jdbc:mysql://localhost:3308/teste","root","887091");
            insert = con1.prepareStatement("update consulta set idCliente= ?,Nome_Cliente= ?,idFuncionario= ?, Nome_funcionario= ?, Data=?, Horario=? where idConsulta= ?");
            insert.setString(1,idcliente);
            insert.setString(2,nome_cliente);
            insert.setString(3,idfuncionario);
            insert.setString(4,nome_funcionario);
            insert.setString(5,data);
            insert.setString(6,horario);
            insert.setInt(7,idConsulta);
            insert.executeUpdate();
            JOptionPane.showMessageDialog(this, "Registro Atualizado Com Sucesso!");
            txtidcliente.setText("");
            txtcliente.setText("");
            txtidfuncionario.setText("");
            txtfuncionario.setText("");
            txtdata.setText("");
            jComboBoxhorario.setSelectedItem("8:00");
            txthorario.setText("");
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
        
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // Botão de Excluir
        
        DefaultTableModel model = (DefaultTableModel) jTConsulta.getModel();
        int selectedIndex = jTConsulta.getSelectedRow();
            
        if (jTConsulta.getSelectedRow() != -1){
        try {   
                
            int idConsulta = Integer.parseInt(model.getValueAt(selectedIndex, 0).toString());
            int dialogResult = JOptionPane.showConfirmDialog (null, "Você Realmente Quer Apagar Esse Registro?","AVISO",JOptionPane.YES_NO_OPTION);
            if(dialogResult == JOptionPane.YES_OPTION){
                Class.forName("com.mysql.cj.jdbc.Driver");
                con1 = DriverManager.getConnection("jdbc:mysql://localhost:3308/teste","root","887091");
                insert = con1.prepareStatement("delete from consulta where idConsulta = ?");
                insert.setInt(1,idConsulta);
                insert.executeUpdate();
                JOptionPane.showMessageDialog(this, "Registro Deletedo Com Êxito");
                txtidcliente.setText("");
                txtcliente.setText("");
                txtidfuncionario.setText("");
                txtfuncionario.setText("");
                txtdata.setText("");
                jComboBoxhorario.setSelectedItem("8:00");
                txthorario.setText("");
                table_update();
           
           }
        } catch (ClassNotFoundException | SQLException ex) {
        
        }
        }
        else{
            JOptionPane.showMessageDialog(null, "Selecione um cadastro para excluir!");
        }
        
    }//GEN-LAST:event_jButton4ActionPerformed

    private void txtfuncionarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtfuncionarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtfuncionarioActionPerformed

    private void txtdataActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtdataActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtdataActionPerformed

    private void jTConsultaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTConsultaMouseClicked
        // TODO add your handling code here:
        
        DefaultTableModel model = (DefaultTableModel) jTConsulta.getModel();
        int selectedIndex = jTConsulta.getSelectedRow();
      
        txtidcliente.setText(model.getValueAt(selectedIndex, 1).toString());
        txtcliente.setText(model.getValueAt(selectedIndex, 2).toString());
        txtidfuncionario.setText(model.getValueAt(selectedIndex, 3).toString());
        txtfuncionario.setText(model.getValueAt(selectedIndex, 4).toString());
        txtdata.setText(model.getValueAt(selectedIndex, 5).toString());
        txthorario.setText(model.getValueAt(selectedIndex, 6).toString());
        jComboBoxhorario.setSelectedItem(model.getValueAt(selectedIndex, 6).toString());
        
    }//GEN-LAST:event_jTConsultaMouseClicked

    private void jPanel2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel2MouseClicked
        // TODO add your handling code here:
        
        txtidcliente.setText("");
        txtcliente.setText("");
        txtidfuncionario.setText("");
        txtfuncionario.setText("");
        txtdata.setText("");
        jComboBoxhorario.setSelectedItem("8:00");
        txthorario.setText("");
        table_update();
        table_C_update();
        table_F_update();
        
    }//GEN-LAST:event_jPanel2MouseClicked

    
    Connection con1;
    PreparedStatement insert;
    
    private void table_C_update(){
        int CC;
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            con1 = DriverManager.getConnection("jdbc:mysql://localhost:3308/teste","root","887091");
            insert = con1.prepareStatement("SELECT * FROM cliente");
            ResultSet Rs = insert.executeQuery();
            
            ResultSetMetaData RSMD = Rs.getMetaData();
            CC = RSMD.getColumnCount();
            DefaultTableModel DFT = (DefaultTableModel) jTclientes.getModel();
             DFT.setRowCount(0);
            while (Rs.next()) {
                Vector v2 = new Vector();
           
                for (int ii = 1; ii <= CC; ii++) {
                    v2.add(Rs.getString("idCliente"));
                    v2.add(Rs.getString("Nome"));
                    v2.add(Rs.getString("RG"));
                    v2.add(Rs.getString("Telefone"));
                    v2.add(Rs.getString("Email"));
                    
                }
                DFT.addRow(v2);
            }
        } catch (Exception e) {
        }
    }
    
    
    private void table_F_update(){
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
                    v2.add(Rs.getString("Telefone"));
                    v2.add(Rs.getString("Cargo"));
                }
                DFT.addRow(v2);
            }
        } catch (Exception e) {
        }
    }
    
    private void table_update(){
        int CC;
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            con1 = DriverManager.getConnection("jdbc:mysql://localhost:3308/teste","root","887091");
            insert = con1.prepareStatement("SELECT * FROM consulta");
            ResultSet Rs = insert.executeQuery();
            
            ResultSetMetaData RSMD = Rs.getMetaData();
            CC = RSMD.getColumnCount();
            DefaultTableModel DFT = (DefaultTableModel) jTConsulta.getModel();
             DFT.setRowCount(0);
            while (Rs.next()) {
                Vector v2 = new Vector();
           
                for (int ii = 1; ii <= CC; ii++) {
                    v2.add(Rs.getString("idConsulta"));
                    v2.add(Rs.getString("idCliente"));
                    v2.add(Rs.getString("Nome_Cliente"));
                    v2.add(Rs.getString("idFuncionario"));
                    v2.add(Rs.getString("Nome_Funcionario"));
                    v2.add(Rs.getString("Data"));
                    v2.add(Rs.getString("Horario"));
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
            java.util.logging.Logger.getLogger(Cadastro_Horario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Cadastro_Horario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Cadastro_Horario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Cadastro_Horario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Cadastro_Horario().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    javax.swing.JButton jButton1;
    javax.swing.JButton jButton2;
    javax.swing.JButton jButton3;
    javax.swing.JButton jButton4;
    javax.swing.JComboBox<String> jComboBoxhorario;
    com.toedter.calendar.JDateChooser jDateChooser1;
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
    javax.swing.JLabel jLabel3;
    javax.swing.JLabel jLabel4;
    javax.swing.JLabel jLabel5;
    javax.swing.JLabel jLabel6;
    javax.swing.JLabel jLabel7;
    javax.swing.JLabel jLabel8;
    javax.swing.JLabel jLabel9;
    javax.swing.JPanel jPanel1;
    javax.swing.JPanel jPanel2;
    javax.swing.JPanel jPanel3;
    javax.swing.JScrollPane jScrollPane1;
    javax.swing.JScrollPane jScrollPane2;
    javax.swing.JScrollPane jScrollPane3;
    javax.swing.JTable jTConsulta;
    javax.swing.JTable jTclientes;
    javax.swing.JTable jTfuncionarios;
    javax.swing.JTextField txtcliente;
    javax.swing.JTextField txtdata;
    javax.swing.JTextField txtfuncionario;
    javax.swing.JTextField txthorario;
    javax.swing.JTextField txtidcliente;
    javax.swing.JTextField txtidfuncionario;
    // End of variables declaration//GEN-END:variables
}
