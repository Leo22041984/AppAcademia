package appacademia;

import java.util.Scanner;

public class AppAcademia {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Escolha uma categoria (corrida/musculacao):");
        String categoria = scanner.nextLine().toLowerCase();

        System.out.println("Digite o nome do exercício:");
        String nomeExercicio = scanner.nextLine();

        ExercicioFactory exercicioFactory;
        if (categoria.equals("corrida")) {
            exercicioFactory = new CorridaFactory();
        } else if (categoria.equals("musculacao")) {
            exercicioFactory = new MusculacaoFactory();
        } else {
            System.out.println("Categoria inválida.");
            scanner.close();
            return;
        }

        Exercicio exercicio = exercicioFactory.criarExercicio(nomeExercicio);
        exercicio.realizar();

        scanner.close();
    }
}





