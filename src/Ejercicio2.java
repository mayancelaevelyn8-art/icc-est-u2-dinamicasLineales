import java.util.ArrayDeque;
public class Ejercicio2 {

    ///
    /// Metodo que verifica si una cadena de texto
    /// es palindroma usando una pila.
    ///
    /// Un texto es palindromo cuando se lee igual
    /// de izquierda a derecha y de derecha a izquierda.
    ///
    /// Ejemplo:
    /// texto -> radar
    /// return -> true
    ///
    /// texto -> computacion
    /// return -> false
    ///
    /// Restriccion:
    /// USAR SOLO PILAS COMO ESTRUCTURA AUXILIAR
    ///
    public boolean esPalindromo(String texto) {
        ArrayDeque<Character> pila = new ArrayDeque<>();

        for (char letra : texto.toCharArray()) {
            pila.push(letra);
        }

        String invertido = "";
        while (!pila.isEmpty()) {
            invertido += pila.pop();
        }

        return texto.equals(invertido);
    }
}