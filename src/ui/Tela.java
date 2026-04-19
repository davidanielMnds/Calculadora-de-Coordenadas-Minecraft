package ui;

import java.awt.Image;
import javax.swing.ImageIcon;

public class Tela extends javax.swing.JFrame {
    
    private static final java.util.logging.Logger logger = java.util.logging.Logger.getLogger(Tela.class.getName());

    public Tela() {
        initComponents();
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
        txtBlocosA_pular = new javax.swing.JFormattedTextField();
        lblBotoes = new javax.swing.JLabel();
        pnlBotoes = new javax.swing.JPanel();
        btnOver_Nether = new javax.swing.JButton();
        btnNether_Over = new javax.swing.JButton();
        lblRespostaTitle = new javax.swing.JLabel();
        pnlResposta = new javax.swing.JPanel();
        lblRespostaX = new javax.swing.JLabel();
        txtResultadoX = new javax.swing.JScrollPane();
        txtRespostaX = new javax.swing.JTextArea();
        lblRespostaZ = new javax.swing.JLabel();
        txtResultadoY = new javax.swing.JScrollPane();
        txtRespostaY = new javax.swing.JTextArea();
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

        txtBlocosA_pular.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#0"))));
        txtBlocosA_pular.setMinimumSize(new java.awt.Dimension(80, 26));
        txtBlocosA_pular.setPreferredSize(new java.awt.Dimension(80, 26));
        pnlConfig.add(txtBlocosA_pular);

        pnlFormulario.add(pnlConfig);

        lblBotoes.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblBotoes.setText("Método de Conversão");
        pnlFormulario.add(lblBotoes);

        pnlBotoes.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.CENTER, 20, 0));

        btnOver_Nether.setText("OverWorld -> Nether");
        btnOver_Nether.addActionListener(this::btnOver_NetherActionPerformed);
        pnlBotoes.add(btnOver_Nether);

        btnNether_Over.setText("Nether -> OverWorld");
        pnlBotoes.add(btnNether_Over);

        pnlFormulario.add(pnlBotoes);

        lblRespostaTitle.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblRespostaTitle.setText("Resposta:");
        pnlFormulario.add(lblRespostaTitle);

        pnlResposta.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.LEFT, 20, 0));

        lblRespostaX.setText("X");
        pnlResposta.add(lblRespostaX);

        txtResultadoX.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        txtResultadoX.setFocusable(false);
        txtResultadoX.setPreferredSize(new java.awt.Dimension(80, 26));
        txtResultadoX.setViewport(null);

        txtRespostaX.setEditable(false);
        txtRespostaX.setColumns(20);
        txtRespostaX.setRows(5);
        txtResultadoX.setViewportView(txtRespostaX);

        pnlResposta.add(txtResultadoX);

        lblRespostaZ.setText("Z");
        pnlResposta.add(lblRespostaZ);

        txtResultadoY.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        txtResultadoY.setFocusable(false);
        txtResultadoY.setPreferredSize(new java.awt.Dimension(80, 26));

        txtRespostaY.setEditable(false);
        txtRespostaY.setColumns(20);
        txtRespostaY.setRows(5);
        txtResultadoY.setViewportView(txtRespostaY);

        pnlResposta.add(txtResultadoY);

        btnCopiar.setText("Copiar");
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
        // TODO add your handling code here:
    }//GEN-LAST:event_btnOver_NetherActionPerformed

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(() -> new Tela().setVisible(true));
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCopiar;
    private javax.swing.JButton btnNether_Over;
    private javax.swing.JButton btnOver_Nether;
    private javax.swing.JLabel lblBlocosA_Pular;
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
    private javax.swing.JFormattedTextField txtBlocosA_pular;
    private javax.swing.JFormattedTextField txtNetherX;
    private javax.swing.JFormattedTextField txtNetherZ;
    private javax.swing.JFormattedTextField txtOverWorldX;
    private javax.swing.JFormattedTextField txtOverWorldZ;
    private javax.swing.JTextArea txtRespostaX;
    private javax.swing.JTextArea txtRespostaY;
    private javax.swing.JScrollPane txtResultadoX;
    private javax.swing.JScrollPane txtResultadoY;
    // End of variables declaration//GEN-END:variables
}
