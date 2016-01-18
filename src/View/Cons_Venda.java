/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;
import Classes.ButtonColumnSeeMore;
import Classes.ValidadorCPF;
import Controller.ControlVenda;
import Model.Venda;
import java.sql.SQLException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumnModel;

/**
 *
 * @author cesar.nascimento
 * 
 */
public class Cons_Venda extends javax.swing.JFrame {
    /**
     * Creates new form Cons_Venda
     */
    public Cons_Venda() {
        initComponents();
        TableColumnModel t = jTableVenda.getColumnModel();
        t.getColumn(2).setCellRenderer(Classes.FormatRenderer.getDateTimeRenderer());
        ButtonColumnSeeMore bc = new ButtonColumnSeeMore(jTableVenda, 4);
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabeID = new javax.swing.JLabel();
        jTextID = new javax.swing.JTextField();
        jRadioButtonCPF = new javax.swing.JRadioButton();
        jRadioButtonID = new javax.swing.JRadioButton();
        jLabelCPF = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableVenda = new javax.swing.JTable();
        jLabelSelecione = new javax.swing.JLabel();
        jTextCPF = new javax.swing.JTextField();
        jButtonConsultar = new javax.swing.JButton();
        jLabelData = new javax.swing.JLabel();
        jRadioButtonData = new javax.swing.JRadioButton();
        jButtonCancelar = new javax.swing.JButton();
        jTextData = new javax.swing.JFormattedTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Consulta de Vendas");
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jLabeID.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabeID.setText("ID - Vendedor:");

        jTextID.setName(""); // NOI18N

        jRadioButtonCPF.setText("CPF");
        jRadioButtonCPF.setToolTipText("");
        jRadioButtonCPF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButtonCPFActionPerformed(evt);
            }
        });

        jRadioButtonID.setText("ID");
        jRadioButtonID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButtonIDActionPerformed(evt);
            }
        });

        jLabelCPF.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabelCPF.setText("CPF - Cliente:");

        jTableVenda.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID - Vendedor", "ID - Cliente", "Data da Venda", "Total - R$", "Ver Mais"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Double.class, java.lang.Object.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, true
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTableVenda.setRowHeight(24);
        jScrollPane1.setViewportView(jTableVenda);

        jLabelSelecione.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabelSelecione.setText("Selecione: ");

        jTextCPF.setName(""); // NOI18N

        jButtonConsultar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/find.png"))); // NOI18N
        jButtonConsultar.setText("Consultar");
        jButtonConsultar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jButtonConsultarMousePressed(evt);
            }
        });

        jLabelData.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabelData.setText("Data da Venda:");

        jRadioButtonData.setText("Data");
        jRadioButtonData.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButtonDataActionPerformed(evt);
            }
        });

        jButtonCancelar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/cancel.png"))); // NOI18N
        jButtonCancelar.setText("Cancelar");
        jButtonCancelar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jButtonCancelarMousePressed(evt);
            }
        });

        try {
            jTextData.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##/##/####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(62, 62, 62)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButtonConsultar)
                        .addGap(18, 18, 18)
                        .addComponent(jButtonCancelar))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jLabelCPF)
                                .addComponent(jLabelSelecione))
                            .addGap(18, 18, 18)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jRadioButtonCPF)
                                    .addGap(18, 18, 18)
                                    .addComponent(jRadioButtonID)
                                    .addGap(18, 18, 18)
                                    .addComponent(jRadioButtonData))
                                .addComponent(jTextCPF, javax.swing.GroupLayout.PREFERRED_SIZE, 278, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(jLabeID)
                            .addGap(18, 18, 18)
                            .addComponent(jTextID, javax.swing.GroupLayout.PREFERRED_SIZE, 278, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(jLabelData)
                            .addGap(18, 18, 18)
                            .addComponent(jTextData, javax.swing.GroupLayout.PREFERRED_SIZE, 278, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(59, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelSelecione)
                    .addComponent(jRadioButtonCPF)
                    .addComponent(jRadioButtonID)
                    .addComponent(jRadioButtonData))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelCPF)
                    .addComponent(jTextCPF, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabeID)
                    .addComponent(jTextID, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelData)
                    .addComponent(jTextData, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(36, 36, 36)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonConsultar)
                    .addComponent(jButtonCancelar))
                .addGap(30, 30, 30)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(43, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jRadioButtonCPFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButtonCPFActionPerformed
        DefaultTableModel model = (DefaultTableModel) jTableVenda.getModel();
        model.setNumRows(0);
        jTextID.setText("");
        jTextData.setText(null);
        if(jRadioButtonCPF.isSelected()==true){
            jRadioButtonID.setSelected(false);
            jRadioButtonData.setSelected(false);
            jTextCPF.setEnabled(true);
            jTextID.setEnabled(false);
            jTextData.setEnabled(false);
        }else{
            jTextID.setEnabled(true);
            jTextData.setEnabled(true);
        }
    }//GEN-LAST:event_jRadioButtonCPFActionPerformed

    private void jRadioButtonIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButtonIDActionPerformed
        DefaultTableModel model = (DefaultTableModel) jTableVenda.getModel();
        model.setNumRows(0);
        jTextCPF.setText("");
        jTextData.setText(null);
        if(jRadioButtonID.isSelected()==true){
            jRadioButtonCPF.setSelected(false);
            jRadioButtonData.setSelected(false);
            jTextID.setEnabled(true);
            jTextCPF.setEnabled(false);
            jTextData.setEnabled(false);
        }else{
            jTextCPF.setEnabled(true);
            jTextData.setEnabled(true);
        }
    }//GEN-LAST:event_jRadioButtonIDActionPerformed

    private void jRadioButtonDataActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButtonDataActionPerformed
        DefaultTableModel model = (DefaultTableModel) jTableVenda.getModel();
        model.setNumRows(0);
        jTextCPF.setText("");
        jTextID.setText("");
        if(jRadioButtonData.isSelected()==true){
            jRadioButtonCPF.setSelected(false);
            jRadioButtonID.setSelected(false);
            jTextData.setEnabled(true);
            jTextCPF.setEnabled(false);
            jTextID.setEnabled(false);
        }else{
            jTextCPF.setEnabled(true);
            jTextID.setEnabled(true);
        }
    }//GEN-LAST:event_jRadioButtonDataActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        jRadioButtonCPF.setSelected(true);
        jTextID.setEnabled(false);
        jTextData.setEnabled(false);
    }//GEN-LAST:event_formWindowOpened

    private void jButtonCancelarMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonCancelarMousePressed
        this.dispose();
    }//GEN-LAST:event_jButtonCancelarMousePressed

    private void jButtonConsultarMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonConsultarMousePressed
        DefaultTableModel model = (DefaultTableModel) jTableVenda.getModel();
        List<Venda> vendas = new ArrayList<>();
        ControlVenda cv = new ControlVenda();
        int passa = 0;
        if(jRadioButtonCPF.isSelected()==true && jTextCPF.getText().isEmpty()){
            JOptionPane.showMessageDialog(this,"Campo CPF em branco, por favor, preencha e pesquise novamente.", "Alerta", JOptionPane.WARNING_MESSAGE);
            jTextCPF.requestFocus();
            passa=1;
        }else if(passa==0 && jRadioButtonCPF.isSelected()==true){
            if(ValidadorCPF.TestaCPF(jTextCPF.getText())==true){
                try{
                    vendas = cv.consultarVenda(Long.parseLong(jTextCPF.getText()));
                }catch(SQLException e){
                    passa=1;
                    JOptionPane.showMessageDialog(this, e.getMessage(), "Erro", JOptionPane.ERROR_MESSAGE);
                }
            }else{
               JOptionPane.showMessageDialog(this,"CPF inválido, por favor, digite um CPF válido e pesquise novamente.", "Alerta", JOptionPane.WARNING_MESSAGE); 
               passa=1;
               jTextCPF.setText("");
               jTextCPF.requestFocus();
            }
        }
        
        if(jRadioButtonID.isSelected()==true && jTextID.getText().isEmpty()){
            JOptionPane.showMessageDialog(this,"Campo ID-Vendedor em branco, por favor, preencha e pesquise novamente.", "Alerta", JOptionPane.WARNING_MESSAGE);
            passa=1;
        }else if(passa==0 && jRadioButtonID.isSelected()==true){
            try {
                vendas = cv.consultarVenda(Integer.parseInt(jTextID.getText()));
            } catch(SQLException e) {
                passa=1;
                JOptionPane.showMessageDialog(this, e.getMessage(), "Erro", JOptionPane.ERROR_MESSAGE);
            }catch(NumberFormatException e){
                passa=1;
                JOptionPane.showMessageDialog(this, "Campo ID-Vendedor é numérico, por favor, verifique e pesquise novamente", "Alerta", JOptionPane.WARNING_MESSAGE);
                jTextID.setText("");
                jTextID.requestFocus();
            }
        }
        
        if(jRadioButtonData.isSelected()==true && jTextData.getText().equals("  /  /    ")){
            passa=1;
            JOptionPane.showMessageDialog(this,"Campo Data em branco, por favor, preencha e pesquise novamente.", "Alerta", JOptionPane.WARNING_MESSAGE);
        }else if(jRadioButtonData.isSelected()==true && jTextData.getText().contains(" ")){
            passa=1;
            JOptionPane.showMessageDialog(this,"Digite uma data válida e pesquise novamente.", "Alerta", JOptionPane.WARNING_MESSAGE);
        }else if(passa==0 && jRadioButtonData.isSelected()==true){
            try {
                SimpleDateFormat format = new SimpleDateFormat("dd/MM/yyyy");  
                java.sql.Date data = new java.sql.Date(format.parse(jTextData.getText()).getTime());  
                vendas = cv.consultarVenda(data);
            } catch(SQLException e) {
                passa=1;
                JOptionPane.showMessageDialog(this, e.getMessage(), "Erro", JOptionPane.ERROR_MESSAGE);
            } catch (ParseException ex) {
                passa=1;
                Logger.getLogger(Cons_Venda.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        
        if(passa==0 && vendas.isEmpty()){
            JOptionPane.showMessageDialog(this, "A pesquisa não retornou dados, tente novamente.", "Alerta", JOptionPane.WARNING_MESSAGE);
        }else{
            Object vec[] = new Object[4];
            String cpf;
            for(Venda vi : vendas){
                cpf = Long.toString(vi.getCpfCliente());
                if(cpf.length()!=11 && !cpf.equals("0")){
                    while(cpf.length()!=11){
                        cpf = "0"+cpf;
                    }
                }else{
                    cpf="";
                }
                vec[0] = vi.getIdVendedor();
                vec[1] = cpf;
                SimpleDateFormat si = new SimpleDateFormat("dd/MM/yyyy");
                vec[2] = si.format(vi.getDataVenda().getTime());
                vec[3] = vi.getValorTotal();
                model.addRow(vec);
            }
        }
    }//GEN-LAST:event_jButtonConsultarMousePressed

    /**
     * @param args the command line arguments
     */
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonCancelar;
    private javax.swing.JButton jButtonConsultar;
    private javax.swing.JLabel jLabeID;
    private javax.swing.JLabel jLabelCPF;
    private javax.swing.JLabel jLabelData;
    private javax.swing.JLabel jLabelSelecione;
    private javax.swing.JRadioButton jRadioButtonCPF;
    private javax.swing.JRadioButton jRadioButtonData;
    private javax.swing.JRadioButton jRadioButtonID;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTableVenda;
    private javax.swing.JTextField jTextCPF;
    private javax.swing.JFormattedTextField jTextData;
    private javax.swing.JTextField jTextID;
    // End of variables declaration//GEN-END:variables
}