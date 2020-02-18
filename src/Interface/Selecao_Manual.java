package Interface;

import Algoritimos.Celular;
import Algoritimos.Controle;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class Selecao_Manual extends javax.swing.JFrame {

    Controle reg = new Controle();

    public Selecao_Manual() {

        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Titulo1 = new javax.swing.JLabel();
        Titulo2 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        Preço = new javax.swing.JLabel();
        preco = new javax.swing.JTextField();
        Câmera = new javax.swing.JLabel();
        camera = new javax.swing.JComboBox<>();
        Hardware = new javax.swing.JLabel();
        hardware = new javax.swing.JComboBox<>();
        CustoBeneficio = new javax.swing.JLabel();
        custoBe = new javax.swing.JComboBox<>();
        Tela = new javax.swing.JLabel();
        tela = new javax.swing.JComboBox<>();
        Desempenho = new javax.swing.JLabel();
        desempenho = new javax.swing.JComboBox<>();
        confirma = new javax.swing.JButton();
        sair = new javax.swing.JButton();
        Fundo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setMinimumSize(new java.awt.Dimension(476, 469));
        setName("Preferências "); // NOI18N
        setSize(new java.awt.Dimension(476, 469));
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });
        getContentPane().setLayout(null);

        Titulo1.setBackground(new java.awt.Color(0, 0, 0));
        Titulo1.setFont(new java.awt.Font("Good Timing Rg", 0, 48)); // NOI18N
        Titulo1.setForeground(new java.awt.Color(255, 255, 255));
        Titulo1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Titulo1.setText("Entre com suas");
        getContentPane().add(Titulo1);
        Titulo1.setBounds(0, 20, 460, 30);

        Titulo2.setFont(new java.awt.Font("Good Timing Rg", 0, 48)); // NOI18N
        Titulo2.setForeground(new java.awt.Color(255, 255, 255));
        Titulo2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Titulo2.setText("Preferências:");
        Titulo2.setName(""); // NOI18N
        getContentPane().add(Titulo2);
        Titulo2.setBounds(0, 60, 460, 40);
        Titulo2.getAccessibleContext().setAccessibleDescription("");

        jPanel1.setBackground(new java.awt.Color(172, 172, 172));
        jPanel1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        Preço.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        Preço.setForeground(new java.awt.Color(0, 0, 0));
        Preço.setText("Preço Maxímo: ");

        preco.setBackground(new java.awt.Color(255, 255, 255));
        preco.setForeground(new java.awt.Color(0, 0, 0));
        preco.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        preco.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        Câmera.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        Câmera.setForeground(new java.awt.Color(0, 0, 0));
        Câmera.setText("Qualidade de Câmera: ");

        camera.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Desnecessário", "Pouco Necessário", "Necessário", "Muito Necessário", "Imprescindível" }));

        Hardware.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        Hardware.setForeground(new java.awt.Color(0, 0, 0));
        Hardware.setText("Qualidade de Hardware: ");

        hardware.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Desnecessário", "Pouco Necessário", "Necessário", "Muito Necessário", "Imprescindível" }));

        CustoBeneficio.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        CustoBeneficio.setForeground(new java.awt.Color(0, 0, 0));
        CustoBeneficio.setText("Custo X Benefício : ");

        custoBe.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Desnecessário", "Pouco Necessário", "Necessário", "Muito Necessário", "Imprescindível" }));

        Tela.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        Tela.setForeground(new java.awt.Color(0, 0, 0));
        Tela.setText("Qualidade de Tela: ");

        tela.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Desnecessário", "Pouco Necessário", "Necessário", "Muito Necessário", "Imprescindível" }));

        Desempenho.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        Desempenho.setForeground(new java.awt.Color(0, 0, 0));
        Desempenho.setText("Qualidade de Desempenho: ");

        desempenho.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Desnecessário", "Pouco Necessário", "Necessário", "Muito Necessário", "Imprescindível" }));

        confirma.setBackground(new java.awt.Color(172, 172, 172));
        confirma.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        confirma.setText("Confirmar");
        confirma.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                confirmaActionPerformed(evt);
            }
        });

        sair.setBackground(new java.awt.Color(172, 172, 172));
        sair.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        sair.setText("Sair");
        sair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sairActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(Hardware)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(hardware, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(CustoBeneficio)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(custoBe, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Câmera)
                            .addComponent(Preço))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(camera, 0, 150, Short.MAX_VALUE)
                            .addComponent(preco)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Tela)
                            .addComponent(Desempenho))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(desempenho, 0, 150, Short.MAX_VALUE)
                            .addComponent(tela, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(confirma, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(50, 50, 50)
                .addComponent(sair, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(60, 60, 60))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Preço)
                    .addComponent(preco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Câmera)
                    .addComponent(camera, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Hardware)
                    .addComponent(hardware, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(CustoBeneficio)
                    .addComponent(custoBe, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Tela)
                    .addComponent(tela, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Desempenho)
                    .addComponent(desempenho, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(confirma)
                    .addComponent(sair))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel1);
        jPanel1.setBounds(30, 110, 400, 290);

        Fundo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Fundo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/Fundo.jpg"))); // NOI18N
        Fundo.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        getContentPane().add(Fundo);
        Fundo.setBounds(0, 0, 460, 430);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void confirmaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_confirmaActionPerformed
        // Ação do Botão de Confirmar:

        try {

            Celular aux = new Celular();

            aux.preco = Integer.parseInt(preco.getText());

            // Resposta Qualidade da Camera
            if (camera.getSelectedItem().equals("Desnecessário")) {
                aux.camera = 0;
            }
            if (camera.getSelectedItem().equals("Pouco Necessário")) {
                aux.camera = 1;
            }
            if (camera.getSelectedItem().equals("Necessário")) {
                aux.camera = 2;
            }
            if (camera.getSelectedItem().equals("Muito Necessário")) {
                aux.camera = 3;
            }
            if (camera.getSelectedItem().equals("Imprescindível")) {
                aux.camera = 4;
            }

            // Resposta Qualidade da Hardware
            if (hardware.getSelectedItem().equals("Desnecessário")) {
                aux.hardware = 0;
            }
            if (hardware.getSelectedItem().equals("Pouco Necessário")) {
                aux.hardware = 1;
            }
            if (hardware.getSelectedItem().equals("Necessário")) {
                aux.hardware = 2;
            }
            if (hardware.getSelectedItem().equals("Muito Necessário")) {
                aux.hardware = 3;
            }
            if (hardware.getSelectedItem().equals("Imprescindível")) {
                aux.hardware = 4;
            }

            // Resposta Qualidade da Custo Benefício
            if (custoBe.getSelectedItem().equals("Desnecessário")) {
                aux.custoBe = 0;
            }
            if (custoBe.getSelectedItem().equals("Pouco Necessário")) {
                aux.custoBe = 1;
            }
            if (custoBe.getSelectedItem().equals("Necessário")) {
                aux.custoBe = 2;
            }
            if (custoBe.getSelectedItem().equals("Muito Necessário")) {
                aux.custoBe = 3;
            }
            if (custoBe.getSelectedItem().equals("Imprescindível")) {
                aux.custoBe = 4;
            }

            // Resposta Qualidade da Tela
            if (tela.getSelectedItem().equals("Desnecessário")) {
                aux.tela = 0;
            }
            if (tela.getSelectedItem().equals("Pouco Necessário")) {
                aux.tela = 1;
            }
            if (tela.getSelectedItem().equals("Necessário")) {
                aux.tela = 2;
            }
            if (tela.getSelectedItem().equals("Muito Necessário")) {
                aux.tela = 3;
            }
            if (tela.getSelectedItem().equals("Imprescindível")) {
                aux.tela = 4;
            }

            // Resposta Qualidade da Tela
            if (desempenho.getSelectedItem().equals("Desnecessário")) {
                aux.desempenho = 0;
            }
            if (desempenho.getSelectedItem().equals("Pouco Necessário")) {
                aux.desempenho = 1;
            }
            if (desempenho.getSelectedItem().equals("Necessário")) {
                aux.desempenho = 2;
            }
            if (desempenho.getSelectedItem().equals("Muito Necessário")) {
                aux.desempenho = 3;
            }
            if (desempenho.getSelectedItem().equals("Imprescindível")) {
                aux.desempenho = 4;
            }

            reg.aplicaNota(aux);

            Resultado res = new Resultado();
            res.setVisible(true);
            dispose();
        } catch (NumberFormatException e) {

            JOptionPane.showMessageDialog(null, "Digite um Preço Maxímo!!!");
        }

    }//GEN-LAST:event_confirmaActionPerformed

    private void sairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sairActionPerformed
        // Ação do Botão de Sair:

        dispose();
    }//GEN-LAST:event_sairActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        // Ação Quando a Janela Abre:

        try {

            reg.fileRead();
        } catch (IOException ex) {

            Logger.getLogger(Selecao_Manual.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_formWindowOpened

    public static void main(String args[]) {

        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Selecao_Manual.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Selecao_Manual.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Selecao_Manual.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Selecao_Manual.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Selecao_Manual().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel CustoBeneficio;
    private javax.swing.JLabel Câmera;
    private javax.swing.JLabel Desempenho;
    private javax.swing.JLabel Fundo;
    private javax.swing.JLabel Hardware;
    private javax.swing.JLabel Preço;
    private javax.swing.JLabel Tela;
    private javax.swing.JLabel Titulo1;
    private javax.swing.JLabel Titulo2;
    private javax.swing.JComboBox<String> camera;
    private javax.swing.JButton confirma;
    private javax.swing.JComboBox<String> custoBe;
    private javax.swing.JComboBox<String> desempenho;
    private javax.swing.JComboBox<String> hardware;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField preco;
    private javax.swing.JButton sair;
    private javax.swing.JComboBox<String> tela;
    // End of variables declaration//GEN-END:variables
}
