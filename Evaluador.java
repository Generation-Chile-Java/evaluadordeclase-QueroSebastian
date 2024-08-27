package Tarea;

import java.util.Scanner;

public class Evaluador {
    public static void main(String[] args) {
        Scanner notaMateria = new Scanner(System.in);

        double lenguaje, matematicas, biologia; // almaceno las notas de las 3 materias en un double

        System.out.print("Ingresa la nota de lenguaje: "); // notas primera materia
        lenguaje = notaMateria.nextDouble(); // le otorgo el valor a la primera materia en consola

        System.out.print("Ingresa la nota de matemáticas: "); // notas segunda materia
        matematicas = notaMateria.nextDouble(); // le otorgo el valor a la segunda materia en consola

        System.out.print("Ingresa la nota de biologia: "); // notas tercera materia
        biologia = notaMateria.nextDouble(); // le otorgo el valor a la tercera materia en consola

        System.out.println("Calificación de lenguaje es: " + evaluarNota(lenguaje)); // con el metodo evaluarNota utilizo el
        System.out.println("Calificación de matematicas es: " + evaluarNota(matematicas));
        System.out.println("Calificación de biologia es: " + evaluarNota(biologia));

        notaMateria.close(); // Evito la fuga de recursos con el metodo de cierre luego de mi Scanner
    }

    public static String evaluarNota(double nota) { // Evaluar mis notas por rango
        if (nota > 8 && nota <= 10) {
            return "Excelente";
        } else if (nota > 5 && nota <= 8) {
            return "Aceptable";
        } else if (nota > 3 && nota <= 5) {
            return "Insuficiente";
        } else if (nota >= 0 && nota < 3) {
            return "No aprobado";
        } else {
            return "Entrada es inválida";
        }
    }
}
