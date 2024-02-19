
import java.io.DataOutputStream;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author juanf
 */
public class vistaJugador extends javax.swing.JFrame {

    Cliente1 cliente = new Cliente1();
    
    public vistaJugador() {
        initComponents();
        this.setLocationRelativeTo(this);
        
        cliente.conectarCliente();
    }

    
    // Método que actualiza tfLetraSeleccionada
    public void actualizarLetra(String letraSeleccionada){
        tfLetraSeleccionada.setText(letraSeleccionada);
    }
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        btA = new javax.swing.JButton();
        btB = new javax.swing.JButton();
        btC = new javax.swing.JButton();
        btD = new javax.swing.JButton();
        btE = new javax.swing.JButton();
        btH = new javax.swing.JButton();
        btI = new javax.swing.JButton();
        btJ = new javax.swing.JButton();
        btK = new javax.swing.JButton();
        btL = new javax.swing.JButton();
        btN = new javax.swing.JButton();
        btÑ = new javax.swing.JButton();
        btO = new javax.swing.JButton();
        btP = new javax.swing.JButton();
        btQ = new javax.swing.JButton();
        btR = new javax.swing.JButton();
        btS = new javax.swing.JButton();
        btT = new javax.swing.JButton();
        btU = new javax.swing.JButton();
        btV = new javax.swing.JButton();
        btW = new javax.swing.JButton();
        btX = new javax.swing.JButton();
        btY = new javax.swing.JButton();
        btZ = new javax.swing.JButton();
        btM = new javax.swing.JButton();
        btF = new javax.swing.JButton();
        btG = new javax.swing.JButton();
        tfLetraSeleccionada = new javax.swing.JTextField();
        btEnviar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("VistaJugador");
        setBackground(new java.awt.Color(102, 102, 102));

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 36)); // NOI18N
        jLabel1.setText("ESCRIBE TU LETRA");

        btA.setText("A");
        btA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btAActionPerformed(evt);
            }
        });

        btB.setText("B");
        btB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btBActionPerformed(evt);
            }
        });

        btC.setText("C");
        btC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btCActionPerformed(evt);
            }
        });

        btD.setText("D");
        btD.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btDActionPerformed(evt);
            }
        });

        btE.setText("E");
        btE.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btEActionPerformed(evt);
            }
        });

        btH.setText("H");
        btH.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btHActionPerformed(evt);
            }
        });

        btI.setText("I");
        btI.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btIActionPerformed(evt);
            }
        });

        btJ.setText("J");
        btJ.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btJActionPerformed(evt);
            }
        });

        btK.setText("K");
        btK.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btKActionPerformed(evt);
            }
        });

        btL.setText("L");
        btL.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btLActionPerformed(evt);
            }
        });

        btN.setText("N");
        btN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btNActionPerformed(evt);
            }
        });

        btÑ.setText("Ñ");
        btÑ.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btÑActionPerformed(evt);
            }
        });

        btO.setText("O");
        btO.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btOActionPerformed(evt);
            }
        });

        btP.setText("P");
        btP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btPActionPerformed(evt);
            }
        });

        btQ.setText("Q");
        btQ.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btQActionPerformed(evt);
            }
        });

        btR.setText("R");
        btR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btRActionPerformed(evt);
            }
        });

        btS.setText("S");
        btS.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btSActionPerformed(evt);
            }
        });

        btT.setText("T");
        btT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btTActionPerformed(evt);
            }
        });

        btU.setText("U");
        btU.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btUActionPerformed(evt);
            }
        });

        btV.setText("V");
        btV.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btVActionPerformed(evt);
            }
        });

        btW.setText("W");
        btW.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btWActionPerformed(evt);
            }
        });

        btX.setText("X");
        btX.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btXActionPerformed(evt);
            }
        });

        btY.setText("Y");
        btY.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btYActionPerformed(evt);
            }
        });

        btZ.setText("Z");
        btZ.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btZActionPerformed(evt);
            }
        });

        btM.setText("M");
        btM.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btMActionPerformed(evt);
            }
        });

        btF.setText("F");
        btF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btFActionPerformed(evt);
            }
        });

        btG.setText("G");
        btG.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btGActionPerformed(evt);
            }
        });

        tfLetraSeleccionada.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        tfLetraSeleccionada.setFocusable(false);
        tfLetraSeleccionada.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfLetraSeleccionadaActionPerformed(evt);
            }
        });

        btEnviar.setBackground(new java.awt.Color(255, 255, 0));
        btEnviar.setText("ENVIAR");
        btEnviar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btEnviarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(20, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btÑ, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btO, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btP, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btQ, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btR, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btS, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btT, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btU, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btV, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btW, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btX, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btY, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btZ, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btEnviar, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jLabel1)
                                .addGroup(layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(btH, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(btA, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(btI, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(btJ, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(btK, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(btL, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(btM, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(btN, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(btB, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(btC, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(btD, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(btE, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(btF, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(btG, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                        .addGap(21, 21, 21))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(tfLetraSeleccionada, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(173, 173, 173))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(tfLetraSeleccionada, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btA, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btB, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btC, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btD, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btE, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btF, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btG, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btH, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btI, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btJ, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btK, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btL, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btN, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btM, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btÑ, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btO, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btP, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btQ, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btR, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btS, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btT, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btU, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btV, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btW, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btX, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btY, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btZ, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btEnviar, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(21, 21, 21))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btAActionPerformed
        actualizarLetra("A");
    }//GEN-LAST:event_btAActionPerformed

    private void btBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btBActionPerformed
        actualizarLetra("B");
    }//GEN-LAST:event_btBActionPerformed

    private void btCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btCActionPerformed
        actualizarLetra("C");
    }//GEN-LAST:event_btCActionPerformed

    private void btIActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btIActionPerformed
        actualizarLetra("I");
    }//GEN-LAST:event_btIActionPerformed

    private void btNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btNActionPerformed
        actualizarLetra("N");
    }//GEN-LAST:event_btNActionPerformed

    private void btUActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btUActionPerformed
        actualizarLetra("U");
    }//GEN-LAST:event_btUActionPerformed

    private void btEActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btEActionPerformed
        actualizarLetra("E");
    }//GEN-LAST:event_btEActionPerformed

    private void btFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btFActionPerformed
       actualizarLetra("F");
    }//GEN-LAST:event_btFActionPerformed

    private void btGActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btGActionPerformed
        actualizarLetra("G");
    }//GEN-LAST:event_btGActionPerformed

    private void btHActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btHActionPerformed
        actualizarLetra("H");
    }//GEN-LAST:event_btHActionPerformed

    private void btJActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btJActionPerformed
        actualizarLetra("J");
    }//GEN-LAST:event_btJActionPerformed

    private void btKActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btKActionPerformed
        actualizarLetra("K");
    }//GEN-LAST:event_btKActionPerformed

    private void btLActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btLActionPerformed
        actualizarLetra("L");
    }//GEN-LAST:event_btLActionPerformed

    private void btMActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btMActionPerformed
        actualizarLetra("M");
    }//GEN-LAST:event_btMActionPerformed

    private void btÑActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btÑActionPerformed
        actualizarLetra("Ñ");
    }//GEN-LAST:event_btÑActionPerformed

    private void btOActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btOActionPerformed
        actualizarLetra("O");
    }//GEN-LAST:event_btOActionPerformed

    private void btPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btPActionPerformed
        actualizarLetra("P");
    }//GEN-LAST:event_btPActionPerformed

    private void btQActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btQActionPerformed
        actualizarLetra("Q");
    }//GEN-LAST:event_btQActionPerformed

    private void btRActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btRActionPerformed
        actualizarLetra("R");
    }//GEN-LAST:event_btRActionPerformed

    private void btSActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btSActionPerformed
        actualizarLetra("S");
    }//GEN-LAST:event_btSActionPerformed

    private void btTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btTActionPerformed
        actualizarLetra("T");
    }//GEN-LAST:event_btTActionPerformed

    private void btVActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btVActionPerformed
        actualizarLetra("V");
    }//GEN-LAST:event_btVActionPerformed

    private void btWActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btWActionPerformed
        actualizarLetra("W");
    }//GEN-LAST:event_btWActionPerformed

    private void btXActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btXActionPerformed
        actualizarLetra("X");
    }//GEN-LAST:event_btXActionPerformed

    private void btYActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btYActionPerformed
        actualizarLetra("Y");
    }//GEN-LAST:event_btYActionPerformed

    private void btZActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btZActionPerformed
        actualizarLetra("Z");
    }//GEN-LAST:event_btZActionPerformed

    private void btDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btDActionPerformed
        actualizarLetra("D");
    }//GEN-LAST:event_btDActionPerformed

    
    
    
    private void btEnviarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btEnviarActionPerformed
        // TODO add your handling code here:
        String caracterElegido = tfLetraSeleccionada.getText();
        cliente.enviarCaracter(caracterElegido);
        
        // Switch para cancelar el botón que ya ha sido elegido, para facilitar el juego
        switch (caracterElegido){
            case "A":
                btA.setEnabled(false);
                break;
            case "B":
                btB.setEnabled(false);
                break;
            case "C":
                btC.setEnabled(false);
                break;
            case "D":
                btD.setEnabled(false);
                break;
            case "E":
                btE.setEnabled(false);
                break;
            case "F":
                btF.setEnabled(false);
                break;
            case "G":
                btG.setEnabled(false);
                break;
            case "H":
                btH.setEnabled(false);
                break;
            case "I":
                btI.setEnabled(false);
                break;
            case "J":
                btJ.setEnabled(false);
                break;
            case "K":
                btK.setEnabled(false);
                break;
            case "L":
                btL.setEnabled(false);
                break;
            case "M":
                btM.setEnabled(false);
                break;
            case "N":
                btN.setEnabled(false);
                break;
            case "Ñ":
                btÑ.setEnabled(false);
                break;
            case "O":
                btO.setEnabled(false);
                break;
            case "P":
                btP.setEnabled(false);
                break;
            case "Q":
                btQ.setEnabled(false);
                break;
            case "R":
                btR.setEnabled(false);
                break;
            case "S":
                btS.setEnabled(false);
                break;
            case "T":
                btT.setEnabled(false);
                break;
            case "U":
                btU.setEnabled(false);
                break;
            case "V":
                btV.setEnabled(false);
                break;
            case "W":
                btW.setEnabled(false);
                break;
            case "X":
                btX.setEnabled(false);
                break;
            case "Y":
                btY.setEnabled(false);
                break;
            case "Z":
                btZ.setEnabled(false);
                break;     
        }          
    }//GEN-LAST:event_btEnviarActionPerformed

    private void tfLetraSeleccionadaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfLetraSeleccionadaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfLetraSeleccionadaActionPerformed

    
    
    
    
    
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
            java.util.logging.Logger.getLogger(vistaJugador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(vistaJugador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(vistaJugador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(vistaJugador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new vistaJugador().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btA;
    private javax.swing.JButton btB;
    private javax.swing.JButton btC;
    private javax.swing.JButton btD;
    private javax.swing.JButton btE;
    private javax.swing.JButton btEnviar;
    private javax.swing.JButton btF;
    private javax.swing.JButton btG;
    private javax.swing.JButton btH;
    private javax.swing.JButton btI;
    private javax.swing.JButton btJ;
    private javax.swing.JButton btK;
    private javax.swing.JButton btL;
    private javax.swing.JButton btM;
    private javax.swing.JButton btN;
    private javax.swing.JButton btO;
    private javax.swing.JButton btP;
    private javax.swing.JButton btQ;
    private javax.swing.JButton btR;
    private javax.swing.JButton btS;
    private javax.swing.JButton btT;
    private javax.swing.JButton btU;
    private javax.swing.JButton btV;
    private javax.swing.JButton btW;
    private javax.swing.JButton btX;
    private javax.swing.JButton btY;
    private javax.swing.JButton btZ;
    private javax.swing.JButton btÑ;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JTextField tfLetraSeleccionada;
    // End of variables declaration//GEN-END:variables
}
