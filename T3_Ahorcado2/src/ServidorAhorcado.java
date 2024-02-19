/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author juanf
 */
import java.io.*;
import java.net.*;
import java.util.*;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ServidorAhorcado {
    
    public static int puerto = 6003;
    
    ServerSocket servidorSocket;
    Socket cliente1;
    Socket cliente2;
    public boolean conectarServidor(){
        try {
            servidorSocket = new ServerSocket(puerto);
            System.out.println("Servidor listo para recibir conexiones...");
            
            cliente1 = servidorSocket.accept();
            System.out.println("Cliente 1 conectado");
            cliente2 = servidorSocket.accept();
            System.out.println("Cliente 2 conectado");
            
            servidorSocket.close();
            return true;
        } catch (IOException ex) {
            ex.printStackTrace();
            return false;
        }
    }
    
    // Métodos para recoger el mensaje de cada jugador
    public String recogerMensaje1(){
        try {
            // Establezco conexión con el cliente1
            DataInputStream entrada = new DataInputStream(cliente1.getInputStream());
            // Recojo el mensaje
            String mensaje = entrada.readUTF();
            
            return mensaje;
        } catch (IOException ex) {
            ex.getMessage();
            return "Error, no se ha recogido el mensaje";
        }
        
    }
    
    public String recogerMensaje2(){
        try {
            // Establezco conexión con el cliente1
            DataInputStream entrada = new DataInputStream(cliente2.getInputStream());
            // Recojo el mensaje
            String mensaje = entrada.readUTF();
            
            return mensaje;
        } catch (IOException ex) {
            ex.getMessage();
            return "Error, no se ha recogido el mensaje";
        }
        
    }
    
}


