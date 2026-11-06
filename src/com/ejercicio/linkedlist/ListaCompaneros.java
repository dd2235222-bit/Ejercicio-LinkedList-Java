package com.ejercicio.linkedlist;

import java.util.LinkedList;
import java.util.ListIterator;

public class ListaCompaneros {
    
    public static void main(String[] args) {
        
        // 1. Crear la LinkedList
        LinkedList<String> companeros = new LinkedList<>();

        System.out.println("--- 1. AGREGANDO COMPAÑEROS ---");
        
        // Usando addFirst y addLast para demostrar los métodos
        companeros.addFirst("PROFESOR (Al inicio)");
        
        // Agregando a los compañeros (incluyéndote)
        companeros.add("Diego Alejandro Alejandres Corona");
        companeros.add("Johan Alessandro Moreno Correa");
        companeros.add("Erick Lira Hernández");
        companeros.add("Eduardo Oropeza Santiago");
        companeros.add("Osorio Gomez Desailly");
        companeros.add("Martínez Díaz Misaid Michel");
        companeros.add("Luis Antonio Higuera Jiménez");
        companeros.add("Valdez Arroyo Jack Donaldo");
        companeros.add("González Hernández Victor Daniel");
        companeros.add("Alvarez Perales Harumi Regina");
        companeros.add("Martinez Alvarez Angel Adrian");
        companeros.add("Carrizales Sánchez Armando Saul");
        
        companeros.addLast("ALUMNO NUEVO (Al final)");    
        
        System.out.println("Lista actual de la clase:");
        System.out.println(companeros);

        System.out.println("\n--- 2. CONSULTANDO ELEMENTOS ---");
        // Métodos getFirst(), getLast(), get(), size()
        System.out.println("Primer elemento de la lista: " + companeros.getFirst());
        System.out.println("Último elemento de la lista: " + companeros.getLast());
        System.out.println("Compañero en la posición 3: " + companeros.get(3));
        System.out.println("Total de personas en la lista: " + companeros.size());

        System.out.println("\n--- 3. BUSCANDO COMPAÑEROS ---");
        // Métodos contains(), indexOf()
        boolean existeErick = companeros.contains("Erick Lira Hernández");
        System.out.println("¿Está Erick en la lista? " + existeErick);
        System.out.println("Posición de Victor Daniel: " + companeros.indexOf("González Hernández Victor Daniel"));

        System.out.println("\n--- 4. MODIFICANDO Y ELIMINANDO ---");
        // Método set() (Vamos a corregir el nombre de Osorio)
        companeros.set(5, "Gómez Desailly Osorio"); 
        System.out.println("Lista tras modificar un nombre: " + companeros.get(5));

        // Métodos removeFirst(), removeLast(), remove()
        companeros.removeFirst(); // Elimina al "PROFESOR"
        companeros.removeLast();  // Elimina al "ALUMNO NUEVO"
        companeros.remove("Martinez Alvarez Angel Adrian"); // Elimina a Angel Adrian
        System.out.println("\nLista tras eliminar al profesor, al alumno nuevo y a Angel Adrian:");
        System.out.println(companeros);

        System.out.println("\n--- 5. RECORRIENDO LA LISTA FINAL ---");
        // Usando un iterador
        ListIterator<String> iterador = companeros.listIterator();
        System.out.println("Recorriendo la lista de compañeros restantes:");
        while (iterador.hasNext()) {
            System.out.println("- " + iterador.next());
        }
        
        // Método clear() para vaciar la lista
        companeros.clear();
        System.out.println("\n¿La lista está vacía al final? " + companeros.isEmpty());
    }
}