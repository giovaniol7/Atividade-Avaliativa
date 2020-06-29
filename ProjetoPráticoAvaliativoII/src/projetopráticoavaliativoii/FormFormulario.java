package projetopráticoavaliativoii;

import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class FormFormulario extends javax.swing.JFrame {
   
    public FormFormulario() {
        initComponents();
        configuracoes();
        preencherTabela();
    }
        
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbFormulario = new javax.swing.JTable();
        btnVoltar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(204, 204, 204));

        tbFormulario.setBackground(new java.awt.Color(204, 204, 204));
        tbFormulario.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        tbFormulario.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nome", "Descrição", "Categorias", "Tipo", "Valor de Vendas"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tbFormulario.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                tbFormularioAncestorAdded(evt);
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });
        jScrollPane1.setViewportView(tbFormulario);

        btnVoltar.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        btnVoltar.setForeground(new java.awt.Color(0, 0, 0));
        btnVoltar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/iconfinder_Back_131811.png"))); // NOI18N
        btnVoltar.setText("Voltar");
        btnVoltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVoltarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 808, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(btnVoltar)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 562, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(btnVoltar)
                .addContainerGap())
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

    private void btnVoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVoltarActionPerformed
        
        //abri menu principal
        FormCadastramento f = new FormCadastramento();

        //Fechar login
        this.dispose();

        //exibir menu
        f.setVisible(true);
        
    }//GEN-LAST:event_btnVoltarActionPerformed

    private void tbFormularioAncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_tbFormularioAncestorAdded
        // TODO add your handling code here:
    }//GEN-LAST:event_tbFormularioAncestorAdded

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnVoltar;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tbFormulario;
    // End of variables declaration//GEN-END:variables

    private void configuracoes() {
        
        this.setTitle("Formulário de Imóvel");
        this.setResizable(false);
        this.setLocationRelativeTo(null);
        
        configurarTabela();
    }
    
    private void configurarTabela() {
        DefaultTableModel t = new DefaultTableModel(){
        
        //Não permitir edição das cédulas da tabela
        @Override
        public boolean isCellEditable(int row, int column){        
            return false;
        }
      };
        
        //Nome das Colunas
        t.addColumn("Nome");
        t.addColumn("Descrição");
        t.addColumn("Categoria");
        t.addColumn("Tipo");
        t.addColumn("Valor da Venda");
        
        
        tbFormulario.setModel(t);
        tbFormulario.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
        tbFormulario.setColumnSelectionAllowed(false);
        tbFormulario.setCellSelectionEnabled(false);
        tbFormulario.setRowSelectionAllowed(false);
        tbFormulario.getTableHeader().setReorderingAllowed(true);
        tbFormulario.getTableHeader().setResizingAllowed(false);
        tbFormulario.getColumnModel().getColumn(0).setPreferredWidth(200);
        tbFormulario.getColumnModel().getColumn(1).setPreferredWidth(300);
        tbFormulario.getColumnModel().getColumn(2).setPreferredWidth(110);
        tbFormulario.getColumnModel().getColumn(3).setPreferredWidth(110);
        tbFormulario.getColumnModel().getColumn(4).setPreferredWidth(100);
    }
    
    private void preencherTabela() {
        if (FormCadastramento.lista != null) {
            DefaultTableModel m = (DefaultTableModel)tbFormulario.getModel();
            for(Imovel i : FormCadastramento.lista){
                m.addRow(new Object[] {
                    i.getNome(),
                    i.getDescricao(),
                    i.getCategoria(),
                    i.getTipo(),
                    i.getVendas()
                });
            }
        }
    }
    
}
