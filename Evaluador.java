package Tarea;

import java.util.Scanner;

public class Evaluador {
    public static void main(String[] args) {
        Scanner notaMateria = new Scanner(System.in);

        double nota1, nota2, nota3; // almaceno las notas de las 3 materias en un double

        System.out.print("Ingresa la nota de la primera materia: "); // notas primera materia
        nota1 = notaMateria.nextDouble(); // le otorgo el valor a la primera materia en consola

        System.out.print("Ingresa la nota de la segunda materia: "); // notas segunda materia
        nota2 = notaMateria.nextDouble(); // le otorgo el valor a la segunda materia en consola

        System.out.print("Ingresa la nota de la tercera materia: "); // notas tercera materia
        nota3 = notaMateria.nextDouble(); // le otorgo el valor a la tercera materia en consola

        System.out.println("Calificación de la primera materia: " + evaluarNota(nota1)); // con el metodo evaluarNota utilizo el
        System.out.println("Calificación de la segunda materia: " + evaluarNota(nota2));
        System.out.println("Calificación de la tercera materia: " + evaluarNota(nota3));

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
