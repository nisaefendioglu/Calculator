/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author NisaEfendioglu
 */
public class Calculator extends javax.swing.JFrame {

        int s1,s2,sonuc;
        int islemler;
    /**
     * Creates new form Tasarim
     */
    public Calculator() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jRadioButton1 = new javax.swing.JRadioButton();
        jRadioButton2 = new javax.swing.JRadioButton();
        cikti = new javax.swing.JPanel();
        girilenler = new javax.swing.JTextField();
        yedi = new javax.swing.JButton();
        sekiz = new javax.swing.JButton();
        dokuz = new javax.swing.JButton();
        alti = new javax.swing.JButton();
        bes = new javax.swing.JButton();
        dört = new javax.swing.JButton();
        üc = new javax.swing.JButton();
        iki = new javax.swing.JButton();
        bir = new javax.swing.JButton();
        sifir = new javax.swing.JButton();
        delete = new javax.swing.JButton();
        esittir = new javax.swing.JButton();
        topla = new javax.swing.JButton();
        cikar = new javax.swing.JButton();
        böl = new javax.swing.JButton();
        carp = new javax.swing.JButton();
        nokta = new javax.swing.JButton();

        jRadioButton1.setText("jRadioButton1");

        jRadioButton2.setText("jRadioButton2");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        cikti.setBackground(new java.awt.Color(204, 102, 255));

        girilenler.setBackground(new java.awt.Color(255, 153, 255));
        girilenler.setFont(new java.awt.Font("Dialog", 0, 48)); // NOI18N
        girilenler.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        girilenler.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        girilenler.setOpaque(false);
        girilenler.setSelectionColor(new java.awt.Color(204, 102, 255));
        girilenler.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                girilenlerActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout ciktiLayout = new javax.swing.GroupLayout(cikti);
        cikti.setLayout(ciktiLayout);
        ciktiLayout.setHorizontalGroup(
            ciktiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, ciktiLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(girilenler)
                .addContainerGap())
        );
        ciktiLayout.setVerticalGroup(
            ciktiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ciktiLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(girilenler, javax.swing.GroupLayout.DEFAULT_SIZE, 129, Short.MAX_VALUE)
                .addContainerGap())
        );

        yedi.setBackground(new java.awt.Color(255, 153, 255));
        yedi.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        yedi.setText("7");
        yedi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                yediActionPerformed(evt);
            }
        });

        sekiz.setBackground(new java.awt.Color(255, 153, 255));
        sekiz.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        sekiz.setText("8");
        sekiz.setMaximumSize(new java.awt.Dimension(37, 32));
        sekiz.setMinimumSize(new java.awt.Dimension(37, 32));
        sekiz.setPreferredSize(new java.awt.Dimension(37, 32));
        sekiz.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sekizActionPerformed(evt);
            }
        });

        dokuz.setBackground(new java.awt.Color(255, 153, 255));
        dokuz.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        dokuz.setText("9");
        dokuz.setMaximumSize(new java.awt.Dimension(37, 32));
        dokuz.setMinimumSize(new java.awt.Dimension(37, 32));
        dokuz.setPreferredSize(new java.awt.Dimension(37, 32));
        dokuz.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dokuzActionPerformed(evt);
            }
        });

        alti.setBackground(new java.awt.Color(255, 153, 255));
        alti.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        alti.setText("6");
        alti.setMaximumSize(new java.awt.Dimension(37, 32));
        alti.setMinimumSize(new java.awt.Dimension(37, 32));
        alti.setPreferredSize(new java.awt.Dimension(37, 32));
        alti.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                altiActionPerformed(evt);
            }
        });

        bes.setBackground(new java.awt.Color(255, 153, 255));
        bes.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        bes.setText("5");
        bes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                besActionPerformed(evt);
            }
        });

        dört.setBackground(new java.awt.Color(255, 153, 255));
        dört.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        dört.setText("4");
        dört.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dörtActionPerformed(evt);
            }
        });

        üc.setBackground(new java.awt.Color(255, 153, 255));
        üc.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        üc.setText("3");
        üc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ücActionPerformed(evt);
            }
        });

        iki.setBackground(new java.awt.Color(255, 153, 255));
        iki.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        iki.setText("2");
        iki.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ikiActionPerformed(evt);
            }
        });

        bir.setBackground(new java.awt.Color(255, 153, 255));
        bir.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        bir.setText("1");
        bir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                birActionPerformed(evt);
            }
        });

        sifir.setBackground(new java.awt.Color(255, 153, 255));
        sifir.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        sifir.setText("0");
        sifir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sifirActionPerformed(evt);
            }
        });

        delete.setBackground(new java.awt.Color(204, 102, 255));
        delete.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        delete.setText("C");
        delete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteActionPerformed(evt);
            }
        });

        esittir.setBackground(new java.awt.Color(204, 102, 255));
        esittir.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        esittir.setText("=");
        esittir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                esittirActionPerformed(evt);
            }
        });

        topla.setBackground(new java.awt.Color(204, 102, 255));
        topla.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        topla.setText("+");
        topla.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                toplaActionPerformed(evt);
            }
        });

        cikar.setBackground(new java.awt.Color(204, 102, 255));
        cikar.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        cikar.setText("-");
        cikar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cikarActionPerformed(evt);
            }
        });

        böl.setBackground(new java.awt.Color(204, 102, 255));
        böl.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        böl.setText("÷");
        böl.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bölActionPerformed(evt);
            }
        });

        carp.setBackground(new java.awt.Color(204, 102, 255));
        carp.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        carp.setText("x");
        carp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                carpActionPerformed(evt);
            }
        });

        nokta.setBackground(new java.awt.Color(204, 102, 255));
        nokta.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        nokta.setText(".");
        nokta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                noktaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(cikti, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(üc, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(alti, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(bes, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(iki, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addComponent(sifir, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(dört, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(cikar, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(bir, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(nokta, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(böl, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(carp, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(yedi, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(sekiz, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(dokuz, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(topla, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(delete, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(esittir, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 11, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(cikti, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(topla, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(dokuz, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(sekiz, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(delete, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(yedi, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED, 14, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(dört, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(bes, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(alti, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(cikar, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(9, 9, 9)
                                .addComponent(üc, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(iki, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(bir, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(böl, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(sifir, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(carp, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(nokta, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(esittir, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(13, 13, 13))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void yediActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_yediActionPerformed
        // TODO add your handling code here:
        girilenler.setText(girilenler.getText()+"7");
    }//GEN-LAST:event_yediActionPerformed

    private void sekizActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sekizActionPerformed
        // TODO add your handling code here:
        girilenler.setText(girilenler.getText()+"8");
    }//GEN-LAST:event_sekizActionPerformed

    private void dörtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dörtActionPerformed
        // TODO add your handling code here:
        girilenler.setText(girilenler.getText()+"4");
    }//GEN-LAST:event_dörtActionPerformed

    private void birActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_birActionPerformed
            girilenler.setText(girilenler.getText()+"1");
    }//GEN-LAST:event_birActionPerformed

    private void sifirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sifirActionPerformed
            girilenler.setText(girilenler.getText()+"0");
    }//GEN-LAST:event_sifirActionPerformed

    private void besActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_besActionPerformed
        // TODO add your handling code here:
        girilenler.setText(girilenler.getText()+"5");
    }//GEN-LAST:event_besActionPerformed

    private void ücActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ücActionPerformed
        // TODO add your handling code here:
        girilenler.setText(girilenler.getText()+"3");
    }//GEN-LAST:event_ücActionPerformed

    private void esittirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_esittirActionPerformed
        // TODO add your handling code here:
        //
       
        s2=Integer.parseInt(girilenler.getText());
        
        if(islemler==1){
            
            sonuc = s1 + s2;
           //girilenler.setText(s1+"+"+s2+"="+sonuc);
            girilenler.setText(Integer.toString(sonuc));
        }        
        else if(islemler==2){
            sonuc = s1 - s2;
           // 
            girilenler.setText(s1+"-"+s2+"="+sonuc);
            girilenler.setText(Integer.toString(sonuc));
        }
         else if(islemler==3){
             
            sonuc = s1 / s2;
           // girilenler.setText(s1+"/"+s2+"="+sonuc);
            girilenler.setText(Integer.toString(sonuc));
           // 
        }
         else if(islemler==4){
            sonuc = s1 * s2;
           // girilenler.setText(s1+"*"+s2+"="+sonuc);
            girilenler.setText(Integer.toString(sonuc));
        }
    }//GEN-LAST:event_esittirActionPerformed

    private void cikarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cikarActionPerformed
        // TODO add your handling code here:
        
         s1=Integer.parseInt(girilenler.getText());
        islemler=2;
        girilenler.setText("");
        
    }//GEN-LAST:event_cikarActionPerformed

    private void bölActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bölActionPerformed
        // TODO add your handling code here:
         s1=Integer.parseInt(girilenler.getText());
        islemler=3;
        girilenler.setText("");
        
    }//GEN-LAST:event_bölActionPerformed

    private void carpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_carpActionPerformed
        // TODO add your handling code here:
         s1=Integer.parseInt(girilenler.getText());
        islemler=4;
        girilenler.setText("");
        
    }//GEN-LAST:event_carpActionPerformed

    private void altiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_altiActionPerformed
        // TODO add your handling code here:
        girilenler.setText(girilenler.getText()+"6");
    }//GEN-LAST:event_altiActionPerformed

    private void toplaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_toplaActionPerformed
        
        s1=Integer.parseInt(girilenler.getText());
        islemler=1;
        girilenler.setText("");
        
    }//GEN-LAST:event_toplaActionPerformed

    private void girilenlerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_girilenlerActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_girilenlerActionPerformed

    private void dokuzActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dokuzActionPerformed
        // TODO add your handling code here:
        girilenler.setText(girilenler.getText()+"9");
    }//GEN-LAST:event_dokuzActionPerformed

    private void ikiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ikiActionPerformed
        // TODO add your handling code here:
        girilenler.setText(girilenler.getText()+"2");
    }//GEN-LAST:event_ikiActionPerformed

    private void deleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteActionPerformed
        // TODO add your handling code here:
       girilenler.setText("");
    }//GEN-LAST:event_deleteActionPerformed

    private void noktaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_noktaActionPerformed
        // TODO add your handling code here:
         girilenler.setText(girilenler.getText()+".");
    }//GEN-LAST:event_noktaActionPerformed

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
            java.util.logging.Logger.getLogger(Calculator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Calculator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Calculator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Calculator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Calculator().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton alti;
    private javax.swing.JButton bes;
    private javax.swing.JButton bir;
    private javax.swing.JButton böl;
    private javax.swing.JButton carp;
    private javax.swing.JButton cikar;
    private javax.swing.JPanel cikti;
    private javax.swing.JButton delete;
    private javax.swing.JButton dokuz;
    private javax.swing.JButton dört;
    private javax.swing.JButton esittir;
    private javax.swing.JTextField girilenler;
    private javax.swing.JButton iki;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JRadioButton jRadioButton2;
    private javax.swing.JButton nokta;
    private javax.swing.JButton sekiz;
    private javax.swing.JButton sifir;
    private javax.swing.JButton topla;
    private javax.swing.JButton yedi;
    private javax.swing.JButton üc;
    // End of variables declaration//GEN-END:variables
}
