package projetopráticoavaliativoii;

import java.util.ArrayList;
import java.util.List;
import javax.swing.ButtonGroup;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;

public class FormCadastramento extends javax.swing.JFrame {
    
    //Lista Dinâmica contendo as disciplinas
    protected static List<Imovel> lista = new ArrayList<>(); //static faz ter escopo global
    
    public FormCadastramento() {
        initComponents();
        configuracoes();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        txtNome = new javax.swing.JTextField();
        lblCadastramento = new javax.swing.JLabel();
        lblNome = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtDescricao = new javax.swing.JTextArea();
        lblDescricao = new javax.swing.JLabel();
        lblCategoria = new javax.swing.JLabel();
        rdbResidencial = new javax.swing.JRadioButton();
        rdbComercial = new javax.swing.JRadioButton();
        cbxTipo = new javax.swing.JComboBox<>();
        lblTipo = new javax.swing.JLabel();
        txtValorVenda = new javax.swing.JTextField();
        lblValorVenda = new javax.swing.JLabel();
        btnSalvar = new javax.swing.JButton();
        btnLimpar = new javax.swing.JButton();
        btnFormulario = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(204, 204, 204));
        jPanel1.setForeground(new java.awt.Color(255, 255, 255));

        txtNome.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        txtNome.setForeground(new java.awt.Color(0, 0, 0));
        txtNome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNomeActionPerformed(evt);
            }
        });

        lblCadastramento.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        lblCadastramento.setForeground(new java.awt.Color(0, 0, 0));
        lblCadastramento.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/cadastro_64.png"))); // NOI18N
        lblCadastramento.setText("Cadastramento do Imóvel");

        lblNome.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        lblNome.setForeground(new java.awt.Color(0, 0, 0));
        lblNome.setText("Nome");

        txtDescricao.setColumns(20);
        txtDescricao.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        txtDescricao.setForeground(new java.awt.Color(0, 0, 0));
        txtDescricao.setRows(5);
        jScrollPane1.setViewportView(txtDescricao);

        lblDescricao.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        lblDescricao.setForeground(new java.awt.Color(0, 0, 0));
        lblDescricao.setText("Descrição");

        lblCategoria.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        lblCategoria.setForeground(new java.awt.Color(0, 0, 0));
        lblCategoria.setText("Categoria");

        rdbResidencial.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        rdbResidencial.setForeground(new java.awt.Color(0, 0, 0));
        rdbResidencial.setText("Residencial");

        rdbComercial.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        rdbComercial.setForeground(new java.awt.Color(0, 0, 0));
        rdbComercial.setText("Comercial");

        cbxTipo.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        cbxTipo.setForeground(new java.awt.Color(0, 0, 0));
        cbxTipo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        lblTipo.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        lblTipo.setForeground(new java.awt.Color(0, 0, 0));
        lblTipo.setText("Tipo");

        txtValorVenda.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        txtValorVenda.setForeground(new java.awt.Color(0, 0, 0));
        txtValorVenda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtValorVendaActionPerformed(evt);
            }
        });

        lblValorVenda.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        lblValorVenda.setForeground(new java.awt.Color(0, 0, 0));
        lblValorVenda.setText("Valor da Venda");

        btnSalvar.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        btnSalvar.setForeground(new java.awt.Color(0, 0, 0));
        btnSalvar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/salvar_32.png"))); // NOI18N
        btnSalvar.setText("Salvar");
        btnSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalvarActionPerformed(evt);
            }
        });

        btnLimpar.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        btnLimpar.setForeground(new java.awt.Color(0, 0, 0));
        btnLimpar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/limpar_32.png"))); // NOI18N
        btnLimpar.setText("Limpar");
        btnLimpar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimparActionPerformed(evt);
            }
        });

        btnFormulario.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        btnFormulario.setForeground(new java.awt.Color(0, 0, 0));
        btnFormulario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/iconfinder_6_forms_google_data_document_file_2109134.png"))); // NOI18N
        btnFormulario.setText("Formulário");
        btnFormulario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFormularioActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addComponent(btnLimpar)
                        .addGap(18, 18, 18)
                        .addComponent(btnSalvar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnFormulario))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 602, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(lblTipo)
                        .addComponent(cbxTipo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(rdbResidencial)
                            .addGap(18, 18, 18)
                            .addComponent(rdbComercial))
                        .addComponent(lblCategoria)
                        .addComponent(lblDescricao)
                        .addComponent(lblNome)
                        .addComponent(lblCadastramento)
                        .addComponent(txtNome, javax.swing.GroupLayout.PREFERRED_SIZE, 602, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(txtValorVenda, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblValorVenda, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap(27, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(lblCadastramento)
                .addGap(24, 24, 24)
                .addComponent(lblNome)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(lblDescricao)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(lblCategoria)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rdbResidencial)
                    .addComponent(rdbComercial))
                .addGap(18, 18, 18)
                .addComponent(lblTipo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cbxTipo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(lblValorVenda)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtValorVenda, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnSalvar)
                    .addComponent(btnLimpar)
                    .addComponent(btnFormulario, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(6, 6, 6))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    //Função de Limpar os Dados
    private void btnLimparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimparActionPerformed
        txtNome.setText("");
        txtDescricao.setText("");
        ButtonGroup grupo = new ButtonGroup();
        grupo.add(rdbComercial);
        grupo.add(rdbResidencial);
        grupo.clearSelection();
        cbxTipo.setSelectedIndex(0);
        txtValorVenda.setText("");
    }//GEN-LAST:event_btnLimparActionPerformed

    //Função Para Salvar os Dados
    private void btnSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalvarActionPerformed
        
        Imovel i = new Imovel();
        i.setNome(txtNome.getText());
        i.setDescricao(txtDescricao.getText());
        if (rdbResidencial.isSelected()){
            i.setCategoria("Residencial");
        }else if (rdbComercial.isSelected()){
            i.setCategoria("Comercial");
        }
        i.setTipo(cbxTipo.getSelectedItem().toString());
        i.setVendas(txtValorVenda.getText());
        
        //Adicionar objeto a lista dinâmica
        FormCadastramento.lista.add(i);
        
        JOptionPane.showMessageDialog(null,"Imovel adicionado com Sucesso!");
        
        //Limpar variaveis
        btnLimparActionPerformed(evt);
    }//GEN-LAST:event_btnSalvarActionPerformed

    private void txtValorVendaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtValorVendaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtValorVendaActionPerformed

    private void txtNomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNomeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNomeActionPerformed

    private void btnFormularioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFormularioActionPerformed
        
        //abrir formulario
        FormFormulario f = new FormFormulario();

        //Fechar cadastramento
        this.dispose();

        //exibir formulario
        f.setVisible(true);
        
    }//GEN-LAST:event_btnFormularioActionPerformed

    public static void main(String args[]) {
       
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(FormCadastramento.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FormCadastramento.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FormCadastramento.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FormCadastramento.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FormCadastramento().setVisible(true);
            }
        });
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnFormulario;
    private javax.swing.JButton btnLimpar;
    private javax.swing.JButton btnSalvar;
    private javax.swing.JComboBox<String> cbxTipo;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblCadastramento;
    private javax.swing.JLabel lblCategoria;
    private javax.swing.JLabel lblDescricao;
    private javax.swing.JLabel lblNome;
    private javax.swing.JLabel lblTipo;
    private javax.swing.JLabel lblValorVenda;
    private javax.swing.JRadioButton rdbComercial;
    private javax.swing.JRadioButton rdbResidencial;
    private javax.swing.JTextArea txtDescricao;
    private javax.swing.JTextField txtNome;
    private javax.swing.JTextField txtValorVenda;
    // End of variables declaration//GEN-END:variables

    private void configuracoes() {
        this.setTitle("Cadastramento de Imóvel");
        this.setResizable(false);
        this.setLocationRelativeTo(null);
        
        
        //Criação de grupo JRadioButton
        ButtonGroup bg = new ButtonGroup();
        bg.add(rdbResidencial);
        bg.add(rdbComercial);
        
        //Limpar o controle JComboBox
        cbxTipo.setModel(new DefaultComboBoxModel());
        
        carregarDados();
    }
    
    private void carregarDados(){
        //Definir um conjunto de dados
        List<String> dados = new ArrayList<>();
        dados.add("- Selecione um Tipo de Imóvel -");
        dados.add("Apartamento");
        dados.add("Casa");
        dados.add("Chácara");
        dados.add("Sala");
        dados.add("Salão");
        dados.add("Sítio");
        
        //adicionar dados ao JComboBox
        DefaultComboBoxModel d = new DefaultComboBoxModel();
        for(String elem : dados){
            d.addElement(elem);
        }
        cbxTipo.setModel(d);
        
     }
}
