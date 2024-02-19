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

public class Cliente1 {
    
    public static String host = "localhost";
    public static int puerto = 6003;
    Socket clienteSocket;
    
    public void conectarCliente(){
        try {
            clienteSocket = new Socket(host,puerto);
            System.out.println("Conectado al servidor: " + clienteSocket);
            
            
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }
    
    public void enviarCaracter(String caracter){
        System.out.println("Cliente envía el caracter "+caracter+": "+clienteSocket);
        try {
            // Establezco canal de comunicación con el cliente
            DataOutputStream salida = new DataOutputStream(clienteSocket.getOutputStream());
            // Envío el mensaje
            salida.writeUTF(caracter);
            
        } catch (IOException ex) {
            ex.getMessage();
        }
    }
    
    
}