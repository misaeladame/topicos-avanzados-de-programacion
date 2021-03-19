package pelotas;

public class PelotaRebotandoBean extends javax.swing.JPanel {

    Pelota pelota;
    
    public PelotaRebotandoBean() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jpnlMarcoPelota = new javax.swing.JPanel();
        jbtnIniciar = new javax.swing.JButton();
        jbtnDetener = new javax.swing.JButton();

        jpnlMarcoPelota.setBackground(new java.awt.Color(255, 255, 255));
        jpnlMarcoPelota.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        javax.swing.GroupLayout jpnlMarcoPelotaLayout = new javax.swing.GroupLayout(jpnlMarcoPelota);
        jpnlMarcoPelota.setLayout(jpnlMarcoPelotaLayout);
        jpnlMarcoPelotaLayout.setHorizontalGroup(
            jpnlMarcoPelotaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 207, Short.MAX_VALUE)
        );
        jpnlMarcoPelotaLayout.setVerticalGroup(
            jpnlMarcoPelotaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 215, Short.MAX_VALUE)
        );

        jbtnIniciar.setText("Iniciar");
        jbtnIniciar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnIniciarActionPerformed(evt);
            }
        });

        jbtnDetener.setText("Detener");
        jbtnDetener.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnDetenerActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jbtnIniciar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jbtnDetener))
                    .addComponent(jpnlMarcoPelota, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(11, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jpnlMarcoPelota, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbtnIniciar)
                    .addComponent(jbtnDetener))
                .addContainerGap(13, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jbtnIniciarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnIniciarActionPerformed
        pelota = new Pelota ( jpnlMarcoPelota );
        pelota.start ();
    }//GEN-LAST:event_jbtnIniciarActionPerformed

    private void jbtnDetenerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnDetenerActionPerformed
        pelota.seguirRebotando = false;
    }//GEN-LAST:event_jbtnDetenerActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jbtnDetener;
    private javax.swing.JButton jbtnIniciar;
    private javax.swing.JPanel jpnlMarcoPelota;
    // End of variables declaration//GEN-END:variables
}
