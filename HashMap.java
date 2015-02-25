import java.util.ArrayList;
import pkg.ArrayListInt;

/**
 * Write a description of class HashMap here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class HashMap
{
    // Coleccion para almacenar las claves string
    private ArrayList<String> claves;
    // Colección de int para guardar los valores
    private ArrayListInt valores;

    /**
     * Constructor for objects of class HashMap
     */
    public HashMap()
    {
        claves = new ArrayList<String>();
        valores = new ArrayListInt();
    }

    /**
     * Metodo para introducir un valor al hashmap
     * @param clave La clave a introducir
     * @param valor El valor asociado a la clave
     * @return Si la clave no existia, retorna -1. Si ya
     *          existia sobreescribe el valor y lo retorna
     */
    public int put(String clave, int valor)
    {
        // Creamos el entero a retornar
        int retornar = -1;
        // Si la arraylist ya contiene la clave, cojemos ese indice para
        // añadirlo en la misma posicion a valores, y salvamos el valor anterior para retornarlo
        if(claves.contains(clave))
        {
            int indice = claves.indexOf(clave);
            retornar = valores.get(indice);
            valores.add(indice, valor);
        }
        // Si no existia ya la clave, lo añadimos sin mas al final de las listas
        else
        {
            claves.add(clave);
            valores.add(valor);
        }
        return retornar;
    }

    /**
     * Metodo que devuelve el valor asociado a una clave
     * @param clave, La clave para buscar
     * @return El valor asociado a la clave, o -1 si no existe la clave
     */
    public int get(String clave)
    {
        // Creamos el entero a retornar
        int retornar = -1;
        // Si la arraylist ya contiene la clave, tomamos el valor a devolver
        if(claves.contains(clave))
        {
            int indice = claves.indexOf(clave);
            retornar = valores.get(indice);
        }
        return retornar;
    }

    /**
     * Metodo que comprueba si el mapa contiene o no elementos
     * @return True si esta vacia, false si contiene elementos
     */
    public boolean isEmpty()
    {
        // Debemos comprobar que ambas listas esten vacias
        return ((claves.isEmpty()) && (valores.isEmpty()));
    }

    /**
     * Metodo que devuelve el número de elementos en el mapa
     * @return El número de elementos en el mapa
     */
    public int size()
    {

    }

    /**
     * Metodo que elimina el elemento de la clave dada
     * @param clave La clave del elemento a eliminar
     * @return Su valor si existia la clave, -1 sino
     */
    public int remove(String clave)
    {

    }

    /**
     * Metodo que vacia el mapa de elementos
     */
    public void clear()
    {

    }

    /**
     * Metodo que comprueba si una clave existe ya en el hashmap
     * @param La clave a buscar
     * @return True si ya existe, false si no
     */
    public boolean containsKey(String clave)
    {

        return retornar;
    }

    /**
     * Metodo para comprobar si un valor ya existe en el hashmap
     * @param valor El valor a comprobar si ya existe
     * @return True si el valor existe, false si no
     */
    public boolean containsValue(int valor)
    {

        return encontrada;
    }
}
