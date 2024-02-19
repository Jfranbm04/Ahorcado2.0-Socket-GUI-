/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author juanf
 */
import java.util.Scanner;
import java.util.Random;
import java.util.ArrayList;

public class JuegoAhorcado {  
    private static final String[] palabras = {"programacion", "sistemas", "basedatos", "fol", "entornos", "lenguajemarcas", "electroencefalograficsta"};
    private String palabraSecreta;
    private ArrayList<Character> letrasCorrectas;
    private ArrayList<Character> letrasIncorrectas;
    private int intentosRestantes;

    // Constructor
    public JuegoAhorcado() {
        Random random = new Random();
        palabraSecreta = palabras[random.nextInt(palabras.length)];
        letrasCorrectas = new ArrayList<>();
        letrasIncorrectas = new ArrayList<>();
        intentosRestantes = 6; // Se dibujará el ahorcado en 6 intentos
    }

    // getters y setters necesarios
    public int getIntentosRestantes() {
        return this.intentosRestantes;
    }

    // Métodos
 
    public void jugar() {
        Scanner scanner = new Scanner(System.in);
        while (intentosRestantes > 0 && !adivinastePalabra()) {
            mostrarEstadoJuego();
            System.out.print("Ingresa una letra: ");
            char letra = scanner.next().charAt(0);
            adivinarLetra(letra);
        }

        if (adivinastePalabra()) {
            System.out.println("¡Felicidades, has sobrevivido!");
        } else {
            System.out.println("¡Oh no! Te has ahorcado. La palabra era: " + palabraSecreta);
        }
    }

    public void adivinarLetra(char letra) {
        if (palabraSecreta.indexOf(letra) != -1) {
            letrasCorrectas.add(letra);
        } else {
            letrasIncorrectas.add(letra);
            intentosRestantes--;
        }
    }

    public boolean adivinastePalabra() {
        for (char c : palabraSecreta.toCharArray()) {
            if (!letrasCorrectas.contains(c)) {
                return false;
            }
        }
        return true;
    }

    public void mostrarEstadoJuego() {
        System.out.println("Palabra: " + obtenerPalabraOculta());
        System.out.println("Letras correctas: " + letrasCorrectas);
        System.out.println("Letras incorrectas: " + letrasIncorrectas);
        System.out.println("Palabras usadas: " + letrasIncorrectas);
        System.out.println("Intentos restantes: " + intentosRestantes);
    }

    public String obtenerPalabraOculta() {
        StringBuilder palabraOculta = new StringBuilder();
        for (char c : palabraSecreta.toCharArray()) {
            if (letrasCorrectas.contains(c)) {
                palabraOculta.append(c);
            } else {
                palabraOculta.append("_");
            }
        }
        return palabraOculta.toString();
    }

    public String getPalabraSecreta() {
        return palabraSecreta;
    }
    
    public static void main(String[] args) {
        JuegoAhorcado juego = new JuegoAhorcado();
        juego.jugar();
    }
}