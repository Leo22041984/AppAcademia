
package appacademia;


class MusculacaoFactory implements ExercicioFactory {
    @Override
    public Exercicio criarExercicio(String nome) {
        return new ExercicioResistencia(nome);
    }
}