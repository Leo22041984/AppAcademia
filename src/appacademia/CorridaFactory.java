
package appacademia;

class CorridaFactory implements ExercicioFactory {
    @Override
    public Exercicio criarExercicio(String nome) {
        return new ExercicioVelocidade(nome);
    }
}
