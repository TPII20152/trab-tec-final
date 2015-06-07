/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interface;
import Dao.ProdutoDao;
import ModuloDeProdutos.Produto;
import java.awt.Color;
import java.awt.Component;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
/**
 *
 * @author cesar.nascimento
 */
public class Cad_Produ extends javax.swing.JInternalFrame {

    /**
     * Creates new form Cad_Produ_Teste
     */
    public Cad_Produ() {
        initComponents();
        setClosable(true);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButtonCancelar = new javax.swing.JButton();
        jButtonLimpar = new javax.swing.JButton();
        jLabelNome = new javax.swing.JLabel();
        jButtonCadastrar = new javax.swing.JButton();
        jTextNome = new javax.swing.JTextField();
        jTextID = new javax.swing.JTextField();
        jTextQuantidade = new javax.swing.JTextField();
        jLabelID = new javax.swing.JLabel();
        jLabelQuantidade = new javax.swing.JLabel();
        jLabelPreco = new javax.swing.JLabel();
        jTextPreco = new javax.swing.JTextField();
        jLabelDescricao = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextDescricao = new javax.swing.JTextArea();

        setTitle("Cadastro de Produto");

        jButtonCancelar.setText("Cancelar");
        jButtonCancelar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jButtonCancelarMousePressed(evt);
            }
        });

        jButtonLimpar.setText("Limpar Campos");
        jButtonLimpar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jButtonLimparMousePressed(evt);
            }
        });

        jLabelNome.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabelNome.setText("Nome:");

        jButtonCadastrar.setText("Cadastrar");
        jButtonCadastrar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jButtonCadastrarMousePressed(evt);
            }
        });

        jTextNome.setName(""); // NOI18N

        jTextID.setName(""); // NOI18N
        jTextID.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                jTextIDFocusLost(evt);
            }
        });

        jTextQuantidade.setName(""); // NOI18N
        jTextQuantidade.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                jTextQuantidadeFocusLost(evt);
            }
        });

        jLabelID.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabelID.setText("ID - Produto:");

        jLabelQuantidade.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabelQuantidade.setText("Quantidade: ");

        jLabelPreco.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabelPreco.setText("Preço(uni/kg): ");

        jTextPreco.setName(""); // NOI18N
        jTextPreco.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                jTextPrecoFocusLost(evt);
            }
        });

        jLabelDescricao.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabelDescricao.setText("Descrição: ");

        jTextDescricao.setColumns(20);
        jTextDescricao.setRows(5);
        jScrollPane1.setViewportView(jTextDescricao);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(92, 92, 92)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabelID)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jTextID, javax.swing.GroupLayout.PREFERRED_SIZE, 278, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jTextNome, javax.swing.GroupLayout.PREFERRED_SIZE, 278, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabelNome)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabelPreco)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTextPreco, javax.swing.GroupLayout.PREFERRED_SIZE, 279, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabelQuantidade)
                                .addGap(18, 18, 18)
                                .addComponent(jTextQuantidade, javax.swing.GroupLayout.PREFERRED_SIZE, 278, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(jLabelDescricao)
                            .addGap(28, 28, 28)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 279, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                            .addComponent(jButtonCadastrar)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(jButtonLimpar, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(jButtonCancelar))))
                .addContainerGap(92, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextID, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelID))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelNome)
                    .addComponent(jTextNome, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelQuantidade)
                    .addComponent(jTextQuantidade, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelPreco)
                    .addComponent(jTextPreco, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabelDescricao)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonCadastrar, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonLimpar, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(76, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonCancelarMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonCancelarMousePressed
        this.dispose();
    }//GEN-LAST:event_jButtonCancelarMousePressed

    private void jButtonLimparMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonLimparMousePressed
        jTextNome.setText("");
        jTextPreco.setText("");
        jTextQuantidade.setText("");
        jTextDescricao.setText("");
    }//GEN-LAST:event_jButtonLimparMousePressed

    private void jButtonCadastrarMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonCadastrarMousePressed
        int erro = 0;
        Component components[] = getContentPane().getComponents();
        for (Component component : components) {
            //É campo de texto?
            if (component instanceof JTextField) {
                //Está preenchido?
                if (((JTextField) component).getText().isEmpty() ){
                    erro=1;
                    break;
                }

                if (jTextDescricao.getText().isEmpty() ){
                    erro=1;
                    break;
                }
            }
        }
        if(erro==1){
            erro=0;
            JOptionPane.showMessageDialog(null,"Preencha todos os campos.","Alerta",JOptionPane.WARNING_MESSAGE);
        }else{
            Produto p = new Produto();
            p.setNome(jTextNome.getText());
            p.setId(Integer.parseInt(jTextID.getText()));
            p.setPreco(Double.parseDouble(jTextPreco.getText()));
            p.setDescricao(jTextDescricao.getText());
            p.setQuantidade(Integer.parseInt(jTextQuantidade.getText()));
            ProdutoDao pd = new ProdutoDao();
            pd.cadastrar(p);
            JOptionPane.showMessageDialog(null,"Produto cadastrado com sucesso.","Sucesso",JOptionPane.INFORMATION_MESSAGE);
            this.dispose();
        }
    }//GEN-LAST:event_jButtonCadastrarMousePressed

    private void jTextIDFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextIDFocusLost
        try{
            if(!jTextID.getText().equals("")){
                Integer.parseInt(jTextID.getText());
                jLabelID.setForeground(Color.black);
            }
        }catch(NumberFormatException e){
            jLabelID.setForeground(Color.red);
            JOptionPane.showMessageDialog(null,"O campo ID - Produto é numérico,digite corretamente" ,"Alerta", JOptionPane.WARNING_MESSAGE);
            jTextID.setText("");
            jTextID.requestFocus();
        }
    }//GEN-LAST:event_jTextIDFocusLost

    private void jTextQuantidadeFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextQuantidadeFocusLost
        try{
            if(!jTextQuantidade.getText().equals("")){
                Integer.parseInt(jTextQuantidade.getText());
                jLabelQuantidade.setForeground(Color.black);
            }
        }catch(NumberFormatException e){
            jLabelQuantidade.setForeground(Color.red);
            JOptionPane.showMessageDialog(null,"O campo Quantidade é numérico,digite corretamente" ,"Alerta", JOptionPane.WARNING_MESSAGE);
            jTextQuantidade.setText("");
            jTextQuantidade.requestFocus();
        }
    }//GEN-LAST:event_jTextQuantidadeFocusLost

    private void jTextPrecoFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextPrecoFocusLost
        try{
            if(!jTextPreco.getText().equals("")){
                Double.parseDouble(jTextPreco.getText());
                jLabelPreco.setForeground(Color.black);
            }
        }catch(NumberFormatException e){
            jLabelPreco.setForeground(Color.red);
            JOptionPane.showMessageDialog(null,"O campo Preço é numérico,digite corretamente" ,"Alerta", JOptionPane.WARNING_MESSAGE);
            jTextPreco.setText("");
            jTextPreco.requestFocus();
        }
    }//GEN-LAST:event_jTextPrecoFocusLost


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonCadastrar;
    private javax.swing.JButton jButtonCancelar;
    private javax.swing.JButton jButtonLimpar;
    private javax.swing.JLabel jLabelDescricao;
    private javax.swing.JLabel jLabelID;
    private javax.swing.JLabel jLabelNome;
    private javax.swing.JLabel jLabelPreco;
    private javax.swing.JLabel jLabelQuantidade;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextDescricao;
    private javax.swing.JTextField jTextID;
    private javax.swing.JTextField jTextNome;
    private javax.swing.JTextField jTextPreco;
    private javax.swing.JTextField jTextQuantidade;
    // End of variables declaration//GEN-END:variables
}
