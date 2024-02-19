
import java.awt.Image;
import static java.lang.System.exit;
import java.util.ArrayList;
import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author juanf
 */
public class vistaPrincipal extends javax.swing.JFrame {

    // Variables para el socket
    ServidorAhorcado servidor = new ServidorAhorcado();
    boolean ganador = false;
    boolean jugador1Terminado = false;
    boolean jugador2Terminado = false;
 
    // Variables para el juego
    private static final String[] palabras = {"programacion", "sistemas", "basedatos", "fol", "entornos", "lenguajemarcas", "electroencefalografista", "procastinacion"};
    private String palabraSecreta;
    private ArrayList<String> letrasCorrectas;
    private ArrayList<String> letrasIncorrectas;
    private int vidasRestantes = 6; 
    ArrayList<JLabel> listaVidas = new ArrayList();

    
    
    public vistaPrincipal() {
        /* Si al iniciar el servidor y los dos clientes no se abre el frame de vistaPrincipal, comentar linea de abajo, compilar todo y descomentar linea*/
        initComponents();
        this.setLocationRelativeTo(this);

        ocultarJuego();
        servidor.conectarServidor();  

    }
    

    
    public synchronized String pedirLetraJugador1() {
        // Juega jugador1
        lbTurnoJugador.setText("Jugador 1");
        System.out.println("Esperando mensaje jugador 1...");
        String letraRecogida = servidor.recogerMensaje1().toLowerCase();
        System.out.println("Carácter recibido jugador 1: " + letraRecogida);

        jugador1Terminado = false;
        jugador2Terminado = true;
        
        return letraRecogida;
        
    }

    // Método para pedir letra para el jugador 2
    public synchronized String pedirLetraJugador2() {
        // Juega jugador2
        lbTurnoJugador.setText("Jugador 2");
        System.out.println("Esperando mensaje jugador 2...");
        String letraRecogida = servidor.recogerMensaje2().toLowerCase();
        System.out.println("Carácter recibido jugador 2: " + letraRecogida);

        jugador1Terminado = true;
        jugador2Terminado = false;
        
        return letraRecogida;
    }


    // Método que oculta todo hasta empezar a jugar
    public void ocultarJuego(){
        setVidas();
        panelVidas.setVisible(false);
        txtLetrasUtilizadas.setVisible(false);
        jLabel2.setVisible(false);
        jLabel3.setVisible(false);
        tfPalabraSecreta.setVisible(false);
        jLabel4.setVisible(false);
        lbTurnoJugador.setVisible(false);
        lbGanar.setVisible(false);
        lbPerder.setVisible(false);
    }
    
    // Método que recoge la letra seleccionada por el jugador
    public String getLetraSeleccionada(){
        String letraSeleccionada = servidor.recogerMensaje1(); 
        return letraSeleccionada;
    }
    
    
    // Métodos para añadir las vidas al frame
    private void setImageLabel(JLabel labelName, String root){
        ImageIcon image = new ImageIcon(root);
        Icon icon = new ImageIcon( image.getImage().getScaledInstance(labelName.getWidth(), labelName.getHeight(), Image.SCALE_DEFAULT));
        labelName.setIcon(icon);
        this.repaint();
                    
    }
    private void setVidas(){
        setImageLabel(vida1, "src/vida.png");
        setImageLabel(vida2, "src/vida.png");
        setImageLabel(vida3, "src/vida.png");
        setImageLabel(vida4, "src/vida.png");
        setImageLabel(vida5, "src/vida.png");
        setImageLabel(vida6, "src/vida.png");
        // se añaden las vidas a un arrayList de jLabel
        listaVidas.add(vida1);
        listaVidas.add(vida2);
        listaVidas.add(vida3);
        listaVidas.add(vida4);
        listaVidas.add(vida5);
        listaVidas.add(vida6);
    }

    

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtLetrasUtilizadas = new javax.swing.JTextArea();
        jLabel2 = new javax.swing.JLabel();
        panelVidas = new javax.swing.JPanel();
        vida6 = new javax.swing.JLabel();
        vida5 = new javax.swing.JLabel();
        vida1 = new javax.swing.JLabel();
        vida4 = new javax.swing.JLabel();
        vida3 = new javax.swing.JLabel();
        vida2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        tfPalabraSecreta = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        btJugar = new javax.swing.JButton();
        lbTurnoJugador = new javax.swing.JLabel();
        lbPerder = new javax.swing.JLabel();
        lbGanar = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Ahorcado rechulón");

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jLabel1.setText(" EL AHORCADO MULTIPLAYER");
        jLabel1.setPreferredSize(new java.awt.Dimension(166, 40));

        txtLetrasUtilizadas.setColumns(20);
        txtLetrasUtilizadas.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        txtLetrasUtilizadas.setRows(5);
        txtLetrasUtilizadas.setFocusable(false);
        jScrollPane1.setViewportView(txtLetrasUtilizadas);

        jLabel2.setText("LETRAS UTILIZADAS");

        vida6.setText("vida6");

        vida5.setText("vida5");

        vida1.setText("vida1");

        vida4.setText("vida4");

        vida3.setText("vida3");

        vida2.setText("vida2");

        javax.swing.GroupLayout panelVidasLayout = new javax.swing.GroupLayout(panelVidas);
        panelVidas.setLayout(panelVidasLayout);
        panelVidasLayout.setHorizontalGroup(
            panelVidasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelVidasLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(vida1, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(vida2, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(vida5, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(vida4, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(vida3, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(vida6, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(83, 83, 83))
        );
        panelVidasLayout.setVerticalGroup(
            panelVidasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelVidasLayout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addGroup(panelVidasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(vida2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, panelVidasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(vida5, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(vida1, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, panelVidasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(vida3, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(vida4, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(vida6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(21, Short.MAX_VALUE))
        );

        jLabel3.setText("PALABRA SECRETA");

        tfPalabraSecreta.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        tfPalabraSecreta.setText("Palabra secreta");
        tfPalabraSecreta.setFocusable(false);
        tfPalabraSecreta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfPalabraSecretaActionPerformed(evt);
            }
        });

        jLabel4.setText("ES EL TURNO DE:");

        btJugar.setBackground(new java.awt.Color(255, 255, 0));
        btJugar.setText("EMPEZAR JUEGO");
        btJugar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btJugarActionPerformed(evt);
            }
        });

        lbTurnoJugador.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        lbTurnoJugador.setText("Jugador 1");

        lbPerder.setBackground(new java.awt.Color(255, 102, 102));
        lbPerder.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        lbPerder.setForeground(new java.awt.Color(204, 0, 0));
        lbPerder.setText("HABÉIS PERDIDO");

        lbGanar.setBackground(new java.awt.Color(102, 255, 51));
        lbGanar.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        lbGanar.setForeground(new java.awt.Color(0, 204, 0));
        lbGanar.setText("HABÉIS GANADO");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 374, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(94, 94, 94))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btJugar, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 32, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addGap(150, 150, 150))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(tfPalabraSecreta, javax.swing.GroupLayout.PREFERRED_SIZE, 338, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(33, 33, 33))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(221, 221, 221)
                        .addComponent(jLabel4)
                        .addContainerGap())))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 535, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(220, 220, 220)
                        .addComponent(jLabel2)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(lbTurnoJugador, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(214, 214, 214))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lbGanar)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(lbPerder))
                            .addComponent(panelVidas, javax.swing.GroupLayout.PREFERRED_SIZE, 492, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(31, 31, 31))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btJugar, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addGap(18, 18, 18)
                        .addComponent(tfPalabraSecreta, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(30, 30, 30)
                .addComponent(jLabel2)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28)
                .addComponent(panelVidas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lbPerder, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lbGanar, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 71, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jLabel4)))
                .addGap(18, 18, 18)
                .addComponent(lbTurnoJugador, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(44, Short.MAX_VALUE))
        );

        jLabel1.getAccessibleContext().setAccessibleDescription("");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tfPalabraSecretaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfPalabraSecretaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfPalabraSecretaActionPerformed

    Thread juegoThread;
    private void btJugarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btJugarActionPerformed
        btJugar.setEnabled(false);
        encenderTablero();
        iniciarJuego();
        
        juegoThread = new Thread(new Runnable() {
            @Override
            public void run() {
                while (!ganador) {
                    if (jugador1Terminado) {
                        String letraJugador1 = pedirLetraJugador1();
                        juegaCliente(letraJugador1);    // El juego se actualiza con la letra que ha proporcionado el jugador
                        
                    } else {
                       String letraJugador2 = pedirLetraJugador2();
                       juegaCliente(letraJugador2);
                    }
                }
            }
        });

    juegoThread.start(); 
    }//GEN-LAST:event_btJugarActionPerformed

    private void encenderTablero(){
        panelVidas.setVisible(true);
        txtLetrasUtilizadas.setVisible(true);
        jLabel2.setVisible(true);
        jLabel3.setVisible(true);
        tfPalabraSecreta.setVisible(true);
        jLabel4.setVisible(true);
        lbTurnoJugador.setVisible(true);
    }
    
    
    // Método para el funcionamiento del juego mientras se juega
    public void iniciarJuego(){
        Random random = new Random();
        palabraSecreta = palabras[random.nextInt(palabras.length)];
        letrasCorrectas = new ArrayList<>();
        letrasIncorrectas = new ArrayList<>();
        
        
        System.out.println("Palabra secreta: "+palabraSecreta);
        tfPalabraSecreta.setText(obtenerPalabraOculta());
//        System.out.println("Palabra oculta: "+obtenerPalabraOculta());
        
        
    }
    // Método que recoge la letra del jugador y actualiza el juego
    public void juegaCliente(String pLetraJugador){
        // recoger letra del jugador
        String letraJugador = pLetraJugador;
        adivinarLetra(letraJugador);

        tfPalabraSecreta.setText(obtenerPalabraOculta());
//        System.out.println("Palabra oculta: "+obtenerPalabraOculta());
        
        if (adivinastePalabra()) {
            
            lbGanar.setVisible(true);
//        } else {
//            System.out.println("¡Oh no! Te has ahorcado. La palabra era: " + palabraSecreta);
        }
    }
    
    
    
    public void adivinarLetra(String letra) {
//        System.out.println("Entra en adivinar letra");
        if (palabraSecreta.indexOf(letra) != -1) {
            letrasCorrectas.add(letra);
            for (String letrasCorrecta : letrasCorrectas) {
//                System.out.println("Letras correctas: "+letrasCorrecta);
            }
            
        } else {
            letrasIncorrectas.add(letra);
            setTextArea();
            
            // Ocultar la vida correspondiente
            if (vidasRestantes > 1) {
                listaVidas.get(vidasRestantes - 1).setVisible(false);
                vidasRestantes--;
            }else{
                lbPerder.setVisible(true);      // Quito la última vida y se acaba el juego
                listaVidas.get(vidasRestantes - 1).setVisible(false);
                
                JOptionPane.showMessageDialog(null, "La palabra secreta es: "+palabraSecreta);
                panelVidas.setVisible(false);
                jLabel4.setVisible(false);
                lbTurnoJugador.setVisible(false);
            }
            
        }
    }
    
    // Método para añadir las letras utilizadas en el textArea
    public void setTextArea() {
        StringBuilder texto = new StringBuilder();
        for (String letraIncorrecta : letrasIncorrectas) { 
    
            texto.append(letraIncorrecta).append(" | ");  
        }

        txtLetrasUtilizadas.setText(texto.toString());
    }
    
    // Método para escribir la palabra secreta en el textField
    public String obtenerPalabraOculta() {
        StringBuilder palabraOculta = new StringBuilder();
        for (char c : palabraSecreta.toCharArray()) {
            if (letrasCorrectas.contains(c+"")) {
//                System.out.println("Letra correcta: "+c);
                palabraOculta.append(c+" ");
            } else {
                palabraOculta.append("_ ");
            }
        }
        return palabraOculta.toString();
    }
    
    // Método para verificar si has ganado
    public boolean adivinastePalabra() {
        
        if(!obtenerPalabraOculta().contains("_")){   // Si la palabra oculta (la que se está formando por turnos) no contiene el simbolo "_", has ganado
            return true;
        }

        return false;
    }
    
    
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
            java.util.logging.Logger.getLogger(vistaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(vistaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(vistaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(vistaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new vistaPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btJugar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lbGanar;
    private javax.swing.JLabel lbPerder;
    private javax.swing.JLabel lbTurnoJugador;
    private javax.swing.JPanel panelVidas;
    private javax.swing.JTextField tfPalabraSecreta;
    private javax.swing.JTextArea txtLetrasUtilizadas;
    private javax.swing.JLabel vida1;
    private javax.swing.JLabel vida2;
    private javax.swing.JLabel vida3;
    private javax.swing.JLabel vida4;
    private javax.swing.JLabel vida5;
    private javax.swing.JLabel vida6;
    // End of variables declaration//GEN-END:variables
}
