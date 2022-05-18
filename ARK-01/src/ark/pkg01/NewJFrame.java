package ark.pkg01;

import java.awt.Color;
import java.util.Random;

public class NewJFrame extends javax.swing.JFrame {

    Random random = new Random();
    int valor = random.nextInt(1000);
    int diferencaAnterior;
    int m;

    public NewJFrame() {
        initComponents();
        NovoJogo.setVisible(false);
        resutado.setEditable(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        campoValor1 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        msg = new javax.swing.JLabel();
        resutado = new javax.swing.JTextField();
        msg2 = new javax.swing.JLabel();
        NovoJogo = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("ARK-01");
        setBackground(new java.awt.Color(255, 255, 255));
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(204, 204, 204));
        jPanel1.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));

        jLabel1.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel1.setText("Eu tenho um numero entre 1 e 1000, você pode adivinhá-lo ?");

        campoValor1.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N

        jButton1.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jButton1.setText("Verificar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        msg.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        msg.setText(" ");

        resutado.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N

        msg2.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        msg2.setText(" ");

        NovoJogo.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        NovoJogo.setText("Novo Jogo");
        NovoJogo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NovoJogoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(resutado, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(campoValor1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton1))
                    .addComponent(msg, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(0, 70, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(msg2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(NovoJogo, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(campoValor1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(msg)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(resutado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(msg2)
                    .addComponent(NovoJogo))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jMenu1.setText("Sobre");

        jMenuItem1.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_C, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        jMenuItem1.setText("Dados do Progama ");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem1);

        jMenuBar1.add(jMenu1);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        int campoValor = 0;
        int diferenca = 0;
        msg.setText("");
        try {
            campoValor = Integer.parseInt(campoValor1.getText().trim());
            campoValor1.setText("");
            m = m + 1;
        } catch (Exception e) {
            campoValor1.setText("");
            msg.setText("Digite um numero");
        }

        if (campoValor != this.valor) {
            if (campoValor < valor) {
                while (campoValor != valor) {
                    campoValor += 1;
                    diferenca += 1;
                }
                if (diferenca >= diferencaAnterior) {
                    resutado.setBackground(Color.RED);
                    resutado.setText("");
                    msg2.setText("Mais Longe");
                    diferencaAnterior = diferenca;
                } else {
                    resutado.setBackground(Color.GREEN);
                    resutado.setText("");
                    msg2.setText("Mais Perto");
                    diferencaAnterior = diferenca;
                }
            }

            if (campoValor > valor) {
                while (campoValor != valor) {
                    campoValor -= 1;
                    diferenca += 1;
                }
                if (diferenca >= diferencaAnterior) {
                    resutado.setBackground(Color.RED);
                    resutado.setText("");
                    msg2.setText("Mais Longe");
                    diferencaAnterior = diferenca;
                } else {
                    resutado.setBackground(Color.GREEN);
                    resutado.setText("");
                    msg2.setText("Mais Perto");
                    diferencaAnterior = diferenca;
                }
            }
            if (m >= 10) {
                System.out.println("Valor:" + valor);
            }

            if (m == 1) {
                resutado.setBackground(Color.GREEN);
                resutado.setText("");
                msg2.setText("Mais Perto");
                diferencaAnterior = diferenca;
            }
        } else {
            msg2.setText("Correto o numero é: " + campoValor +".");
            resutado.setBackground(Color.GREEN);
            campoValor1.setEditable(false);
            NovoJogo.setVisible(true);
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void NovoJogoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NovoJogoActionPerformed
        valor = random.nextInt(1000);
        campoValor1.setEditable(true);
        campoValor1.setText("");
        msg2.setText("");
        resutado.setBackground(Color.white);
        NovoJogo.setVisible(false);
    }//GEN-LAST:event_NovoJogoActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
         Sobre sobre = new Sobre();
        sobre.setVisible(true);
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new NewJFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton NovoJogo;
    private javax.swing.JTextField campoValor1;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel msg;
    private javax.swing.JLabel msg2;
    private javax.swing.JTextField resutado;
    // End of variables declaration//GEN-END:variables
}
