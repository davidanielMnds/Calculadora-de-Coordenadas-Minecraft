package ui;

import java.awt.Toolkit;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;
import model.Coordenada;

public class Tela extends javax.swing.JFrame {
    

    public Tela() {
        initComponents();
        btnOver_Nether.setFocusable(false);
        btnNether_Over.setFocusable(false);
        DocumentListener  listenerOverWorld = new DocumentListener() 
        {
            @Override
            public void insertUpdate(DocumentEvent e) {updateOverWorld();}
            @Override
            public void removeUpdate (DocumentEvent e) {updateOverWorld();}
            @Override
            public void changedUpdate (DocumentEvent e) {updateOverWorld();}
        };
        
        DocumentListener  listenerNether; 
        listenerNether = new DocumentListener() 
        {
            @Override
            public void insertUpdate(DocumentEvent e) {updateNether();}
            @Override
            public void removeUpdate (DocumentEvent e) {updateNether();}
            @Override
            public void changedUpdate (DocumentEvent e) {updateNether();}
        };
        
        txtOverWorldX.getDocument().addDocumentListener(listenerOverWorld);
        txtOverWorldZ.getDocument().addDocumentListener(listenerOverWorld);
        txtNetherX.getDocument().addDocumentListener(listenerNether);
        txtNetherZ.getDocument().addDocumentListener(listenerNether);
        
    }
    
    public void updateOverWorld()
    {
        if(txtOverWorldX.getText().trim().isEmpty() || txtOverWorldZ.getText().trim().isEmpty())
        {
            btnOver_Nether.setEnabled(false);
        }
        else {btnOver_Nether.setEnabled(true);}
    }
    public void updateNether()
    {
        if(txtNetherX.getText().trim().isEmpty() || txtNetherZ.getText().trim().isEmpty())
        {
            btnNether_Over.setEnabled(false);
        }
        else {btnNether_Over.setEnabled(true);}
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        root = new javax.swing.JPanel();
        pnlNorth = new javax.swing.JPanel();
        lblGato = new javax.swing.JLabel();
        pnlCenter = new javax.swing.JPanel();
        pnlFormulario = new javax.swing.JPanel();
        lblOverWorldText = new javax.swing.JLabel();
        pnlOverWorld = new javax.swing.JPanel();
        lblOverWorldX = new javax.swing.JLabel();
        txtOverWorldX = new javax.swing.JFormattedTextField();
        lblOverWorldZ = new javax.swing.JLabel();
        txtOverWorldZ = new javax.swing.JFormattedTextField();
        lblNether = new javax.swing.JLabel();
        pnlNether = new javax.swing.JPanel();
        lblNetherX = new javax.swing.JLabel();
        txtNetherX = new javax.swing.JFormattedTextField();
        lblNetherZ = new javax.swing.JLabel();
        txtNetherZ = new javax.swing.JFormattedTextField();
        lblConfiguracoes = new javax.swing.JLabel();
        pnlConfig = new javax.swing.JPanel();
        lblBlocosA_Pular = new javax.swing.JLabel();
        lblBlocosA_pularX = new javax.swing.JLabel();
        txtBlocosA_pularX = new javax.swing.JFormattedTextField();
        lblBlocosA_pularZ = new javax.swing.JLabel();
        txtBlocosA_pularZ = new javax.swing.JFormattedTextField();
        lblBotoes = new javax.swing.JLabel();
        pnlBotoes = new javax.swing.JPanel();
        btnOver_Nether = new javax.swing.JButton();
        btnNether_Over = new javax.swing.JButton();
        lblRespostaTitle = new javax.swing.JLabel();
        pnlResposta = new javax.swing.JPanel();
        lblRespostaX = new javax.swing.JLabel();
        txtRespostaX = new javax.swing.JTextField();
        lblRespostaZ = new javax.swing.JLabel();
        txtRespostaZ = new javax.swing.JTextField();
        btnCopiar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Calculadora de Coordenadas");
        setPreferredSize(new java.awt.Dimension(400, 450));
        setResizable(false);

        root.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        root.setPreferredSize(new java.awt.Dimension(400, 450));
        root.setLayout(new java.awt.BorderLayout());

        pnlNorth.setMinimumSize(new java.awt.Dimension(110, 100));
        pnlNorth.setPreferredSize(new java.awt.Dimension(400, 100));
        pnlNorth.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.CENTER, 0, 0));

        lblGato.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/cat.gif"))); // NOI18N
        pnlNorth.add(lblGato);

        root.add(pnlNorth, java.awt.BorderLayout.PAGE_START);

        pnlCenter.setMinimumSize(new java.awt.Dimension(400, 300));
        pnlCenter.setPreferredSize(new java.awt.Dimension(400, 320));
        pnlCenter.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.LEFT, 0, 10));

        pnlFormulario.setPreferredSize(new java.awt.Dimension(400, 300));
        pnlFormulario.setLayout(new java.awt.GridLayout(10, 0, 1, 1));

        lblOverWorldText.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblOverWorldText.setText("OverWorld: ");
        pnlFormulario.add(lblOverWorldText);

        pnlOverWorld.setPreferredSize(new java.awt.Dimension(400, 30));
        pnlOverWorld.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.LEFT, 10, 0));

        lblOverWorldX.setText("X");
        pnlOverWorld.add(lblOverWorldX);

        txtOverWorldX.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#0"))));
        txtOverWorldX.setMinimumSize(new java.awt.Dimension(80, 26));
        txtOverWorldX.setPreferredSize(new java.awt.Dimension(80, 26));
        txtOverWorldX.addActionListener(this::txtOverWorldXActionPerformed);
        pnlOverWorld.add(txtOverWorldX);

        lblOverWorldZ.setText("Z");
        pnlOverWorld.add(lblOverWorldZ);

        txtOverWorldZ.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#0"))));
        txtOverWorldZ.setPreferredSize(new java.awt.Dimension(80, 26));
        pnlOverWorld.add(txtOverWorldZ);

        pnlFormulario.add(pnlOverWorld);

        lblNether.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblNether.setText("Nether:");
        pnlFormulario.add(lblNether);

        pnlNether.setPreferredSize(new java.awt.Dimension(400, 30));
        pnlNether.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.LEFT, 10, 0));

        lblNetherX.setText("X");
        pnlNether.add(lblNetherX);

        txtNetherX.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#0"))));
        txtNetherX.setPreferredSize(new java.awt.Dimension(80, 26));
        pnlNether.add(txtNetherX);

        lblNetherZ.setText("Z");
        pnlNether.add(lblNetherZ);

        txtNetherZ.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#0"))));
        txtNetherZ.setPreferredSize(new java.awt.Dimension(80, 26));
        pnlNether.add(txtNetherZ);

        pnlFormulario.add(pnlNether);

        lblConfiguracoes.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblConfiguracoes.setText("Configurações");
        pnlFormulario.add(lblConfiguracoes);

        pnlConfig.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.LEFT, 10, 0));

        lblBlocosA_Pular.setText("Blocos a pular:");
        pnlConfig.add(lblBlocosA_Pular);

        lblBlocosA_pularX.setText("X");
        pnlConfig.add(lblBlocosA_pularX);

        txtBlocosA_pularX.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#0"))));
        txtBlocosA_pularX.setMinimumSize(new java.awt.Dimension(80, 26));
        txtBlocosA_pularX.setPreferredSize(new java.awt.Dimension(80, 26));
        pnlConfig.add(txtBlocosA_pularX);

        lblBlocosA_pularZ.setText("Z");
        pnlConfig.add(lblBlocosA_pularZ);

        txtBlocosA_pularZ.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#0"))));
        txtBlocosA_pularZ.setMinimumSize(new java.awt.Dimension(80, 26));
        txtBlocosA_pularZ.setPreferredSize(new java.awt.Dimension(80, 26));
        pnlConfig.add(txtBlocosA_pularZ);

        pnlFormulario.add(pnlConfig);

        lblBotoes.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblBotoes.setText("Método de Conversão");
        pnlFormulario.add(lblBotoes);

        pnlBotoes.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.CENTER, 20, 0));

        btnOver_Nether.setText("OverWorld -> Nether");
        btnOver_Nether.setEnabled(false);
        btnOver_Nether.addActionListener(this::btnOver_NetherActionPerformed);
        pnlBotoes.add(btnOver_Nether);

        btnNether_Over.setText("Nether -> OverWorld");
        btnNether_Over.setEnabled(false);
        btnNether_Over.addActionListener(this::btnNether_OverActionPerformed);
        pnlBotoes.add(btnNether_Over);

        pnlFormulario.add(pnlBotoes);

        lblRespostaTitle.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblRespostaTitle.setText("Resposta:");
        pnlFormulario.add(lblRespostaTitle);

        pnlResposta.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.LEFT, 20, 0));

        lblRespostaX.setText("X");
        pnlResposta.add(lblRespostaX);

        txtRespostaX.setEditable(false);
        txtRespostaX.setMinimumSize(new java.awt.Dimension(86, 26));
        txtRespostaX.setPreferredSize(new java.awt.Dimension(86, 26));
        pnlResposta.add(txtRespostaX);

        lblRespostaZ.setText("Z");
        pnlResposta.add(lblRespostaZ);

        txtRespostaZ.setEditable(false);
        txtRespostaZ.setMinimumSize(new java.awt.Dimension(86, 26));
        txtRespostaZ.setPreferredSize(new java.awt.Dimension(86, 26));
        pnlResposta.add(txtRespostaZ);

        btnCopiar.setText("Copiar");
        btnCopiar.addActionListener(this::btnCopiarActionPerformed);
        pnlResposta.add(btnCopiar);

        pnlFormulario.add(pnlResposta);

        pnlCenter.add(pnlFormulario);

        root.add(pnlCenter, java.awt.BorderLayout.CENTER);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(root, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(root, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnOver_NetherActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOver_NetherActionPerformed
        int posX = Integer.parseInt(txtOverWorldX.getText());
        int posZ = Integer.parseInt(txtOverWorldZ.getText());
        int skipX =0;
        int skipZ = 0;
        //-------------------se campo pular X ou Z não estiverem vazios seta eles----------------
        if(!txtBlocosA_pularX.getText().trim().isEmpty())
        {skipX = Integer.parseInt(txtBlocosA_pularX.getText());}
        if(!txtBlocosA_pularZ.getText().trim().isEmpty())
        {skipZ = Integer.parseInt(txtBlocosA_pularZ.getText());;}
        //----------------------------------------------------------------------------------------
        Coordenada.getInstance().OverWorld_Nether(posX, posZ, skipX, skipZ);
        String pos_x = Integer.toString(Coordenada.getInstance().getPos_x());
        String pos_z = Integer.toString(Coordenada.getInstance().getPos_z());
        txtRespostaX.setText(pos_x);
        txtRespostaZ.setText(pos_z);
        
    }//GEN-LAST:event_btnOver_NetherActionPerformed

    private void txtOverWorldXActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtOverWorldXActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtOverWorldXActionPerformed

    private void btnNether_OverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNether_OverActionPerformed
        //---------------NETHER -> OVERWORLD-------------------------------------------------------------
        int posX = Integer.parseInt(txtNetherX.getText());
        int posZ = Integer.parseInt(txtNetherZ.getText());
        int skipX =0;
        int skipZ = 0;
        //-------------------se campo pular X ou Z não estiverem vazios seta eles----------------
        if(!txtBlocosA_pularX.getText().trim().isEmpty())
        {skipX = Integer.parseInt(txtBlocosA_pularX.getText());}
        if(!txtBlocosA_pularZ.getText().trim().isEmpty())
        {skipZ = Integer.parseInt(txtBlocosA_pularZ.getText());}
        //----------------------------------------------------------------------------------------
        Coordenada.getInstance().Nether_OverWorld(posX, posZ, skipX, skipZ);
        String pos_x = Integer.toString(Coordenada.getInstance().getPos_x());
        String pos_z = Integer.toString(Coordenada.getInstance().getPos_z());
        txtRespostaX.setText(pos_x);
        txtRespostaZ.setText(pos_z);
    }//GEN-LAST:event_btnNether_OverActionPerformed

    private void btnCopiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCopiarActionPerformed
        String copiar = txtRespostaX.getText() + " ~ " + txtRespostaZ.getText();
        java.awt.Toolkit.getDefaultToolkit().
                getSystemClipboard().setContents(new java.awt.datatransfer.StringSelection(copiar), null);
    }//GEN-LAST:event_btnCopiarActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCopiar;
    private javax.swing.JButton btnNether_Over;
    private javax.swing.JButton btnOver_Nether;
    private javax.swing.JLabel lblBlocosA_Pular;
    private javax.swing.JLabel lblBlocosA_pularX;
    private javax.swing.JLabel lblBlocosA_pularZ;
    private javax.swing.JLabel lblBotoes;
    private javax.swing.JLabel lblConfiguracoes;
    private javax.swing.JLabel lblGato;
    private javax.swing.JLabel lblNether;
    private javax.swing.JLabel lblNetherX;
    private javax.swing.JLabel lblNetherZ;
    private javax.swing.JLabel lblOverWorldText;
    private javax.swing.JLabel lblOverWorldX;
    private javax.swing.JLabel lblOverWorldZ;
    private javax.swing.JLabel lblRespostaTitle;
    private javax.swing.JLabel lblRespostaX;
    private javax.swing.JLabel lblRespostaZ;
    private javax.swing.JPanel pnlBotoes;
    private javax.swing.JPanel pnlCenter;
    private javax.swing.JPanel pnlConfig;
    private javax.swing.JPanel pnlFormulario;
    private javax.swing.JPanel pnlNether;
    private javax.swing.JPanel pnlNorth;
    private javax.swing.JPanel pnlOverWorld;
    private javax.swing.JPanel pnlResposta;
    private javax.swing.JPanel root;
    private javax.swing.JFormattedTextField txtBlocosA_pularX;
    private javax.swing.JFormattedTextField txtBlocosA_pularZ;
    private javax.swing.JFormattedTextField txtNetherX;
    private javax.swing.JFormattedTextField txtNetherZ;
    private javax.swing.JFormattedTextField txtOverWorldX;
    private javax.swing.JFormattedTextField txtOverWorldZ;
    private javax.swing.JTextField txtRespostaX;
    private javax.swing.JTextField txtRespostaZ;
    // End of variables declaration//GEN-END:variables
}
