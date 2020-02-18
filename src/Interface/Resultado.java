package Interface;

import Algoritimos.Controle;

public class Resultado extends javax.swing.JFrame {

    Controle reg = new Controle();

    public Resultado() {

        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Titulo = new javax.swing.JLabel();
        Painel = new javax.swing.JPanel();
        rolagem = new javax.swing.JScrollPane();
        descricao = new javax.swing.JTextArea();
        Nome1 = new javax.swing.JLabel();
        nome1 = new javax.swing.JLabel();
        Preço1 = new javax.swing.JLabel();
        preco1 = new javax.swing.JLabel();
        Nome2 = new javax.swing.JLabel();
        nome2 = new javax.swing.JLabel();
        Preço2 = new javax.swing.JLabel();
        preco2 = new javax.swing.JLabel();
        Nome3 = new javax.swing.JLabel();
        nome3 = new javax.swing.JLabel();
        Preço3 = new javax.swing.JLabel();
        preco3 = new javax.swing.JLabel();
        confirma = new javax.swing.JButton();
        Fundo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(616, 759));
        setName("Resultado"); // NOI18N
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });
        getContentPane().setLayout(null);

        Titulo.setFont(new java.awt.Font("Good Timing Rg", 0, 48)); // NOI18N
        Titulo.setForeground(new java.awt.Color(255, 255, 255));
        Titulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Titulo.setText("Resultado:");
        Titulo.setName(""); // NOI18N
        getContentPane().add(Titulo);
        Titulo.setBounds(0, 10, 600, 40);

        Painel.setBackground(new java.awt.Color(172, 172, 172));
        Painel.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        rolagem.setBackground(new java.awt.Color(172, 172, 172));
        rolagem.setBorder(null);
        rolagem.setForeground(new java.awt.Color(172, 172, 172));
        rolagem.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);

        descricao.setBackground(new java.awt.Color(172, 172, 172));
        descricao.setColumns(1);
        descricao.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        descricao.setForeground(new java.awt.Color(0, 0, 0));
        descricao.setLineWrap(true);
        descricao.setRows(11);
        descricao.setText("Analise do Perfil");
        rolagem.setViewportView(descricao);

        Nome1.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        Nome1.setForeground(new java.awt.Color(0, 0, 0));
        Nome1.setText("Nome: ");

        nome1.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        nome1.setForeground(new java.awt.Color(0, 0, 0));
        nome1.setText("???");

        Preço1.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        Preço1.setForeground(new java.awt.Color(0, 0, 0));
        Preço1.setText("Preço: ");

        preco1.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        preco1.setForeground(new java.awt.Color(0, 0, 0));
        preco1.setText("???");

        Nome2.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        Nome2.setForeground(new java.awt.Color(0, 0, 0));
        Nome2.setText("Nome: ");

        nome2.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        nome2.setForeground(new java.awt.Color(0, 0, 0));
        nome2.setText("???");

        Preço2.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        Preço2.setForeground(new java.awt.Color(0, 0, 0));
        Preço2.setText("Preço: ");

        preco2.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        preco2.setForeground(new java.awt.Color(0, 0, 0));
        preco2.setText("???");

        Nome3.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        Nome3.setForeground(new java.awt.Color(0, 0, 0));
        Nome3.setText("Nome: ");

        nome3.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        nome3.setForeground(new java.awt.Color(0, 0, 0));
        nome3.setText("???");

        Preço3.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        Preço3.setForeground(new java.awt.Color(0, 0, 0));
        Preço3.setText("Preço: ");

        preco3.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        preco3.setForeground(new java.awt.Color(0, 0, 0));
        preco3.setText("???");

        confirma.setBackground(new java.awt.Color(172, 172, 172));
        confirma.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        confirma.setText("Confirmar");
        confirma.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                confirmaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout PainelLayout = new javax.swing.GroupLayout(Painel);
        Painel.setLayout(PainelLayout);
        PainelLayout.setHorizontalGroup(
            PainelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PainelLayout.createSequentialGroup()
                .addContainerGap(25, Short.MAX_VALUE)
                .addGroup(PainelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(rolagem, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 440, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PainelLayout.createSequentialGroup()
                        .addGroup(PainelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(PainelLayout.createSequentialGroup()
                                .addComponent(Nome1)
                                .addGap(18, 18, 18)
                                .addComponent(nome1, javax.swing.GroupLayout.PREFERRED_SIZE, 285, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(PainelLayout.createSequentialGroup()
                                .addComponent(Preço1)
                                .addGap(18, 18, 18)
                                .addComponent(preco1, javax.swing.GroupLayout.PREFERRED_SIZE, 285, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(PainelLayout.createSequentialGroup()
                                .addComponent(Preço2)
                                .addGap(18, 18, 18)
                                .addComponent(preco2, javax.swing.GroupLayout.PREFERRED_SIZE, 285, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(PainelLayout.createSequentialGroup()
                                .addComponent(Nome2)
                                .addGap(18, 18, 18)
                                .addComponent(nome2, javax.swing.GroupLayout.PREFERRED_SIZE, 285, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(PainelLayout.createSequentialGroup()
                                .addComponent(Preço3)
                                .addGap(18, 18, 18)
                                .addComponent(preco3, javax.swing.GroupLayout.PREFERRED_SIZE, 285, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(PainelLayout.createSequentialGroup()
                                .addComponent(Nome3)
                                .addGap(18, 18, 18)
                                .addComponent(nome3, javax.swing.GroupLayout.PREFERRED_SIZE, 285, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(35, 35, 35))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PainelLayout.createSequentialGroup()
                        .addComponent(confirma, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(163, 163, 163)))
                .addGap(19, 19, 19))
        );
        PainelLayout.setVerticalGroup(
            PainelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PainelLayout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(rolagem, javax.swing.GroupLayout.PREFERRED_SIZE, 234, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(PainelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Nome1)
                    .addComponent(nome1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(PainelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Preço1)
                    .addComponent(preco1))
                .addGap(33, 33, 33)
                .addGroup(PainelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Nome2)
                    .addComponent(nome2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(PainelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Preço2)
                    .addComponent(preco2))
                .addGap(37, 37, 37)
                .addGroup(PainelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Nome3)
                    .addComponent(nome3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(PainelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Preço3)
                    .addComponent(preco3))
                .addGap(31, 31, 31)
                .addComponent(confirma)
                .addContainerGap(10, Short.MAX_VALUE))
        );

        getContentPane().add(Painel);
        Painel.setBounds(50, 70, 490, 600);

        Fundo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Fundo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/Fundo.jpg"))); // NOI18N
        Fundo.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        getContentPane().add(Fundo);
        Fundo.setBounds(0, 0, 600, 720);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void confirmaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_confirmaActionPerformed
        // Ação do Botão de Confirmar:

        Selecao_Manual sm = new Selecao_Manual();
        sm.setVisible(true);
        dispose();
    }//GEN-LAST:event_confirmaActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        // Ação Quando a Janela Abre:

        descricao.setText(reg.analise);

        nome1.setText(reg.celulares.get(reg.indices[0]).nome);
        preco1.setText("R$" + reg.celulares.get(reg.indices[0]).preco);

        nome2.setText(reg.celulares.get(reg.indices[1]).nome);
        preco2.setText("R$" + reg.celulares.get(reg.indices[1]).preco);

        nome3.setText(reg.celulares.get(reg.indices[2]).nome);
        preco3.setText("R$" + reg.celulares.get(reg.indices[2]).preco);
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
            java.util.logging.Logger.getLogger(Resultado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Resultado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Resultado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Resultado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Resultado().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Fundo;
    private javax.swing.JLabel Nome1;
    private javax.swing.JLabel Nome2;
    private javax.swing.JLabel Nome3;
    private javax.swing.JPanel Painel;
    private javax.swing.JLabel Preço1;
    private javax.swing.JLabel Preço2;
    private javax.swing.JLabel Preço3;
    private javax.swing.JLabel Titulo;
    private javax.swing.JButton confirma;
    private javax.swing.JTextArea descricao;
    private javax.swing.JLabel nome1;
    private javax.swing.JLabel nome2;
    private javax.swing.JLabel nome3;
    private javax.swing.JLabel preco1;
    private javax.swing.JLabel preco2;
    private javax.swing.JLabel preco3;
    private javax.swing.JScrollPane rolagem;
    // End of variables declaration//GEN-END:variables
}
