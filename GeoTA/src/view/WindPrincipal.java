package view;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JButton;
import javax.swing.JFrame;

public class WindPrincipal extends javax.swing.JFrame {

    public WindPrincipal() {
        initComponents();
        EventoMouse eventoMouse = new EventoMouse(this);
        btnBairro.addMouseListener(eventoMouse); // Adicionar evento de mouse no mouse.
        btnOcorrencia.addMouseListener(eventoMouse);
        btnRelatorio.addMouseListener(eventoMouse);
    }

    private class EventoMouse extends MouseAdapter {

        private JButton botao;
        private JFrame windPrincipal;
        
        public EventoMouse(JFrame windPrincipal) {
            this.windPrincipal = windPrincipal;
        }
        
        
        @Override
        public void mouseClicked(MouseEvent e) {
            botao = (JButton)e.getSource(); // Usar cast para converter o local clicado em botão.
            
            switch(botao.getName()) {
                case "btnBairro":
                    WindCadastroBairro windCadastroBairro = new WindCadastroBairro();
                    windCadastroBairro.setTitle("Cadastro De Bairros");
                    this.windPrincipal.setVisible(false);
                    windCadastroBairro.setVisible(true);
                    break;
                case "btnOcorrencia":
                    WindOcorrencia windOcorrencia = new WindOcorrencia();
                    windOcorrencia.setTitle("Cadastro De Ocorrência");
                    this.windPrincipal.setVisible(false);
                    windOcorrencia.setVisible(true);
                    break;
                case "btnRelatorio":
                    WindRelatorio windRelatorio = new  WindRelatorio();
                    windRelatorio.setTitle("Cadastro De Relatório");
                    this.windPrincipal.setVisible(false);
                    windRelatorio.setVisible(true);
                    break;
            }
        }
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        windInicial = new javax.swing.JPanel();
        btnBairro = new javax.swing.JButton();
        btnOcorrencia = new javax.swing.JButton();
        btnRelatorio = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("GeoTA");
        setLocation(new java.awt.Point(300, 300));
        setResizable(false);

        btnBairro.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/imgBairro.png"))); // NOI18N
        btnBairro.setToolTipText("Cadastrar Bairro");
        btnBairro.setName("btnBairro"); // NOI18N

        btnOcorrencia.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/imgOcorrencia.png"))); // NOI18N
        btnOcorrencia.setToolTipText("Cadastrar Ocorrência");
        btnOcorrencia.setName("btnOcorrencia"); // NOI18N

        btnRelatorio.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/imgRelatorios.png"))); // NOI18N
        btnRelatorio.setToolTipText("Relatórios");
        btnRelatorio.setName("btnRelatorio"); // NOI18N

        javax.swing.GroupLayout windInicialLayout = new javax.swing.GroupLayout(windInicial);
        windInicial.setLayout(windInicialLayout);
        windInicialLayout.setHorizontalGroup(
            windInicialLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(windInicialLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnBairro, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnOcorrencia, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnRelatorio, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        windInicialLayout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {btnBairro, btnOcorrencia});

        windInicialLayout.setVerticalGroup(
            windInicialLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(windInicialLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(windInicialLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnRelatorio)
                    .addGroup(windInicialLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btnBairro, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnOcorrencia)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        windInicialLayout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {btnBairro, btnOcorrencia});

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(windInicial, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(windInicial, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

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
            java.util.logging.Logger.getLogger(WindPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(WindPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(WindPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(WindPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new WindPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBairro;
    private javax.swing.JButton btnOcorrencia;
    private javax.swing.JButton btnRelatorio;
    private javax.swing.JPanel windInicial;
    // End of variables declaration//GEN-END:variables
}
