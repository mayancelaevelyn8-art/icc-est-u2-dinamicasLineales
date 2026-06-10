import java.util.ArrayDeque;

public class Ejercicio1 {

    ///
    /// Metodo que devuelve una cadena de
    /// texto invertida utilizando unicamente una pila.
    ///
    /// Ejemplo:
    /// texto -> COMPUTACION
    /// return -> NOICATUPMOC
    ///
    /// Restriccion:
    /// USAR SOLO PILAS COMO ESTRUCTURA AUXILIAR
    ///
    public String invertString(String texto) {
        ArrayDeque<Character> pila = new ArrayDeque<>();

        for (char letra : texto.toCharArray()) {
            pila.push(letra);
        }

        String invertido = "";
        while (!pila.isEmpty()) {
            invertido += pila.pop();
        }

        return invertido;
    }
}