package app;

import javax.swing.DefaultListModel;

public class JLista extends javax.swing.JPanel {
    
    public String[] elementos = { "Elemento C", "Elemento D", "Elemento F", 
                                  "Elemento B", "Elemento E", "Elemento A" };
    
    
    public JLista() {
        initComponents();

    }

    public String[] getElementos() {
        return elementos;
    }

    public void setElementos(String[] elementos) {
        this.elementos = elementos;
    }

    
    
    public String getLeyendaBajar() {
        return jbtnBajar.getText ();
    }

    public void setLeyendaBajar ( String bajar ) {
        jbtnBajar.setText ( bajar );
    }

    public String getLeyendaPrimero() {
        return jbtnPrimero.getText ();
    }

    public void setLeyendaPrimero( String primero ) {
        jbtnPrimero.setText ( primero );
    }

    public String getLeyendaSubir() {
        return jbtnSubir.getText ();
    }

    public void setLeyendaSubir(String subir) {
        jbtnSubir.setText ( subir );
    }

    public String getLeyendaUltimo() {
        return jbtnUltimo.getText ();
    }

    public void setLeyendaUltimo(String ultimo) {
        jbtnUltimo.setText ( ultimo );
    }
    
    
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jListElementos = new javax.swing.JList<>();
        jLabel1 = new javax.swing.JLabel();
        jbtnSubir = new javax.swing.JButton();
        jbtnBajar = new javax.swing.JButton();
        jbtnPrimero = new javax.swing.JButton();
        jbtnUltimo = new javax.swing.JButton();

        jListElementos.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Elemento C", "Elemento D", "Elemento F", "Elemento B", "Elemento E", "Elemento A" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jScrollPane1.setViewportView(jListElementos);

        jLabel1.setText("Elementos:");

        jbtnSubir.setText("Subir");
        jbtnSubir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnSubirActionPerformed(evt);
            }
        });

        jbtnBajar.setText("Bajar");
        jbtnBajar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnBajarActionPerformed(evt);
            }
        });

        jbtnPrimero.setText("Primero");
        jbtnPrimero.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnPrimeroActionPerformed(evt);
            }
        });

        jbtnUltimo.setText("Ultimo");
        jbtnUltimo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnUltimoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jbtnPrimero, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jbtnBajar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jbtnSubir, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jbtnUltimo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap(44, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jbtnSubir)
                        .addGap(18, 18, 18)
                        .addComponent(jbtnBajar)
                        .addGap(18, 18, 18)
                        .addComponent(jbtnPrimero)
                        .addGap(18, 18, 18)
                        .addComponent(jbtnUltimo))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 213, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(22, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jbtnSubirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnSubirActionPerformed
       int indice = jListElementos.getSelectedIndex ();
       String aux = jListElementos.getSelectedValue ();
       elementos [ indice ] = elementos [ indice - 1 ];
       elementos [ indice - 1] = aux;
       jListElementos.removeAll ();
       jListElementos.setListData ( elementos );
       
               
    }//GEN-LAST:event_jbtnSubirActionPerformed

    private void jbtnBajarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnBajarActionPerformed
       int indice = jListElementos.getSelectedIndex ();
       String aux = jListElementos.getSelectedValue ();
       elementos [ indice ] = elementos [ indice + 1 ];
       elementos [ indice + 1] = aux;
       jListElementos.removeAll ();
       jListElementos.setListData ( elementos );
    }//GEN-LAST:event_jbtnBajarActionPerformed

    private void jbtnPrimeroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnPrimeroActionPerformed
       int indice = jListElementos.getSelectedIndex ();
       String aux = jListElementos.getSelectedValue ();
       elementos [ indice ] = elementos [ indice + 1 ];
       elementos [ 0 ] = aux;
       jListElementos.removeAll ();
       jListElementos.setListData ( elementos );
       
    }//GEN-LAST:event_jbtnPrimeroActionPerformed

    private void jbtnUltimoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnUltimoActionPerformed
       
    }//GEN-LAST:event_jbtnUltimoActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JList<String> jListElementos;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton jbtnBajar;
    private javax.swing.JButton jbtnPrimero;
    private javax.swing.JButton jbtnSubir;
    private javax.swing.JButton jbtnUltimo;
    // End of variables declaration//GEN-END:variables
}
