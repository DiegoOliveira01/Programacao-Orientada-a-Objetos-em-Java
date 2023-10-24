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


/**
 *
 * @author diego
 */
public class Cadastro_Cliente extends javax.swing.JFrame {

    /**
     * Creates new form Cadastro
     */
    
    
    
    
    
    public Cadastro_Cliente() {
        initComponents();
        table_update();
        
        // Codigo para ativar a ordenação da Jtable
        DefaultTableModel modelo = (DefaultTableModel) jTclientes.getModel();
        jTclientes.setRowSorter(new TableRowSorter(modelo));
        
        jTclientes.getTableHeader().setFont(new Font("Segoe UI", Font.BOLD, 14));
        jTclientes.getTableHeader().setOpaque(false);
        jTclientes.getTableHeader().setBackground(new Color (132,191,214));
        jTclientes.getTableHeader().setForeground(new Color (5, 5, 5));
        
        
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
        jButton1 = new javax.swing.JButton();
        txtnome = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtrg = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        txtendereco = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTclientes = new javax.swing.JTable();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jLabel14 = new javax.swing.JLabel();
        txtobs = new javax.swing.JTextField();
        txttelefone = new javax.swing.JTextField();
        txtemail = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        txtemergencia = new javax.swing.JTextField();
        jLabel24 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jComboBoxgenero = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Cadastro De Cliente");
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(132, 191, 214));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 0, 12), new java.awt.Color(0, 0, 204))); // NOI18N
        jPanel1.setPreferredSize(new java.awt.Dimension(760, 820));
        jPanel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel1MouseClicked(evt);
            }
        });
        jPanel1.setLayout(null);

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
        jButton1.setBounds(30, 30, 170, 27);

        txtnome.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        txtnome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtnomeActionPerformed(evt);
            }
        });
        jPanel1.add(txtnome);
        txtnome.setBounds(350, 130, 280, 32);

        jLabel1.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel1.setText("Gênero: ");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(660, 310, 70, 30);

        jLabel2.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel2.setText("RG:");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(130, 190, 32, 30);

        txtrg.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        txtrg.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtrgActionPerformed(evt);
            }
        });
        jPanel1.add(txtrg);
        txtrg.setBounds(350, 190, 280, 32);

        jLabel5.setFont(new java.awt.Font("Book Antiqua", 0, 28)); // NOI18N
        jLabel5.setText("Clientes Cadastrados");
        jPanel1.add(jLabel5);
        jLabel5.setBounds(510, 430, 280, 34);

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
        jButton2.setBounds(1100, 390, 160, 30);

        txtendereco.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        txtendereco.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtenderecoActionPerformed(evt);
            }
        });
        jPanel1.add(txtendereco);
        txtendereco.setBounds(350, 250, 280, 32);

        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/consultorio_dentista/Images/_82034fd4-4d25-4fd5-9910-ca4e1a14046d-removebg-preview.png"))); // NOI18N
        jPanel1.add(jLabel10);
        jLabel10.setBounds(1180, -10, 119, 109);

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/consultorio_dentista/Images/Black.png"))); // NOI18N
        jPanel1.add(jLabel9);
        jLabel9.setBounds(540, 90, 260, 10);

        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/consultorio_dentista/Images/Black.png"))); // NOI18N
        jPanel1.add(jLabel11);
        jLabel11.setBounds(0, 90, 260, 10);

        jLabel12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/consultorio_dentista/Images/Black.png"))); // NOI18N
        jPanel1.add(jLabel12);
        jLabel12.setBounds(500, 90, 260, 10);

        jLabel13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/consultorio_dentista/Images/Black.png"))); // NOI18N
        jPanel1.add(jLabel13);
        jLabel13.setBounds(0, 90, 260, 10);

        jTclientes.setBorder(javax.swing.BorderFactory.createCompoundBorder());
        jTclientes.setForeground(new java.awt.Color(0, 0, 0));
        jTclientes.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID Cliente", "Nome Completo", "RG", "Endereço", "Telefone", "Email", "Observações", "Contato De Emergencia", "Gênero"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTclientes.setOpaque(false);
        jTclientes.setRowHeight(30);
        jTclientes.setSelectionBackground(new java.awt.Color(0, 85, 255));
        jTclientes.getTableHeader().setReorderingAllowed(false);
        jTclientes.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                jTclientesFocusLost(evt);
            }
        });
        jTclientes.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTclientesMouseClicked(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jTclientesMouseReleased(evt);
            }
        });
        jScrollPane1.setViewportView(jTclientes);

        jPanel1.add(jScrollPane1);
        jScrollPane1.setBounds(10, 530, 1280, 406);

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
        jButton3.setBounds(30, 380, 160, 30);

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
        jButton4.setBounds(900, 390, 160, 30);

        jLabel14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/consultorio_dentista/Images/Black.png"))); // NOI18N
        jPanel1.add(jLabel14);
        jLabel14.setBounds(1020, 90, 260, 10);

        txtobs.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        txtobs.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtobsActionPerformed(evt);
            }
        });
        jPanel1.add(txtobs);
        txtobs.setBounds(850, 250, 280, 32);

        txttelefone.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        txttelefone.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txttelefoneActionPerformed(evt);
            }
        });
        jPanel1.add(txttelefone);
        txttelefone.setBounds(850, 130, 280, 32);

        txtemail.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        txtemail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtemailActionPerformed(evt);
            }
        });
        jPanel1.add(txtemail);
        txtemail.setBounds(850, 190, 280, 32);

        jLabel4.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel4.setText("Nome Completo:");
        jPanel1.add(jLabel4);
        jLabel4.setBounds(130, 130, 133, 30);

        jLabel6.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel6.setText("Telefone:");
        jPanel1.add(jLabel6);
        jLabel6.setBounds(660, 130, 76, 30);

        jLabel7.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel7.setText("Email:");
        jPanel1.add(jLabel7);
        jLabel7.setBounds(660, 190, 49, 30);

        jLabel15.setIcon(new javax.swing.ImageIcon(getClass().getResource("/consultorio_dentista/Images/Black.png"))); // NOI18N
        jPanel1.add(jLabel15);
        jLabel15.setBounds(1040, 90, 260, 10);

        jLabel8.setFont(new java.awt.Font("Book Antiqua", 0, 28)); // NOI18N
        jLabel8.setText("Cadastro De Cliente");
        jPanel1.add(jLabel8);
        jLabel8.setBounds(510, 30, 250, 34);

        jLabel16.setIcon(new javax.swing.ImageIcon(getClass().getResource("/consultorio_dentista/Images/Black.png"))); // NOI18N
        jPanel1.add(jLabel16);
        jLabel16.setBounds(260, 90, 260, 10);

        jLabel17.setIcon(new javax.swing.ImageIcon(getClass().getResource("/consultorio_dentista/Images/Black.png"))); // NOI18N
        jPanel1.add(jLabel17);
        jLabel17.setBounds(0, 490, 260, 10);

        jLabel18.setIcon(new javax.swing.ImageIcon(getClass().getResource("/consultorio_dentista/Images/Black.png"))); // NOI18N
        jPanel1.add(jLabel18);
        jLabel18.setBounds(260, 490, 260, 10);

        jLabel19.setIcon(new javax.swing.ImageIcon(getClass().getResource("/consultorio_dentista/Images/Black.png"))); // NOI18N
        jPanel1.add(jLabel19);
        jLabel19.setBounds(510, 490, 260, 10);

        jLabel20.setIcon(new javax.swing.ImageIcon(getClass().getResource("/consultorio_dentista/Images/Black.png"))); // NOI18N
        jPanel1.add(jLabel20);
        jLabel20.setBounds(1040, 490, 260, 10);

        jLabel21.setIcon(new javax.swing.ImageIcon(getClass().getResource("/consultorio_dentista/Images/Black.png"))); // NOI18N
        jPanel1.add(jLabel21);
        jLabel21.setBounds(840, 490, 260, 10);

        jLabel22.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel22.setText("Endereço:");
        jPanel1.add(jLabel22);
        jLabel22.setBounds(130, 250, 100, 30);

        jLabel23.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel23.setText("Contato De Emergencia:");
        jPanel1.add(jLabel23);
        jLabel23.setBounds(130, 310, 220, 30);

        txtemergencia.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        txtemergencia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtemergenciaActionPerformed(evt);
            }
        });
        jPanel1.add(txtemergencia);
        txtemergencia.setBounds(350, 310, 280, 32);

        jLabel24.setIcon(new javax.swing.ImageIcon(getClass().getResource("/consultorio_dentista/Images/Black.png"))); // NOI18N
        jPanel1.add(jLabel24);
        jLabel24.setBounds(800, 90, 260, 10);

        jLabel25.setIcon(new javax.swing.ImageIcon(getClass().getResource("/consultorio_dentista/Images/Black.png"))); // NOI18N
        jPanel1.add(jLabel25);
        jLabel25.setBounds(800, 90, 260, 10);

        jLabel26.setIcon(new javax.swing.ImageIcon(getClass().getResource("/consultorio_dentista/Images/Black.png"))); // NOI18N
        jPanel1.add(jLabel26);
        jLabel26.setBounds(770, 490, 260, 10);

        jLabel3.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel3.setText("Observações:");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(660, 250, 111, 30);

        jComboBoxgenero.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jComboBoxgenero.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Masculino", "Feminino", "Não-Binario", "Outro", "Prefiro Não Dizer" }));
        jPanel1.add(jComboBoxgenero);
        jComboBoxgenero.setBounds(850, 310, 280, 30);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 1300, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 950, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    /*
    UserModel newUser = new UserModel();
    newUser.setName(nomeTextField.getText());
    newUser.setEmail(emailTextField.getText());
    userList.add(newUser);
    */
    
    
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // Botão para voltar ao Menu
        Menu Telademenu = new Menu();
        Telademenu.setVisible(true); // Deixa a tela do menu visivel
        this.dispose(); // Fecha a tela atual
    }//GEN-LAST:event_jButton1ActionPerformed

    private void txtnomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtnomeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtnomeActionPerformed

    Connection con1;
    PreparedStatement insert;
    
    private void table_update(){
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
                    v2.add(Rs.getString("Endereco"));
                    v2.add(Rs.getString("Telefone"));
                    v2.add(Rs.getString("Email"));
                    v2.add(Rs.getString("Observacoes"));
                    v2.add(Rs.getString("Emergencia"));
                    v2.add(Rs.getString("Genero"));
                }
                DFT.addRow(v2);
            }
        } catch (Exception e) {
        }
    }
    
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
        String observacoes = txtobs.getText();
        String emergencia = txtemergencia.getText();
        String genero = (String) (jComboBoxgenero.getSelectedItem());
        
        try {
          Class.forName("com.mysql.cj.jdbc.Driver"); //Register the mysql driver
          con1 = DriverManager.getConnection("jdbc:mysql://localhost:3308/teste","root","887091");
          insert = con1.prepareStatement("insert into cliente (Nome,RG,Endereco,Telefone,Email,Observacoes,Emergencia,Genero)values(?,?,?,?,?,?,?,?)");
          insert.setString(1,nome);
          insert.setString(2,rg);
          insert.setString(3,endereco);
          insert.setString(4,telefone);
          insert.setString(5,email);
          insert.setString(6,observacoes);
          insert.setString(7, emergencia);
          insert.setString(8, genero);
          insert.executeUpdate();
          JOptionPane.showMessageDialog(this, "Registro Feito Com Sucesso!");
          
          
          txtnome.setText("");
          txtrg.setText("");
          txtendereco.setText("");
          txttelefone.setText("");
          txtemail.setText("");
          txtobs.setText("");
          txtemergencia.setText("");
          jComboBoxgenero.setSelectedItem("Masculino");
          table_update();
        } catch (ClassNotFoundException ex) {
          Logger.getLogger(Cadastro_Cliente.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
          Logger.getLogger(Cadastro_Cliente.class.getName()).log(Level.SEVERE, null, ex);
        }      
    }//GEN-LAST:event_jButton2ActionPerformed

    private void txtrgActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtrgActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtrgActionPerformed

    private void txtenderecoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtenderecoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtenderecoActionPerformed

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
        
        DefaultTableModel model = (DefaultTableModel) jTclientes.getModel();
        int selectedIndex = jTclientes.getSelectedRow();
            
        if (jTclientes.getSelectedRow() != -1){
        try {   
                
            int idCliente = Integer.parseInt(model.getValueAt(selectedIndex, 0).toString());
            int dialogResult = JOptionPane.showConfirmDialog (null, "Você Realmente Quer Apagar Esse Registro?","AVISO",JOptionPane.YES_NO_OPTION);
            if(dialogResult == JOptionPane.YES_OPTION){
                Class.forName("com.mysql.cj.jdbc.Driver");
                con1 = DriverManager.getConnection("jdbc:mysql://localhost:3308/teste","root","887091");
                insert = con1.prepareStatement("delete from cliente where idCliente = ?");
                insert.setInt(1,idCliente);
                insert.executeUpdate();
                JOptionPane.showMessageDialog(this, "Registro Deletedo Com Êxito");
                txtnome.setText("");
                txtrg.setText("");
                txtendereco.setText("");
                txttelefone.setText("");
                txtemail.setText("");
                txtobs.setText("");
                txtemergencia.setText("");
                jComboBoxgenero.setSelectedItem("Masculino");
                table_update();
           
           }
        } catch (ClassNotFoundException | SQLException ex) {
        
        }
        }
        else{
            JOptionPane.showMessageDialog(null, "Selecione um cadastro para excluir!");
        }
        
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // Botão de Atualizar
      /*if (jTclientes.getSelectedRow() != -1) {
            jTclientes.setValueAt(txtnome.getText(), jTclientes.getSelectedRow(), 0);
            jTclientes.setValueAt(txtrg.getText(), jTclientes.getSelectedRow(), 1);
            jTclientes.setValueAt(txtendereco.getText(), jTclientes.getSelectedRow(), 2);
        } */
        DefaultTableModel model = (DefaultTableModel) jTclientes.getModel();
        int selectedIndex = jTclientes.getSelectedRow();
        if (jTclientes.getSelectedRow() != -1){
            try {
            int idCliente = Integer.parseInt(model.getValueAt(selectedIndex, 0).toString());
            String nome = txtnome.getText();
            String rg = txtrg.getText();
            String endereco = txtendereco.getText();
            String telefone = txttelefone.getText();
            String email = txtemail.getText();
            String observacoes = txtobs.getText();
            String emergencia = txtemergencia.getText();
            String genero = (String) (jComboBoxgenero.getSelectedItem());
            
            Class.forName("com.mysql.cj.jdbc.Driver");
            con1 = DriverManager.getConnection("jdbc:mysql://localhost:3308/teste","root","887091");
            insert = con1.prepareStatement("update cliente set Nome= ?,RG= ?,Endereco= ?, Telefone= ?, Email=?, Observacoes=?, Emergencia=?, Genero=? where idCliente= ?");
            insert.setString(1,nome);
            insert.setString(2,rg);
            insert.setString(3,endereco);
            insert.setString(4,telefone);
            insert.setString(5,email);
            insert.setString(6,observacoes);
            insert.setString(7,emergencia);
            insert.setString(8,genero);
            insert.setInt(9,idCliente);
            insert.executeUpdate();
            JOptionPane.showMessageDialog(this, "Registro Atualizado Com Sucesso!");
            txtnome.setText("");
            txtrg.setText("");
            txtendereco.setText("");
            txttelefone.setText("");
            txtemail.setText("");
            txtobs.setText("");
            txtemergencia.setText("");
            jComboBoxgenero.setSelectedItem("Masculino");
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

    private void jTclientesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTclientesMouseClicked
        DefaultTableModel model = (DefaultTableModel) jTclientes.getModel();
        int selectedIndex = jTclientes.getSelectedRow();
      
        txtnome.setText(model.getValueAt(selectedIndex, 1).toString());
        txtrg.setText(model.getValueAt(selectedIndex, 2).toString());
        txtendereco.setText(model.getValueAt(selectedIndex, 3).toString());
        txttelefone.setText(model.getValueAt(selectedIndex, 4).toString());
        txtemail.setText(model.getValueAt(selectedIndex, 5).toString());
        txtobs.setText(model.getValueAt(selectedIndex, 6).toString());
        txtemergencia.setText(model.getValueAt(selectedIndex, 7).toString());
        jComboBoxgenero.setSelectedItem(model.getValueAt(selectedIndex, 8).toString());
    }//GEN-LAST:event_jTclientesMouseClicked

    private void jTclientesMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTclientesMouseReleased
        /*if(jTclientes.getSelectedRow() != -1) {
           txtnome.setText(jTclientes.getValueAt(jTclientes.getSelectedRow(), 0).toString());
           txtrg.setText(jTclientes.getValueAt(jTclientes.getSelectedRow(), 1).toString());
           txtendereco.setText(jTclientes.getValueAt(jTclientes.getSelectedRow(), 2).toString());
        } */
    }//GEN-LAST:event_jTclientesMouseReleased

    private void jTclientesFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTclientesFocusLost
        // TODO add your handling code here:
    }//GEN-LAST:event_jTclientesFocusLost

    private void jPanel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel1MouseClicked
        // Codigo Para Deselecionar Linhas Do Jtable
        txtnome.setText("");
        txtrg.setText("");
        txtendereco.setText("");
        txttelefone.setText("");
        txtemail.setText("");
        txtobs.setText("");
        txtemergencia.setText("");
        jComboBoxgenero.setSelectedItem("Masculino");
        table_update();
    }//GEN-LAST:event_jPanel1MouseClicked

    private void txtobsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtobsActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtobsActionPerformed

    private void txttelefoneActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txttelefoneActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txttelefoneActionPerformed

    private void txtemailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtemailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtemailActionPerformed

    private void txtemergenciaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtemergenciaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtemergenciaActionPerformed

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
            java.util.logging.Logger.getLogger(Cadastro_Cliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Cadastro_Cliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Cadastro_Cliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Cadastro_Cliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Cadastro_Cliente().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    javax.swing.JButton jButton1;
    javax.swing.JButton jButton2;
    javax.swing.JButton jButton3;
    javax.swing.JButton jButton4;
    javax.swing.JComboBox<String> jComboBoxgenero;
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
    javax.swing.JLabel jLabel24;
    javax.swing.JLabel jLabel25;
    javax.swing.JLabel jLabel26;
    javax.swing.JLabel jLabel3;
    javax.swing.JLabel jLabel4;
    javax.swing.JLabel jLabel5;
    javax.swing.JLabel jLabel6;
    javax.swing.JLabel jLabel7;
    javax.swing.JLabel jLabel8;
    javax.swing.JLabel jLabel9;
    javax.swing.JPanel jPanel1;
    javax.swing.JScrollPane jScrollPane1;
    javax.swing.JTable jTclientes;
    javax.swing.JTextField txtemail;
    javax.swing.JTextField txtemergencia;
    javax.swing.JTextField txtendereco;
    javax.swing.JTextField txtnome;
    javax.swing.JTextField txtobs;
    javax.swing.JTextField txtrg;
    javax.swing.JTextField txttelefone;
    // End of variables declaration//GEN-END:variables
}
