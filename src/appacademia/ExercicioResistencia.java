
package appacademia;


class ExercicioResistencia implements Exercicio {
    private String nome;

    public ExercicioResistencia(String nome) {
        this.nome = nome;
    }

    @Override
    public void realizar() {
        System.out.println("Realizando exercício de resistência: " + nome);
    }
}
